package com.tw ter.cr_m xer.f lter
 mport com.tw ter.cr_m xer.model.CrCand dateGeneratorQuery
 mport com.tw ter.cr_m xer.model.RankedCand date
 mport com.tw ter.cr_m xer.thr ftscala.S ceType
 mport com.tw ter.f nagle.stats.StatsRece ver
 mport com.tw ter.ut l.Future
 mport javax. nject. nject
 mport javax. nject.S ngleton

@S ngleton
case class PostRankF lterRunner @ nject() (
  globalStats: StatsRece ver) {

  pr vate val scopedStats = globalStats.scope(t .getClass.getCanon calNa )

  pr vate val beforeCount = scopedStats.stat("cand date_count", "before")
  pr vate val afterCount = scopedStats.stat("cand date_count", "after")

  def run(
    query: CrCand dateGeneratorQuery,
    cand dates: Seq[RankedCand date]
  ): Future[Seq[RankedCand date]] = {

    beforeCount.add(cand dates.s ze)

    Future(
      removeBadRecentNot f cat onCand dates(cand dates)
    ).map { results =>
      afterCount.add(results.s ze)
      results
    }
  }

  /**
   * Remove "bad" qual y cand dates generated by recent not f cat ons
   * A cand date  s bad w n    s generated by a s ngle RecentNot f cat on
   * S ceKey.
   * e.x:
   * t etA {recent not f cat on1} -> bad
   * t etB {recent not f cat on1 recent not f cat on2} -> good
   *t etC {recent not f cat on1 recent follow1} -> bad
   * SD-19397
   */
  pr vate[f lter] def removeBadRecentNot f cat onCand dates(
    cand dates: Seq[RankedCand date]
  ): Seq[RankedCand date] = {
    cand dates.f lterNot {
       sBadQual yRecentNot f cat onCand date
    }
  }

  pr vate def  sBadQual yRecentNot f cat onCand date(cand date: RankedCand date): Boolean = {
    cand date.potent alReasons.s ze == 1 &&
    cand date.potent alReasons. ad.s ce nfoOpt.nonEmpty &&
    cand date.potent alReasons. ad.s ce nfoOpt.get.s ceType == S ceType.Not f cat onCl ck
  }

}
