/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class MapLong2Long {
  pr vate trans ent long sw gCPtr;
  protected trans ent boolean sw gC mOwn;

  protected MapLong2Long(long cPtr, boolean c moryOwn) {
    sw gC mOwn = c moryOwn;
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr(MapLong2Long obj) {
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
        sw gfa ssJN .delete_MapLong2Long(sw gCPtr);
      }
      sw gCPtr = 0;
    }
  }

  publ c vo d setMap(SW GTYPE_p_std__unordered_mapT_long_long_t value) {
    sw gfa ssJN .MapLong2Long_map_set(sw gCPtr, t , SW GTYPE_p_std__unordered_mapT_long_long_t.getCPtr(value));
  }

  publ c SW GTYPE_p_std__unordered_mapT_long_long_t getMap() {
    return new SW GTYPE_p_std__unordered_mapT_long_long_t(sw gfa ssJN .MapLong2Long_map_get(sw gCPtr, t ), true);
  }

  publ c vo d add(long n, SW GTYPE_p_long keys, SW GTYPE_p_long vals) {
    sw gfa ssJN .MapLong2Long_add(sw gCPtr, t , n, SW GTYPE_p_long.getCPtr(keys), SW GTYPE_p_long.getCPtr(vals));
  }

  publ c  nt search( nt key) {
    return sw gfa ssJN .MapLong2Long_search(sw gCPtr, t , key);
  }

  publ c vo d search_mult ple(long n, SW GTYPE_p_long keys, SW GTYPE_p_long vals) {
    sw gfa ssJN .MapLong2Long_search_mult ple(sw gCPtr, t , n, SW GTYPE_p_long.getCPtr(keys), SW GTYPE_p_long.getCPtr(vals));
  }

  publ c MapLong2Long() {
    t (sw gfa ssJN .new_MapLong2Long(), true);
  }

}
