package com.tw ter.ho _m xer

 mport com.tw ter.f nagle.thr ft.Cl ent d
 mport com.tw ter.f natra.thr ft.rout ng.Thr ftWarmup
 mport com.tw ter.ho _m xer.{thr ftscala => st}
 mport com.tw ter.ut l.logg ng.Logg ng
 mport com.tw ter. nject.ut ls.Handler
 mport com.tw ter.product_m xer.core.{thr ftscala => pt}
 mport com.tw ter.scrooge.Request
 mport com.tw ter.scrooge.Response
 mport com.tw ter.ut l.Return
 mport com.tw ter.ut l.Throw
 mport com.tw ter.ut l.Try
 mport javax. nject. nject
 mport javax. nject.S ngleton

@S ngleton
class Ho M xerThr ftServerWarmupHandler @ nject() (warmup: Thr ftWarmup)
    extends Handler
    w h Logg ng {

  pr vate val cl ent d = Cl ent d("thr ft-warmup-cl ent")

  def handle(): Un  = {
    val test ds = Seq(1, 2, 3)
    try {
      cl ent d.asCurrent {
        test ds.foreach {  d =>
          val warmupReq = warmupQuery( d)
           nfo(s"Send ng warm-up request to serv ce w h query: $warmupReq")
          warmup.sendRequest(
             thod = st.Ho M xer.GetUrtResponse,
            req = Request(st.Ho M xer.GetUrtResponse.Args(warmupReq)))(assertWarmupResponse)
        }
      }
    } catch {
      case e: Throwable => error(e.get ssage, e)
    }
     nfo("Warm-up done.")
  }

  pr vate def warmupQuery(user d: Long): st.Ho M xerRequest = {
    val cl entContext = pt.Cl entContext(
      user d = So (user d),
      guest d = None,
      app d = So (12345L),
       pAddress = So ("0.0.0.0"),
      userAgent = So ("FAKE_USER_AGENT_FOR_WARMUPS"),
      countryCode = So ("US"),
      languageCode = So ("en"),
       sTwoff ce = None,
      userRoles = None,
      dev ce d = So ("FAKE_DEV CE_ D_FOR_WARMUPS")
    )
    st.Ho M xerRequest(
      cl entContext = cl entContext,
      product = st.Product.Follow ng,
      productContext = So (st.ProductContext.Follow ng(st.Follow ng())),
      maxResults = So (3)
    )
  }

  pr vate def assertWarmupResponse(
    result: Try[Response[st.Ho M xer.GetUrtResponse.SuccessType]]
  ): Un  = {
    result match {
      case Return(_) => // ok
      case Throw(except on) =>
        warn("Error perform ng warm-up request.")
        error(except on.get ssage, except on)
    }
  }
}
