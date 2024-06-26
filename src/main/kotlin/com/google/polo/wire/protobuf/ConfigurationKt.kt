//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: polo.proto

package com.google.polo.wire.protobuf;

@kotlin.jvm.JvmName("-initializeconfiguration")
inline fun configuration(block: com.google.polo.wire.protobuf.ConfigurationKt.Dsl.() -> kotlin.Unit): com.google.polo.wire.protobuf.PoloProto.Configuration =
  com.google.polo.wire.protobuf.ConfigurationKt.Dsl._create(com.google.polo.wire.protobuf.PoloProto.Configuration.newBuilder()).apply { block() }._build()
object ConfigurationKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: com.google.polo.wire.protobuf.PoloProto.Configuration.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.google.polo.wire.protobuf.PoloProto.Configuration.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.google.polo.wire.protobuf.PoloProto.Configuration = _builder.build()

    /**
     * <pre>
     * The encoding to be used in this session.
     * </pre>
     *
     * <code>required .polo.wire.protobuf.Options.Encoding encoding = 1;</code>
     */
    var encoding: com.google.polo.wire.protobuf.PoloProto.Options.Encoding
      @JvmName("getEncoding")
      get() = _builder.getEncoding()
      @JvmName("setEncoding")
      set(value) {
        _builder.setEncoding(value)
      }
    /**
     * <pre>
     * The encoding to be used in this session.
     * </pre>
     *
     * <code>required .polo.wire.protobuf.Options.Encoding encoding = 1;</code>
     */
    fun clearEncoding() {
      _builder.clearEncoding()
    }
    /**
     * <pre>
     * The encoding to be used in this session.
     * </pre>
     *
     * <code>required .polo.wire.protobuf.Options.Encoding encoding = 1;</code>
     * @return Whether the encoding field is set.
     */
    fun hasEncoding(): kotlin.Boolean {
      return _builder.hasEncoding()
    }

    /**
     * <pre>
     * The role of the client (ie, the one initiating pairing). This implies the
     * peer (server) acts as the complementary role.
     * </pre>
     *
     * <code>required .polo.wire.protobuf.Options.RoleType client_role = 2;</code>
     */
     var clientRole: com.google.polo.wire.protobuf.PoloProto.Options.RoleType
      @JvmName("getClientRole")
      get() = _builder.getClientRole()
      @JvmName("setClientRole")
      set(value) {
        _builder.setClientRole(value)
      }
    /**
     * <pre>
     * The role of the client (ie, the one initiating pairing). This implies the
     * peer (server) acts as the complementary role.
     * </pre>
     *
     * <code>required .polo.wire.protobuf.Options.RoleType client_role = 2;</code>
     */
    fun clearClientRole() {
      _builder.clearClientRole()
    }
    /**
     * <pre>
     * The role of the client (ie, the one initiating pairing). This implies the
     * peer (server) acts as the complementary role.
     * </pre>
     *
     * <code>required .polo.wire.protobuf.Options.RoleType client_role = 2;</code>
     * @return Whether the clientRole field is set.
     */
    fun hasClientRole(): kotlin.Boolean {
      return _builder.hasClientRole()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun com.google.polo.wire.protobuf.PoloProto.Configuration.copy(block: com.google.polo.wire.protobuf.ConfigurationKt.Dsl.() -> kotlin.Unit): com.google.polo.wire.protobuf.PoloProto.Configuration =
  com.google.polo.wire.protobuf.ConfigurationKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val com.google.polo.wire.protobuf.PoloProto.ConfigurationOrBuilder.encodingOrNull: com.google.polo.wire.protobuf.PoloProto.Options.Encoding?
  get() = if (hasEncoding()) getEncoding() else null

