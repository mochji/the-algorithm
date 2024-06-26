package com.tw ter.v s b l y.conf gap .params

 mport com.tw ter.t  l nes.conf gap .Param

abstract class SafetyLevelParam(overr de val default: Boolean) extends Param(default) {
  overr de val statNa : Str ng = s"SafetyLevelParam/${t .getClass.getS mpleNa }"
}

pr vate[v s b l y] object SafetyLevelParams {
  object EnableAccess nternalPromotedContentSafetyLevelParam extends SafetyLevelParam(false)
  object EnableAdsBus nessSett ngsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableAdsCampa gnSafetyLevelParam extends SafetyLevelParam(false)
  object EnableAdsManagerSafetyLevelParam extends SafetyLevelParam(false)
  object EnableAdsReport ngDashboardSafetyLevelParam extends SafetyLevelParam(false)
  object EnableAllSubscr bedL stsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableAppealsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableArt cleT etT  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableBaseQ gSafetyLevelParam extends SafetyLevelParam(false)
  object EnableB rdwatchNoteAuthorSafetyLevel extends SafetyLevelParam(false)
  object EnableB rdwatchNoteT etsT  l neSafetyLevel extends SafetyLevelParam(false)
  object EnableB rdwatchNeedsY  lpNot f cat onsSafetyLevel extends SafetyLevelParam(false)
  object EnableBlockMuteUsersT  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableBrandSafetySafetyLevelParam extends SafetyLevelParam(false)
  object EnableCardPollVot ngSafetyLevelParam extends SafetyLevelParam(false)
  object EnableCardsServ ceSafetyLevelParam extends SafetyLevelParam(false)
  object EnableCommun  esSafetyLevelParam extends SafetyLevelParam(false)
  object EnableContentControlTool nstallSafetyLevelParam extends SafetyLevelParam(false)
  object EnableConversat onFocalPrehydrat onSafetyLevelParam extends SafetyLevelParam(false)
  object EnableConversat onFocalT etSafetyLevelParam extends SafetyLevelParam(false)
  object EnableConversat on njectedT etSafetyLevelParam extends SafetyLevelParam(false)
  object EnableConversat onReplySafetyLevelParam extends SafetyLevelParam(false)
  object EnableCuratedTrendsRepresentat veT et extends SafetyLevelParam(default = false)
  object EnableCurat onPol cyV olat ons extends SafetyLevelParam(default = false)
  object EnableDevPlatformGetL stT etsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESFollow ngAndFollo rsUserL stSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESHo T  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESQuoteT etT  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESRealt  SafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESRealt  SpamEnr ch ntSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESRealt  T etF lterSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESRet et ngUsersSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDesT etDeta lSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDEST etL k ngUsersSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESUserBookmarksSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESUserL kedT etSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESUser nt onsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDESUserT etsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableDevPlatformCompl anceStreamSafetyLevelParam extends SafetyLevelParam(false)
  object EnableD rect ssagesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableD rect ssagesConversat onL stSafetyLevelParam extends SafetyLevelParam(false)
  object EnableD rect ssagesConversat onT  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableD rect ssages nboxSafetyLevelParam extends SafetyLevelParam(false)
  object EnableD rect ssagesMutedUsersSafetyLevelParam extends SafetyLevelParam(false)
  object EnableD rect ssagesP nnedSafetyLevelParam extends SafetyLevelParam(false)
  object EnableD rect ssagesSearchSafetyLevelParam extends SafetyLevelParam(false)
  object EnableEd  toryT  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableElevatedQuoteT etT  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableEmbeddedT etSafetyLevelParam extends SafetyLevelParam(false)
  object EnableEmbedsPubl c nterestNot ceSafetyLevelParam extends SafetyLevelParam(false)
  object EnableEmbedT etMarkupSafetyLevelParam extends SafetyLevelParam(false)
  object EnableWr ePathL m edAct onsEnforce ntSafetyLevelParam extends SafetyLevelParam(false)
  object EnableF lterAllSafetyLevelParam extends SafetyLevelParam(false)
  object EnableF lterAllPlaceholderSafetyLevelParam extends SafetyLevelParam(false)
  object EnableF lterDefaultSafetyLevelParam extends SafetyLevelParam(false)
  object EnableF lterNoneSafetyLevelParam extends SafetyLevelParam(false)
  object EnableFollo dTop csT  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableFollo rConnect onsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableFollow ngAndFollo rsUserL stSafetyLevelParam extends SafetyLevelParam(false)
  object EnableForDevelop ntOnlySafetyLevelParam extends SafetyLevelParam(false)
  object EnableFr endsFollow ngL stSafetyLevelParam extends SafetyLevelParam(false)
  object EnableGraphqlDefaultSafetyLevelParam extends SafetyLevelParam(false)
  object EnableGryphonDecksAndColumnsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableHuman zat onNudgeSafetyLevelParam extends SafetyLevelParam(false)
  object EnableK c nS nkDevelop ntSafetyLevelParam extends SafetyLevelParam(false)
  object EnableL st aderSafetyLevelParam extends SafetyLevelParam(false)
  object EnableL st mbersh psSafetyLevelParam extends SafetyLevelParam(false)
  object EnableL stOwnersh psSafetyLevelParam extends SafetyLevelParam(false)
  object EnableL stRecom ndat onsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableL stSearchSafetyLevelParam extends SafetyLevelParam(false)
  object EnableL stSubscr pt onsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableL veP pel neEngage ntCountsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableL veV deoT  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableMag cRecsAggress veSafetyLevelParam extends SafetyLevelParam(false)
  object EnableMag cRecsAggress veV2SafetyLevelParam extends SafetyLevelParam(false)
  object EnableMag cRecsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableMag cRecsV2SafetyLevelParam extends SafetyLevelParam(false)
  object EnableM n malSafetyLevelParam extends SafetyLevelParam(false)
  object EnableModeratedT etsT  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableMo ntsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNearbySafetyLevelParam extends SafetyLevelParam(false)
  object EnableNewUserExper enceSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNot f cat ons b sSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNot f cat onsPlatformSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNot f cat onsPlatformPushSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNot f cat onsQ gSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNot f cat onsReadSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNot f cat onsT  l neDev ceFollowSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNot f cat onsWr eSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNot f cat onsWr erT etHydratorSafetyLevelParam extends SafetyLevelParam(false)
  object EnableNot f cat onsWr erV2SafetyLevelParam extends SafetyLevelParam(false)
  object EnableQu ckPromoteT etEl g b l ySafetyLevelParam extends SafetyLevelParam(false)
  object EnableQuoteT etT  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableRecom ndat onsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableRecom ndat onsW houtNsfaSafetyLevelParam extends SafetyLevelParam(false)
  object EnableRecosV deoSafetyLevelParam extends SafetyLevelParam(false)
  object EnableRecosWr ePathSafetyLevelParam extends SafetyLevelParam(false)
  object EnableRepl esGroup ngSafetyLevelParam extends SafetyLevelParam(false)
  object EnableReportCenterSafetyLevelParam extends SafetyLevelParam(false)
  object EnableReturn ngUserExper enceFocalT etSafetyLevelParam extends SafetyLevelParam(false)
  object EnableReturn ngUserExper enceSafetyLevelParam extends SafetyLevelParam(false)
  object EnableRevenueSafetyLevelParam extends SafetyLevelParam(false)
  object EnableR oAct onedT etT  l neParam extends SafetyLevelParam(false)
  object EnableSafeSearchM n malSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSafeSearchStr ctSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchHydrat onSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchLatestSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchTopSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchTopQ gSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchPhotoSafetyLevelParam extends SafetyLevelParam(false)
  object SearchTrendTakeoverPromotedT etSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchV deoSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchBlenderUserRulesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchLatestUserRulesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchPeopleSearchResultPageSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchPeopleTypea adSafetyLevelParam extends SafetyLevelParam(false)
  object EnableUserSearchSrpSafetyLevelParam extends SafetyLevelParam(false)
  object EnableUserSearchTypea adSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchM xerSrpM n malSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSearchM xerSrpStr ctSafetyLevelParam extends SafetyLevelParam(false)
  object EnableShopp ngManagerSpyModeSafetyLevelParam extends SafetyLevelParam(false)
  object EnableS gnalsReact onsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableS gnalsT etReact ngUsersSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSoc alProofSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSoft ntervent onP votSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpaceFleetl neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpaceHo T  l neUprank ngSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpaceJo nScreenSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpaceNot f cat onsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpacesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpacesPart c pantsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpaceNot f cat onSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpacesSellerAppl cat onStatusSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpacesShar ngSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSpaceT etAvatarHo T  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSt ckersT  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableStratoExtL m edEngage ntsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableStreamServ cesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSuperFollo rConnect onsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableSuperL keSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTestSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neBookmarkSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neConversat onsDownrank ngSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neContentControlsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neConversat onsDownrank ngM n malSafetyLevelParam
      extends SafetyLevelParam(false)
  object EnableT  l neConversat onsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neFavor esSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neFavor esSelfV ewSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neFocalT etSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neFollow ngAct v ySafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neHo Commun  esSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neHo Hydrat onSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neHo LatestSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neHo PromotedHydrat onSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neHo Recom ndat onsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neHo SafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neHo Top cFollowRecom ndat onsSafetyLevelParam
      extends SafetyLevelParam(false)
  object EnableT  l neScorerSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTop csLand ngPageTop cRecom ndat onsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableExploreRecom ndat onsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l ne nject onSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neL kedBySafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neL stsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l ne d aSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l ne nt onsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neModeratedT etsHydrat onSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neProf leSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neProf leAllSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neProf leSpacesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neProf leSuperFollowsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neReact veBlend ngSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neRet etedBySafetyLevelParam extends SafetyLevelParam(false)
  object EnableT  l neSuperL kedBySafetyLevelParam extends SafetyLevelParam(false)
  object EnableTombston ngSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTop cRecom ndat onsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTrendsRepresentat veT etSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTrustedFr endsUserL stSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTw terDelegateUserL stSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT etDeta lSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT etDeta lNonTooSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT etDeta lW h nject onsHydrat onSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT etEngagersSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT etReplyNudgeParam extends SafetyLevelParam(false)
  object EnableT etScopedT  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT etWr esAp SafetyLevelParam extends SafetyLevelParam(false)
  object EnableTw terArt cleComposeSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTw terArt cleProf leTabSafetyLevelParam extends SafetyLevelParam(false)
  object EnableTw terArt cleReadSafetyLevelParam extends SafetyLevelParam(false)
  object EnableUserProf le aderSafetyLevelParam extends SafetyLevelParam(false)
  object EnableProf leM xer d aSafetyLevelParam extends SafetyLevelParam(false)
  object EnableProf leM xerFavor esSafetyLevelParam extends SafetyLevelParam(false)
  object EnableUserM lestoneRecom ndat onSafetyLevelParam extends SafetyLevelParam(false)
  object EnableUserScopedT  l neSafetyLevelParam extends SafetyLevelParam(false)
  object EnableUserSelfV ewOnlySafetyLevelParam extends SafetyLevelParam(false)
  object EnableUserSett ngsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableV deoAdsSafetyLevelParam extends SafetyLevelParam(false)
  object EnableZ pb rdConsu rArch vesSafetyLevelParam extends SafetyLevelParam(false)
  object EnableT etAwardSafetyLevelParam extends SafetyLevelParam(false)

  object EnableDeprecatedSafetyLevel extends SafetyLevelParam(true)
  object EnableQuotedT etRulesParam extends SafetyLevelParam(true)
  object EnableUnsupportedSafetyLevel extends SafetyLevelParam(true)
  object EnableUnknownSafetyLevel$ extends SafetyLevelParam(true)
}
