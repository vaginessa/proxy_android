// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logout.proto

package hr.client.appuser;

@SuppressWarnings("unused")
public final class Logout {
  private Logout() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AppUserLogoutOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hr.client.appuser.AppUserLogout)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code hr.client.appuser.AppUserLogout}
   */
  public  static final class AppUserLogout extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:hr.client.appuser.AppUserLogout)
      AppUserLogoutOrBuilder {
    // Use AppUserLogout.newBuilder() to construct.
    private AppUserLogout(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private AppUserLogout() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private AppUserLogout(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
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
      return hr.client.appuser.Logout.internal_static_hr_client_appuser_AppUserLogout_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hr.client.appuser.Logout.internal_static_hr_client_appuser_AppUserLogout_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hr.client.appuser.Logout.AppUserLogout.class, hr.client.appuser.Logout.AppUserLogout.Builder.class);
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
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static hr.client.appuser.Logout.AppUserLogout parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static hr.client.appuser.Logout.AppUserLogout parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static hr.client.appuser.Logout.AppUserLogout parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static hr.client.appuser.Logout.AppUserLogout parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static hr.client.appuser.Logout.AppUserLogout parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static hr.client.appuser.Logout.AppUserLogout parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static hr.client.appuser.Logout.AppUserLogout parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static hr.client.appuser.Logout.AppUserLogout parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static hr.client.appuser.Logout.AppUserLogout parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static hr.client.appuser.Logout.AppUserLogout parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(hr.client.appuser.Logout.AppUserLogout prototype) {
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
     * Protobuf type {@code hr.client.appuser.AppUserLogout}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hr.client.appuser.AppUserLogout)
        hr.client.appuser.Logout.AppUserLogoutOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return hr.client.appuser.Logout.internal_static_hr_client_appuser_AppUserLogout_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return hr.client.appuser.Logout.internal_static_hr_client_appuser_AppUserLogout_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                hr.client.appuser.Logout.AppUserLogout.class, hr.client.appuser.Logout.AppUserLogout.Builder.class);
      }

      // Construct using hr.client.appuser.Logout.AppUserLogout.newBuilder()
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
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return hr.client.appuser.Logout.internal_static_hr_client_appuser_AppUserLogout_descriptor;
      }

      public hr.client.appuser.Logout.AppUserLogout getDefaultInstanceForType() {
        return hr.client.appuser.Logout.AppUserLogout.getDefaultInstance();
      }

      public hr.client.appuser.Logout.AppUserLogout build() {
        hr.client.appuser.Logout.AppUserLogout result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public hr.client.appuser.Logout.AppUserLogout buildPartial() {
        hr.client.appuser.Logout.AppUserLogout result = new hr.client.appuser.Logout.AppUserLogout(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof hr.client.appuser.Logout.AppUserLogout) {
          return mergeFrom((hr.client.appuser.Logout.AppUserLogout)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(hr.client.appuser.Logout.AppUserLogout other) {
        if (other == hr.client.appuser.Logout.AppUserLogout.getDefaultInstance()) return this;
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
        hr.client.appuser.Logout.AppUserLogout parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (hr.client.appuser.Logout.AppUserLogout) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:hr.client.appuser.AppUserLogout)
    }

    // @@protoc_insertion_point(class_scope:hr.client.appuser.AppUserLogout)
    private static final hr.client.appuser.Logout.AppUserLogout DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new hr.client.appuser.Logout.AppUserLogout();
    }

    public static hr.client.appuser.Logout.AppUserLogout getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AppUserLogout>
        PARSER = new com.google.protobuf.AbstractParser<AppUserLogout>() {
      public AppUserLogout parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new AppUserLogout(input, extensionRegistry);
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

    public static com.google.protobuf.Parser<AppUserLogout> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AppUserLogout> getParserForType() {
      return PARSER;
    }

    public hr.client.appuser.Logout.AppUserLogout getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface AppUserLogoutResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hr.client.appuser.AppUserLogoutResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 resultCode = 1;</code>
     */
    int getResultCode();

    /**
     * <code>optional string errorInfo = 2;</code>
     */
    java.lang.String getErrorInfo();
    /**
     * <code>optional string errorInfo = 2;</code>
     */
    com.google.protobuf.ByteString
        getErrorInfoBytes();
  }
  /**
   * Protobuf type {@code hr.client.appuser.AppUserLogoutResponse}
   */
  public  static final class AppUserLogoutResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:hr.client.appuser.AppUserLogoutResponse)
      AppUserLogoutResponseOrBuilder {
    // Use AppUserLogoutResponse.newBuilder() to construct.
    private AppUserLogoutResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private AppUserLogoutResponse() {
      resultCode_ = 0;
      errorInfo_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private AppUserLogoutResponse(
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

              resultCode_ = input.readInt32();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              errorInfo_ = s;
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
      return hr.client.appuser.Logout.internal_static_hr_client_appuser_AppUserLogoutResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hr.client.appuser.Logout.internal_static_hr_client_appuser_AppUserLogoutResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hr.client.appuser.Logout.AppUserLogoutResponse.class, hr.client.appuser.Logout.AppUserLogoutResponse.Builder.class);
    }

    public static final int RESULTCODE_FIELD_NUMBER = 1;
    private int resultCode_;
    /**
     * <code>optional int32 resultCode = 1;</code>
     */
    public int getResultCode() {
      return resultCode_;
    }

    public static final int ERRORINFO_FIELD_NUMBER = 2;
    private volatile java.lang.Object errorInfo_;
    /**
     * <code>optional string errorInfo = 2;</code>
     */
    public java.lang.String getErrorInfo() {
      java.lang.Object ref = errorInfo_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorInfo_ = s;
        return s;
      }
    }
    /**
     * <code>optional string errorInfo = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrorInfoBytes() {
      java.lang.Object ref = errorInfo_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorInfo_ = b;
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
      if (resultCode_ != 0) {
        output.writeInt32(1, resultCode_);
      }
      if (!getErrorInfoBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, errorInfo_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (resultCode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, resultCode_);
      }
      if (!getErrorInfoBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, errorInfo_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static hr.client.appuser.Logout.AppUserLogoutResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static hr.client.appuser.Logout.AppUserLogoutResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static hr.client.appuser.Logout.AppUserLogoutResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static hr.client.appuser.Logout.AppUserLogoutResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static hr.client.appuser.Logout.AppUserLogoutResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static hr.client.appuser.Logout.AppUserLogoutResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static hr.client.appuser.Logout.AppUserLogoutResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static hr.client.appuser.Logout.AppUserLogoutResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static hr.client.appuser.Logout.AppUserLogoutResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static hr.client.appuser.Logout.AppUserLogoutResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(hr.client.appuser.Logout.AppUserLogoutResponse prototype) {
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
     * Protobuf type {@code hr.client.appuser.AppUserLogoutResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hr.client.appuser.AppUserLogoutResponse)
        hr.client.appuser.Logout.AppUserLogoutResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return hr.client.appuser.Logout.internal_static_hr_client_appuser_AppUserLogoutResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return hr.client.appuser.Logout.internal_static_hr_client_appuser_AppUserLogoutResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                hr.client.appuser.Logout.AppUserLogoutResponse.class, hr.client.appuser.Logout.AppUserLogoutResponse.Builder.class);
      }

      // Construct using hr.client.appuser.Logout.AppUserLogoutResponse.newBuilder()
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
        resultCode_ = 0;

        errorInfo_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return hr.client.appuser.Logout.internal_static_hr_client_appuser_AppUserLogoutResponse_descriptor;
      }

      public hr.client.appuser.Logout.AppUserLogoutResponse getDefaultInstanceForType() {
        return hr.client.appuser.Logout.AppUserLogoutResponse.getDefaultInstance();
      }

      public hr.client.appuser.Logout.AppUserLogoutResponse build() {
        hr.client.appuser.Logout.AppUserLogoutResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public hr.client.appuser.Logout.AppUserLogoutResponse buildPartial() {
        hr.client.appuser.Logout.AppUserLogoutResponse result = new hr.client.appuser.Logout.AppUserLogoutResponse(this);
        result.resultCode_ = resultCode_;
        result.errorInfo_ = errorInfo_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof hr.client.appuser.Logout.AppUserLogoutResponse) {
          return mergeFrom((hr.client.appuser.Logout.AppUserLogoutResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(hr.client.appuser.Logout.AppUserLogoutResponse other) {
        if (other == hr.client.appuser.Logout.AppUserLogoutResponse.getDefaultInstance()) return this;
        if (other.getResultCode() != 0) {
          setResultCode(other.getResultCode());
        }
        if (!other.getErrorInfo().isEmpty()) {
          errorInfo_ = other.errorInfo_;
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
        hr.client.appuser.Logout.AppUserLogoutResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (hr.client.appuser.Logout.AppUserLogoutResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int resultCode_ ;
      /**
       * <code>optional int32 resultCode = 1;</code>
       */
      public int getResultCode() {
        return resultCode_;
      }
      /**
       * <code>optional int32 resultCode = 1;</code>
       */
      public Builder setResultCode(int value) {
        
        resultCode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 resultCode = 1;</code>
       */
      public Builder clearResultCode() {
        
        resultCode_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object errorInfo_ = "";
      /**
       * <code>optional string errorInfo = 2;</code>
       */
      public java.lang.String getErrorInfo() {
        java.lang.Object ref = errorInfo_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          errorInfo_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string errorInfo = 2;</code>
       */
      public com.google.protobuf.ByteString
          getErrorInfoBytes() {
        java.lang.Object ref = errorInfo_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errorInfo_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string errorInfo = 2;</code>
       */
      public Builder setErrorInfo(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        errorInfo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string errorInfo = 2;</code>
       */
      public Builder clearErrorInfo() {
        
        errorInfo_ = getDefaultInstance().getErrorInfo();
        onChanged();
        return this;
      }
      /**
       * <code>optional string errorInfo = 2;</code>
       */
      public Builder setErrorInfoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        errorInfo_ = value;
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


      // @@protoc_insertion_point(builder_scope:hr.client.appuser.AppUserLogoutResponse)
    }

    // @@protoc_insertion_point(class_scope:hr.client.appuser.AppUserLogoutResponse)
    private static final hr.client.appuser.Logout.AppUserLogoutResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new hr.client.appuser.Logout.AppUserLogoutResponse();
    }

    public static hr.client.appuser.Logout.AppUserLogoutResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AppUserLogoutResponse>
        PARSER = new com.google.protobuf.AbstractParser<AppUserLogoutResponse>() {
      public AppUserLogoutResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new AppUserLogoutResponse(input, extensionRegistry);
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

    public static com.google.protobuf.Parser<AppUserLogoutResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AppUserLogoutResponse> getParserForType() {
      return PARSER;
    }

    public hr.client.appuser.Logout.AppUserLogoutResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hr_client_appuser_AppUserLogout_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hr_client_appuser_AppUserLogout_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hr_client_appuser_AppUserLogoutResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hr_client_appuser_AppUserLogoutResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014logout.proto\022\021hr.client.appuser\"\017\n\rApp" +
      "UserLogout\">\n\025AppUserLogoutResponse\022\022\n\nr" +
      "esultCode\030\001 \001(\005\022\021\n\terrorInfo\030\002 \001(\tb\006prot" +
      "o3"
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
    internal_static_hr_client_appuser_AppUserLogout_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hr_client_appuser_AppUserLogout_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_hr_client_appuser_AppUserLogout_descriptor,
        new java.lang.String[] { });
    internal_static_hr_client_appuser_AppUserLogoutResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hr_client_appuser_AppUserLogoutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_hr_client_appuser_AppUserLogoutResponse_descriptor,
        new java.lang.String[] { "ResultCode", "ErrorInfo", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
