// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gameConnectedInfo.proto

package data.data_trans;

@SuppressWarnings("unused")
public final class GameConnectedInfoOuterClass {
  private GameConnectedInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GameConnectedInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:data.data_trans.GameConnectedInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>optional int32 connTime = 2;</code>
     */
    int getConnTime();
  }
  /**
   * Protobuf type {@code data.data_trans.GameConnectedInfo}
   */
  public  static final class GameConnectedInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:data.data_trans.GameConnectedInfo)
      GameConnectedInfoOrBuilder {
    // Use GameConnectedInfo.newBuilder() to construct.
    private GameConnectedInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private GameConnectedInfo() {
      uid_ = 0;
      connTime_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private GameConnectedInfo(
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

              connTime_ = input.readInt32();
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
      return data.data_trans.GameConnectedInfoOuterClass.internal_static_data_data_trans_GameConnectedInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return data.data_trans.GameConnectedInfoOuterClass.internal_static_data_data_trans_GameConnectedInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo.class, data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>optional int32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int CONNTIME_FIELD_NUMBER = 2;
    private int connTime_;
    /**
     * <code>optional int32 connTime = 2;</code>
     */
    public int getConnTime() {
      return connTime_;
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
      if (connTime_ != 0) {
        output.writeInt32(2, connTime_);
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
      if (connTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, connTime_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo prototype) {
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
     * Protobuf type {@code data.data_trans.GameConnectedInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:data.data_trans.GameConnectedInfo)
        data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return data.data_trans.GameConnectedInfoOuterClass.internal_static_data_data_trans_GameConnectedInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return data.data_trans.GameConnectedInfoOuterClass.internal_static_data_data_trans_GameConnectedInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo.class, data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo.Builder.class);
      }

      // Construct using data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo.newBuilder()
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

        connTime_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return data.data_trans.GameConnectedInfoOuterClass.internal_static_data_data_trans_GameConnectedInfo_descriptor;
      }

      public data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo getDefaultInstanceForType() {
        return data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo.getDefaultInstance();
      }

      public data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo build() {
        data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo buildPartial() {
        data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo result = new data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo(this);
        result.uid_ = uid_;
        result.connTime_ = connTime_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo) {
          return mergeFrom((data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo other) {
        if (other == data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getConnTime() != 0) {
          setConnTime(other.getConnTime());
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
        data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo) e.getUnfinishedMessage();
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

      private int connTime_ ;
      /**
       * <code>optional int32 connTime = 2;</code>
       */
      public int getConnTime() {
        return connTime_;
      }
      /**
       * <code>optional int32 connTime = 2;</code>
       */
      public Builder setConnTime(int value) {
        
        connTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 connTime = 2;</code>
       */
      public Builder clearConnTime() {
        
        connTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:data.data_trans.GameConnectedInfo)
    }

    // @@protoc_insertion_point(class_scope:data.data_trans.GameConnectedInfo)
    private static final data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo();
    }

    public static data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GameConnectedInfo>
        PARSER = new com.google.protobuf.AbstractParser<GameConnectedInfo>() {
      public GameConnectedInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new GameConnectedInfo(input, extensionRegistry);
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

    public static com.google.protobuf.Parser<GameConnectedInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GameConnectedInfo> getParserForType() {
      return PARSER;
    }

    public data.data_trans.GameConnectedInfoOuterClass.GameConnectedInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_data_data_trans_GameConnectedInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_data_data_trans_GameConnectedInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027gameConnectedInfo.proto\022\017data.data_tra" +
      "ns\"2\n\021GameConnectedInfo\022\013\n\003uid\030\001 \001(\005\022\020\n\010" +
      "connTime\030\002 \001(\005b\006proto3"
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
    internal_static_data_data_trans_GameConnectedInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_data_data_trans_GameConnectedInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_data_data_trans_GameConnectedInfo_descriptor,
        new java.lang.String[] { "Uid", "ConnTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
