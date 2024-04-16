package com.tw ter.ho _m xer.funct onal_component.f lter

 mport com.tw ter.ho _m xer.model.Ho Features.GetOlderFeature
 mport com.tw ter.ho _m xer.model.Ho Features.ServedT et dsFeature
 mport com.tw ter.ho _m xer.ut l.Cand datesUt l
 mport com.tw ter.product_m xer.component_l brary.model.cand date.T etCand date
 mport com.tw ter.product_m xer.core.funct onal_component.f lter.F lter
 mport com.tw ter.product_m xer.core.funct onal_component.f lter.F lterResult
 mport com.tw ter.product_m xer.core.model.common.Cand dateW hFeatures
 mport com.tw ter.product_m xer.core.model.common. dent f er.F lter dent f er
 mport com.tw ter.product_m xer.core.p pel ne.P pel neQuery
 mport com.tw ter.st ch.St ch

object Prev ouslyServedT etsF lter
    extends F lter[P pel neQuery, T etCand date]
    w h F lter.Cond  onally[P pel neQuery, T etCand date] {

  overr de val  dent f er: F lter dent f er = F lter dent f er("Prev ouslyServedT ets")

  overr de def only f(
    query: P pel neQuery,
    cand dates: Seq[Cand dateW hFeatures[T etCand date]]
  ): Boolean = {
    query.features.ex sts(_.getOrElse(GetOlderFeature, false))
  }

  overr de def apply(
    query: P pel neQuery,
    cand dates: Seq[Cand dateW hFeatures[T etCand date]]
  ): St ch[F lterResult[T etCand date]] = {

    val servedT et ds =
      query.features.map(_.getOrElse(ServedT et dsFeature, Seq.empty)).toSeq.flatten.toSet

    val (removed, kept) = cand dates.part  on { cand date =>
      val t et dAndS ce d = Cand datesUt l.getT et dAndS ce d(cand date)
      t et dAndS ce d.ex sts(servedT et ds.conta ns)
    }

    St ch.value(F lterResult(kept = kept.map(_.cand date), removed = removed.map(_.cand date)))
  }
}
