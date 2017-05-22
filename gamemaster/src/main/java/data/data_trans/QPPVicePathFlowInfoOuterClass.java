// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qPPVicePathFlowInfo.proto

package data.data_trans;
@SuppressWarnings("unused")
public final class QPPVicePathFlowInfoOuterClass {
  private QPPVicePathFlowInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface QPPVicePathFlowInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:data.data_trans.QPPVicePathFlowInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>optional int32 flowBytes = 2;</code>
     */
    int getFlowBytes();

    /**
     * <code>optional int32 totalTime = 3;</code>
     */
    int getTotalTime();

    /**
     * <code>optional int32 enableTime = 4;</code>
     */
    int getEnableTime();

    /**
     * <code>optional string protocol = 5;</code>
     */
    java.lang.String getProtocol();
    /**
     * <code>optional string protocol = 5;</code>
     */
    com.google.protobuf.ByteString
        getProtocolBytes();
  }
  /**
   * Protobuf type {@code data.data_trans.QPPVicePathFlowInfo}
   */
  public  static final class QPPVicePathFlowInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:data.data_trans.QPPVicePathFlowInfo)
      QPPVicePathFlowInfoOrBuilder {
    // Use QPPVicePathFlowInfo.newBuilder() to construct.
    private QPPVicePathFlowInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private QPPVicePathFlowInfo() {
      uid_ = 0;
      flowBytes_ = 0;
      totalTime_ = 0;
      enableTime_ = 0;
      protocol_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private QPPVicePathFlowInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              uid_ = input.readInt32();
              break;
            }
            case 16: {

              flowBytes_ = input.readInt32();
              break;
            }
            case 24: {

              totalTime_ = input.readInt32();
              break;
            }
            case 32: {

              enableTime_ = input.readInt32();
              break;
            }
            case 42: {
              String s = input.readStringRequireUtf8();

              protocol_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return data.data_trans.QPPVicePathFlowInfoOuterClass.internal_static_data_data_trans_QPPVicePathFlowInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return data.data_trans.QPPVicePathFlowInfoOuterClass.internal_static_data_data_trans_QPPVicePathFlowInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo.class, data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>optional int32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int FLOWBYTES_FIELD_NUMBER = 2;
    private int flowBytes_;
    /**
     * <code>optional int32 flowBytes = 2;</code>
     */
    public int getFlowBytes() {
      return flowBytes_;
    }

    public static final int TOTALTIME_FIELD_NUMBER = 3;
    private int totalTime_;
    /**
     * <code>optional int32 totalTime = 3;</code>
     */
    public int getTotalTime() {
      return totalTime_;
    }

    public static final int ENABLETIME_FIELD_NUMBER = 4;
    private int enableTime_;
    /**
     * <code>optional int32 enableTime = 4;</code>
     */
    public int getEnableTime() {
      return enableTime_;
    }

    public static final int PROTOCOL_FIELD_NUMBER = 5;
    private volatile java.lang.Object protocol_;
    /**
     * <code>optional string protocol = 5;</code>
     */
    public java.lang.String getProtocol() {
      java.lang.Object ref = protocol_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        protocol_ = s;
        return s;
      }
    }
    /**
     * <code>optional string protocol = 5;</code>
     */
    public com.google.protobuf.ByteString
        getProtocolBytes() {
      java.lang.Object ref = protocol_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        protocol_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (uid_ != 0) {
        output.writeInt32(1, uid_);
      }
      if (flowBytes_ != 0) {
        output.writeInt32(2, flowBytes_);
      }
      if (totalTime_ != 0) {
        output.writeInt32(3, totalTime_);
      }
      if (enableTime_ != 0) {
        output.writeInt32(4, enableTime_);
      }
      if (!getProtocolBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 5, protocol_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, uid_);
      }
      if (flowBytes_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, flowBytes_);
      }
      if (totalTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, totalTime_);
      }
      if (enableTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, enableTime_);
      }
      if (!getProtocolBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(5, protocol_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code data.data_trans.QPPVicePathFlowInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:data.data_trans.QPPVicePathFlowInfo)
        data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return data.data_trans.QPPVicePathFlowInfoOuterClass.internal_static_data_data_trans_QPPVicePathFlowInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return data.data_trans.QPPVicePathFlowInfoOuterClass.internal_static_data_data_trans_QPPVicePathFlowInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo.class, data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo.Builder.class);
      }

      // Construct using data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        uid_ = 0;

        flowBytes_ = 0;

        totalTime_ = 0;

        enableTime_ = 0;

        protocol_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return data.data_trans.QPPVicePathFlowInfoOuterClass.internal_static_data_data_trans_QPPVicePathFlowInfo_descriptor;
      }

      public data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo getDefaultInstanceForType() {
        return data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo.getDefaultInstance();
      }

      public data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo build() {
        data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo buildPartial() {
        data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo result = new data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo(this);
        result.uid_ = uid_;
        result.flowBytes_ = flowBytes_;
        result.totalTime_ = totalTime_;
        result.enableTime_ = enableTime_;
        result.protocol_ = protocol_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo) {
          return mergeFrom((data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo other) {
        if (other == data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getFlowBytes() != 0) {
          setFlowBytes(other.getFlowBytes());
        }
        if (other.getTotalTime() != 0) {
          setTotalTime(other.getTotalTime());
        }
        if (other.getEnableTime() != 0) {
          setEnableTime(other.getEnableTime());
        }
        if (!other.getProtocol().isEmpty()) {
          protocol_ = other.protocol_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int uid_ ;
      /**
       * <code>optional int32 uid = 1;</code>
       */
      public int getUid() {
        return uid_;
      }
      /**
       * <code>optional int32 uid = 1;</code>
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 uid = 1;</code>
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private int flowBytes_ ;
      /**
       * <code>optional int32 flowBytes = 2;</code>
       */
      public int getFlowBytes() {
        return flowBytes_;
      }
      /**
       * <code>optional int32 flowBytes = 2;</code>
       */
      public Builder setFlowBytes(int value) {
        
        flowBytes_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 flowBytes = 2;</code>
       */
      public Builder clearFlowBytes() {
        
        flowBytes_ = 0;
        onChanged();
        return this;
      }

      private int totalTime_ ;
      /**
       * <code>optional int32 totalTime = 3;</code>
       */
      public int getTotalTime() {
        return totalTime_;
      }
      /**
       * <code>optional int32 totalTime = 3;</code>
       */
      public Builder setTotalTime(int value) {
        
        totalTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 totalTime = 3;</code>
       */
      public Builder clearTotalTime() {
        
        totalTime_ = 0;
        onChanged();
        return this;
      }

      private int enableTime_ ;
      /**
       * <code>optional int32 enableTime = 4;</code>
       */
      public int getEnableTime() {
        return enableTime_;
      }
      /**
       * <code>optional int32 enableTime = 4;</code>
       */
      public Builder setEnableTime(int value) {
        
        enableTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 enableTime = 4;</code>
       */
      public Builder clearEnableTime() {
        
        enableTime_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object protocol_ = "";
      /**
       * <code>optional string protocol = 5;</code>
       */
      public java.lang.String getProtocol() {
        java.lang.Object ref = protocol_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          protocol_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string protocol = 5;</code>
       */
      public com.google.protobuf.ByteString
          getProtocolBytes() {
        java.lang.Object ref = protocol_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          protocol_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string protocol = 5;</code>
       */
      public Builder setProtocol(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        protocol_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string protocol = 5;</code>
       */
      public Builder clearProtocol() {
        
        protocol_ = getDefaultInstance().getProtocol();
        onChanged();
        return this;
      }
      /**
       * <code>optional string protocol = 5;</code>
       */
      public Builder setProtocolBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        protocol_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:data.data_trans.QPPVicePathFlowInfo)
    }

    // @@protoc_insertion_point(class_scope:data.data_trans.QPPVicePathFlowInfo)
    private static final data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo();
    }

    public static data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QPPVicePathFlowInfo>
        PARSER = new com.google.protobuf.AbstractParser<QPPVicePathFlowInfo>() {
      public QPPVicePathFlowInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new QPPVicePathFlowInfo(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<QPPVicePathFlowInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QPPVicePathFlowInfo> getParserForType() {
      return PARSER;
    }

    public data.data_trans.QPPVicePathFlowInfoOuterClass.QPPVicePathFlowInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_data_data_trans_QPPVicePathFlowInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_data_data_trans_QPPVicePathFlowInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031qPPVicePathFlowInfo.proto\022\017data.data_t" +
      "rans\"n\n\023QPPVicePathFlowInfo\022\013\n\003uid\030\001 \001(\005" +
      "\022\021\n\tflowBytes\030\002 \001(\005\022\021\n\ttotalTime\030\003 \001(\005\022\022" +
      "\n\nenableTime\030\004 \001(\005\022\020\n\010protocol\030\005 \001(\tb\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_data_data_trans_QPPVicePathFlowInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_data_data_trans_QPPVicePathFlowInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_data_data_trans_QPPVicePathFlowInfo_descriptor,
        new java.lang.String[] { "Uid", "FlowBytes", "TotalTime", "EnableTime", "Protocol", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
