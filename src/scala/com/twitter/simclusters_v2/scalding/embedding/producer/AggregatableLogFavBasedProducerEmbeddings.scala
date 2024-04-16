package com.tw ter.s mclusters_v2.scald ng.embedd ng.producer

 mport com.tw ter.scald ng._
 mport com.tw ter.scald ng_ nternal.dalv2.DALWr e._
 mport com.tw ter.scald ng_ nternal.mult format.format.keyval.KeyVal
 mport com.tw ter.scald ng_ nternal.s ce.lzo_scrooge.F xedPathLzoScrooge
 mport com.tw ter.s mclusters_v2.hdfs_s ces.{
  AggregatableProducerS mclustersEmbedd ngsByLogFavScoreScalaDataset,
  AggregatableProducerS mclustersEmbedd ngsByLogFavScoreThr ftScalaDataset,
  AggregatableProducerS mclustersEmbedd ngsByLogFavScore2020ScalaDataset,
  AggregatableProducerS mclustersEmbedd ngsByLogFavScore2020Thr ftScalaDataset,
  AggregatableProducerS mclustersEmbedd ngsByLogFavScoreRelaxedFavEngage ntThreshold2020ScalaDataset,
  AggregatableProducerS mclustersEmbedd ngsByLogFavScoreRelaxedFavEngage ntThreshold2020Thr ftScalaDataset
}
 mport com.tw ter.s mclusters_v2.scald ng.embedd ng.common.Embedd ngUt l
 mport com.tw ter.s mclusters_v2.thr ftscala.{
  Embedd ngType,
  ModelVers on,
  Ne ghborW h  ghts,
  S mClustersEmbedd ng,
  S mClustersEmbedd ng d,
  S mClustersEmbedd ngW h d,
  UserTo nterested nClusterScores
}
 mport com.tw ter.wtf.scald ng.jobs.common.{AdhocExecut onApp, Sc duledExecut onApp}
 mport java.ut l.T  Zone

/**
 * T  f le  mple nts a new Producer S mClusters Embedd ngs.
 * T  d fferences w h ex st ng producer embedd ngs are:
 *
 * 1) t  embedd ng scores are not normal zed, so that one can aggregate mult ple producer embedd ngs by add ng t m.
 * 2)   use log-fav scores  n t  user-producer graph and user-s mclusters graph.
 * LogFav scores are smoot r than fav scores   prev ously used and t y are less sens  ve to outl ers
 *
 *
 *
 *  T  ma n d fference w h ot r normal zed embedd ngs  s t  `convertEmbedd ngToAggregatableEmbedd ngs` funct on
 *  w re   mult ply t  normal zed embedd ng w h producer's norms. T  resulted embedd ngs are t n
 *  unnormal zed and aggregatable.
 *
 */
/**
 * Product on job:
capesospy-v2 update aggregatable_producer_embedd ngs_by_logfav_score src/scala/com/tw ter/s mclusters_v2/capesos_conf g/atla_proc3.yaml
 */
object AggregatableLogFavBasedProducerEmbedd ngsSc duledApp
    extends AggregatableLogFavBasedProducerEmbedd ngsBaseApp
    w h Sc duledExecut onApp {

  overr de val modelVers on: ModelVers on = ModelVers on.Model20m145kUpdated
  // Not us ng t  Embedd ngUt l.getHdfsPath to preserve t  prev ous funct onal y.
  pr vate val outputPath: Str ng =
    "/user/cassowary/manhattan_sequence_f les/producer_s mclusters_aggregatable_embedd ngs_by_logfav_score"

  pr vate val outputPathThr ft: Str ng = Embedd ngUt l.getHdfsPath(
     sAdhoc = false,
     sManhattanKeyVal = false,
    modelVers on = modelVers on,
    pathSuff x = "producer_s mclusters_aggregatable_embedd ngs_by_logfav_score_thr ft"
  )

  overr de def batch ncre nt: Durat on = Days(7)

  overr de def f rstT  : R chDate = R chDate("2020-04-05")

  overr de def wr eToManhattan(
    output: TypedP pe[KeyVal[S mClustersEmbedd ng d, S mClustersEmbedd ng]]
  )(
     mpl c  dateRange: DateRange,
    t  Zone: T  Zone,
    un que D: Un que D
  ): Execut on[Un ] = {
    output
      .wr eDALVers onedKeyValExecut on(
        AggregatableProducerS mclustersEmbedd ngsByLogFavScoreScalaDataset,
        D.Suff x(outputPath),
        vers on = Expl c EndT  (dateRange.end)
      )
  }

  overr de def wr eToThr ft(
    output: TypedP pe[S mClustersEmbedd ngW h d]
  )(
     mpl c  dateRange: DateRange,
    t  Zone: T  Zone,
    un que D: Un que D
  ): Execut on[Un ] = {
    output
      .wr eDALSnapshotExecut on(
        dataset = AggregatableProducerS mclustersEmbedd ngsByLogFavScoreThr ftScalaDataset,
        updateStep = D.Da ly,
        pathLa t = D.Suff x(outputPathThr ft),
        fmt = D.Parquet,
        endDate = dateRange.end
      )
  }
}

