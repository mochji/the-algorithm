/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class GenHamm ngComputerM8 {
  pr vate trans ent long sw gCPtr;
  protected trans ent boolean sw gC mOwn;

  protected GenHamm ngComputerM8(long cPtr, boolean c moryOwn) {
    sw gC mOwn = c moryOwn;
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr(GenHamm ngComputerM8 obj) {
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
        sw gfa ssJN .delete_GenHamm ngComputerM8(sw gCPtr);
      }
      sw gCPtr = 0;
    }
  }

  publ c vo d setA(SW GTYPE_p_uns gned_long value) {
    sw gfa ssJN .GenHamm ngComputerM8_a_set(sw gCPtr, t , SW GTYPE_p_uns gned_long.getCPtr(value));
  }

  publ c SW GTYPE_p_uns gned_long getA() {
    long cPtr = sw gfa ssJN .GenHamm ngComputerM8_a_get(sw gCPtr, t );
    return (cPtr == 0) ? null : new SW GTYPE_p_uns gned_long(cPtr, false);
  }

  publ c vo d setN( nt value) {
    sw gfa ssJN .GenHamm ngComputerM8_n_set(sw gCPtr, t , value);
  }

  publ c  nt getN() {
    return sw gfa ssJN .GenHamm ngComputerM8_n_get(sw gCPtr, t );
  }

  publ c GenHamm ngComputerM8(SW GTYPE_p_uns gned_char a8,  nt code_s ze) {
    t (sw gfa ssJN .new_GenHamm ngComputerM8(SW GTYPE_p_uns gned_char.getCPtr(a8), code_s ze), true);
  }

  publ c  nt hamm ng(SW GTYPE_p_uns gned_char b8) {
    return sw gfa ssJN .GenHamm ngComputerM8_hamm ng(sw gCPtr, t , SW GTYPE_p_uns gned_char.getCPtr(b8));
  }

}
