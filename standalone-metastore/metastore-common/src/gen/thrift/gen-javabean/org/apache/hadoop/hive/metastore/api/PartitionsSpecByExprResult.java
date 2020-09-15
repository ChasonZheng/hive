/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class PartitionsSpecByExprResult implements org.apache.thrift.TBase<PartitionsSpecByExprResult, PartitionsSpecByExprResult._Fields>, java.io.Serializable, Cloneable, Comparable<PartitionsSpecByExprResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PartitionsSpecByExprResult");

  private static final org.apache.thrift.protocol.TField PARTITIONS_SPEC_FIELD_DESC = new org.apache.thrift.protocol.TField("partitionsSpec", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField HAS_UNKNOWN_PARTITIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("hasUnknownPartitions", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PartitionsSpecByExprResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PartitionsSpecByExprResultTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<PartitionSpec> partitionsSpec; // required
  private boolean hasUnknownPartitions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITIONS_SPEC((short)1, "partitionsSpec"),
    HAS_UNKNOWN_PARTITIONS((short)2, "hasUnknownPartitions");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PARTITIONS_SPEC
          return PARTITIONS_SPEC;
        case 2: // HAS_UNKNOWN_PARTITIONS
          return HAS_UNKNOWN_PARTITIONS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __HASUNKNOWNPARTITIONS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITIONS_SPEC, new org.apache.thrift.meta_data.FieldMetaData("partitionsSpec", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PartitionSpec.class))));
    tmpMap.put(_Fields.HAS_UNKNOWN_PARTITIONS, new org.apache.thrift.meta_data.FieldMetaData("hasUnknownPartitions", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PartitionsSpecByExprResult.class, metaDataMap);
  }

  public PartitionsSpecByExprResult() {
  }

  public PartitionsSpecByExprResult(
    java.util.List<PartitionSpec> partitionsSpec,
    boolean hasUnknownPartitions)
  {
    this();
    this.partitionsSpec = partitionsSpec;
    this.hasUnknownPartitions = hasUnknownPartitions;
    setHasUnknownPartitionsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionsSpecByExprResult(PartitionsSpecByExprResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPartitionsSpec()) {
      java.util.List<PartitionSpec> __this__partitionsSpec = new java.util.ArrayList<PartitionSpec>(other.partitionsSpec.size());
      for (PartitionSpec other_element : other.partitionsSpec) {
        __this__partitionsSpec.add(new PartitionSpec(other_element));
      }
      this.partitionsSpec = __this__partitionsSpec;
    }
    this.hasUnknownPartitions = other.hasUnknownPartitions;
  }

  public PartitionsSpecByExprResult deepCopy() {
    return new PartitionsSpecByExprResult(this);
  }

  @Override
  public void clear() {
    this.partitionsSpec = null;
    setHasUnknownPartitionsIsSet(false);
    this.hasUnknownPartitions = false;
  }

  public int getPartitionsSpecSize() {
    return (this.partitionsSpec == null) ? 0 : this.partitionsSpec.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<PartitionSpec> getPartitionsSpecIterator() {
    return (this.partitionsSpec == null) ? null : this.partitionsSpec.iterator();
  }

  public void addToPartitionsSpec(PartitionSpec elem) {
    if (this.partitionsSpec == null) {
      this.partitionsSpec = new java.util.ArrayList<PartitionSpec>();
    }
    this.partitionsSpec.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<PartitionSpec> getPartitionsSpec() {
    return this.partitionsSpec;
  }

  public void setPartitionsSpec(@org.apache.thrift.annotation.Nullable java.util.List<PartitionSpec> partitionsSpec) {
    this.partitionsSpec = partitionsSpec;
  }

  public void unsetPartitionsSpec() {
    this.partitionsSpec = null;
  }

  /** Returns true if field partitionsSpec is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitionsSpec() {
    return this.partitionsSpec != null;
  }

  public void setPartitionsSpecIsSet(boolean value) {
    if (!value) {
      this.partitionsSpec = null;
    }
  }

  public boolean isHasUnknownPartitions() {
    return this.hasUnknownPartitions;
  }

  public void setHasUnknownPartitions(boolean hasUnknownPartitions) {
    this.hasUnknownPartitions = hasUnknownPartitions;
    setHasUnknownPartitionsIsSet(true);
  }

  public void unsetHasUnknownPartitions() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HASUNKNOWNPARTITIONS_ISSET_ID);
  }

  /** Returns true if field hasUnknownPartitions is set (has been assigned a value) and false otherwise */
  public boolean isSetHasUnknownPartitions() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HASUNKNOWNPARTITIONS_ISSET_ID);
  }

  public void setHasUnknownPartitionsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HASUNKNOWNPARTITIONS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PARTITIONS_SPEC:
      if (value == null) {
        unsetPartitionsSpec();
      } else {
        setPartitionsSpec((java.util.List<PartitionSpec>)value);
      }
      break;

    case HAS_UNKNOWN_PARTITIONS:
      if (value == null) {
        unsetHasUnknownPartitions();
      } else {
        setHasUnknownPartitions((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITIONS_SPEC:
      return getPartitionsSpec();

    case HAS_UNKNOWN_PARTITIONS:
      return isHasUnknownPartitions();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PARTITIONS_SPEC:
      return isSetPartitionsSpec();
    case HAS_UNKNOWN_PARTITIONS:
      return isSetHasUnknownPartitions();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof PartitionsSpecByExprResult)
      return this.equals((PartitionsSpecByExprResult)that);
    return false;
  }

  public boolean equals(PartitionsSpecByExprResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_partitionsSpec = true && this.isSetPartitionsSpec();
    boolean that_present_partitionsSpec = true && that.isSetPartitionsSpec();
    if (this_present_partitionsSpec || that_present_partitionsSpec) {
      if (!(this_present_partitionsSpec && that_present_partitionsSpec))
        return false;
      if (!this.partitionsSpec.equals(that.partitionsSpec))
        return false;
    }

    boolean this_present_hasUnknownPartitions = true;
    boolean that_present_hasUnknownPartitions = true;
    if (this_present_hasUnknownPartitions || that_present_hasUnknownPartitions) {
      if (!(this_present_hasUnknownPartitions && that_present_hasUnknownPartitions))
        return false;
      if (this.hasUnknownPartitions != that.hasUnknownPartitions)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPartitionsSpec()) ? 131071 : 524287);
    if (isSetPartitionsSpec())
      hashCode = hashCode * 8191 + partitionsSpec.hashCode();

    hashCode = hashCode * 8191 + ((hasUnknownPartitions) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(PartitionsSpecByExprResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPartitionsSpec()).compareTo(other.isSetPartitionsSpec());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitionsSpec()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitionsSpec, other.partitionsSpec);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHasUnknownPartitions()).compareTo(other.isSetHasUnknownPartitions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasUnknownPartitions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasUnknownPartitions, other.hasUnknownPartitions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PartitionsSpecByExprResult(");
    boolean first = true;

    sb.append("partitionsSpec:");
    if (this.partitionsSpec == null) {
      sb.append("null");
    } else {
      sb.append(this.partitionsSpec);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hasUnknownPartitions:");
    sb.append(this.hasUnknownPartitions);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetPartitionsSpec()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partitionsSpec' is unset! Struct:" + toString());
    }

    if (!isSetHasUnknownPartitions()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'hasUnknownPartitions' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PartitionsSpecByExprResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PartitionsSpecByExprResultStandardScheme getScheme() {
      return new PartitionsSpecByExprResultStandardScheme();
    }
  }

  private static class PartitionsSpecByExprResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<PartitionsSpecByExprResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PartitionsSpecByExprResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITIONS_SPEC
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list456 = iprot.readListBegin();
                struct.partitionsSpec = new java.util.ArrayList<PartitionSpec>(_list456.size);
                @org.apache.thrift.annotation.Nullable PartitionSpec _elem457;
                for (int _i458 = 0; _i458 < _list456.size; ++_i458)
                {
                  _elem457 = new PartitionSpec();
                  _elem457.read(iprot);
                  struct.partitionsSpec.add(_elem457);
                }
                iprot.readListEnd();
              }
              struct.setPartitionsSpecIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HAS_UNKNOWN_PARTITIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hasUnknownPartitions = iprot.readBool();
              struct.setHasUnknownPartitionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PartitionsSpecByExprResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partitionsSpec != null) {
        oprot.writeFieldBegin(PARTITIONS_SPEC_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partitionsSpec.size()));
          for (PartitionSpec _iter459 : struct.partitionsSpec)
          {
            _iter459.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(HAS_UNKNOWN_PARTITIONS_FIELD_DESC);
      oprot.writeBool(struct.hasUnknownPartitions);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionsSpecByExprResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PartitionsSpecByExprResultTupleScheme getScheme() {
      return new PartitionsSpecByExprResultTupleScheme();
    }
  }

  private static class PartitionsSpecByExprResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<PartitionsSpecByExprResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PartitionsSpecByExprResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.partitionsSpec.size());
        for (PartitionSpec _iter460 : struct.partitionsSpec)
        {
          _iter460.write(oprot);
        }
      }
      oprot.writeBool(struct.hasUnknownPartitions);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PartitionsSpecByExprResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list461 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.partitionsSpec = new java.util.ArrayList<PartitionSpec>(_list461.size);
        @org.apache.thrift.annotation.Nullable PartitionSpec _elem462;
        for (int _i463 = 0; _i463 < _list461.size; ++_i463)
        {
          _elem462 = new PartitionSpec();
          _elem462.read(iprot);
          struct.partitionsSpec.add(_elem462);
        }
      }
      struct.setPartitionsSpecIsSet(true);
      struct.hasUnknownPartitions = iprot.readBool();
      struct.setHasUnknownPartitionsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

