/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class  ndexFlat P extends  ndexFlat {
  pr vate trans ent long sw gCPtr;

  protected  ndexFlat P(long cPtr, boolean c moryOwn) {
    super(sw gfa ssJN . ndexFlat P_SW GUpcast(cPtr), c moryOwn);
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr( ndexFlat P obj) {
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
        sw gfa ssJN .delete_ ndexFlat P(sw gCPtr);
      }
      sw gCPtr = 0;
    }
    super.delete();
  }

  publ c  ndexFlat P(long d) {
    t (sw gfa ssJN .new_ ndexFlat P__SW G_0(d), true);
  }

  publ c  ndexFlat P() {
    t (sw gfa ssJN .new_ ndexFlat P__SW G_1(), true);
  }

}
