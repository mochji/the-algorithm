/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class VectorTransformVector {
  pr vate trans ent long sw gCPtr;
  protected trans ent boolean sw gC mOwn;

  protected VectorTransformVector(long cPtr, boolean c moryOwn) {
    sw gC mOwn = c moryOwn;
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr(VectorTransformVector obj) {
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
        sw gfa ssJN .delete_VectorTransformVector(sw gCPtr);
      }
      sw gCPtr = 0;
    }
  }

  publ c VectorTransformVector() {
    t (sw gfa ssJN .new_VectorTransformVector(), true);
  }

  publ c vo d push_back(VectorTransform arg0) {
    sw gfa ssJN .VectorTransformVector_push_back(sw gCPtr, t , VectorTransform.getCPtr(arg0), arg0);
  }

  publ c vo d clear() {
    sw gfa ssJN .VectorTransformVector_clear(sw gCPtr, t );
  }

  publ c SW GTYPE_p_p_fa ss__VectorTransform data() {
    long cPtr = sw gfa ssJN .VectorTransformVector_data(sw gCPtr, t );
    return (cPtr == 0) ? null : new SW GTYPE_p_p_fa ss__VectorTransform(cPtr, false);
  }

  publ c long s ze() {
    return sw gfa ssJN .VectorTransformVector_s ze(sw gCPtr, t );
  }

  publ c VectorTransform at(long n) {
    long cPtr = sw gfa ssJN .VectorTransformVector_at(sw gCPtr, t , n);
    return (cPtr == 0) ? null : new VectorTransform(cPtr, false);
  }

  publ c vo d res ze(long n) {
    sw gfa ssJN .VectorTransformVector_res ze(sw gCPtr, t , n);
  }

  publ c vo d reserve(long n) {
    sw gfa ssJN .VectorTransformVector_reserve(sw gCPtr, t , n);
  }

  publ c vo d swap(VectorTransformVector ot r) {
    sw gfa ssJN .VectorTransformVector_swap(sw gCPtr, t , VectorTransformVector.getCPtr(ot r), ot r);
  }

}
