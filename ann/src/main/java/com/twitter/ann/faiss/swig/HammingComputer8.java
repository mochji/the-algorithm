/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class Hamm ngComputer8 {
  pr vate trans ent long sw gCPtr;
  protected trans ent boolean sw gC mOwn;

  protected Hamm ngComputer8(long cPtr, boolean c moryOwn) {
    sw gC mOwn = c moryOwn;
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr(Hamm ngComputer8 obj) {
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
        sw gfa ssJN .delete_Hamm ngComputer8(sw gCPtr);
      }
      sw gCPtr = 0;
    }
  }

  publ c vo d setA0(long value) {
    sw gfa ssJN .Hamm ngComputer8_a0_set(sw gCPtr, t , value);
  }

  publ c long getA0() {
    return sw gfa ssJN .Hamm ngComputer8_a0_get(sw gCPtr, t );
  }

  publ c Hamm ngComputer8() {
    t (sw gfa ssJN .new_Hamm ngComputer8__SW G_0(), true);
  }

  publ c Hamm ngComputer8(SW GTYPE_p_uns gned_char a,  nt code_s ze) {
    t (sw gfa ssJN .new_Hamm ngComputer8__SW G_1(SW GTYPE_p_uns gned_char.getCPtr(a), code_s ze), true);
  }

  publ c vo d set(SW GTYPE_p_uns gned_char a,  nt code_s ze) {
    sw gfa ssJN .Hamm ngComputer8_set(sw gCPtr, t , SW GTYPE_p_uns gned_char.getCPtr(a), code_s ze);
  }

  publ c  nt hamm ng(SW GTYPE_p_uns gned_char b) {
    return sw gfa ssJN .Hamm ngComputer8_hamm ng(sw gCPtr, t , SW GTYPE_p_uns gned_char.getCPtr(b));
  }

}
