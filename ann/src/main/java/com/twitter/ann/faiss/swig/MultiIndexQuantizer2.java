/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class Mult  ndexQuant zer2 extends Mult  ndexQuant zer {
  pr vate trans ent long sw gCPtr;

  protected Mult  ndexQuant zer2(long cPtr, boolean c moryOwn) {
    super(sw gfa ssJN .Mult  ndexQuant zer2_SW GUpcast(cPtr), c moryOwn);
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr(Mult  ndexQuant zer2 obj) {
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
        sw gfa ssJN .delete_Mult  ndexQuant zer2(sw gCPtr);
      }
      sw gCPtr = 0;
    }
    super.delete();
  }

  publ c vo d setAss gn_ ndexes(SW GTYPE_p_std__vectorT_fa ss__ ndex_p_t value) {
    sw gfa ssJN .Mult  ndexQuant zer2_ass gn_ ndexes_set(sw gCPtr, t , SW GTYPE_p_std__vectorT_fa ss__ ndex_p_t.getCPtr(value));
  }

  publ c SW GTYPE_p_std__vectorT_fa ss__ ndex_p_t getAss gn_ ndexes() {
    long cPtr = sw gfa ssJN .Mult  ndexQuant zer2_ass gn_ ndexes_get(sw gCPtr, t );
    return (cPtr == 0) ? null : new SW GTYPE_p_std__vectorT_fa ss__ ndex_p_t(cPtr, false);
  }

  publ c vo d setOwn_f elds(boolean value) {
    sw gfa ssJN .Mult  ndexQuant zer2_own_f elds_set(sw gCPtr, t , value);
  }

  publ c boolean getOwn_f elds() {
    return sw gfa ssJN .Mult  ndexQuant zer2_own_f elds_get(sw gCPtr, t );
  }

  publ c Mult  ndexQuant zer2( nt d, long M, long nb s, SW GTYPE_p_p_fa ss__ ndex  ndexes) {
    t (sw gfa ssJN .new_Mult  ndexQuant zer2__SW G_0(d, M, nb s, SW GTYPE_p_p_fa ss__ ndex.getCPtr( ndexes)), true);
  }

  publ c Mult  ndexQuant zer2( nt d, long nb s,  ndex ass gn_ ndex_0,  ndex ass gn_ ndex_1) {
    t (sw gfa ssJN .new_Mult  ndexQuant zer2__SW G_1(d, nb s,  ndex.getCPtr(ass gn_ ndex_0), ass gn_ ndex_0,  ndex.getCPtr(ass gn_ ndex_1), ass gn_ ndex_1), true);
  }

  publ c vo d tra n(long n, SW GTYPE_p_float x) {
    sw gfa ssJN .Mult  ndexQuant zer2_tra n(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x));
  }

  publ c vo d search(long n, SW GTYPE_p_float x, long k, SW GTYPE_p_float d stances, LongVector labels) {
    sw gfa ssJN .Mult  ndexQuant zer2_search(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x), k, SW GTYPE_p_float.getCPtr(d stances), SW GTYPE_p_long_long.getCPtr(labels.data()), labels);
  }

}
