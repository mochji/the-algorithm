package com.tw ter.representat on_manager.columns.t et

 mport com.tw ter.representat on_manager.columns.ColumnConf gBase
 mport com.tw ter.representat on_manager.store.T etS mClustersEmbedd ngStore
 mport com.tw ter.representat on_manager.thr ftscala.S mClustersEmbedd ngV ew
 mport com.tw ter.s mclusters_v2.thr ftscala. nternal d
 mport com.tw ter.s mclusters_v2.thr ftscala.S mClustersEmbedd ng
 mport com.tw ter.s mclusters_v2.thr ftscala.S mClustersEmbedd ng d
 mport com.tw ter.st ch
 mport com.tw ter.st ch.St ch
 mport com.tw ter.st ch.storehaus.St chOfReadableStore
 mport com.tw ter.strato.catalog.Op tadata
 mport com.tw ter.strato.conf g.AnyOf
 mport com.tw ter.strato.conf g.Contact nfo
 mport com.tw ter.strato.conf g.FromColumns
 mport com.tw ter.strato.conf g.Pol cy
 mport com.tw ter.strato.conf g.Pref x
 mport com.tw ter.strato.data.Conv
 mport com.tw ter.strato.data.Descr pt on.Pla nText
 mport com.tw ter.strato.data.L fecycle
 mport com.tw ter.strato.fed._
 mport com.tw ter.strato.thr ft.ScroogeConv
 mport javax. nject. nject

class T etS mClustersEmbedd ngCol @ nject() (embedd ngStore: T etS mClustersEmbedd ngStore)
    extends StratoFed.Column("recom ndat ons/representat on_manager/s mClustersEmbedd ng.T et")
    w h StratoFed.Fetch.St ch {

  pr vate val storeSt ch: S mClustersEmbedd ng d => St ch[S mClustersEmbedd ng] =
    St chOfReadableStore(embedd ngStore.t etS mClustersEmbedd ngStore.mapValues(_.toThr ft))

  val colPerm ss ons: Seq[com.tw ter.strato.conf g.Pol cy] =
    ColumnConf gBase.recosPerm ss ons ++ ColumnConf gBase.externalPerm ss ons :+ FromColumns(
      Set(
        Pref x("ml/featureStore/s mClusters"),
      ))

  overr de val pol cy: Pol cy = AnyOf({
    colPerm ss ons
  })

  overr de type Key = Long // T et d
  overr de type V ew = S mClustersEmbedd ngV ew
  overr de type Value = S mClustersEmbedd ng

  overr de val keyConv: Conv[Key] = Conv.long
  overr de val v ewConv: Conv[V ew] = ScroogeConv.fromStruct[S mClustersEmbedd ngV ew]
  overr de val valueConv: Conv[Value] = ScroogeConv.fromStruct[S mClustersEmbedd ng]

  overr de val contact nfo: Contact nfo = ColumnConf gBase.contact nfo

  overr de val  tadata: Op tadata = Op tadata(
    l fecycle = So (L fecycle.Product on),
    descr pt on = So (
      Pla nText("T  T et S mClusters Embedd ng Endpo nt  n Representat on Manage nt Serv ce." +
        " TDD: http://go/rms-tdd"))
  )

  overr de def fetch(key: Key, v ew: V ew): St ch[Result[Value]] = {
    val embedd ng d = S mClustersEmbedd ng d(
      v ew.embedd ngType,
      v ew.modelVers on,
       nternal d.T et d(key)
    )

    storeSt ch(embedd ng d)
      .map(embedd ng => found(embedd ng))
      .handle {
        case st ch.NotFound => m ss ng
      }
  }

}
