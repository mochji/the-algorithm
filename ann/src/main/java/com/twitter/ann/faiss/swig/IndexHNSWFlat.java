/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class  ndexHNSWFlat extends  ndexHNSW {
  pr vate trans ent long sw gCPtr;

  protected  ndexHNSWFlat(long cPtr, boolean c moryOwn) {
    super(sw gfa ssJN . ndexHNSWFlat_SW GUpcast(cPtr), c moryOwn);
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr( ndexHNSWFlat obj) {
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
        sw gfa ssJN .delete_ ndexHNSWFlat(sw gCPtr);
      }
      sw gCPtr = 0;
    }
    super.delete();
  }

  publ c  ndexHNSWFlat() {
    t (sw gfa ssJN .new_ ndexHNSWFlat__SW G_0(), true);
  }

  publ c  ndexHNSWFlat( nt d,  nt M,  tr cType  tr c) {
    t (sw gfa ssJN .new_ ndexHNSWFlat__SW G_1(d, M,  tr c.sw gValue()), true);
  }

  publ c  ndexHNSWFlat( nt d,  nt M) {
    t (sw gfa ssJN .new_ ndexHNSWFlat__SW G_2(d, M), true);
  }

}
