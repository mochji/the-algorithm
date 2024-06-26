package com.tw ter.fr gate.pushserv ce.params

 mport com.tw ter.f nagle.stats.StatsRece ver
 mport com.tw ter.fr gate.common.ut l.{FeatureSw chParams => Common}
 mport com.tw ter.fr gate.pushserv ce.params.{PushFeatureSw chParams => Pushserv ce}
 mport com.tw ter.logg ng.Logger
 mport com.tw ter.servo.dec der.Dec derGateBu lder
 mport com.tw ter.t  l nes.conf gap .BaseConf gBu lder
 mport com.tw ter.t  l nes.conf gap .FeatureSw chOverr deUt l
 mport com.tw ter.t  l nes.conf gap .dec der.Dec derUt ls

case class PushFeatureSw c s(
  dec derGateBu lder: Dec derGateBu lder,
  statsRece ver: StatsRece ver) {

  pr vate[t ] val logger = Logger(classOf[PushFeatureSw c s])
  pr vate[t ] val stat = statsRece ver.scope("PushFeatureSw c s")

  pr vate val booleanDec derOverr des = Dec derUt ls.getBooleanDec derOverr des(
    dec derGateBu lder,
    PushParams.D sableAllRelevanceParam,
    PushParams.D sable avyRank ngParam,
    PushParams.Restr ctL ghtRank ngParam,
    PushParams.UTEGT etCand dateS ceParam,
    PushParams.EnableWr esToNot f cat onServ ceParam,
    PushParams.EnableWr esToNot f cat onServ ceForAllEmployeesParam,
    PushParams.EnableWr esToNot f cat onServ ceForEveryoneParam,
    PushParams.EnablePromptFeedbackFat gueResponseNoPred cate,
    PushParams.EarlyB rdSCBasedCand datesParam,
    PushParams.MRT etFavRecsParam,
    PushParams.MRT etRet etRecsParam,
    PushParams.EnablePushSendEventBus,
    PushParams.D sableMl nF lter ngParam,
    PushParams.DownSampleL ghtRank ngScr beCand datesParam,
    PushParams.EnableMrRequestScr b ng,
    PushParams.EnableH ghQual yCand dateScoresScr b ng,
    PushParams.EnablePnegMult modalPred ct onForF1T ets,
    PushParams.EnableScr beOonFavScoreForF1T ets,
    PushParams.EnableMrUserSemant cCoreFeaturesHydrat on,
    PushParams.EnableMrUserSemant cCoreNoZeroFeaturesHydrat on,
    PushParams.EnableHtlOffl neUserAggregatesExtendedHydrat on,
    PushParams.EnableNerErgFeatureHydrat on,
    PushParams.EnableDaysS nceRecentResurrect onFeatureHydrat on,
    PushParams.EnableUserPastAggregatesFeatureHydrat on,
    PushParams.EnableMrUserS mclusterV2020FeaturesHydrat on,
    PushParams.EnableMrUserS mclusterV2020NoZeroFeaturesHydrat on,
    PushParams.EnableTop cEngage ntRealT  AggregatesFeatureHydrat on,
    PushParams.EnableUserTop cAggregatesFeatureHydrat on,
    PushParams.EnableHtlUserAuthorRTAFeaturesFromFeatureStoreHydrat on,
    PushParams.EnableDurat onS nceLastV s Features,
    PushParams.EnableT etAnnotat onFeaturesHydrat on,
    PushParams.EnableSpaceV s b l yL braryF lter ng,
    PushParams.EnableUserTop cFollowFeatureSetHydrat on,
    PushParams.EnableOnboard ngNewUserFeatureSetHydrat on,
    PushParams.EnableMrUserAuthorSparseContFeatureSetHydrat on,
    PushParams.EnableMrUserTop cSparseContFeatureSetHydrat on,
    PushParams.EnableUserPengu nLanguageFeatureSetHydrat on,
    PushParams.EnableMrUserHashspaceEmbedd ngFeatureHydrat on,
    PushParams.EnableMrUserEngagedT etTokensFeatureHydrat on,
    PushParams.EnableMrCand dateT etTokensFeatureHydrat on,
    PushParams.EnableMrT etSent  ntFeatureHydrat on,
    PushParams.EnableMrT etAuthorAggregatesFeatureHydrat on,
    PushParams.EnableUserGeoFeatureSetHydrat on,
    PushParams.EnableAuthorGeoFeatureSetHydrat on,
    PushParams.EnableTwH NUserEngage ntFeaturesHydrat on,
    PushParams.EnableTwH NUserFollowFeaturesHydrat on,
    PushParams.EnableTwH NAuthorFollowFeaturesHydrat on,
    PushParams.EnableAuthorFollowTwh nEmbedd ngFeatureHydrat on,
    PushParams.RampupUserGeoFeatureSetHydrat on,
    PushParams.RampupAuthorGeoFeatureSetHydrat on,
    PushParams.EnablePred cateDeta led nfoScr b ng,
    PushParams.EnablePushCap nfoScr b ng,
    PushParams.EnableUserS gnalLanguageFeatureHydrat on,
    PushParams.EnableUserPreferredLanguageFeatureHydrat on,
    PushParams.PopGeoCand datesDec der,
    PushParams.TrendsCand dateDec der,
    PushParams.Enable nsTraff cDec der,
    PushParams.EnableModelBasedPushcapAss gn nts,
    PushParams.Tr pGeoT etCand datesDec der,
    PushParams.ContentRecom nderM xerAdaptorDec der,
    PushParams.Gener cCand dateAdaptorDec der,
    PushParams.Tr pGeoT etContentM xerDarkTraff cDec der,
    PushParams.Enable sT etTranslatableC ck,
    PushParams.EnableMrT etS mClusterFeatureHydrat on,
    PushParams.EnableTw stlyAggregatesFeatureHydrat on,
    PushParams.EnableT etTwH NFavFeatureHydrat on,
    PushParams.EnableRealGraphV2FeatureHydrat on,
    PushParams.EnableT etBeTFeatureHydrat on,
    PushParams.EnableMrOffl neUserT etTop cAggregateHydrat on,
    PushParams.EnableMrOffl neUserT etS mClusterAggregateHydrat on,
    PushParams.EnableUserSendT  FeatureHydrat on,
    PushParams.EnableMrUserUtcSendT  AggregateFeaturesHydrat on,
    PushParams.EnableMrUserLocalSendT  AggregateFeaturesHydrat on,
    PushParams.EnableBqmlReportModelPred ct onForF1T ets,
    PushParams.EnableUserTwh nEmbedd ngFeatureHydrat on,
    PushParams.EnableScr b ngMLFeaturesAsDataRecord,
    PushParams.EnableAuthorVer f edFeatureHydrat on,
    PushParams.EnableAuthorCreatorSubscr pt onFeatureHydrat on,
    PushParams.EnableD rectHydrat onForUserFeatures
  )

  pr vate val  ntFeatureSw chOverr des = FeatureSw chOverr deUt l.getBounded ntFSOverr des(
    Pushserv ce.SportsMaxNumberOfPus s n ntervalPerEvent,
    Pushserv ce.SportsMaxNumberOfPus s n nterval,
    Pushserv ce.PushM xerMaxResults,
    Pushserv ce.MaxTrendT etNot f cat ons nDurat on,
    Pushserv ce.MaxRecom ndedTrendsToQuery,
    Pushserv ce.NumberOfMaxEarlyb rd nNetworkCand datesParam,
    Pushserv ce.NumberOfMaxCand datesToBatch nRFPHTakeStep,
    Pushserv ce.MaxMrPushSends24H sParam,
    Pushserv ce.MaxMrPushSends24H sNtabOnlyUsersParam,
    Pushserv ce.NumberOfMaxCrM xerCand datesParam,
    Pushserv ce.Restr ctStepS ze,
    Pushserv ce.Mag cFanoutRankErgThreshold avy,
    Pushserv ce.Mag cFanoutRankErgThresholdNon avy,
    Pushserv ce.Mag cFanoutRelaxedEvent dFat gue nterval nH s,
    Pushserv ce.NumberOfMaxUTEGCand datesQuer edParam,
    Pushserv ce.HTLV s Fat gueT  ,
    Pushserv ce.MaxOnboard ngPush n nterval,
    Pushserv ce.MaxTopT etsByGeoPushG ven nterval,
    Pushserv ce.MaxH ghQual yT etsPushG ven nterval,
    Pushserv ce.MaxTopT etsByGeoCand datesToTake,
    Pushserv ce.SpaceRecsRealgraphThreshold,
    Pushserv ce.SpaceRecsGlobalPushL m ,
    Pushserv ce.OptoutExptPushCapParam,
    Pushserv ce.MaxTopT et mpress onsNot f cat ons,
    Pushserv ce.TopT et mpress onsM nRequ red,
    Pushserv ce.TopT et mpress onsThreshold,
    Pushserv ce.TopT et mpress onsOr g nalT etsNumDaysSearch,
    Pushserv ce.TopT et mpress onsM nNumOr g nalT ets,
    Pushserv ce.TopT et mpress onsMaxFavor esPerT et,
    Pushserv ce.TopT et mpress onsTotal nboundFavor esL m ,
    Pushserv ce.TopT et mpress onsTotalFavor esL m NumDaysSearch,
    Pushserv ce.TopT et mpress onsRecentT etsByAuthorStoreMaxResults,
    Pushserv ce.ANNEfQuery,
    Pushserv ce.NumberOfMaxMrModel ngBasedCand dates,
    Pushserv ce.ThresholdOfFavMrModel ngBasedCand dates,
    Pushserv ce.L ghtRank ngNumberOfCand datesParam,
    Pushserv ce.NumberOfDeTop cT etCand dates,
    Pushserv ce.NumberOfMaxDeTop cT etCand datesReturned,
    Pushserv ce.Overr deNot f cat onsMaxNumOfSlots,
    Pushserv ce.Overr deNot f cat onsMaxCountForNTab,
    Pushserv ce.MFMaxNumberOfPus s n nterval,
    Pushserv ce.SpacesTopKS mClusterCount,
    Pushserv ce.SpaceRecsS mClusterUserM n mumFollo rCount,
    Pushserv ce.OONSpaceRecsPushL m ,
    Pushserv ce.Mag cFanoutRealgraphRankThreshold,
    Pushserv ce.Custom zedPushCapOffset,
    Pushserv ce.NumberOfF1Cand datesThresholdForOONBackf ll,
    Pushserv ce.M n mumAllo dAuthorAccountAge nH s,
    Pushserv ce.Restr ctedM nModelPushcap,
    Pushserv ce.L stRecom ndat onsGeoHashLength,
    Pushserv ce.L stRecom ndat onsSubscr berCount,
    Pushserv ce.MaxL stRecom ndat onsPushG ven nterval,
    Pushserv ce.SendT  ByUser toryMaxOpenedThreshold,
    Pushserv ce.SendT  ByUser toryNoSendsH s,
    Pushserv ce.SendT  ByUser toryQu ckSendBeforeH s,
    Pushserv ce.SendT  ByUser toryQu ckSendAfterH s,
    Pushserv ce.SendT  ByUser toryQu ckSendM nDurat on nM nute,
    Pushserv ce.SendT  ByUser toryNoSendM nDurat on,
    Pushserv ce.F1Emoj CopyNumOfPus sFat gue,
    Pushserv ce.OonEmoj CopyNumOfPus sFat gue,
    Pushserv ce.Tr pT etMaxTotalCand dates,
    Pushserv ce. nl neFeedbackSubst utePos  on,
    Pushserv ce.H ghQual yCand datesNumberOfCand dates,
    Pushserv ce.H ghQual yCand datesM nNumOfCand datesToFallback,
    Pushserv ce.ProductLaunchMaxNumberOfPus s n nterval,
    Pushserv ce.CreatorSubscr pt onPushMaxNumberOfPus s n nterval,
    Pushserv ce.NewCreatorPushMaxNumberOfPus s n nterval,
    Pushserv ce.T etReplytoL keRat oReplyCountThreshold,
    Pushserv ce.MaxExploreV deoT ets,
  )

  pr vate val doubleFeatureSw chOverr des =
    FeatureSw chOverr deUt l.getBoundedDoubleFSOverr des(
      Pushserv ce.Percent leThresholdCohort1,
      Pushserv ce.Percent leThresholdCohort2,
      Pushserv ce.Percent leThresholdCohort3,
      Pushserv ce.Percent leThresholdCohort4,
      Pushserv ce.Percent leThresholdCohort5,
      Pushserv ce.Percent leThresholdCohort6,
      Pushserv ce.PnsfwT etTextThreshold,
      Pushserv ce.PnsfwT etTextBucket ngThreshold,
      Pushserv ce.PnsfwT et d aThreshold,
      Pushserv ce.PnsfwT et mageThreshold,
      Pushserv ce.PnsfwQuoteT etThreshold,
      Pushserv ce.PnsfwT et d aBucket ngThreshold,
      Pushserv ce.AgathaCal bratedNSFWThreshold,
      Pushserv ce.AgathaCal bratedNSFWThresholdForMrTw stly,
      Pushserv ce.AgathaTextNSFWThreshold,
      Pushserv ce.AgathaTextNSFWThresholdForMrTw stly,
      Pushserv ce.AgathaCal bratedNSFWBucketThreshold,
      Pushserv ce.AgathaTextNSFWBucketThreshold,
      Pushserv ce.BucketOptoutThresholdParam,
      Pushserv ce.T et d aSens  veCategoryThresholdParam,
      Pushserv ce.Cand dateGenerat onModelCos neThreshold,
      Pushserv ce.MrModel ngBasedCand datesTop cScoreThreshold,
      Pushserv ce.HashspaceCand datesTop cScoreThreshold,
      Pushserv ce.FrsT etCand datesTop cScoreThreshold,
      Pushserv ce.Top cProofT etCand datesTop cScoreThreshold,
      Pushserv ce.SpacesTarget ngS mClusterDotProductThreshold,
      Pushserv ce.SautOonW h d aT etLengthThresholdParam,
      Pushserv ce.NonSautOonW h d aT etLengthThresholdParam,
      Pushserv ce.SautOonW hout d aT etLengthThresholdParam,
      Pushserv ce.NonSautOonW hout d aT etLengthThresholdParam,
      Pushserv ce.ArgfOonW h d aT etWordLengthThresholdParam,
      Pushserv ce.EsfthOonW h d aT etWordLengthThresholdParam,
      Pushserv ce.BqmlQual yModelPred cateThresholdParam,
      Pushserv ce.L ghtRank ngScr beCand datesDownSampl ngParam,
      Pushserv ce.Qual yUprank ngBoostFor avyRank ngParam,
      Pushserv ce.Qual yUprank ngS gmo dB asFor avyRank ngParam,
      Pushserv ce.Qual yUprank ngS gmo d  ghtFor avyRank ngParam,
      Pushserv ce.Qual yUprank ngL nearBarFor avyRank ngParam,
      Pushserv ce.Qual yUprank ngBoostForH ghQual yProducersParam,
      Pushserv ce.Qual yUprank ngDownboostForLowQual yProducersParam,
      Pushserv ce.Bqml althModelPred cateF lterThresholdParam,
      Pushserv ce.Bqml althModelPred cateBucketThresholdParam,
      Pushserv ce.PNegMult modalPred cateModelThresholdParam,
      Pushserv ce.PNegMult modalPred cateBucketThresholdParam,
      Pushserv ce.SeeLessOftenF1Tr ggerF1PushCap  ght,
      Pushserv ce.SeeLessOftenF1Tr ggerNonF1PushCap  ght,
      Pushserv ce.SeeLessOftenNonF1Tr ggerF1PushCap  ght,
      Pushserv ce.SeeLessOftenNonF1Tr ggerNonF1PushCap  ght,
      Pushserv ce.SeeLessOftenTr pHqT etTr ggerF1PushCap  ght,
      Pushserv ce.SeeLessOftenTr pHqT etTr ggerNonF1PushCap  ght,
      Pushserv ce.SeeLessOftenTr pHqT etTr ggerTr pHqT etPushCap  ght,
      Pushserv ce.SeeLessOftenNtabOnlyNot fUserPushCap  ght,
      Pushserv ce.PromptFeedbackF1Tr ggerF1PushCap  ght,
      Pushserv ce.PromptFeedbackF1Tr ggerNonF1PushCap  ght,
      Pushserv ce.PromptFeedbackNonF1Tr ggerF1PushCap  ght,
      Pushserv ce.PromptFeedbackNonF1Tr ggerNonF1PushCap  ght,
      Pushserv ce. nl neFeedbackF1Tr ggerF1PushCap  ght,
      Pushserv ce. nl neFeedbackF1Tr ggerNonF1PushCap  ght,
      Pushserv ce. nl neFeedbackNonF1Tr ggerF1PushCap  ght,
      Pushserv ce. nl neFeedbackNonF1Tr ggerNonF1PushCap  ght,
      Pushserv ce.T etNtabD sl keCountThresholdParam,
      Pushserv ce.T etNtabD sl keRateThresholdParam,
      Pushserv ce.T etNtabD sl keCountThresholdForMrTw stlyParam,
      Pushserv ce.T etNtabD sl keRateThresholdForMrTw stlyParam,
      Pushserv ce.T etNtabD sl keCountBucketThresholdParam,
      Pushserv ce.M nAuthorSendsThresholdParam,
      Pushserv ce.M nT etSendsThresholdParam,
      Pushserv ce.AuthorD sl keRateThresholdParam,
      Pushserv ce.AuthorReportRateThresholdParam,
      Pushserv ce.FavOverSendThresholdParam,
      Pushserv ce.SpreadControlRat oParam,
      Pushserv ce.T etQTtoNtabCl ckRat oThresholdParam,
      Pushserv ce.T etReplytoL keRat oThresholdLo rBound,
      Pushserv ce.T etReplytoL keRat oThresholdUpperBound,
      Pushserv ce.AuthorSens  ve d aF lter ngThreshold,
      Pushserv ce.AuthorSens  ve d aF lter ngThresholdForMrTw stly,
      Pushserv ce.MrRequestScr b ngEpsGreedyExplorat onRat o,
      Pushserv ce.SeeLessOftenTop cTr ggerTop cPushCap  ght,
      Pushserv ce.SeeLessOftenTop cTr ggerF1PushCap  ght,
      Pushserv ce.SeeLessOftenTop cTr ggerOONPushCap  ght,
      Pushserv ce.SeeLessOftenF1Tr ggerTop cPushCap  ght,
      Pushserv ce.SeeLessOftenOONTr ggerTop cPushCap  ght,
      Pushserv ce.SeeLessOftenDefaultPushCap  ght,
      Pushserv ce.Overr deMaxSlotFn  ght,
      Pushserv ce.Qual yPred cateExpl c ThresholdParam,
      Pushserv ce.AuthorSens  veScore  ght nRerank ng,
      Pushserv ce.B gF lter ngThresholdParam,
      Pushserv ce.NsfwScoreThresholdForF1Copy,
      Pushserv ce.NsfwScoreThresholdForOONCopy,
      Pushserv ce.H ghOONCThresholdForCopy,
      Pushserv ce.LowOONCThresholdForCopy,
      Pushserv ce.UserDev ceLanguageThresholdParam,
      Pushserv ce.User nferredLanguageThresholdParam,
      Pushserv ce.Spam T etOonThreshold,
      Pushserv ce.Spam T et nThreshold,
      Pushserv ce.Spam T etBucket ngThreshold,
      Pushserv ce.NumFollo rThresholdFor althAndQual yF lters,
      Pushserv ce.NumFollo rThresholdFor althAndQual yF ltersPrerank ng,
      Pushserv ce.SoftRankFactorForSubscr pt onCreators,
      Pushserv ce.Mag cFanoutS mClusterDotProduct avyUserThreshold,
      Pushserv ce.Mag cFanoutS mClusterDotProductNon avyUserThreshold
    )

  pr vate val doubleSeqFeatureSw chOverr des =
    FeatureSw chOverr deUt l.getDoubleSeqFSOverr des(
      Pushserv ce.MfGr dSearchThresholdsCohort1,
      Pushserv ce.MfGr dSearchThresholdsCohort2,
      Pushserv ce.MfGr dSearchThresholdsCohort3,
      Pushserv ce.MfGr dSearchThresholdsCohort4,
      Pushserv ce.MfGr dSearchThresholdsCohort5,
      Pushserv ce.MfGr dSearchThresholdsCohort6,
      Pushserv ce.MrPercent leGr dSearchThresholdsCohort1,
      Pushserv ce.MrPercent leGr dSearchThresholdsCohort2,
      Pushserv ce.MrPercent leGr dSearchThresholdsCohort3,
      Pushserv ce.MrPercent leGr dSearchThresholdsCohort4,
      Pushserv ce.MrPercent leGr dSearchThresholdsCohort5,
      Pushserv ce.MrPercent leGr dSearchThresholdsCohort6,
      Pushserv ce.GlobalOptoutThresholdParam,
      Pushserv ce.BucketOptoutSlotThresholdParam,
      Pushserv ce.BqmlQual yModelBucketThresholdL stParam,
      Pushserv ce.SeeLessOftenL stOfDayKnobs,
      Pushserv ce.SeeLessOftenL stOfPushCap  ghtKnobs,
      Pushserv ce.SeeLessOftenL stOfPo rKnobs,
      Pushserv ce.PromptFeedbackL stOfDayKnobs,
      Pushserv ce.PromptFeedbackL stOfPushCap  ghtKnobs,
      Pushserv ce.PromptFeedbackL stOfPo rKnobs,
      Pushserv ce. nl neFeedbackL stOfDayKnobs,
      Pushserv ce. nl neFeedbackL stOfPushCap  ghtKnobs,
      Pushserv ce. nl neFeedbackL stOfPo rKnobs,
      Pushserv ce.Overr deMaxSlotFnPushCapKnobs,
      Pushserv ce.Overr deMaxSlotFnPo rKnobs,
      Pushserv ce.Overr deMaxSlotFnPushCapKnobs,
      Pushserv ce.Mag cRecsRelevanceScoreRange,
      Pushserv ce.Mag cFanoutRelevanceScoreRange,
      Pushserv ce.Mult l ngualPnsfwT etTextBucket ngThreshold,
      Pushserv ce.Mult l ngualPnsfwT etTextF lter ngThreshold,
    )

  pr vate val booleanFeatureSw chOverr des = FeatureSw chOverr deUt l.getBooleanFSOverr des(
    Pushserv ce.EnablePushRecom ndat onsParam,
    Pushserv ce.D sable avyRank ngModelFSParam,
    Pushserv ce.EnablePushM xerReplac ngAllS ces,
    Pushserv ce.EnablePushM xerReplac ngAllS cesW hControl,
    Pushserv ce.EnablePushM xerReplac ngAllS cesW hExtra,
    Pushserv ce.EnablePushM xerS ce,
    Common.EnableSc duledSpaceSpeakers,
    Common.EnableSc duledSpaceSubscr bers,
    Pushserv ce.Mag cFanoutNewsUserGeneratedEventsEnable,
    Pushserv ce.Mag cFanoutSk pAccountCountryPred cate,
    Pushserv ce.Mag cFanoutNewsEnableDescr pt onCopy,
    Pushserv ce.EnableF1Tr ggerSeeLessOftenFat gue,
    Pushserv ce.EnableNonF1Tr ggerSeeLessOftenFat gue,
    Pushserv ce.AdjustTr pHqT etTr ggeredNtabCaretCl ckFat gue,
    Pushserv ce.EnableCuratedTrendT ets,
    Pushserv ce.EnableNonCuratedTrendT ets,
    Pushserv ce.D sableMl nF lter ngFeatureSw chParam,
    Pushserv ce.EnableTop cCopyForMF,
    Pushserv ce.EnableTop cCopyFor mpl c Top cs,
    Pushserv ce.EnableRestr ctStep,
    Pushserv ce.EnableH ghPr or yPush,
    Pushserv ce.BoostCand datesFromSubscr pt onCreators,
    Pushserv ce.SoftRankCand datesFromSubscr pt onCreators,
    Pushserv ce.EnableNewMROONCopyForPush,
    Pushserv ce.EnableQueryAuthor d aRepresentat onStore,
    Pushserv ce.EnableProfan yF lterParam,
    Pushserv ce.EnableAbuseStr keTop2PercentF lterS mCluster,
    Pushserv ce.EnableAbuseStr keTop1PercentF lterS mCluster,
    Pushserv ce.EnableAbuseStr keTop05PercentF lterS mCluster,
    Pushserv ce.EnableAgathaUser althModelPred cate,
    Pushserv ce.PnsfwT et d aF lterOonOnly,
    Pushserv ce.Enable althS gnalStorePnsfwT etTextPred cate,
    Pushserv ce.Enable althS gnalStoreMult l ngualPnsfwT etTextPred cate,
    Pushserv ce.D sable althF ltersForCrM xerCand dates,
    Pushserv ce.EnableOverr deNot f cat onsForAndro d,
    Pushserv ce.EnableOverr deNot f cat onsFor os,
    Pushserv ce.EnableMrRequestScr b ngForTargetF lter ng,
    Pushserv ce.EnableMrRequestScr b ngForCand dateF lter ng,
    Pushserv ce.EnableMrRequestScr b ngW hFeatureHydrat ng,
    Pushserv ce.EnableFlattenMrRequestScr b ng,
    Pushserv ce.EnableMrRequestScr b ngForEpsGreedyExplorat on,
    Pushserv ce.EnableMrRequestScr b ngD sm ssScore,
    Pushserv ce.EnableMrRequestScr b ngB gF lter ngSuperv sedScores,
    Pushserv ce.EnableMrRequestScr b ngB gF lter ngRLScores,
    Pushserv ce.EnableEventPr mary d aAndro d,
    Pushserv ce.EnableEventSquare d a osMag cFanoutNewsEvent,
    Pushserv ce.EnableEventSquare d aAndro d,
    Pushserv ce.EnableMag cFanoutNewsFor NtabCopy,
    Pushserv ce.EnableMfGeoTarget ng,
    Pushserv ce.EnableRuxLand ngPage,
    Pushserv ce.EnableNTabRuxLand ngPage,
    Pushserv ce.EnableGraduallyRampUpNot f cat on,
    Pushserv ce.EnableOnboard ngPus s,
    Pushserv ce.EnableAddressBookPush,
    Pushserv ce.EnableCompleteOnboard ngPush,
    Pushserv ce.EnableOverr deNot f cat onsSmartPushConf gForAndro d,
    Pushserv ce.D sableOnboard ngPushFat gue,
    Pushserv ce.EnableTopT etsByGeoCand dates,
    Pushserv ce.Backf llRankTopT etsByGeoCand dates,
    Pushserv ce.PopGeoT etEnableAggress veThresholds,
    Pushserv ce.EnableMrM nDurat onS nceMrPushFat gue,
    Pushserv ce.EnableF1FromProtectedT etAuthors,
    Pushserv ce.Mag cFanoutEnableCustomTarget ngNewsEvent,
    Pushserv ce.EnableSafeUserT etT etyp eStore,
    Pushserv ce.EnableMrM nDurat onS nceMrPushFat gue,
    Pushserv ce.EnableHydrat ngOnl neMR toryFeatures,
    Common.SpaceRecsEnableHostNot fs,
    Common.SpaceRecsEnableSpeakerNot fs,
    Common.SpaceRecsEnableL stenerNot fs,
    Common.EnableMag cFanoutProductLaunch,
    Pushserv ce.EnableTopT etsByGeoCand datesForDormantUsers,
    Pushserv ce.EnableOverr deNot f cat onsScoreBasedOverr de,
    Pushserv ce.EnableOverr deNot f cat onsMult pleTarget ds,
    Pushserv ce.EnableM nDurat onMod f er,
    Pushserv ce.EnableM nDurat onMod f erV2,
    Pushserv ce.EnableM nDurat onMod f erByUser tory,
    Pushserv ce.EnableQueryUserOpened tory,
    Pushserv ce.EnableRandomH ForQu ckSend,
    Pushserv ce.EnableFrsCand dates,
    Pushserv ce.EnableFrsT etCand datesTop cSett ng,
    Pushserv ce.EnableFrsT etCand datesTop cAnnotat on,
    Pushserv ce.EnableFrsT etCand datesTop cCopy,
    Pushserv ce.EnableCand dateGenerat onModelParam,
    Pushserv ce.EnableOverr deForSportsCand dates,
    Pushserv ce.EnableEvent dBasedOverr deForSportsCand dates,
    Pushserv ce.EnableMrModel ngBasedCand dates,
    Pushserv ce.EnableMrModel ngBasedCand datesTop cSett ng,
    Pushserv ce.EnableMrModel ngBasedCand datesTop cAnnotat on,
    Pushserv ce.EnableMrModel ngBasedCand datesTop cCopy,
    Pushserv ce.EnableResultFromFrsCand dates,
    Pushserv ce.EnableHashspaceCand dates,
    Pushserv ce.EnableHashspaceCand datesTop cSett ng,
    Pushserv ce.EnableHashspaceCand datesTop cAnnotat on,
    Pushserv ce.EnableHashspaceCand datesTop cCopy,
    Pushserv ce.EnableResultFromHashspaceCand dates,
    Pushserv ce.EnableDownRankOfNewUserPlaybookTop cFollowPush,
    Pushserv ce.EnableDownRankOfNewUserPlaybookTop cT etPush,
    Pushserv ce.EnableTopT et mpress onsNot f cat on,
    Pushserv ce.EnableL ghtRank ngParam,
    Pushserv ce.EnableRandomBasel neL ghtRank ngParam,
    Pushserv ce.EnableQual yUprank ngFor avyRank ngParam,
    Pushserv ce.EnableQual yUprank ngCrtScoreStatsFor avyRank ngParam,
    Pushserv ce.EnableProducersQual yBoost ngFor avyRank ngParam,
    Pushserv ce.EnableMrScr b ngMLFeaturesAsFeatureMapForStag ng,
    Pushserv ce.EnableMrT etSent  ntFeatureHydrat onFS,
    Pushserv ce.EnableT  l ne althS gnalHydrat on,
    Pushserv ce.EnableTop cEngage ntRealT  AggregatesFS,
    Pushserv ce.EnableMrUserSemant cCoreFeatureForExpt,
    Pushserv ce.EnableHydrat ngRealGraphTargetUserFeatures,
    Pushserv ce.EnableHydrat ngUserDurat onS nceLastV s Features,
    Pushserv ce.EnableRealGraphUserAuthorAndSoc alContxtFeatureHydrat on,
    Pushserv ce.EnableUserTop cAggregatesFS,
    Pushserv ce.EnableT  l ne althS gnalHydrat onForModelTra n ng,
    Pushserv ce.EnableMrUserSoc alContextAggregateFeatureHydrat on,
    Pushserv ce.EnableMrUserSemant cCoreAggregateFeatureHydrat on,
    Pushserv ce.EnableMrUserCand dateSparseOffl neAggregateFeatureHydrat on,
    Pushserv ce.EnableMrUserCand dateOffl neAggregateFeatureHydrat on,
    Pushserv ce.EnableMrUserCand dateOffl neCompactAggregateFeatureHydrat on,
    Pushserv ce.EnableMrUserAuthorOffl neAggregateFeatureHydrat on,
    Pushserv ce.EnableMrUserAuthorOffl neCompactAggregateFeatureHydrat on,
    Pushserv ce.EnableMrUserOffl neCompactAggregateFeatureHydrat on,
    Pushserv ce.EnableMrUserS mcluster2020AggregateFeatureHydrat on,
    Pushserv ce.EnableMrUserOffl neAggregateFeatureHydrat on,
    Pushserv ce.EnableBqmlQual yModelPred cateParam,
    Pushserv ce.EnableBqmlQual yModelScore togramParam,
    Pushserv ce.EnableBqml althModelPred cateParam,
    Pushserv ce.EnableBqml althModelPred ct onFor nNetworkCand datesParam,
    Pushserv ce.EnableBqml althModelScore togramParam,
    Pushserv ce.EnablePNegMult modalPred cateParam,
    Pushserv ce.EnableNegat veKeywordsPred cateParam,
    Pushserv ce.EnableT etAuthorAggregatesFeatureHydrat onParam,
    Pushserv ce.OonT etLengthPred cateUpdated d aLog c,
    Pushserv ce.OonT etLengthPred cateUpdatedQuoteT etLog c,
    Pushserv ce.OonT etLengthPred cateMoreStr ctForUndef nedLanguages,
    Pushserv ce.EnablePrerank ngT etLengthPred cate,
    Pushserv ce.EnableDeTop cT etCand dates,
    Pushserv ce.EnableDeTop cT etCand dateResults,
    Pushserv ce.EnableDeTop cT etCand datesCustomTop cs,
    Pushserv ce.EnableDeTop cT etCand datesCustomLanguages,
    Pushserv ce.EnableMrT etS mClusterFeatureHydrat onFS,
    Pushserv ce.D sableOutNetworkT etCand datesFS,
    Pushserv ce.EnableLaunchV deos n m rs veExplore,
    Pushserv ce.EnableStor ngNtabGener cNot fKey,
    Pushserv ce.EnableDelet ngNtabT  l ne,
    Pushserv ce.EnableOverr deNot f cat onsNSlots,
    Pushserv ce.EnableNslotsForOverr deOnNtab,
    Pushserv ce.EnableOverr deMaxSlotFn,
    Pushserv ce.EnableTarget d nSmartPushPayloadForMag cFanoutSportsEvent,
    Pushserv ce.EnableOverr de dNTabRequest,
    Pushserv ce.EnableOverr deForSpaces,
    Pushserv ce.EnableTop cProofT etRecs,
    Pushserv ce.Enable althF ltersForTop cProofT et,
    Pushserv ce.EnableTarget ds nSmartPushPayload,
    Pushserv ce.EnableSecondaryAccountPred cateMF,
    Pushserv ce.Enable nl neV deo,
    Pushserv ce.EnableAutoplayFor nl neV deo,
    Pushserv ce.EnableOONGenerated nl neAct ons,
    Pushserv ce.Enable nl neFeedbackOnPush,
    Pushserv ce.Use nl neAct onsV1,
    Pushserv ce.Use nl neAct onsV2,
    Pushserv ce.EnableFeaturedSpacesOON,
    Pushserv ce.C ckFeaturedSpaceOON,
    Pushserv ce.EnableGeoTarget ngForSpaces,
    Pushserv ce.EnableEmployeeOnlySpaceNot f cat ons,
    Pushserv ce.EnableSpacesTtlForNtab,
    Pushserv ce.EnableCustomThread dForOverr de,
    Pushserv ce.EnableS mClusterTarget ngSpaces,
    Pushserv ce.Target n nl neAct onAppV s Fat gue,
    Pushserv ce.Enable nl neAct onAppV s Fat gue,
    Pushserv ce.EnableThresholdOfFavMrModel ngBasedCand dates,
    Pushserv ce.HydrateMrUserS mclusterV2020 nModel ngBasedCG,
    Pushserv ce.HydrateMrUserSemant cCore nModel ngBasedCG,
    Pushserv ce.HydrateOnboard ng nModel ngBasedCG,
    Pushserv ce.HydrateTop cFollow nModel ngBasedCG,
    Pushserv ce.HydrateMrUserTop c nModel ngBasedCG,
    Pushserv ce.HydrateMrUserAuthor nModel ngBasedCG,
    Pushserv ce.HydrateUserPengu nLanguage nModel ngBasedCG,
    Pushserv ce.EnableMrUserEngagedT etTokensFeature,
    Pushserv ce.HydrateMrUserHashspaceEmbedd ng nModel ngBasedCG,
    Pushserv ce.HydrateUseGeo nModel ngBasedCG,
    Pushserv ce.EnableSpaceCohostJo nEvent,
    Pushserv ce.EnableOONF lter ngBasedOnUserSett ngs,
    Pushserv ce.EnableContFnF1Tr ggerSeeLessOftenFat gue,
    Pushserv ce.EnableContFnNonF1Tr ggerSeeLessOftenFat gue,
    Pushserv ce.EnableContFnF1Tr ggerPromptFeedbackFat gue,
    Pushserv ce.EnableContFnNonF1Tr ggerPromptFeedbackFat gue,
    Pushserv ce.EnableContFnF1Tr gger nl neFeedbackFat gue,
    Pushserv ce.EnableContFnNonF1Tr gger nl neFeedbackFat gue,
    Pushserv ce.Use nl neD sl keForFat gue,
    Pushserv ce.Use nl neD sm ssForFat gue,
    Pushserv ce.Use nl neSeeLessForFat gue,
    Pushserv ce.Use nl neNotRelevantForFat gue,
    Pushserv ce.GPEnableCustomMag cFanoutCr cketFat gue,
    Pushserv ce. ncludeRelevanceScore n b s2Payload,
    Pushserv ce.BypassGlobalSpacePushCapForSoftDev ceFollow,
    Pushserv ce.EnableCountryCodeBackoffTopT etsByGeo,
    Pushserv ce.EnableNewCreatorPush,
    Pushserv ce.EnableCreatorSubscr pt onPush,
    Pushserv ce.Enable nsSender,
    Pushserv ce.EnableOptoutAdjustedPushcap,
    Pushserv ce.EnableOONBackf llBasedOnF1Cand dates,
    Pushserv ce.EnableVF nT etyp e,
    Pushserv ce.EnablePushPresentat onVer f edSymbol,
    Pushserv ce.EnableH ghPr or ySportsPush,
    Pushserv ce.EnableSearchURLRed rectForSportsFanout,
    Pushserv ce.EnableScoreFanoutNot f cat on,
    Pushserv ce.EnableExpl c PushCap,
    Pushserv ce.EnableNsfwTokenBasedF lter ng,
    Pushserv ce.EnableRestr ctedM nModelPushcap,
    Pushserv ce.EnableGener cCRTBasedFat guePred cate,
    Pushserv ce.EnableCopyFeaturesForF1,
    Pushserv ce.EnableEmoj  nF1Copy,
    Pushserv ce.EnableTarget nF1Copy,
    Pushserv ce.EnableCopyFeaturesForOon,
    Pushserv ce.EnableEmoj  nOonCopy,
    Pushserv ce.EnableTarget nOonCopy,
    Pushserv ce.EnableF1CopyBody,
    Pushserv ce.EnableOONCopyBody,
    Pushserv ce.Enable osCopyBodyTruncate,
    Pushserv ce.EnableHTLBasedFat gueBas cRule,
    Pushserv ce.EnableTargetAndEmoj Spl Fat gue,
    Pushserv ce.EnableNsfwCopy,
    Pushserv ce.EnableOONCopyBody,
    Pushserv ce.EnableT etDynam c nl neAct ons,
    Pushserv ce.EnablePushcapRefactor,
    Pushserv ce.B gF lter ngEnable togramsParam,
    Pushserv ce.EnableT etTranslat on,
    Pushserv ce.Tr pT etCand dateReturnEnable,
    Pushserv ce.EnableSoc alContextForRet et,
    Pushserv ce.EnableEmptyBody,
    Pushserv ce.EnableLocalV ralT ets,
    Pushserv ce.EnableExploreV deoT ets,
    Pushserv ce.EnableDynam c nl neAct onsForDesktop b,
    Pushserv ce.EnableDynam c nl neAct onsForMob le b,
    Pushserv ce.EnableNTabEntr esForSportsEventNot f cat ons,
    Pushserv ce.EnableNTabFaceP leForSportsEventNot f cat ons,
    Pushserv ce.D sable sTargetBlueVer f edPred cate,
    Pushserv ce.EnableNTabEntr esForProductLaunchNot f cat ons,
    Pushserv ce.D sable sTargetLegacyVer f edPred cate,
    Pushserv ce.EnableNTabOverr deForSportsEventNot f cat ons,
    Pushserv ce.EnableOONCBasedCopy,
    Pushserv ce.H ghQual yCand datesEnableCand dateS ce,
    Pushserv ce.H ghQual yCand datesEnableFallback,
    Pushserv ce.EnableT etLanguageF lter,
    Pushserv ce.EnableL stRecom ndat ons,
    Pushserv ce.Enable DSL stRecom ndat ons,
    Pushserv ce.EnablePopGeoL stRecom ndat ons,
    Pushserv ce.Sk pLanguageF lterFor d aT ets,
    Pushserv ce.EnableSpam T etF lter,
    Pushserv ce.EnableT etPushToHo Andro d,
    Pushserv ce.EnableT etPushToHo  OS,
    Pushserv ce.EnableBoundedFeatureSetForSoc alContext,
    Pushserv ce.EnableStpBoundedFeatureSetForUserSoc alContext,
    Pushserv ce.EnableCoreUser toryBoundedFeatureSetForSoc alContext,
    Pushserv ce.Sk pPostRank ngF lters,
    Pushserv ce.MR bHoldbackParam,
    Pushserv ce.Enable sTargetSuperFollowCreatorPred cate
  )

  pr vate val longSeqFeatureSw chOverr des =
    FeatureSw chOverr deUt l.getLongSeqFSOverr des(
      Pushserv ce.Mag cFanoutEventAllowl stToSk pAccountCountryPred cate
    )

  pr vate val longSetFeatureSw chOverr des =
    FeatureSw chOverr deUt l.getLongSetFSOverr des(
      Pushserv ce.L stOfAdhoc dsForStatsTrack ng
    )

  pr vate val str ngSeqFeatureSw chOverr des =
    FeatureSw chOverr deUt l.getStr ngSeqFSOverr des(
      Pushserv ce.L stOfCrtsForOpenApp,
      Pushserv ce.L stOfCrtsToUpRank,
      Pushserv ce.OONCand datesD sabledCrTagParam,
      Pushserv ce.L stOfCrtsToDownRank,
      Pushserv ce.Mag cFanoutDenyL stedCountr es,
      Pushserv ce.GlobalOptoutModelParam,
      Pushserv ce.BqmlQual yModelBucketModel dL stParam,
      Pushserv ce.CommonRecom ndat onTypeDenyL stPushHoldbacks,
      Pushserv ce.TargetLevelFeatureL stForMrRequestScr b ng,
      Pushserv ce.Mag cFanoutSportsEventDenyL stedCountr es,
      Pushserv ce.Mult l ngualPnsfwT etTextSupportedLanguages,
      Pushserv ce.Negat veKeywordsPred cateDenyl st,
      Pushserv ce.Tr pT etCand dateS ce ds,
      Pushserv ce.NsfwTokensParam,
      Pushserv ce.H ghQual yCand datesFallbackS ce ds
    )

  pr vate val  ntSeqFeatureSw chOverr des =
    FeatureSw chOverr deUt l.get ntSeqFSOverr des(
      Pushserv ce.BucketOptoutSlotPushcapParam,
      Pushserv ce.GeoHashLengthL st,
      Pushserv ce.M nDurat onMod f erStartH L st,
      Pushserv ce.M nDurat onMod f erEndH L st,
      Pushserv ce.M nDurat onT  Mod f erConst
    )

  pr vate val enumFeatureSw chOverr des = FeatureSw chOverr deUt l.getEnumFSOverr des(
    stat,
    logger,
    Pushserv ce.MRBoldT leFavor eAndRet etParam,
    Pushserv ce.Qual yUprank ngTransformTypeParam,
    Pushserv ce.Qual yPred cate dParam,
    Pushserv ce.B gF lter ngNormal zat onType dParam,
    Common.PushcapModelType,
    Common.MFCr cketTarget ngPred cate,
    Pushserv ce.Rank ngFunct onForTopT etsByGeo,
    Pushserv ce.TopT etsByGeoComb nat onParam,
    Pushserv ce.PopGeoT etVers onParam,
    Pushserv ce.Subtext nAndro dPush aderParam,
    Pushserv ce.H ghOONCT etFormat,
    Pushserv ce.LowOONCT etFormat,
  )

  pr vate val enumSeqFeatureSw chOverr des = FeatureSw chOverr deUt l.getEnumSeqFSOverr des(
    stat,
    logger,
    Pushserv ce.OONT etDynam c nl neAct onsL st,
    Pushserv ce.T etDynam c nl neAct onsL st,
    Pushserv ce.T etDynam c nl neAct onsL stFor b,
    Pushserv ce.H ghQual yCand datesEnableGroups,
    Pushserv ce.H ghQual yCand datesFallbackEnabledGroups,
    Pushserv ce.OONCand datesD sabledCrtGroupParam,
    Pushserv ce.Mult l ngualPnsfwT etTextBucket ngModelL st,
  )

  pr vate val str ngFeatureSw chOverr des = FeatureSw chOverr deUt l.getStr ngFSOverr des(
    Common.PushcapModelPred ct onVers on,
    Pushserv ce.  ghtedOpenOrNtabCl ckRank ngModelParam,
    Pushserv ce.  ghtedOpenOrNtabCl ckF lter ngModelParam,
    Pushserv ce.BucketOptoutModelParam,
    Pushserv ce.Scor ngFuncForTopT etsByGeo,
    Pushserv ce.L ghtRank ngModelTypeParam,
    Pushserv ce.B gF lter ngSuperv sedSend ngModelParam,
    Pushserv ce.B gF lter ngSuperv sedW houtSend ngModelParam,
    Pushserv ce.B gF lter ngRLSend ngModelParam,
    Pushserv ce.B gF lter ngRLW houtSend ngModelParam,
    Pushserv ce.BqmlQual yModelTypeParam,
    Pushserv ce.Bqml althModelTypeParam,
    Pushserv ce.Qual yUprank ngModelTypeParam,
    Pushserv ce.SearchURLRed rectForSportsFanout,
    Pushserv ce.LocalV ralT etsBucket,
    Pushserv ce.H ghQual yCand dates avyRank ngModel,
    Pushserv ce.H ghQual yCand datesNonPersonal zedQual yCnnModel,
    Pushserv ce.H ghQual yCand datesBqmlNsfwModel,
    Pushserv ce.H ghQual yCand datesBqmlReportModel,
    Pushserv ce.ProductLaunchLand ngPageDeepL nk,
    Pushserv ce.ProductLaunchTapThrough,
    Pushserv ce.T etLanguageFeatureNa Param
  )

  pr vate val durat onFeatureSw chOverr des =
    FeatureSw chOverr deUt l.getBoundedDurat onFSOverr des(
      Common.NumberOfDaysToF lterMRForSeeLessOften,
      Common.NumberOfDaysToReducePushCapForSeeLessOften,
      Pushserv ce.NumberOfDaysToF lterForSeeLessOftenForF1Tr ggerF1,
      Pushserv ce.NumberOfDaysToReducePushCapForSeeLessOftenForF1Tr ggerF1,
      Pushserv ce.NumberOfDaysToF lterForSeeLessOftenForF1Tr ggerNonF1,
      Pushserv ce.NumberOfDaysToReducePushCapForSeeLessOftenForF1Tr ggerNonF1,
      Pushserv ce.NumberOfDaysToF lterForSeeLessOftenForNonF1Tr ggerF1,
      Pushserv ce.NumberOfDaysToReducePushCapForSeeLessOftenForNonF1Tr ggerF1,
      Pushserv ce.NumberOfDaysToF lterForSeeLessOftenForNonF1Tr ggerNonF1,
      Pushserv ce.NumberOfDaysToReducePushCapForSeeLessOftenForNonF1Tr ggerNonF1,
      Pushserv ce.TrendT etNot f cat onsFat gueDurat on,
      Pushserv ce.M nDurat onS ncePushParam,
      Pushserv ce.MFM n ntervalFat gue,
      Pushserv ce.S mclusterBasedCand dateMaxT etAgeParam,
      Pushserv ce.Detop cBasedCand dateMaxT etAgeParam,
      Pushserv ce.F1Cand dateMaxT etAgeParam,
      Pushserv ce.MaxT etAgeParam,
      Pushserv ce.Model ngBasedCand dateMaxT etAgeParam,
      Pushserv ce.GeoPopT etMaxAge nH s,
      Pushserv ce.M nDurat onS ncePushParam,
      Pushserv ce.GraduallyRampUpPhaseDurat onDays,
      Pushserv ce.MrM nDurat onS ncePushForOnboard ngPus s,
      Pushserv ce.Fat gueForOnboard ngPus s,
      Pushserv ce.Fr gate toryOt rNot f cat onWr eTtl,
      Pushserv ce.Fr gate toryT etNot f cat onWr eTtl,
      Pushserv ce.TopT etsByGeoPush nterval,
      Pushserv ce.H ghQual yT etsPush nterval,
      Pushserv ce.MrM nDurat onS ncePushForTopT etsByGeoPus s,
      Pushserv ce.T  S nceLastLog nForGeoPopT etPush,
      Pushserv ce.NewUserPlaybookAllo dLastLog nH s,
      Pushserv ce.SpaceRecsAppFat gueDurat on,
      Pushserv ce.OONSpaceRecsFat gueDurat on,
      Pushserv ce.SpaceRecsFat gueM n ntervalDurat on,
      Pushserv ce.SpaceRecsGlobalFat gueDurat on,
      Pushserv ce.M n mumT  S nceLastLog nForGeoPopT etPush,
      Pushserv ce.M nFat gueDurat onS nceLastHTLV s ,
      Pushserv ce.LastHTLV s BasedNonFat gueW ndow,
      Pushserv ce.SpaceNot f cat onsTTLDurat onForNTab,
      Pushserv ce.Overr deNot f cat onsLookbackDurat onForOverr de nfo,
      Pushserv ce.Overr deNot f cat onsLookbackDurat onFor mpress on d,
      Pushserv ce.Overr deNot f cat onsLookbackDurat onForNTab,
      Pushserv ce.TopT et mpress onsNot f cat on nterval,
      Pushserv ce.TopT et mpress onsFat gueM n ntervalDurat on,
      Pushserv ce.MFPush nterval nH s,
      Pushserv ce. nl neAct onAppV s Fat gue,
      Pushserv ce.SpacePart c pant toryLastAct veThreshold,
      Pushserv ce.SportsM n ntervalFat gue,
      Pushserv ce.SportsPush nterval nH s,
      Pushserv ce.SportsM n ntervalFat guePerEvent,
      Pushserv ce.SportsPush nterval nH sPerEvent,
      Pushserv ce.TargetNtabOnlyCapFat gue ntervalH s,
      Pushserv ce.TargetPushCapFat gue ntervalH s,
      Pushserv ce.CopyFeatures toryLookbackDurat on,
      Pushserv ce.F1Emoj CopyFat gueDurat on,
      Pushserv ce.F1TargetCopyFat gueDurat on,
      Pushserv ce.OonEmoj CopyFat gueDurat on,
      Pushserv ce.OonTargetCopyFat gueDurat on,
      Pushserv ce.ProductLaunchPush nterval nH s,
      Pushserv ce.ExploreV deoT etAgeParam,
      Pushserv ce.L stRecom ndat onsPush nterval,
      Pushserv ce.ProductLaunchM n ntervalFat gue,
      Pushserv ce.NewCreatorPush nterval nH s,
      Pushserv ce.NewCreatorPushM n ntervalFat gue,
      Pushserv ce.CreatorSubscr pt onPush nterval nH s,
      Pushserv ce.CreatorSubscr pt onPushhM n ntervalFat gue
    )

  pr vate[params] val allFeatureSw chOverr des =
    booleanDec derOverr des ++
      booleanFeatureSw chOverr des ++
       ntFeatureSw chOverr des ++
      doubleFeatureSw chOverr des ++
      doubleSeqFeatureSw chOverr des ++
      enumFeatureSw chOverr des ++
      str ngSeqFeatureSw chOverr des ++
      str ngFeatureSw chOverr des ++
      durat onFeatureSw chOverr des ++
       ntSeqFeatureSw chOverr des ++
      longSeqFeatureSw chOverr des ++
      enumSeqFeatureSw chOverr des ++
      longSetFeatureSw chOverr des

  val conf g = BaseConf gBu lder(allFeatureSw chOverr des).bu ld()
}
