/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class OPQMatr x extends L nearTransform {
  pr vate trans ent long sw gCPtr;

  protected OPQMatr x(long cPtr, boolean c moryOwn) {
    super(sw gfa ssJN .OPQMatr x_SW GUpcast(cPtr), c moryOwn);
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr(OPQMatr x obj) {
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
        sw gfa ssJN .delete_OPQMatr x(sw gCPtr);
      }
      sw gCPtr = 0;
    }
    super.delete();
  }

  publ c vo d setM( nt value) {
    sw gfa ssJN .OPQMatr x_M_set(sw gCPtr, t , value);
  }

  publ c  nt getM() {
    return sw gfa ssJN .OPQMatr x_M_get(sw gCPtr, t );
  }

  publ c vo d setN er( nt value) {
    sw gfa ssJN .OPQMatr x_n er_set(sw gCPtr, t , value);
  }

  publ c  nt getN er() {
    return sw gfa ssJN .OPQMatr x_n er_get(sw gCPtr, t );
  }

  publ c vo d setN er_pq( nt value) {
    sw gfa ssJN .OPQMatr x_n er_pq_set(sw gCPtr, t , value);
  }

  publ c  nt getN er_pq() {
    return sw gfa ssJN .OPQMatr x_n er_pq_get(sw gCPtr, t );
  }

  publ c vo d setN er_pq_0( nt value) {
    sw gfa ssJN .OPQMatr x_n er_pq_0_set(sw gCPtr, t , value);
  }

  publ c  nt getN er_pq_0() {
    return sw gfa ssJN .OPQMatr x_n er_pq_0_get(sw gCPtr, t );
  }

  publ c vo d setMax_tra n_po nts(long value) {
    sw gfa ssJN .OPQMatr x_max_tra n_po nts_set(sw gCPtr, t , value);
  }

  publ c long getMax_tra n_po nts() {
    return sw gfa ssJN .OPQMatr x_max_tra n_po nts_get(sw gCPtr, t );
  }

  publ c vo d setVerbose(boolean value) {
    sw gfa ssJN .OPQMatr x_verbose_set(sw gCPtr, t , value);
  }

  publ c boolean getVerbose() {
    return sw gfa ssJN .OPQMatr x_verbose_get(sw gCPtr, t );
  }

  publ c vo d setPq(ProductQuant zer value) {
    sw gfa ssJN .OPQMatr x_pq_set(sw gCPtr, t , ProductQuant zer.getCPtr(value), value);
  }

  publ c ProductQuant zer getPq() {
    long cPtr = sw gfa ssJN .OPQMatr x_pq_get(sw gCPtr, t );
    return (cPtr == 0) ? null : new ProductQuant zer(cPtr, false);
  }

  publ c OPQMatr x( nt d,  nt M,  nt d2) {
    t (sw gfa ssJN .new_OPQMatr x__SW G_0(d, M, d2), true);
  }

  publ c OPQMatr x( nt d,  nt M) {
    t (sw gfa ssJN .new_OPQMatr x__SW G_1(d, M), true);
  }

  publ c OPQMatr x( nt d) {
    t (sw gfa ssJN .new_OPQMatr x__SW G_2(d), true);
  }

  publ c OPQMatr x() {
    t (sw gfa ssJN .new_OPQMatr x__SW G_3(), true);
  }

  publ c vo d tra n(long n, SW GTYPE_p_float x) {
    sw gfa ssJN .OPQMatr x_tra n(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x));
  }

}
