/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class S mulatedAnneal ngOpt m zer extends S mulatedAnneal ngPara ters {
  pr vate trans ent long sw gCPtr;

  protected S mulatedAnneal ngOpt m zer(long cPtr, boolean c moryOwn) {
    super(sw gfa ssJN .S mulatedAnneal ngOpt m zer_SW GUpcast(cPtr), c moryOwn);
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr(S mulatedAnneal ngOpt m zer obj) {
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
        sw gfa ssJN .delete_S mulatedAnneal ngOpt m zer(sw gCPtr);
      }
      sw gCPtr = 0;
    }
    super.delete();
  }

  publ c vo d setObj(Permutat onObject ve value) {
    sw gfa ssJN .S mulatedAnneal ngOpt m zer_obj_set(sw gCPtr, t , Permutat onObject ve.getCPtr(value), value);
  }

  publ c Permutat onObject ve getObj() {
    long cPtr = sw gfa ssJN .S mulatedAnneal ngOpt m zer_obj_get(sw gCPtr, t );
    return (cPtr == 0) ? null : new Permutat onObject ve(cPtr, false);
  }

  publ c vo d setN( nt value) {
    sw gfa ssJN .S mulatedAnneal ngOpt m zer_n_set(sw gCPtr, t , value);
  }

  publ c  nt getN() {
    return sw gfa ssJN .S mulatedAnneal ngOpt m zer_n_get(sw gCPtr, t );
  }

  publ c vo d setLogf le(SW GTYPE_p_F LE value) {
    sw gfa ssJN .S mulatedAnneal ngOpt m zer_logf le_set(sw gCPtr, t , SW GTYPE_p_F LE.getCPtr(value));
  }

  publ c SW GTYPE_p_F LE getLogf le() {
    long cPtr = sw gfa ssJN .S mulatedAnneal ngOpt m zer_logf le_get(sw gCPtr, t );
    return (cPtr == 0) ? null : new SW GTYPE_p_F LE(cPtr, false);
  }

  publ c S mulatedAnneal ngOpt m zer(Permutat onObject ve obj, S mulatedAnneal ngPara ters p) {
    t (sw gfa ssJN .new_S mulatedAnneal ngOpt m zer(Permutat onObject ve.getCPtr(obj), obj, S mulatedAnneal ngPara ters.getCPtr(p), p), true);
  }

  publ c vo d setRnd(SW GTYPE_p_fa ss__RandomGenerator value) {
    sw gfa ssJN .S mulatedAnneal ngOpt m zer_rnd_set(sw gCPtr, t , SW GTYPE_p_fa ss__RandomGenerator.getCPtr(value));
  }

  publ c SW GTYPE_p_fa ss__RandomGenerator getRnd() {
    long cPtr = sw gfa ssJN .S mulatedAnneal ngOpt m zer_rnd_get(sw gCPtr, t );
    return (cPtr == 0) ? null : new SW GTYPE_p_fa ss__RandomGenerator(cPtr, false);
  }

  publ c vo d set n _cost(double value) {
    sw gfa ssJN .S mulatedAnneal ngOpt m zer_ n _cost_set(sw gCPtr, t , value);
  }

  publ c double get n _cost() {
    return sw gfa ssJN .S mulatedAnneal ngOpt m zer_ n _cost_get(sw gCPtr, t );
  }

  publ c double opt m ze(SW GTYPE_p_ nt perm) {
    return sw gfa ssJN .S mulatedAnneal ngOpt m zer_opt m ze(sw gCPtr, t , SW GTYPE_p_ nt.getCPtr(perm));
  }

  publ c double run_opt m zat on(SW GTYPE_p_ nt best_perm) {
    return sw gfa ssJN .S mulatedAnneal ngOpt m zer_run_opt m zat on(sw gCPtr, t , SW GTYPE_p_ nt.getCPtr(best_perm));
  }

}
