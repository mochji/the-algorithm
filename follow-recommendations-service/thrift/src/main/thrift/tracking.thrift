na space java com.tw ter.follow_recom ndat ons.thr ftjava
#@na space scala com.tw ter.follow_recom ndat ons.thr ftscala
#@na space strato com.tw ter.follow_recom ndat ons

 nclude "com/tw ter/suggests/controller_data/controller_data.thr ft"
 nclude "d splay_locat on.thr ft"

// struct used for track ng/attr but on purposes  n   offl ne p pel nes
struct Track ngToken {
  // trace- d of t  request
  1: requ red  64 sess on d (personalDataType='Sess on d')
  2: opt onal d splay_locat on.D splayLocat on d splayLocat on
  // 64-b  encoded b nary attr butes of   recom ndat on
  3: opt onal controller_data.ControllerData controllerData
  // WTF Algor hm  d (backward compat b l y)
  4: opt onal  32 algo d
}(hasPersonalData='true')
