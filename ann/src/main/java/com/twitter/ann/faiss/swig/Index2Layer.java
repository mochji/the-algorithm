/* ----------------------------------------------------------------------------
 * T  f le was automat cally generated by SW G (http://www.sw g.org).
 * Vers on 4.0.2
 *
 * Do not make changes to t  f le unless   know what   are do ng--mod fy
 * t  SW G  nterface f le  nstead.
 * ----------------------------------------------------------------------------- */

package com.tw ter.ann.fa ss;

publ c class  ndex2Layer extends  ndexFlatCodes {
  pr vate trans ent long sw gCPtr;

  protected  ndex2Layer(long cPtr, boolean c moryOwn) {
    super(sw gfa ssJN . ndex2Layer_SW GUpcast(cPtr), c moryOwn);
    sw gCPtr = cPtr;
  }

  protected stat c long getCPtr( ndex2Layer obj) {
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
        sw gfa ssJN .delete_ ndex2Layer(sw gCPtr);
      }
      sw gCPtr = 0;
    }
    super.delete();
  }

  publ c vo d setQ1(Level1Quant zer value) {
    sw gfa ssJN . ndex2Layer_q1_set(sw gCPtr, t , Level1Quant zer.getCPtr(value), value);
  }

  publ c Level1Quant zer getQ1() {
    long cPtr = sw gfa ssJN . ndex2Layer_q1_get(sw gCPtr, t );
    return (cPtr == 0) ? null : new Level1Quant zer(cPtr, false);
  }

  publ c vo d setPq(ProductQuant zer value) {
    sw gfa ssJN . ndex2Layer_pq_set(sw gCPtr, t , ProductQuant zer.getCPtr(value), value);
  }

  publ c ProductQuant zer getPq() {
    long cPtr = sw gfa ssJN . ndex2Layer_pq_get(sw gCPtr, t );
    return (cPtr == 0) ? null : new ProductQuant zer(cPtr, false);
  }

  publ c vo d setCode_s ze_1(long value) {
    sw gfa ssJN . ndex2Layer_code_s ze_1_set(sw gCPtr, t , value);
  }

  publ c long getCode_s ze_1() {
    return sw gfa ssJN . ndex2Layer_code_s ze_1_get(sw gCPtr, t );
  }

  publ c vo d setCode_s ze_2(long value) {
    sw gfa ssJN . ndex2Layer_code_s ze_2_set(sw gCPtr, t , value);
  }

  publ c long getCode_s ze_2() {
    return sw gfa ssJN . ndex2Layer_code_s ze_2_get(sw gCPtr, t );
  }

  publ c  ndex2Layer( ndex quant zer, long nl st,  nt M,  nt nb ,  tr cType  tr c) {
    t (sw gfa ssJN .new_ ndex2Layer__SW G_0( ndex.getCPtr(quant zer), quant zer, nl st, M, nb ,  tr c.sw gValue()), true);
  }

  publ c  ndex2Layer( ndex quant zer, long nl st,  nt M,  nt nb ) {
    t (sw gfa ssJN .new_ ndex2Layer__SW G_1( ndex.getCPtr(quant zer), quant zer, nl st, M, nb ), true);
  }

  publ c  ndex2Layer( ndex quant zer, long nl st,  nt M) {
    t (sw gfa ssJN .new_ ndex2Layer__SW G_2( ndex.getCPtr(quant zer), quant zer, nl st, M), true);
  }

  publ c  ndex2Layer() {
    t (sw gfa ssJN .new_ ndex2Layer__SW G_3(), true);
  }

  publ c vo d tra n(long n, SW GTYPE_p_float x) {
    sw gfa ssJN . ndex2Layer_tra n(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x));
  }

  publ c vo d search(long n, SW GTYPE_p_float x, long k, SW GTYPE_p_float d stances, LongVector labels) {
    sw gfa ssJN . ndex2Layer_search(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x), k, SW GTYPE_p_float.getCPtr(d stances), SW GTYPE_p_long_long.getCPtr(labels.data()), labels);
  }

  publ c D stanceComputer get_d stance_computer() {
    long cPtr = sw gfa ssJN . ndex2Layer_get_d stance_computer(sw gCPtr, t );
    return (cPtr == 0) ? null : new D stanceComputer(cPtr, false);
  }

  publ c vo d transfer_to_ VFPQ( ndex VFPQ ot r) {
    sw gfa ssJN . ndex2Layer_transfer_to_ VFPQ(sw gCPtr, t ,  ndex VFPQ.getCPtr(ot r), ot r);
  }

  publ c vo d sa_encode(long n, SW GTYPE_p_float x, SW GTYPE_p_uns gned_char bytes) {
    sw gfa ssJN . ndex2Layer_sa_encode(sw gCPtr, t , n, SW GTYPE_p_float.getCPtr(x), SW GTYPE_p_uns gned_char.getCPtr(bytes));
  }

  publ c vo d sa_decode(long n, SW GTYPE_p_uns gned_char bytes, SW GTYPE_p_float x) {
    sw gfa ssJN . ndex2Layer_sa_decode(sw gCPtr, t , n, SW GTYPE_p_uns gned_char.getCPtr(bytes), SW GTYPE_p_float.getCPtr(x));
  }

}
