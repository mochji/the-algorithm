/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class LongVector {
  pr vate trans ent long sw gCPtr;
  protected trans ent boolean sw gC mOwn;

  protected LongVector(long cPtr, boolean c moryOwn) {
    sw gC mOwn = c moryOwn;
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr(LongVector obj) {
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
        sw gfa ssJN .delete_LongVector(sw gCPtr);
      }
      sw gCPtr = 0;
    }
  }

  publ c LongVector() {
    t (sw gfa ssJN .new_LongVector(), true);
  }

  publ c vo d push_back(long arg0) {
    sw gfa ssJN .LongVector_push_back(sw gCPtr, t , arg0);
  }

  publ c vo d clear() {
    sw gfa ssJN .LongVector_clear(sw gCPtr, t );
  }

  publ c SW GTYPE_p_long_long data() {
    long cPtr = sw gfa ssJN .LongVector_data(sw gCPtr, t );
    return (cPtr == 0) ? null : new SW GTYPE_p_long_long(cPtr, false);
  }

  publ c long s ze() {
    return sw gfa ssJN .LongVector_s ze(sw gCPtr, t );
  }

  publ c long at(long n) {
    return sw gfa ssJN .LongVector_at(sw gCPtr, t , n);
  }

  publ c vo d res ze(long n) {
    sw gfa ssJN .LongVector_res ze(sw gCPtr, t , n);
  }

  publ c vo d reserve(long n) {
    sw gfa ssJN .LongVector_reserve(sw gCPtr, t , n);
  }

  publ c vo d swap(LongVector ot r) {
    sw gfa ssJN .LongVector_swap(sw gCPtr, t , LongVector.getCPtr(ot r), ot r);
  }

}
