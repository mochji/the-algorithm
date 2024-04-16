#pragma once
# fdef __cplusplus

# nclude <twml/common.h>
# nclude <twml/def nes.h>
# nclude <twml/DataRecord.h>
# nclude <twml/TensorRecordReader.h>

# nclude <cstd nt>

# nclude <vector>
# nclude <str ng>
# nclude <unordered_map>

na space twml {

class TWMLAP  DataRecordReader : publ c TensorRecordReader {

pr vate:
  typedef Map< nt64_t,  nt64_t> KeyMap_t;
  KeyMap_t *m_keep_map;
  KeyMap_t *m_labels_map;
  KeyMap_t *m_  ghts_map;

publ c:
  bool keepKey              (const  nt64_t &key,  nt64_t &code);
  bool  sLabel              (const  nt64_t &key,  nt64_t &code);
  bool  s  ght             (const  nt64_t &key,  nt64_t &code);
  vo d readB nary           (const  nt feature_type , DataRecord *record);
  vo d readCont nuous       (const  nt feature_type , DataRecord *record);
  vo d readD screte         (const  nt feature_type , DataRecord *record);
  vo d readStr ng           (const  nt feature_type , DataRecord *record);
  vo d readSparseB nary     (const  nt feature_type , DataRecord *record);
  vo d readSparseCont nuous (const  nt feature_type , DataRecord *record);
  vo d readBlob             (const  nt feature_type , DataRecord *record);

  DataRecordReader() :
      TensorRecordReader(nullptr),
      m_keep_map(nullptr),
      m_labels_map(nullptr),
      m_  ghts_map(nullptr)
      {}

  // Us ng a template  nstead of  nt64_t because tensorflow  mple nts  nt64 based on comp ler.
  vo d setKeepMap(KeyMap_t *keep_map) {
    m_keep_map = keep_map;
  }

  vo d setLabelsMap(KeyMap_t *labels_map) {
    m_labels_map = labels_map;
  }

  vo d set  ghtsMap(KeyMap_t *  ghts_map) {
    m_  ghts_map =   ghts_map;
  }

  vo d setDecodeMode( nt64_t mode) {}
};

}
#end f