/**
 * Product on job:
capesospy-v2 update --bu ld_locally --start_cron aggregatable_producer_embedd ngs_by_logfav_score_2020 src/scala/com/tw ter/s mclusters_v2/capesos_conf g/atla_proc3.yaml
 */
object AggregatableLogFavBasedProducerEmbedd ngs2020Sc duledApp
    extends AggregatableLogFavBasedProducerEmbedd ngsBaseApp
    w h Sc duledExecut onApp {

  overr de val modelVers on: ModelVers on = ModelVers on.Model20m145k2020
  // Not us ng t  Embedd ngUt l.getHdfsPath to preserve t  prev ous funct onal y.
  pr vate val outputPath: Str ng =
    "/user/cassowary/manhattan_sequence_f les/producer_s mclusters_aggregatable_embedd ngs_by_logfav_score_20m145k2020"

  pr vate val outputPathThr ft: Str ng = Embedd ngUt l.getHdfsPath(
     sAdhoc = false,
     sManhattanKeyVal = false,
    modelVers on = modelVers on,
    pathSuff x = "producer_s mclusters_aggregatable_embedd ngs_by_logfav_score_thr ft"
  )

  overr de def batch ncre nt: Durat on = Days(7)

  overr de def f rstT  : R chDate = R chDate("2021-03-05")

  overr de def wr eToManhattan(
    output: TypedP pe[KeyVal[S mClustersEmbedd ng d, S mClustersEmbedd ng]]
  )(
     mpl c  dateRange: DateRange,
    t  Zone: T  Zone,
    un que D: Un que D
  ): Execut on[Un ] = {
    output
      .wr eDALVers onedKeyValExecut on(
        AggregatableProducerS mclustersEmbedd ngsByLogFavScore2020ScalaDataset,
        D.Suff x(outputPath),
        vers on = Expl c EndT  (dateRange.end)
      )
  }

  overr de def wr eToThr ft(
    output: TypedP pe[S mClustersEmbedd ngW h d]
  )(
     mpl c  dateRange: DateRange,
    t  Zone: T  Zone,
    un que D: Un que D
  ): Execut on[Un ] = {
    output
      .wr eDALSnapshotExecut on(
        dataset = AggregatableProducerS mclustersEmbedd ngsByLogFavScore2020Thr ftScalaDataset,
        updateStep = D.Da ly,
        pathLa t = D.Suff x(outputPathThr ft),
        fmt = D.Parquet,
        endDate = dateRange.end
      )
  }
}

/**
 * Product on job:
capesospy-v2 update --bu ld_locally --start_cron aggregatable_producer_embedd ngs_by_logfav_score_relaxed_fav_engage nt_threshold_2020 src/scala/com/tw ter/s mclusters_v2/capesos_conf g/atla_proc3.yaml
 */
