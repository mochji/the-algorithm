/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class  ndex DMap extends  ndex {
  pr vate trans ent long sw gCPtr;

  protected  ndex DMap(long cPtr, boolean c moryOwn) {
    super(sw gfa ssJN . ndex DMap_SW GUpcast(cPtr), c moryOwn);
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr( ndex DMap obj) {
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
        sw gfa ssJN .delete_ ndex DMap(sw gCPtr);
      }
      sw gCPtr = 0;
    }
    super.delete();
  }

  publ c vo d set ndex( ndex value) {
    sw gfa ssJN . ndex DMap_ ndex_set(sw gCPtr, t ,  ndex.getCPtr(value), value);
  }

  publ c  ndex get ndex() {
    long cPtr = sw gfa ssJN . ndex DMap_ ndex_get(sw gCPtr, t );
    return (cPtr == 0) ? null : new  ndex(cPtr, false);
  }

  publ c vo d setOwn_f elds(boolean value) {
    sw gfa ssJN . ndex DMap_own_f elds_set(sw gCPtr, t , value);
  }

  publ c boolean getOwn_f elds() {
    return sw gfa ssJN . ndex DMap_own_f elds_get(sw gCPtr, t );
  }

  publ c vo d set d_map(SW GTYPE_p_std__vectorT_ nt64_t_t value) {
    sw gfa ssJN . ndex DMap_ d_map_set(sw gCPtr, t , SW GTYPE_p_std__vectorT_ nt64_t_t.getCPtr(value));
  }

  publ c SW GTYPE_p_std__vectorT_ nt64_t_t get d_map() {
    long cPtr = sw gfa ssJN . ndex DMap_ d_map_get(sw gCPtr, t );
    return (cPtr == 0) ? null : new SW GTYPE_p_std__vectorT_ nt64_t_t(cPtr, false);
  }

  publ c  ndex DMap( ndex  ndex) {
    t (sw gfa ssJN .new_ ndex DMap__SW G_0( ndex.getCPtr( ndex),  ndex), true);
  }

  publ c vo d add_w h_ ds(long n, SW GTYPE_p_float x, LongVector x ds) {
    sw gfa ssJN . ndex DMap_add_w h_ ds(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x), SW GTYPE_p_long_long.getCPtr(x ds.data()), x ds);
  }

  publ c vo d add(long n, SW GTYPE_p_float x) {
    sw gfa ssJN . ndex DMap_add(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x));
  }

  publ c vo d search(long n, SW GTYPE_p_float x, long k, SW GTYPE_p_float d stances, LongVector labels) {
    sw gfa ssJN . ndex DMap_search(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x), k, SW GTYPE_p_float.getCPtr(d stances), SW GTYPE_p_long_long.getCPtr(labels.data()), labels);
  }

  publ c vo d tra n(long n, SW GTYPE_p_float x) {
    sw gfa ssJN . ndex DMap_tra n(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x));
  }

  publ c vo d reset() {
    sw gfa ssJN . ndex DMap_reset(sw gCPtr, t );
  }

  publ c long remove_ ds( DSelector sel) {
    return sw gfa ssJN . ndex DMap_remove_ ds(sw gCPtr, t ,  DSelector.getCPtr(sel), sel);
  }

  publ c vo d range_search(long n, SW GTYPE_p_float x, float rad us, RangeSearchResult result) {
    sw gfa ssJN . ndex DMap_range_search(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x), rad us, RangeSearchResult.getCPtr(result), result);
  }

  publ c  ndex DMap() {
    t (sw gfa ssJN .new_ ndex DMap__SW G_1(), true);
  }

}
