na space java com.tw ter.s mclusters_v2.thr ftjava
na space py gen.tw ter.s mclusters_v2. dent f er
#@na space scala com.tw ter.s mclusters_v2.thr ftscala
#@na space strato com.tw ter.s mclusters_v2

 nclude "com/tw ter/s mclusters_v2/onl ne_store.thr ft"

/**
  * T  un form type for a S mClusters Embedd ngs.
  * Each embedd ngs have t  un form underly ng storage.
  * Warn ng: Every Embedd ngType should map to one and only one  nternal d.
  **/
enum Embedd ngType {
  // Reserve 001 - 99 for T et embedd ngs
	FavBasedT et = 1, // Deprecated
	FollowBasedT et = 2, // Deprecated
	LogFavBasedT et = 3, // Product on Vers on
	FavBasedTw stlyT et = 10, // Deprecated
	LogFavBasedTw stlyT et = 11, // Deprecated
	LogFavLongestL2Embedd ngT et = 12, // Product on Vers on

  // T et embedd ngs generated from non-fav events
  // Nam ng convent on: {Event}{Score}BasedT et
  // {Event}: T   nteract on event   use to bu ld t  t et embedd ngs
  // {Score}: T  score from user  nterested n embedd ngs
  V deoPlayBack50LogFavBasedT et = 21,
  Ret etLogFavBasedT et = 22,
  ReplyLogFavBasedT et = 23,
  PushOpenLogFavBasedT et = 24,

  // [Exper  ntal] Offl ne generated FavThroughRate-based T et Embedd ng
  Pop1000RankDecay11T et = 30,
  Pop10000RankDecay11T et = 31,
  OonPop1000RankDecayT et = 32,

  // [Exper  ntal] Offl ne generated product on-l ke LogFavScore-based T et Embedd ng
  Offl neGeneratedLogFavBasedT et = 40,

  // Reserve 51-59 for Ads Embedd ng
  LogFavBasedAdsT et = 51, // Exper  ntal embedd ng for ads t et cand date
  LogFavCl ckBasedAdsT et = 52, // Exper  ntal embedd ng for ads t et cand date

  // Reserve 60-69 for Evergreen content
  LogFavBasedEvergreenT et = 60,
  LogFavBasedRealT  T et = 65,

	// Reserve 101 to 149 for Semant c Core Ent y embedd ngs
  FavBasedSemat cCoreEnt y = 101, // Deprecated
  FollowBasedSemat cCoreEnt y = 102, // Deprecated
  FavBasedHashtagEnt y = 103, // Deprecated
  FollowBasedHashtagEnt y = 104, // Deprecated
  ProducerFavBasedSemant cCoreEnt y = 105, // Deprecated
  ProducerFollowBasedSemant cCoreEnt y = 106,// Deprecated
  FavBasedLocaleSemant cCoreEnt y = 107, // Deprecated
  FollowBasedLocaleSemant cCoreEnt y = 108, // Deprecated
  LogFavBasedLocaleSemant cCoreEnt y = 109, // Deprecated
  LanguageF lteredProducerFavBasedSemant cCoreEnt y = 110, // Deprecated
  LanguageF lteredFavBasedLocaleSemant cCoreEnt y = 111, // Deprecated
  FavTfgTop c = 112, // TFG top c embedd ng bu lt from fav-based user  nterested n
  LogFavTfgTop c = 113, // TFG top c embedd ng bu lt from logfav-based user  nterested n
  Fav nferredLanguageTfgTop c = 114, // TFG top c embedd ng bu lt us ng  nferred consu d languages
  FavBasedKgoApeTop c = 115, // top c embedd ng us ng fav-based aggregatable producer embedd ng of KGO seed accounts.
  LogFavBasedKgoApeTop c = 116, // top c embedd ng us ng log fav-based aggregatable producer embedd ng of KGO seed accounts.
  FavBasedOnboard ngApeTop c = 117, // top c embedd ng us ng fav-based aggregatable producer embedd ng of onboard ng seed accounts.
  LogFavBasedOnboard ngApeTop c = 118, // top c embedd ng us ng log fav-based aggregatable producer embedd ng of onboard ng seed accounts.
  LogFavApeBasedMuseTop c = 119, // Deprecated
  LogFavApeBasedMuseTop cExper  nt = 120 // Deprecated

  // Reserved 201 - 299 for Producer embedd ngs (KnownFor)
  FavBasedProducer = 201
  FollowBasedProducer = 202
  AggregatableFavBasedProducer = 203 // fav-based aggregatable producer embedd ng.
  AggregatableLogFavBasedProducer = 204 // logfav-based aggregatable producer embedd ng.
  RelaxedAggregatableLogFavBasedProducer = 205 // logfav-based aggregatable producer embedd ng.
  AggregatableFollowBasedProducer = 206 // follow-based aggregatable producer embedd ng.
  KnownFor = 300

  // Reserved 301 - 399 for User  nterested n embedd ngs
  FavBasedUser nterested n = 301
  FollowBasedUser nterested n = 302
  LogFavBasedUser nterested n = 303
  RecentFollowBasedUser nterested n = 304 //  nterested- n embedd ng based on aggregat ng producer embedd ngs of recent follows
  F lteredUser nterested n = 305 //  nterested- n embedd ng used by tw stly read path
  LogFavBasedUser nterested nFromAPE = 306
  FollowBasedUser nterested nFromAPE = 307
  Tw ceUser nterested n = 308 //  nterested- n mult -embedd ng based on cluster ng producer embedd ngs of ne ghbors
  Unf lteredUser nterested n = 309
  UserNext nterested n = 310 // next  nterested- n embedd ng generated from BeT