object AggregatableLogFavBasedProducerEmbedd ngsRelaxedFavEngage ntThreshold2020Sc duledApp
    extends AggregatableLogFavBasedProducerEmbedd ngsBaseApp
    w h Sc duledExecut onApp {

  overr de val modelVers on: ModelVers on = ModelVers on.Model20m145k2020

  overr de val embedd ngType: Embedd ngType = Embedd ngType.RelaxedAggregatableLogFavBasedProducer

  // Relax fav engage nt threshold
  overr de val m nNumFavers = 15

  // Not us ng t  Embedd ngUt l.getHdfsPath to preserve t  prev ous funct onal y.
  pr vate val outputPath: Str ng =
    "/user/cassowary/manhattan_sequence_f les/producer_s mclusters_aggregatable_embedd ngs_by_logfav_score_relaxed_fav_engage nt_threshold_20m145k2020"

  pr vate val outputPathThr ft: Str ng = Embedd ngUt l.getHdfsPath(
     sAdhoc = false,
     sManhattanKeyVal = false,
    modelVers on = modelVers on,
    pathSuff x =
      "producer_s mclusters_aggregatable_embedd ngs_by_logfav_score_relaxed_fav_score_threshold_thr ft"
  )

  overr de def batch ncre nt: Durat on = Days(7)

  overr de def f rstT  : R chDate = R chDate("2021-07-26")

  overr de def wr eToManhattan(
    output: TypedP pe[KeyVal[S mClustersEmbedd ng d, S mClustersEmbedd ng]]
  )(
     mpl c  dateRange: DateRange,
    t  Zone: T  Zone,
    un que D: Un que D
  ): Execut on[Un ] = {
    output
      .wr eDALVers onedKeyValExecut on(
        AggregatableProducerS mclustersEmbedd ngsByLogFavScoreRelaxedFavEngage ntThreshold2020ScalaDataset,
        D.Suff x(outputPath),
        vers on = Expl c EndT  (dateRange.end)
      )
  }

  overr de def wr eToThr ft(
    output: TypedP pe[S mClustersEmbedd ngW h d]
  )(
     mpl c  dateRange: DateRange,
    t  Zone: T  Zone,
    un que D: Un que D
  ): Execut on[Un ] = {
    output
      .wr eDALSnapshotExecut on(
        dataset =
          AggregatableProducerS mclustersEmbedd ngsByLogFavScoreRelaxedFavEngage ntThreshold2020Thr ftScalaDataset,
        updateStep = D.Da ly,
        pathLa t = D.Suff x(outputPathThr ft),
        fmt = D.Parquet,
        endDate = dateRange.end
      )
  }
}

/***
 * Adhoc job:

scald ng remote run --user recos-platform \
--ma n-class com.tw ter.s mclusters_v2.scald ng.embedd ng.producer.AggregatableLogFavBasedProducerEmbedd ngsAdhocApp \
--target src/scala/com/tw ter/s mclusters_v2/scald ng/embedd ng/producer:aggregatable_logfav_based_producer_embedd ngs_job-adhoc \
-- --date 2020-04-08

 */
object AggregatableLogFavBasedProducerEmbedd ngsAdhocApp
    extends AggregatableLogFavBasedProducerEmbedd ngsBaseApp
    w h AdhocExecut onApp {

  overr de val modelVers on: ModelVers on = ModelVers on.Model20m145kUpdated

  pr vate val outputPath: Str ng = Embedd ngUt l.getHdfsPath(
     sAdhoc = false,
     sManhattanKeyVal = true,
    modelVers on = modelVers on,
    pathSuff x = "producer_s mclusters_aggregatable_embedd ngs_by_log_fav_score"
  )

  pr vate val outputPathThr ft: Str ng = Embedd ngUt l.getHdfsPath(
     sAdhoc = false,
     sManhattanKeyVal = false,
    modelVers on = modelVers on,
    pathSuff x = "producer_s mclusters_aggregatable_embedd ngs_by_log_fav_score_thr ft"
  )

  overr de def wr eToManhattan(
    output: TypedP pe[KeyVal[S mClustersEmbedd ng d, S mClustersEmbedd ng]]
  )(
     mpl c  dateRange: DateRange,
    t  Zone: T  Zone,
    un que D: Un que D
  ): Execut on[Un ] = {
    output
      .flatMap { keyVal =>
        keyVal.value.embedd ng.map { s mClusterW hScore =>
          (
            keyVal.key.embedd ngType,
            keyVal.key.modelVers on,
            keyVal.key. nternal d,
            s mClusterW hScore.cluster d,
            s mClusterW hScore.score
          )
        }
      }
      .wr eExecut on(
        // Wr e to TSV for eas er debugg ng of t  adhoc job.
        TypedTsv(outputPath)
      )
  }

  overr de def wr eToThr ft(
    output: TypedP pe[S mClustersEmbedd ngW h d]
  )(
     mpl c  dateRange: DateRange,
    t  Zone: T  Zone,
    un que D: Un que D
  ): Execut on[Un ] = {
    output
      .wr eExecut on(
        new F xedPathLzoScrooge(outputPathThr ft, S mClustersEmbedd ngW h d)
      )
  }
}

