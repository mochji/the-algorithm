/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class  TQMatr x extends L nearTransform {
  pr vate trans ent long sw gCPtr;

  protected  TQMatr x(long cPtr, boolean c moryOwn) {
    super(sw gfa ssJN . TQMatr x_SW GUpcast(cPtr), c moryOwn);
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr( TQMatr x obj) {
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
        sw gfa ssJN .delete_ TQMatr x(sw gCPtr);
      }
      sw gCPtr = 0;
    }
    super.delete();
  }

  publ c vo d setMax_ er( nt value) {
    sw gfa ssJN . TQMatr x_max_ er_set(sw gCPtr, t , value);
  }

  publ c  nt getMax_ er() {
    return sw gfa ssJN . TQMatr x_max_ er_get(sw gCPtr, t );
  }

  publ c vo d setSeed( nt value) {
    sw gfa ssJN . TQMatr x_seed_set(sw gCPtr, t , value);
  }

  publ c  nt getSeed() {
    return sw gfa ssJN . TQMatr x_seed_get(sw gCPtr, t );
  }

  publ c vo d set n _rotat on(DoubleVector value) {
    sw gfa ssJN . TQMatr x_ n _rotat on_set(sw gCPtr, t , DoubleVector.getCPtr(value), value);
  }

  publ c DoubleVector get n _rotat on() {
    long cPtr = sw gfa ssJN . TQMatr x_ n _rotat on_get(sw gCPtr, t );
    return (cPtr == 0) ? null : new DoubleVector(cPtr, false);
  }

  publ c  TQMatr x( nt d) {
    t (sw gfa ssJN .new_ TQMatr x__SW G_0(d), true);
  }

  publ c  TQMatr x() {
    t (sw gfa ssJN .new_ TQMatr x__SW G_1(), true);
  }

  publ c vo d tra n(long n, SW GTYPE_p_float x) {
    sw gfa ssJN . TQMatr x_tra n(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x));
  }

}
