/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class  ndex {
  pr vate trans ent long sw gCPtr;
  protected trans ent boolean sw gC mOwn;

  protected  ndex(long cPtr, boolean c moryOwn) {
    sw gC mOwn = c moryOwn;
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr( ndex obj) {
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
        sw gfa ssJN .delete_ ndex(sw gCPtr);
      }
      sw gCPtr = 0;
    }
  }

  publ c vo d setD( nt value) {
    sw gfa ssJN . ndex_d_set(sw gCPtr, t , value);
  }

  publ c  nt getD() {
    return sw gfa ssJN . ndex_d_get(sw gCPtr, t );
  }

  publ c vo d setNtotal(long value) {
    sw gfa ssJN . ndex_ntotal_set(sw gCPtr, t , value);
  }

  publ c long getNtotal() {
    return sw gfa ssJN . ndex_ntotal_get(sw gCPtr, t );
}

  publ c vo d setVerbose(boolean value) {
    sw gfa ssJN . ndex_verbose_set(sw gCPtr, t , value);
  }

  publ c boolean getVerbose() {
    return sw gfa ssJN . ndex_verbose_get(sw gCPtr, t );
  }

  publ c vo d set s_tra ned(boolean value) {
    sw gfa ssJN . ndex_ s_tra ned_set(sw gCPtr, t , value);
  }

  publ c boolean get s_tra ned() {
    return sw gfa ssJN . ndex_ s_tra ned_get(sw gCPtr, t );
  }

  publ c vo d set tr c_type( tr cType value) {
    sw gfa ssJN . ndex_ tr c_type_set(sw gCPtr, t , value.sw gValue());
  }

  publ c  tr cType get tr c_type() {
    return  tr cType.sw gToEnum(sw gfa ssJN . ndex_ tr c_type_get(sw gCPtr, t ));
  }

  publ c vo d set tr c_arg(float value) {
    sw gfa ssJN . ndex_ tr c_arg_set(sw gCPtr, t , value);
  }

  publ c float get tr c_arg() {
    return sw gfa ssJN . ndex_ tr c_arg_get(sw gCPtr, t );
  }

  publ c vo d tra n(long n, SW GTYPE_p_float x) {
    sw gfa ssJN . ndex_tra n(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x));
  }

  publ c vo d add(long n, SW GTYPE_p_float x) {
    sw gfa ssJN . ndex_add(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x));
  }

  publ c vo d add_w h_ ds(long n, SW GTYPE_p_float x, LongVector x ds) {
    sw gfa ssJN . ndex_add_w h_ ds(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x), SW GTYPE_p_long_long.getCPtr(x ds.data()), x ds);
  }

  publ c vo d search(long n, SW GTYPE_p_float x, long k, SW GTYPE_p_float d stances, LongVector labels) {
    sw gfa ssJN . ndex_search(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x), k, SW GTYPE_p_float.getCPtr(d stances), SW GTYPE_p_long_long.getCPtr(labels.data()), labels);
  }

  publ c vo d range_search(long n, SW GTYPE_p_float x, float rad us, RangeSearchResult result) {
    sw gfa ssJN . ndex_range_search(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x), rad us, RangeSearchResult.getCPtr(result), result);
  }

  publ c vo d ass gn(long n, SW GTYPE_p_float x, LongVector labels, long k) {
    sw gfa ssJN . ndex_ass gn__SW G_0(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x), SW GTYPE_p_long_long.getCPtr(labels.data()), labels, k);
  }

  publ c vo d ass gn(long n, SW GTYPE_p_float x, LongVector labels) {
    sw gfa ssJN . ndex_ass gn__SW G_1(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x), SW GTYPE_p_long_long.getCPtr(labels.data()), labels);
  }

  publ c vo d reset() {
    sw gfa ssJN . ndex_reset(sw gCPtr, t );
  }

  publ c long remove_ ds( DSelector sel) {
    return sw gfa ssJN . ndex_remove_ ds(sw gCPtr, t ,  DSelector.getCPtr(sel), sel);
  }

  publ c vo d reconstruct(long key, SW GTYPE_p_float recons) {
    sw gfa ssJN . ndex_reconstruct(sw gCPtr, t , key, SW GTYPE_p_float.getCPtr(recons));
  }

  publ c vo d reconstruct_n(long  0, long n , SW GTYPE_p_float recons) {
    sw gfa ssJN . ndex_reconstruct_n(sw gCPtr, t ,  0, n , SW GTYPE_p_float.getCPtr(recons));
  }

  publ c vo d search_and_reconstruct(long n, SW GTYPE_p_float x, long k, SW GTYPE_p_float d stances, LongVector labels, SW GTYPE_p_float recons) {
    sw gfa ssJN . ndex_search_and_reconstruct(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x), k, SW GTYPE_p_float.getCPtr(d stances), SW GTYPE_p_long_long.getCPtr(labels.data()), labels, SW GTYPE_p_float.getCPtr(recons));
  }

  publ c vo d compute_res dual(SW GTYPE_p_float x, SW GTYPE_p_float res dual, long key) {
    sw gfa ssJN . ndex_compute_res dual(sw gCPtr, t , SW GTYPE_p_float.getCPtr(x), SW GTYPE_p_float.getCPtr(res dual), key);
  }

  publ c vo d compute_res dual_n(long n, SW GTYPE_p_float xs, SW GTYPE_p_float res duals, LongVector keys) {
    sw gfa ssJN . ndex_compute_res dual_n(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(xs), SW GTYPE_p_float.getCPtr(res duals), SW GTYPE_p_long_long.getCPtr(keys.data()), keys);
  }

  publ c D stanceComputer get_d stance_computer() {
    long cPtr = sw gfa ssJN . ndex_get_d stance_computer(sw gCPtr, t );
    return (cPtr == 0) ? null : new D stanceComputer(cPtr, false);
  }

  publ c long sa_code_s ze() {
    return sw gfa ssJN . ndex_sa_code_s ze(sw gCPtr, t );
  }

  publ c vo d sa_encode(long n, SW GTYPE_p_float x, SW GTYPE_p_uns gned_char bytes) {
    sw gfa ssJN . ndex_sa_encode(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x), SW GTYPE_p_uns gned_char.getCPtr(bytes));
  }

  publ c vo d sa_decode(long n, SW GTYPE_p_uns gned_char bytes, SW GTYPE_p_float x) {
    sw gfa ssJN . ndex_sa_decode(sw gCPtr, t , n, SW GTYPE_p_uns gned_char.getCPtr(bytes), SW GTYPE_p_float.getCPtr(x));
  }

  publ c  ndex VF to VF() {
    long cPtr = sw gfa ssJN . ndex_to VF(sw gCPtr, t );
    return (cPtr == 0) ? null : new  ndex VF(cPtr, false);
  }

}
