package com.tw ter.fr gate.pushserv ce.model. b s

 mport com.tw ter.fr gate.common.base.T etAuthorDeta ls
 mport com.tw ter.fr gate.common.base.T etFavor eCand date
 mport com.tw ter.fr gate.pushserv ce.model.PushTypes.PushCand date
 mport com.tw ter.ut l.Future

tra  T etFavor eCand date b s2Hydrator
    extends T etCand date b s2Hydrator
    w h RankedSoc alContext b s2Hydrator {
  self: PushCand date w h T etFavor eCand date w h T etAuthorDeta ls =>

  overr de lazy val t etModelValues: Future[Map[Str ng, Str ng]] =
    for {
      soc alContextModelValues <- soc alContextModelValues
      superModelValues <- super.t etModelValues
      t et nl neModelValues <- t et nl neAct onModelValue
    } y eld {
      superModelValues ++  d aModelValue ++ ot rModelValues ++ soc alContextModelValues ++ t et nl neModelValues
    }
}
