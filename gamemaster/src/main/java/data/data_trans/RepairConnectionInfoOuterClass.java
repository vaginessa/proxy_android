// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: repairConnectionInfo.proto

package data.data_trans;

@SuppressWarnings("unused")
public final class RepairConnectionInfoOuterClass {
  private RepairConnectionInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RepairConnectionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:data.data_trans.RepairConnectionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 uid = 1;</code>
     */
    int getUid();

    /**
     * <code>optional int32 taskId = 2;</code>
     */
    int getTaskId();

    /**
     * <code>optional bool succ = 3;</code>
     */
    boolean getSucc();

    /**
     * <code>optional int32 reconnCount = 4;</code>
     */
    int getReconnCount();
  }
  /**
   * Protobuf type {@code data.data_trans.RepairConnectionInfo}
   */
  public  static final class RepairConnectionInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:data.data_trans.RepairConnectionInfo)
      RepairConnectionInfoOrBuilder {
    // Use RepairConnectionInfo.newBuilder() to construct.
    private RepairConnectionInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private RepairConnectionInfo() {
      uid_ = 0;
      taskId_ = 0;
      succ_ = false;
      reconnCount_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private RepairConnectionInfo(
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

              taskId_ = input.readInt32();
              break;
            }
            case 24: {

              succ_ = input.readBool();
              break;
            }
            case 32: {

              reconnCount_ = input.readInt32();
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
      return data.data_trans.RepairConnectionInfoOuterClass.internal_static_data_data_trans_RepairConnectionInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return data.data_trans.RepairConnectionInfoOuterClass.internal_static_data_data_trans_RepairConnectionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo.class, data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 1;
    private int uid_;
    /**
     * <code>optional int32 uid = 1;</code>
     */
    public int getUid() {
      return uid_;
    }

    public static final int TASKID_FIELD_NUMBER = 2;
    private int taskId_;
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public int getTaskId() {
      return taskId_;
    }

    public static final int SUCC_FIELD_NUMBER = 3;
    private boolean succ_;
    /**
     * <code>optional bool succ = 3;</code>
     */
    public boolean getSucc() {
      return succ_;
    }

    public static final int RECONNCOUNT_FIELD_NUMBER = 4;
    private int reconnCount_;
    /**
     * <code>optional int32 reconnCount = 4;</code>
     */
    public int getReconnCount() {
      return reconnCount_;
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
      if (taskId_ != 0) {
        output.writeInt32(2, taskId_);
      }
      if (succ_ != false) {
        output.writeBool(3, succ_);
      }
      if (reconnCount_ != 0) {
        output.writeInt32(4, reconnCount_);
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
      if (taskId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, taskId_);
      }
      if (succ_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, succ_);
      }
      if (reconnCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, reconnCount_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo prototype) {
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
     * Protobuf type {@code data.data_trans.RepairConnectionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:data.data_trans.RepairConnectionInfo)
        data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return data.data_trans.RepairConnectionInfoOuterClass.internal_static_data_data_trans_RepairConnectionInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return data.data_trans.RepairConnectionInfoOuterClass.internal_static_data_data_trans_RepairConnectionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo.class, data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo.Builder.class);
      }

      // Construct using data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo.newBuilder()
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

        taskId_ = 0;

        succ_ = false;

        reconnCount_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return data.data_trans.RepairConnectionInfoOuterClass.internal_static_data_data_trans_RepairConnectionInfo_descriptor;
      }

      public data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo getDefaultInstanceForType() {
        return data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo.getDefaultInstance();
      }

      public data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo build() {
        data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo buildPartial() {
        data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo result = new data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo(this);
        result.uid_ = uid_;
        result.taskId_ = taskId_;
        result.succ_ = succ_;
        result.reconnCount_ = reconnCount_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo) {
          return mergeFrom((data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo other) {
        if (other == data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getTaskId() != 0) {
          setTaskId(other.getTaskId());
        }
        if (other.getSucc() != false) {
          setSucc(other.getSucc());
        }
        if (other.getReconnCount() != 0) {
          setReconnCount(other.getReconnCount());
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
        data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo) e.getUnfinishedMessage();
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

      private int taskId_ ;
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public int getTaskId() {
        return taskId_;
      }
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public Builder setTaskId(int value) {
        
        taskId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public Builder clearTaskId() {
        
        taskId_ = 0;
        onChanged();
        return this;
      }

      private boolean succ_ ;
      /**
       * <code>optional bool succ = 3;</code>
       */
      public boolean getSucc() {
        return succ_;
      }
      /**
       * <code>optional bool succ = 3;</code>
       */
      public Builder setSucc(boolean value) {
        
        succ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool succ = 3;</code>
       */
      public Builder clearSucc() {
        
        succ_ = false;
        onChanged();
        return this;
      }

      private int reconnCount_ ;
      /**
       * <code>optional int32 reconnCount = 4;</code>
       */
      public int getReconnCount() {
        return reconnCount_;
      }
      /**
       * <code>optional int32 reconnCount = 4;</code>
       */
      public Builder setReconnCount(int value) {
        
        reconnCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 reconnCount = 4;</code>
       */
      public Builder clearReconnCount() {
        
        reconnCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:data.data_trans.RepairConnectionInfo)
    }

    // @@protoc_insertion_point(class_scope:data.data_trans.RepairConnectionInfo)
    private static final data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo();
    }

    public static data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RepairConnectionInfo>
        PARSER = new com.google.protobuf.AbstractParser<RepairConnectionInfo>() {
      public RepairConnectionInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new RepairConnectionInfo(input, extensionRegistry);
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

    public static com.google.protobuf.Parser<RepairConnectionInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RepairConnectionInfo> getParserForType() {
      return PARSER;
    }

    public data.data_trans.RepairConnectionInfoOuterClass.RepairConnectionInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_data_data_trans_RepairConnectionInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_data_data_trans_RepairConnectionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032repairConnectionInfo.proto\022\017data.data_" +
      "trans\"V\n\024RepairConnectionInfo\022\013\n\003uid\030\001 \001" +
      "(\005\022\016\n\006taskId\030\002 \001(\005\022\014\n\004succ\030\003 \001(\010\022\023\n\013reco" +
      "nnCount\030\004 \001(\005b\006proto3"
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
    internal_static_data_data_trans_RepairConnectionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_data_data_trans_RepairConnectionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_data_data_trans_RepairConnectionInfo_descriptor,
        new java.lang.String[] { "Uid", "TaskId", "Succ", "ReconnCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
