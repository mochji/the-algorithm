package com.tw ter.t  l nes.data_process ng.ml_ut l.aggregat on_fra work.query

 mport com.tw ter.dal.personal_data.thr ftjava.PersonalDataType
 mport com.tw ter.ml.ap .DataRecord
 mport com.tw ter.ml.ap .Feature
 mport com.tw ter.ml.ap .FeatureBu lder
 mport com.tw ter.ml.ap .FeatureContext
 mport com.tw ter.ml.ap .thr ftscala.{DataRecord => ScalaDataRecord}
 mport com.tw ter.t  l nes.data_process ng.ml_ut l.aggregat on_fra work. tr cs.Aggregat on tr cCommon
 mport java.lang.{Double => JDouble}
 mport java.lang.{Long => JLong}
 mport scala.collect on.JavaConverters._

/**
 * Prov des  thods to bu ld "scoped" aggregates, w re base features generated by aggregates
 * V2 are scoped w h a spec f c key.
 *
 * T  class prov des  thods that take a Map of T -> DataRecord, w re T  s a key type, and
 * t  DataRecord conta ns features produced by t  aggregat on_fra work. T   thods t n
 * generate a _new_ DataRecord, conta n ng "scoped" aggregate features, w re each scoped
 * feature has t  value of t  scope key  n t  feature na , and t  value of t  feature
 *  s t  value of t  or g nal aggregate feature  n t  correspond ng value from t  or g nal
 * Map.
 *
 * For eff c ency reasons, t  bu lder  s  n  al zed w h t  set of features that should be
 * scoped and t  set of keys for wh ch scop ng should be supported.
 *
 * To understand how scope feature na s are constructed, cons der t  follow ng:
 *
 * {{{
 * val features = Set(
 *   new Feature.Cont nuous("user_ nject on_aggregate.pa r.any_label.any_feature.5.days.count"),
 *   new Feature.Cont nuous("user_ nject on_aggregate.pa r.any_label.any_feature.10.days.count")
 * )
 * val scopes = Set(SuggestType.Recap, SuggestType.WhoToFollow)
 * val scopeNa  = " nject onType"
 * val scopedAggregateBu lder = ScopedAggregateBu lder(features, scopes, scopeNa )
 *
 * }}}
 *
 * T n, generated scoped features would be among t  follow ng:
 * - user_ nject on_aggregate.scoped.pa r.any_label.any_feature.5.days.count/scope_na = nject onType/scope=Recap
 * - user_ nject on_aggregate.scoped.pa r.any_label.any_feature.5.days.count/scope_na = nject onType/scope=WhoToFollow
 * - user_ nject on_aggregate.scoped.pa r.any_label.any_feature.10.days.count/scope_na = nject onType/scope=Recap
 * - user_ nject on_aggregate.scoped.pa r.any_label.any_feature.10.days.count/scope_na = nject onType/scope=WhoToFollow
 *
 * @param featuresToScope t  set of features for wh ch one should generate scoped vers ons
 * @param scopeKeys t  set of scope keys to generate scopes w h
 * @param scopeNa  a str ng  nd cat ng what t  scopes represent. T   s also added to t  scoped feature
 * @tparam K t  type of scope key
 */
