package com.tw ter.ho _m xer.product.l st_recom nded_users.feature_hydrator

 mport com.tw ter.ho _m xer.model.request.HasL st d
 mport com.tw ter.ho _m xer.product.l st_recom nded_users.model.L stRecom ndedUsersFeatures. sSGSVal dUserFeature
 mport com.tw ter.product_m xer.component_l brary.model.cand date.UserCand date
 mport com.tw ter.product_m xer.core.feature.Feature
 mport com.tw ter.product_m xer.core.feature.featuremap.FeatureMap
 mport com.tw ter.product_m xer.core.feature.featuremap.FeatureMapBu lder
 mport com.tw ter.product_m xer.core.funct onal_component.feature_hydrator.BulkCand dateFeatureHydrator
 mport com.tw ter.product_m xer.core.model.common.Cand dateW hFeatures
 mport com.tw ter.product_m xer.core.model.common. dent f er.FeatureHydrator dent f er
 mport com.tw ter.product_m xer.core.p pel ne.P pel neQuery
 mport com.tw ter.soc algraph.{thr ftscala => sg}
 mport com.tw ter.st ch.St ch
 mport com.tw ter.st ch.soc algraph.Soc alGraph

 mport javax. nject. nject
 mport javax. nject.S ngleton

@S ngleton
class  sSGSVal dUserFeatureHydrator @ nject() (soc alGraph: Soc alGraph)
    extends BulkCand dateFeatureHydrator[P pel neQuery w h HasL st d, UserCand date] {

  overr de val  dent f er: FeatureHydrator dent f er =
    FeatureHydrator dent f er(" sSGSVal dUser")

  overr de def features: Set[Feature[_, _]] = Set( sSGSVal dUserFeature)

  overr de def apply(
    query: P pel neQuery w h HasL st d,
    cand dates: Seq[Cand dateW hFeatures[UserCand date]]
  ): St ch[Seq[FeatureMap]] = {
    val s ce d = query.getRequ redUser d
    val targetUser ds = cand dates.map(_.cand date. d)
    val request = sg. dsRequest(
      relat onsh ps = Seq(
        sg.SrcRelat onsh p(
          s ce = s ce d,
          relat onsh pType = sg.Relat onsh pType.Block ng,
          hasRelat onsh p = true,
          targets = So (targetUser ds)),
        sg.SrcRelat onsh p(
          s ce = s ce d,
          relat onsh pType = sg.Relat onsh pType.BlockedBy,
          hasRelat onsh p = true,
          targets = So (targetUser ds)),
        sg.SrcRelat onsh p(
          s ce = s ce d,
          relat onsh pType = sg.Relat onsh pType.Mut ng,
          hasRelat onsh p = true,
          targets = So (targetUser ds))
      ),
      pageRequest = So (sg.PageRequest(selectAll = So (true))),
      context = So (sg.LookupContext(performUn on = So (true)))
    )

    soc alGraph. ds(request).map(_. ds).map(_.toSet).map { hasRelat onsh pUser ds =>
      cand dates.map { cand date =>
        FeatureMapBu lder()
          .add( sSGSVal dUserFeature, !hasRelat onsh pUser ds.conta ns(cand date.cand date. d))
          .bu ld()
      }
    }
  }
}