/**
./bazel bundle src/scala/com/tw ter/s mclusters_v2/scald ng/embedd ng/producer:aggregatable_logfav_based_producer_embedd ngs_job_2020-adhoc
scald ng remote run \
--user cassowary \
--keytab /var/l b/tss/keys/fluffy/keytabs/cl ent/cassowary.keytab \
--pr nc pal serv ce_acoount@TW TTER.B Z \
--cluster blueb rd-qus1 \
--ma n-class com.tw ter.s mclusters_v2.scald ng.embedd ng.producer.AggregatableLogFavBasedProducerEmbedd ngs2020AdhocApp \
--target src/scala/com/tw ter/s mclusters_v2/scald ng/embedd ng/producer:aggregatable_logfav_based_producer_embedd ngs_job_2020-adhoc \
--hadoop-propert es "scald ng.w h.reducers.set.expl c ly=true mapreduce.job.reduces=4000" \
-- --date 2020-06-28
 */

object AggregatableLogFavBasedProducerEmbedd ngs2020AdhocApp
    extends AggregatableLogFavBasedProducerEmbedd ngsBaseApp
    w h AdhocExecut onApp {

  overr de val modelVers on: ModelVers on = ModelVers on.Model20m145k2020

  pr vate val outputPath: Str ng = Embedd ngUt l.getHdfsPath(
     sAdhoc = false,
     sManhattanKeyVal = true,
    modelVers on = modelVers on,
    pathSuff x = "producer_s mclusters_aggregatable_embedd ngs_by_log_fav_score"
  )

  pr vate val outputPathThr ft: Str ng = Embedd ngUt l.getHdfsPath(
     sAdhoc = false,
     sManhattanKeyVal = false,
    modelVers on = modelVers on,
    pathSuff x = "producer_s mclusters_aggregatable_embedd ngs_by_log_fav_score_thr ft"
  )

  overr de def wr eToManhattan(
    output: TypedP pe[KeyVal[S mClustersEmbedd ng d, S mClustersEmbedd ng]]
  )(
     mpl c  dateRange: DateRange,
    t  Zone: T  Zone,
    un que D: Un que D
  ): Execut on[Un ] = {
    output
      .flatMap { keyVal =>
        keyVal.value.embedd ng.map { s mClusterW hScore =>
          (
            keyVal.key.embedd ngType,
            keyVal.key.modelVers on,
            keyVal.key. nternal d,
            s mClusterW hScore.cluster d,
            s mClusterW hScore.score
          )
        }
      }
      .wr eExecut on(
        // Wr e to TSV for eas er debugg ng of t  adhoc job.
        TypedTsv(outputPath)
      )
  }

  overr de def wr eToThr ft(
    output: TypedP pe[S mClustersEmbedd ngW h d]
  )(
     mpl c  dateRange: DateRange,
    t  Zone: T  Zone,
    un que D: Un que D
  ): Execut on[Un ] = {
    output
      .wr eExecut on(
        new F xedPathLzoScrooge(outputPathThr ft, S mClustersEmbedd ngW h d)
      )
  }
}

tra  AggregatableLogFavBasedProducerEmbedd ngsBaseApp
    extends AggregatableProducerEmbedd ngsBaseApp {
  overr de val userToProducerScor ngFn: Ne ghborW h  ghts => Double = _.logFavScore.getOrElse(0.0)
  overr de val userToClusterScor ngFn: UserTo nterested nClusterScores => Double =
    _.logFavScore.getOrElse(0.0)
  overr de val embedd ngType: Embedd ngType = Embedd ngType.AggregatableLogFavBasedProducer
}
