/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class RangeSearchPart alResult extends BufferL st {
  pr vate trans ent long sw gCPtr;

  protected RangeSearchPart alResult(long cPtr, boolean c moryOwn) {
    super(sw gfa ssJN .RangeSearchPart alResult_SW GUpcast(cPtr), c moryOwn);
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr(RangeSearchPart alResult obj) {
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
        sw gfa ssJN .delete_RangeSearchPart alResult(sw gCPtr);
      }
      sw gCPtr = 0;
    }
    super.delete();
  }

  publ c vo d setRes(RangeSearchResult value) {
    sw gfa ssJN .RangeSearchPart alResult_res_set(sw gCPtr, t , RangeSearchResult.getCPtr(value), value);
  }

  publ c RangeSearchResult getRes() {
    long cPtr = sw gfa ssJN .RangeSearchPart alResult_res_get(sw gCPtr, t );
    return (cPtr == 0) ? null : new RangeSearchResult(cPtr, false);
  }

  publ c vo d setQuer es(SW GTYPE_p_std__vectorT_fa ss__RangeQueryResult_t value) {
    sw gfa ssJN .RangeSearchPart alResult_quer es_set(sw gCPtr, t , SW GTYPE_p_std__vectorT_fa ss__RangeQueryResult_t.getCPtr(value));
  }

  publ c SW GTYPE_p_std__vectorT_fa ss__RangeQueryResult_t getQuer es() {
    long cPtr = sw gfa ssJN .RangeSearchPart alResult_quer es_get(sw gCPtr, t );
    return (cPtr == 0) ? null : new SW GTYPE_p_std__vectorT_fa ss__RangeQueryResult_t(cPtr, false);
  }

  publ c RangeQueryResult new_result(long qno) {
    return new RangeQueryResult(sw gfa ssJN .RangeSearchPart alResult_new_result(sw gCPtr, t , qno), false);
  }

  publ c vo d set_l ms() {
    sw gfa ssJN .RangeSearchPart alResult_set_l ms(sw gCPtr, t );
  }

  publ c vo d copy_result(boolean  ncre ntal) {
    sw gfa ssJN .RangeSearchPart alResult_copy_result__SW G_0(sw gCPtr, t ,  ncre ntal);
  }

  publ c vo d copy_result() {
    sw gfa ssJN .RangeSearchPart alResult_copy_result__SW G_1(sw gCPtr, t );
  }

  publ c stat c vo d  rge(SW GTYPE_p_std__vectorT_fa ss__RangeSearchPart alResult_p_t part al_results, boolean do_delete) {
    sw gfa ssJN .RangeSearchPart alResult_ rge__SW G_0(SW GTYPE_p_std__vectorT_fa ss__RangeSearchPart alResult_p_t.getCPtr(part al_results), do_delete);
  }

  publ c stat c vo d  rge(SW GTYPE_p_std__vectorT_fa ss__RangeSearchPart alResult_p_t part al_results) {
    sw gfa ssJN .RangeSearchPart alResult_ rge__SW G_1(SW GTYPE_p_std__vectorT_fa ss__RangeSearchPart alResult_p_t.getCPtr(part al_results));
  }

}
