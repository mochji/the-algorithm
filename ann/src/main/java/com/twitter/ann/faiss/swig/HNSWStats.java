/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class HNSWStats {
  pr vate trans ent long sw gCPtr;
  protected trans ent boolean sw gC mOwn;

  protected HNSWStats(long cPtr, boolean c moryOwn) {
    sw gC mOwn = c moryOwn;
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr(HNSWStats obj) {
    return (obj == null) ? 0 : obj.sw gCPtr;
  }

  @SuppressWarn ngs("deprecat on")
  protected vo d f nal ze() {
    delete();
  }

  publ c synchron zed vo d delete() {
     f (sw gCPtr != 0) {
       f (sw gC mOwn) {
        sw gC mOwn = false;
        sw gfa ssJN .delete_HNSWStats(sw gCPtr);
      }
      sw gCPtr = 0;
    }
  }

  publ c vo d setN1(long value) {
    sw gfa ssJN .HNSWStats_n1_set(sw gCPtr, t , value);
  }

  publ c long getN1() {
    return sw gfa ssJN .HNSWStats_n1_get(sw gCPtr, t );
  }

  publ c vo d setN2(long value) {
    sw gfa ssJN .HNSWStats_n2_set(sw gCPtr, t , value);
  }

  publ c long getN2() {
    return sw gfa ssJN .HNSWStats_n2_get(sw gCPtr, t );
  }

  publ c vo d setN3(long value) {
    sw gfa ssJN .HNSWStats_n3_set(sw gCPtr, t , value);
  }

  publ c long getN3() {
    return sw gfa ssJN .HNSWStats_n3_get(sw gCPtr, t );
  }

  publ c vo d setNd s(long value) {
    sw gfa ssJN .HNSWStats_nd s_set(sw gCPtr, t , value);
  }

  publ c long getNd s() {
    return sw gfa ssJN .HNSWStats_nd s_get(sw gCPtr, t );
  }

  publ c vo d setNreorder(long value) {
    sw gfa ssJN .HNSWStats_nreorder_set(sw gCPtr, t , value);
  }

  publ c long getNreorder() {
    return sw gfa ssJN .HNSWStats_nreorder_get(sw gCPtr, t );
  }

  publ c HNSWStats(long n1, long n2, long n3, long nd s, long nreorder) {
    t (sw gfa ssJN .new_HNSWStats__SW G_0(n1, n2, n3, nd s, nreorder), true);
  }

  publ c HNSWStats(long n1, long n2, long n3, long nd s) {
    t (sw gfa ssJN .new_HNSWStats__SW G_1(n1, n2, n3, nd s), true);
  }

  publ c HNSWStats(long n1, long n2, long n3) {
    t (sw gfa ssJN .new_HNSWStats__SW G_2(n1, n2, n3), true);
  }

  publ c HNSWStats(long n1, long n2) {
    t (sw gfa ssJN .new_HNSWStats__SW G_3(n1, n2), true);
  }

  publ c HNSWStats(long n1) {
    t (sw gfa ssJN .new_HNSWStats__SW G_4(n1), true);
  }

  publ c HNSWStats() {
    t (sw gfa ssJN .new_HNSWStats__SW G_5(), true);
  }

  publ c vo d reset() {
    sw gfa ssJN .HNSWStats_reset(sw gCPtr, t );
  }

  publ c vo d comb ne(HNSWStats ot r) {
    sw gfa ssJN .HNSWStats_comb ne(sw gCPtr, t , HNSWStats.getCPtr(ot r), ot r);
  }

}
