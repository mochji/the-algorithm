package com.tw ter.ho _m xer.product.scored_t ets.response_transfor r

 mport com.tw ter.ho _m xer.model.Ho Features.Cand dateS ce dFeature
 mport com.tw ter.ho _m xer.model.Ho Features.From nNetworkS ceFeature
 mport com.tw ter.ho _m xer.model.Ho Features.SuggestTypeFeature
 mport com.tw ter.product_m xer.core.feature.Feature
 mport com.tw ter.product_m xer.core.feature.featuremap.FeatureMap
 mport com.tw ter.product_m xer.core.feature.featuremap.FeatureMapBu lder
 mport com.tw ter.product_m xer.core.funct onal_component.transfor r.Cand dateFeatureTransfor r
 mport com.tw ter.product_m xer.core.model.common. dent f er.Transfor r dent f er
 mport com.tw ter.t  l neserv ce.suggests.logg ng.cand date_t et_s ce_ d.{thr ftscala => cts}
 mport com.tw ter.t  l neserv ce.suggests.{thr ftscala => st}

object ScoredT etsBackf llResponseFeatureTransfor r extends Cand dateFeatureTransfor r[Long] {

  overr de val  dent f er: Transfor r dent f er =
    Transfor r dent f er("ScoredT etsBackf llResponse")

  overr de val features: Set[Feature[_, _]] = Set(
    Cand dateS ce dFeature,
    From nNetworkS ceFeature,
    SuggestTypeFeature
  )

  overr de def transform(cand date: Long): FeatureMap = FeatureMapBu lder()
    .add(Cand dateS ce dFeature, So (cts.Cand dateT etS ce d.Backf llOrgan cT et))
    .add(From nNetworkS ceFeature, true)
    .add(SuggestTypeFeature, So (st.SuggestType.RankedOrgan cT et))
    .bu ld()
}
