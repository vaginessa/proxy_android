// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: createConnectInfo.proto

package data.data_trans;

@SuppressWarnings("unused")
public final class CreateConnectInfoOuterClass {
  private CreateConnectInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CreateConnectInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:data.data_trans.CreateConnectInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 errCode = 1;</code>
     */
    int getErrCode();

    /**
     * <code>optional bool transparent = 2;</code>
     */
    boolean getTransparent();
  }
  /**
   * Protobuf type {@code data.data_trans.CreateConnectInfo}
   */
  public  static final class CreateConnectInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:data.data_trans.CreateConnectInfo)
      CreateConnectInfoOrBuilder {
    // Use CreateConnectInfo.newBuilder() to construct.
    private CreateConnectInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private CreateConnectInfo() {
      errCode_ = 0;
      transparent_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private CreateConnectInfo(
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

              errCode_ = input.readInt32();
              break;
            }
            case 16: {

              transparent_ = input.readBool();
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
      return data.data_trans.CreateConnectInfoOuterClass.internal_static_data_data_trans_CreateConnectInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return data.data_trans.CreateConnectInfoOuterClass.internal_static_data_data_trans_CreateConnectInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo.class, data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo.Builder.class);
    }

    public static final int ERRCODE_FIELD_NUMBER = 1;
    private int errCode_;
    /**
     * <code>optional int32 errCode = 1;</code>
     */
    public int getErrCode() {
      return errCode_;
    }

    public static final int TRANSPARENT_FIELD_NUMBER = 2;
    private boolean transparent_;
    /**
     * <code>optional bool transparent = 2;</code>
     */
    public boolean getTransparent() {
      return transparent_;
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
      if (errCode_ != 0) {
        output.writeInt32(1, errCode_);
      }
      if (transparent_ != false) {
        output.writeBool(2, transparent_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (errCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, errCode_);
      }
      if (transparent_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, transparent_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo prototype) {
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
     * Protobuf type {@code data.data_trans.CreateConnectInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:data.data_trans.CreateConnectInfo)
        data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return data.data_trans.CreateConnectInfoOuterClass.internal_static_data_data_trans_CreateConnectInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return data.data_trans.CreateConnectInfoOuterClass.internal_static_data_data_trans_CreateConnectInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo.class, data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo.Builder.class);
      }

      // Construct using data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo.newBuilder()
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
        errCode_ = 0;

        transparent_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return data.data_trans.CreateConnectInfoOuterClass.internal_static_data_data_trans_CreateConnectInfo_descriptor;
      }

      public data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo getDefaultInstanceForType() {
        return data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo.getDefaultInstance();
      }

      public data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo build() {
        data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo buildPartial() {
        data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo result = new data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo(this);
        result.errCode_ = errCode_;
        result.transparent_ = transparent_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo) {
          return mergeFrom((data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo other) {
        if (other == data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo.getDefaultInstance()) return this;
        if (other.getErrCode() != 0) {
          setErrCode(other.getErrCode());
        }
        if (other.getTransparent() != false) {
          setTransparent(other.getTransparent());
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
        data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int errCode_ ;
      /**
       * <code>optional int32 errCode = 1;</code>
       */
      public int getErrCode() {
        return errCode_;
      }
      /**
       * <code>optional int32 errCode = 1;</code>
       */
      public Builder setErrCode(int value) {
        
        errCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 errCode = 1;</code>
       */
      public Builder clearErrCode() {
        
        errCode_ = 0;
        onChanged();
        return this;
      }

      private boolean transparent_ ;
      /**
       * <code>optional bool transparent = 2;</code>
       */
      public boolean getTransparent() {
        return transparent_;
      }
      /**
       * <code>optional bool transparent = 2;</code>
       */
      public Builder setTransparent(boolean value) {
        
        transparent_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool transparent = 2;</code>
       */
      public Builder clearTransparent() {
        
        transparent_ = false;
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


      // @@protoc_insertion_point(builder_scope:data.data_trans.CreateConnectInfo)
    }

    // @@protoc_insertion_point(class_scope:data.data_trans.CreateConnectInfo)
    private static final data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo();
    }

    public static data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CreateConnectInfo>
        PARSER = new com.google.protobuf.AbstractParser<CreateConnectInfo>() {
      public CreateConnectInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new CreateConnectInfo(input, extensionRegistry);
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

    public static com.google.protobuf.Parser<CreateConnectInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CreateConnectInfo> getParserForType() {
      return PARSER;
    }

    public data.data_trans.CreateConnectInfoOuterClass.CreateConnectInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_data_data_trans_CreateConnectInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_data_data_trans_CreateConnectInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027createConnectInfo.proto\022\017data.data_tra" +
      "ns\"9\n\021CreateConnectInfo\022\017\n\007errCode\030\001 \001(\005" +
      "\022\023\n\013transparent\030\002 \001(\010b\006proto3"
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
    internal_static_data_data_trans_CreateConnectInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_data_data_trans_CreateConnectInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_data_data_trans_CreateConnectInfo_descriptor,
        new java.lang.String[] { "ErrCode", "Transparent", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