class ScopedAggregateBu lder[K](
  featuresToScope: Set[Feature[JDouble]],
  scopeKeys: Set[K],
  scopeNa : Str ng) {

  pr vate[t ] def bu ldScopedAggregateFeature(
    baseNa : Str ng,
    scopeValue: Str ng,
    personalDataTypes: java.ut l.Set[PersonalDataType]
  ): Feature[JDouble] = {
    val components = baseNa .spl ("\\.").toL st

    val newNa  = (components. ad :: "scoped" :: components.ta l).mkStr ng(".")

    new FeatureBu lder.Cont nuous()
      .addExtens onD  ns ons("scope_na ", "scope")
      .setBaseNa (newNa )
      .setPersonalDataTypes(personalDataTypes)
      .extens onBu lder()
      .addExtens on("scope_na ", scopeNa )
      .addExtens on("scope", scopeValue)
      .bu ld()
  }

  /**
   *  ndex of (base aggregate feature na , key) -> key scoped count feature.
   */
  pr vate[t ] val keyScopedAggregateMap: Map[(Str ng, K), Feature[JDouble]] = {
    featuresToScope.flatMap { feat =>
      scopeKeys.map { key =>
        (feat.getFeatureNa , key) ->
          bu ldScopedAggregateFeature(
            feat.getFeatureNa ,
            key.toStr ng,
            Aggregat on tr cCommon.der vePersonalDataTypes(So (feat))
          )
      }
    }.toMap
  }

  type Cont nuousFeaturesMap = Map[JLong, JDouble]

  /**
   * Create key-scoped features for raw aggregate feature  D to value maps, part  oned by key.
   */
  pr vate[t ] def bu ldAggregates(featureMapsByKey: Map[K, Cont nuousFeaturesMap]): DataRecord = {
    val cont nuousFeatures = featureMapsByKey
      .flatMap {
        case (key, featureMap) =>
          featuresToScope.flatMap { feature =>
            val newFeatureOpt = keyScopedAggregateMap.get((feature.getFeatureNa , key))
            newFeatureOpt.flatMap { newFeature =>
              featureMap.get(feature.getFeature d).map(new JLong(newFeature.getFeature d) -> _)
            }
          }.toMap
      }

    new DataRecord().setCont nuousFeatures(cont nuousFeatures.asJava)
  }

  /**
   * Create key-scoped features for Java [[DataRecord]] aggregate records part  oned by key.
   *
   * As an example,  f t  prov ded Map  ncludes t  key `SuggestType.Recap`, and [[scopeKeys]]
   *  ncludes t  key, t n for a feature "xyz.pa r.any_label.any_feature.5.days.count", t   thod
   * w ll generate t  scoped feature "xyz.scoped.pa r.any_label.any_feature.5.days.count/scope_na = nject onType/scope=Recap",
   * w h t  value be ng t  value of t  or g nal feature from t  Map.
   *
   * @param aggregatesByKey a map from key to a cont nuous feature map ( e. feature  D -> Double)
   * @return a Java [[DataRecord]] conta n ng key-scoped features
   */
  def bu ldAggregatesJava(aggregatesByKey: Map[K, DataRecord]): DataRecord = {
    val featureMapsByKey = aggregatesByKey.mapValues(_.cont nuousFeatures.asScala.toMap)
    bu ldAggregates(featureMapsByKey)
  }

  /**
   * Create key-scoped features for Scala [[DataRecord]] aggregate records part  oned by key.
   *
   * As an example,  f t  prov ded Map  ncludes t  key `SuggestType.Recap`, and [[scopeKeys]]
   *  ncludes t  key, t n for a feature "xyz.pa r.any_label.any_feature.5.days.count", t   thod
   * w ll generate t  scoped feature "xyz.scoped.pa r.any_label.any_feature.5.days.count/scope_na = nject onType/scope=Recap",
   * w h t  value be ng t  value of t  or g nal feature from t  Map.
   *
   * T   s a conven ence  thod for so  use cases w re aggregates are read from Scala
   * thr ft objects. Note that t  st ll returns a Java [[DataRecord]], s nce most ML AP 
   * use t  Java vers on.
   *
   * @param aggregatesByKey a map from key to a cont nuous feature map ( e. feature  D -> Double)
   * @return a Java [[DataRecord]] conta n ng key-scoped features
   */
  def bu ldAggregatesScala(aggregatesByKey: Map[K, ScalaDataRecord]): DataRecord = {
    val featureMapsByKey =
      aggregatesByKey
        .mapValues { record =>
          val featureMap = record.cont nuousFeatures.getOrElse(Map[Long, Double]()).toMap
          featureMap.map { case (k, v) => new JLong(k) -> new JDouble(v) }
        }
    bu ldAggregates(featureMapsByKey)
  }

  /**
   * Returns a [[FeatureContext]]  nclud ng all poss ble scoped features generated us ng t  bu lder.
   *
   * @return a [[FeatureContext]] conta n ng all scoped features.
   */
  def scopedFeatureContext: FeatureContext = new FeatureContext(keyScopedAggregateMap.values.asJava)
}
