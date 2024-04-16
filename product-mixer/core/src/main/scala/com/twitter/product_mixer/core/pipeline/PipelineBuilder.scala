package com.tw ter.product_m xer.core.p pel ne

 mport com.tw ter.f nagle.stats.StatsRece ver
 mport com.tw ter.product_m xer.core.model.common. dent f er.Component dent f er
 mport com.tw ter.product_m xer.core.model.common. dent f er.P pel neStep dent f er
 mport com.tw ter.product_m xer.core.p pel ne.p pel ne_fa lure.P pel neFa lure
 mport com.tw ter.product_m xer.core.qual y_factor.Qual yFactorStatus
 mport com.tw ter.product_m xer.core.serv ce.Executor
 mport com.tw ter.product_m xer.core.serv ce.Executor.Context
 mport com.tw ter.product_m xer.core.serv ce
 mport com.tw ter.st ch.Arrow
 mport com.tw ter.ut l.Return
 mport com.tw ter.ut l.Throw

tra  P pel neBu lder[Query] extends Executor {

  /**
   * W n a step  s mostly t  sa , but only t  result update changes,
   *   can pass  n a [[ResultUpdater]] to t  [[Step]] to perform t  update
   * such as w h mult -step hydrat on.
   */
  tra  ResultUpdater[R <: P pel neResult[_], ER <: serv ce.ExecutorResult] {
    def apply(ex st ngResult: R, executorResult: ER): R
  }

  type Underly ngResultType
  type P pel neResultType <: P pel neResult[Underly ngResultType]

  /** t  data that every step has as  nput and output - t  query, and t   n-progress result */
  case class StepData(query: Query, result: P pel neResultType)

  /** An [[Arrow. so]] [[Arrow]]  s an arrow w h t  sa   nput and output types. */
  type StepArrow = Arrow. so[StepData]

  /**
   *   break p pel ne execut on  nto a l near sequence of [[Step]]s. T  execut on log c of each
   * step  s represented as an [[Executor]] (wh ch  s reusable bet en p pel nes).
   *
   * Each step has access to t  [[P pel neResult]] generated by prev ous steps, and can update  
   * w h so  new data.
   *
   *   def ne a p pel ne Step as hav ng three parts:
   *
   *   - An underly ng [[Executor]] [[Arrow]], from t  underly ng executor
   *   - An  nput adaptor to extract t  r ght data from t  prev ous [[P pel neResult]]
   *   - A result updater to update t  [[P pel neResult]]
   *
   * T  keeps knowledge of [[P pel neResult]] out of t  executors, so t y're reusable.
   *
   * @tparam Executor nput T   nput type used by t  executor
   * @tparam ExecutorResult T  output/result type used by t  executor
   */
  tra  Step[Executor nput, ExecutorResult] {
    def  dent f er: P pel neStep dent f er
    def executorArrow: Arrow[Executor nput, ExecutorResult]
    def  nputAdaptor(query: Query, prev ousResult: P pel neResultType): Executor nput
    def resultUpdater(
      prev ousP pel neResult: P pel neResultType,
      executorResult: ExecutorResult
    ): P pel neResultType

    /**
     * Opt onally, steps can def ne a funct on to update t  Query
     */
    def queryUpdater(query: Query, executorResult: ExecutorResult): Query = query

    /**
     * Arrow that adapts t   nput, runs t  underly ng Executor, adapts t  output, and updates t  state
     */
    val stepArrow: StepArrow = {
      val  nputAdaptorArrow: Arrow[StepData, Executor nput] = Arrow.map { stepData: StepData =>
         nputAdaptor(stepData.query, stepData.result)
      }
      val outputAdaptorArrow: Arrow[(StepData, ExecutorResult), StepData] = Arrow.map {
        // abstract type pattern ExecutorResult  s unc cked s nce    s el m nated by erasure
        case (prev ousStepData: StepData, executorResult: ExecutorResult @unc cked) =>
          StepData(
            query = queryUpdater(prev ousStepData.query, executorResult),
            result = resultUpdater(prev ousStepData.result, executorResult)
          )
      }

      Arrow
        .z pW hArg( nputAdaptorArrow.andT n(executorArrow))
        .andT n(outputAdaptorArrow)
    }
  }

  /**
   * Wraps a step w h [[wrapStepW hExecutorBookkeep ng]]
   *
   * W n an error  s encountered  n execut on,   update t  [[P pel neResult.fa lure]] f eld,
   * and   return t  part al results from all prev ously executed steps.
   */
  def wrapStepW hExecutorBookkeep ng(
    context: Context,
    step: Step[_, _]
  ): Arrow. so[StepData] = {
    val wrapped = wrapStepW hExecutorBookkeep ng[StepData, StepData](
      context = context,
       dent f er = step. dent f er,
      arrow = step.stepArrow,
      // extract t  fa lure only  f  's present
      transfor r = _.result.fa lure match {
        case So (p pel neFa lure) => Throw(p pel neFa lure)
        case None => Return.Un 
      }
    )

    Arrow
      .z pW hArg(wrapped.l ftToTry)
      .map {
        case (_: StepData, Return(result)) =>
          //  f Step was successful, return t  result
          result
        case (StepData(query, prev ousResult), Throw(p pel neFa lure: P pel neFa lure)) =>
          //  f t  Step fa led  n such a way that t  fa lure was NOT captured
          //  n t  result object, t n update t  State w h t  fa lure
          StepData(
            query,
            prev ousResult.w hFa lure(p pel neFa lure).as nstanceOf[P pel neResultType])
        case (_, Throw(ex)) =>
          // an except on was thrown wh ch was not handled by t  fa lure class f er
          // t  only happens w h cancellat on except ons wh ch are re-thrown
          throw ex
      }
  }

  /**
   * Bu lds a comb ned arrow out of steps.
   *
   * Wraps t m  n error handl ng, and only executes each step  f t  prev ous step  s successful.
   */
  def bu ldComb nedArrowFromSteps(
    steps: Seq[Step[_, _]],
    context: Executor.Context,
     n  alEmptyResult: P pel neResultType,
    steps nOrderFromConf g: Seq[P pel neStep dent f er]
  ): Arrow[Query, P pel neResultType] = {

    val dateConf gAndBu lderAre nSync(steps, steps nOrderFromConf g)

    /**
     * Prepare t  step arrows.
     *   1. Wrap t m  n executor bookkeep ng
     *   2. Wrap t m  n  so.only f - so   only execute t m  f   don't have a result or fa lure yet
     *   3. Comb ne t m us ng [[ soArrowsSequent ally]]
     *
     * @note t  results  n no Executor bookkeep ng act ons for [[Step]]s after
     *         reach a [[P pel neResult.stopExecut ng]].
     */
    val stepArrows =  soArrowsSequent ally(steps.map { step =>
      Arrow. so.only f[StepData](stepData => !stepData.result.stopExecut ng)(
        wrapStepW hExecutorBookkeep ng(context, step))
    })

    Arrow
      . dent y[Query]
      .map { query => StepData(query,  n  alEmptyResult) }
      .andT n(stepArrows)
      .map { case StepData(_, result) => result }
  }

  /**
   * Sets up stats [[com.tw ter.f nagle.stats.Gauge]]s for any [[Qual yFactorStatus]]
   *
   * @note   use prov deGauge so t se gauges l ve forever even w hout a reference.
   */
  pr vate[p pel ne] def bu ldGaugesForQual yFactor(
    p pel ne dent f er: Component dent f er,
    qual yFactorStatus: Qual yFactorStatus,
    statsRece ver: StatsRece ver
  ): Un  = {
    qual yFactorStatus.qual yFactorByP pel ne.foreach {
      case ( dent f er, qual yFactor) =>
        // QF  s a relat ve stat (s nce t  parent p pel ne  s mon or ng a ch ld p pel ne)
        val scopes = p pel ne dent f er.toScopes ++  dent f er.toScopes :+ "Qual yFactor"
        statsRece ver.prov deGauge(scopes: _*) { qual yFactor.currentValue.toFloat }
    }
  }

  /** Val dates that t  [[P pel neConf gCompan on]]  s  n sync w h t  [[Step]]s a [[P pel neBu lder]] produces */
  pr vate[t ] def val dateConf gAndBu lderAre nSync(
    bu ltSteps: Seq[Step[_, _]],
    steps nOrder: Seq[P pel neStep dent f er]
  ): Un  = {
    requ re(
      bu ltSteps.map(_. dent f er) == steps nOrder,
      s"Bu lder and Conf g are out of sync, bug  n Product M xer Core, `P pel neCompan on` and `P pel neBu lder` " +
        s"have d fferent def n  ons of what Steps are run  n t  P pel ne \n" +
        s"${bu ltSteps.map(_. dent f er).z p(steps nOrder).mkStr ng("\n")}"
    )
  }
}
