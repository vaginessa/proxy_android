// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: id.proto

package grpc.client;

@SuppressWarnings("unused")
public final class Id {
  private Id() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SubaoIdOrBuilder extends
      // @@protoc_insertion_point(interface_extends:grpc.client.SubaoId)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
     * </pre>
     */
    java.lang.String getId();
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
     * </pre>
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <code>optional string userId = 2;</code>
     *
     * <pre>
     *uuid format
     * </pre>
     */
    java.lang.String getUserId();
    /**
     * <code>optional string userId = 2;</code>
     *
     * <pre>
     *uuid format
     * </pre>
     */
    com.google.protobuf.ByteString
        getUserIdBytes();
  }
  /**
   * Protobuf type {@code grpc.client.SubaoId}
   */
  public  static final class SubaoId extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:grpc.client.SubaoId)
      SubaoIdOrBuilder {
    // Use SubaoId.newBuilder() to construct.
    private SubaoId(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private SubaoId() {
      id_ = "";
      userId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SubaoId(
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
            case 10: {
              String s = input.readStringRequireUtf8();

              id_ = s;
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              userId_ = s;
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
      return grpc.client.Id.internal_static_grpc_client_SubaoId_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.client.Id.internal_static_grpc_client_SubaoId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.client.Id.SubaoId.class, grpc.client.Id.SubaoId.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object id_;
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
     * </pre>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      }
    }
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
     * </pre>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USERID_FIELD_NUMBER = 2;
    private volatile java.lang.Object userId_;
    /**
     * <code>optional string userId = 2;</code>
     *
     * <pre>
     *uuid format
     * </pre>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      }
    }
    /**
     * <code>optional string userId = 2;</code>
     *
     * <pre>
     *uuid format
     * </pre>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
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
      if (!getIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, id_);
      }
      if (!getUserIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, userId_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, id_);
      }
      if (!getUserIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, userId_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static grpc.client.Id.SubaoId parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static grpc.client.Id.SubaoId parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static grpc.client.Id.SubaoId parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static grpc.client.Id.SubaoId parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static grpc.client.Id.SubaoId parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static grpc.client.Id.SubaoId parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static grpc.client.Id.SubaoId parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static grpc.client.Id.SubaoId parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static grpc.client.Id.SubaoId parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static grpc.client.Id.SubaoId parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(grpc.client.Id.SubaoId prototype) {
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
     * Protobuf type {@code grpc.client.SubaoId}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:grpc.client.SubaoId)
        grpc.client.Id.SubaoIdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return grpc.client.Id.internal_static_grpc_client_SubaoId_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return grpc.client.Id.internal_static_grpc_client_SubaoId_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                grpc.client.Id.SubaoId.class, grpc.client.Id.SubaoId.Builder.class);
      }

      // Construct using grpc.client.Id.SubaoId.newBuilder()
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
        id_ = "";

        userId_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return grpc.client.Id.internal_static_grpc_client_SubaoId_descriptor;
      }

      public grpc.client.Id.SubaoId getDefaultInstanceForType() {
        return grpc.client.Id.SubaoId.getDefaultInstance();
      }

      public grpc.client.Id.SubaoId build() {
        grpc.client.Id.SubaoId result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public grpc.client.Id.SubaoId buildPartial() {
        grpc.client.Id.SubaoId result = new grpc.client.Id.SubaoId(this);
        result.id_ = id_;
        result.userId_ = userId_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof grpc.client.Id.SubaoId) {
          return mergeFrom((grpc.client.Id.SubaoId)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(grpc.client.Id.SubaoId other) {
        if (other == grpc.client.Id.SubaoId.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
          onChanged();
        }
        if (!other.getUserId().isEmpty()) {
          userId_ = other.userId_;
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
        grpc.client.Id.SubaoId parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (grpc.client.Id.SubaoId) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object id_ = "";
      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
       * </pre>
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
       * </pre>
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
       * </pre>
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
       * </pre>
       */
      public Builder clearId() {
        
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
       * </pre>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        id_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object userId_ = "";
      /**
       * <code>optional string userId = 2;</code>
       *
       * <pre>
       *uuid format
       * </pre>
       */
      public java.lang.String getUserId() {
        java.lang.Object ref = userId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          userId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string userId = 2;</code>
       *
       * <pre>
       *uuid format
       * </pre>
       */
      public com.google.protobuf.ByteString
          getUserIdBytes() {
        java.lang.Object ref = userId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string userId = 2;</code>
       *
       * <pre>
       *uuid format
       * </pre>
       */
      public Builder setUserId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string userId = 2;</code>
       *
       * <pre>
       *uuid format
       * </pre>
       */
      public Builder clearUserId() {
        
        userId_ = getDefaultInstance().getUserId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string userId = 2;</code>
       *
       * <pre>
       *uuid format
       * </pre>
       */
      public Builder setUserIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        userId_ = value;
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


      // @@protoc_insertion_point(builder_scope:grpc.client.SubaoId)
    }

    // @@protoc_insertion_point(class_scope:grpc.client.SubaoId)
    private static final grpc.client.Id.SubaoId DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new grpc.client.Id.SubaoId();
    }

    public static grpc.client.Id.SubaoId getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SubaoId>
        PARSER = new com.google.protobuf.AbstractParser<SubaoId>() {
      public SubaoId parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new SubaoId(input, extensionRegistry);
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

    public static com.google.protobuf.Parser<SubaoId> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SubaoId> getParserForType() {
      return PARSER;
    }

    public grpc.client.Id.SubaoId getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface SessionIdOrBuilder extends
      // @@protoc_insertion_point(interface_extends:grpc.client.SessionId)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
     * </pre>
     */
    java.lang.String getId();
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
     * </pre>
     */
    com.google.protobuf.ByteString
        getIdBytes();
  }
  /**
   * Protobuf type {@code grpc.client.SessionId}
   */
  public  static final class SessionId extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:grpc.client.SessionId)
      SessionIdOrBuilder {
    // Use SessionId.newBuilder() to construct.
    private SessionId(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private SessionId() {
      id_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private SessionId(
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
            case 10: {
              String s = input.readStringRequireUtf8();

              id_ = s;
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
      return grpc.client.Id.internal_static_grpc_client_SessionId_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.client.Id.internal_static_grpc_client_SessionId_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.client.Id.SessionId.class, grpc.client.Id.SessionId.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object id_;
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
     * </pre>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      }
    }
    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
     * </pre>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
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
      if (!getIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, id_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, id_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static grpc.client.Id.SessionId parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static grpc.client.Id.SessionId parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static grpc.client.Id.SessionId parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static grpc.client.Id.SessionId parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static grpc.client.Id.SessionId parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static grpc.client.Id.SessionId parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static grpc.client.Id.SessionId parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static grpc.client.Id.SessionId parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static grpc.client.Id.SessionId parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static grpc.client.Id.SessionId parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(grpc.client.Id.SessionId prototype) {
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
     * Protobuf type {@code grpc.client.SessionId}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:grpc.client.SessionId)
        grpc.client.Id.SessionIdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return grpc.client.Id.internal_static_grpc_client_SessionId_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return grpc.client.Id.internal_static_grpc_client_SessionId_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                grpc.client.Id.SessionId.class, grpc.client.Id.SessionId.Builder.class);
      }

      // Construct using grpc.client.Id.SessionId.newBuilder()
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
        id_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return grpc.client.Id.internal_static_grpc_client_SessionId_descriptor;
      }

      public grpc.client.Id.SessionId getDefaultInstanceForType() {
        return grpc.client.Id.SessionId.getDefaultInstance();
      }

      public grpc.client.Id.SessionId build() {
        grpc.client.Id.SessionId result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public grpc.client.Id.SessionId buildPartial() {
        grpc.client.Id.SessionId result = new grpc.client.Id.SessionId(this);
        result.id_ = id_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof grpc.client.Id.SessionId) {
          return mergeFrom((grpc.client.Id.SessionId)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(grpc.client.Id.SessionId other) {
        if (other == grpc.client.Id.SessionId.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
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
        grpc.client.Id.SessionId parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (grpc.client.Id.SessionId) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object id_ = "";
      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
       * </pre>
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
       * </pre>
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
       * </pre>
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
       * </pre>
       */
      public Builder clearId() {
        
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       *uuid format:6ba7b810-9dad-11d1-80b4-00c04fd430c8
       * </pre>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        id_ = value;
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


      // @@protoc_insertion_point(builder_scope:grpc.client.SessionId)
    }

    // @@protoc_insertion_point(class_scope:grpc.client.SessionId)
    private static final grpc.client.Id.SessionId DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new grpc.client.Id.SessionId();
    }

    public static grpc.client.Id.SessionId getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SessionId>
        PARSER = new com.google.protobuf.AbstractParser<SessionId>() {
      public SessionId parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new SessionId(input, extensionRegistry);
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

    public static com.google.protobuf.Parser<SessionId> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SessionId> getParserForType() {
      return PARSER;
    }

    public grpc.client.Id.SessionId getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_client_SubaoId_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_client_SubaoId_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_client_SessionId_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_grpc_client_SessionId_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\010id.proto\022\013grpc.client\"%\n\007SubaoId\022\n\n\002id" +
      "\030\001 \001(\t\022\016\n\006userId\030\002 \001(\t\"\027\n\tSessionId\022\n\n\002i" +
      "d\030\001 \001(\tb\006proto3"
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
    internal_static_grpc_client_SubaoId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_client_SubaoId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_client_SubaoId_descriptor,
        new java.lang.String[] { "Id", "UserId", });
    internal_static_grpc_client_SessionId_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_client_SessionId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_grpc_client_SessionId_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}