  // Denser User  nterested n, generated by Producer embedd ngs.
  FavBasedUser nterested nFromPE = 311
  FollowBasedUser nterested nFromPE = 312
  LogFavBasedUser nterested nFromPE = 313
  F lteredUser nterested nFromPE = 314 //  nterested- n embedd ng used by tw stly read path

  // [Exper  ntal] Denser User  nterested n, generated by aggregat ng   APE embedd ng from AddressBook
  LogFavBasedUser nterestedMaxpool ngAddressBookFrom  APE = 320
  LogFavBasedUser nterestedAverageAddressBookFrom  APE = 321
  LogFavBasedUser nterestedBooktypeMaxpool ngAddressBookFrom  APE = 322
  LogFavBasedUser nterestedLargestD mMaxpool ngAddressBookFrom  APE = 323
  LogFavBasedUser nterestedLouva nMaxpool ngAddressBookFrom  APE = 324
  LogFavBasedUser nterestedConnectedMaxpool ngAddressBookFrom  APE = 325

  //Reserved 401 - 500 for Space embedd ng
  FavBasedApeSpace = 401 // DEPRECATED
  LogFavBasedL stenerSpace = 402 // DEPRECATED
  LogFavBasedAPESpeakerSpace = 403 // DEPRECATED
  LogFavBasedUser nterested nL stenerSpace = 404 // DEPRECATED

  // Exper  ntal,  nternal-only  Ds
  Exper  ntalTh rtyDayRecentFollowBasedUser nterested n = 10000 // L ke RecentFollowBasedUser nterested n, except l m ed to last 30 days
	Exper  ntalLogFavLongestL2Embedd ngT et = 10001 // DEPRECATED
}(pers sted = 'true', hasPersonalData = 'false')

/**
  * T  un form type for a S mClusters Mult Embedd ngs.
  * Warn ng: Every Mult Embedd ngType should map to one and only one  nternal d.
  **/
enum Mult Embedd ngType {
  // Reserved 0-99 for T et based Mult Embedd ng

  // Reserved 100 - 199 for Top c based Mult Embedd ng
  LogFavApeBasedMuseTop c = 100 // Deprecated
  LogFavApeBasedMuseTop cExper  nt = 101 // Deprecated

  // Reserved 301 - 399 for User  nterested n embedd ngs
  Tw ceUser nterested n = 301 //  nterested- n mult -embedd ng based on cluster ng producer embedd ngs of ne ghbors
}(pers sted = 'true', hasPersonalData = 'true')

// Deprecated. Please use Top c d for future cases.
struct LocaleEnt y d {
  1:  64 ent y d
  2: str ng language
}(pers sted = 'true', hasPersonalData = 'false')

enum Engage ntType {
  Favor e = 1,
  Ret et = 2,
}

struct UserEngagedT et d {
  1:  64 t et d(personalDataType = 'T et d')
  2:  64 user d(personalDataType = 'User d')
  3: Engage ntType engage ntType(personalDataType = 'EventType')
}(pers sted = 'true', hasPersonalData = 'true')

struct Top c d {
  1:  64 ent y d (personalDataType = 'Semant ccoreClass f cat on')
  // 2-letter  SO 639-1 language code
  2: opt onal str ng language
  // 2-letter  SO 3166-1 alpha-2 country code
  3: opt onal str ng country
}(pers sted = 'true', hasPersonalData = 'false')

struct Top cSub d {
  1:  64 ent y d (personalDataType = 'Semant ccoreClass f cat on')
  // 2-letter  SO 639-1 language code
  2: opt onal str ng language
  // 2-letter  SO 3166-1 alpha-2 country code
  3: opt onal str ng country
  4:  32 sub d
}(pers sted = 'true', hasPersonalData = 'true')

// W ll be used for test ng purposes  n DDG 15536, 15534
struct UserW hLanguage d {
  1: requ red  64 user d(personalDataType = 'User d')
  2: opt onal str ng langCode(personalDataType = ' nferredLanguage')
}(pers sted = 'true', hasPersonalData = 'true')

/**
  * T   nternal  dent f er type.
  * Need to add order ng  n [[com.tw ter.s mclusters_v2.common.S mClustersEmbedd ng d]]
  * w n add ng a new type.
  **/
un on  nternal d {
  1:  64 t et d(personalDataType = 'T et d')
  2:  64 user d(personalDataType = 'User d')
  3:  64 ent y d(personalDataType = 'Semant ccoreClass f cat on')
  4: str ng hashtag(personalDataType = 'Publ cT etEnt  esAnd tadata')
  5:  32 cluster d
  6: LocaleEnt y d localeEnt y d(personalDataType = 'Semant ccoreClass f cat on')
  7: UserEngagedT et d userEngagedT et d
  8: Top c d top c d
  9: Top cSub d top cSub d
  10: str ng space d
  11: UserW hLanguage d userW hLanguage d
}(pers sted = 'true', hasPersonalData = 'true')

/**
  * A un form  dent f er type for all k nds of S mClusters based embedd ngs.
  **/
struct S mClustersEmbedd ng d {
  1: requ red Embedd ngType embedd ngType
  2: requ red onl ne_store.ModelVers on modelVers on
  3: requ red  nternal d  nternal d
}(pers sted = 'true', hasPersonalData = 'true')

/**
  * A un form  dent f er type for mult ple S mClusters embedd ngs
  **/
struct S mClustersMult Embedd ng d {
  1: requ red Mult Embedd ngType embedd ngType
  2: requ red onl ne_store.ModelVers on modelVers on
  3: requ red  nternal d  nternal d
}(pers sted = 'true', hasPersonalData = 'true')
