/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class Normal zat onTransform extends VectorTransform {
  pr vate trans ent long sw gCPtr;

  protected Normal zat onTransform(long cPtr, boolean c moryOwn) {
    super(sw gfa ssJN .Normal zat onTransform_SW GUpcast(cPtr), c moryOwn);
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr(Normal zat onTransform obj) {
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
        sw gfa ssJN .delete_Normal zat onTransform(sw gCPtr);
      }
      sw gCPtr = 0;
    }
    super.delete();
  }

  publ c vo d setNorm(float value) {
    sw gfa ssJN .Normal zat onTransform_norm_set(sw gCPtr, t , value);
  }

  publ c float getNorm() {
    return sw gfa ssJN .Normal zat onTransform_norm_get(sw gCPtr, t );
  }

  publ c Normal zat onTransform( nt d, float norm) {
    t (sw gfa ssJN .new_Normal zat onTransform__SW G_0(d, norm), true);
  }

  publ c Normal zat onTransform( nt d) {
    t (sw gfa ssJN .new_Normal zat onTransform__SW G_1(d), true);
  }

  publ c Normal zat onTransform() {
    t (sw gfa ssJN .new_Normal zat onTransform__SW G_2(), true);
  }

  publ c vo d apply_noalloc(long n, SW GTYPE_p_float x, SW GTYPE_p_float xt) {
    sw gfa ssJN .Normal zat onTransform_apply_noalloc(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x), SW GTYPE_p_float.getCPtr(xt));
  }

  publ c vo d reverse_transform(long n, SW GTYPE_p_float xt, SW GTYPE_p_float x) {
    sw gfa ssJN .Normal zat onTransform_reverse_transform(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(xt), SW GTYPE_p_float.getCPtr(x));
  }

}
