//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: remotemessage.proto

package remote;

@kotlin.jvm.JvmName("-initializeremoteKeyInject")
inline fun remoteKeyInject(block: remote.RemoteKeyInjectKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteKeyInject =
  remote.RemoteKeyInjectKt.Dsl._create(remote.Remotemessage.RemoteKeyInject.newBuilder()).apply { block() }._build()
object RemoteKeyInjectKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: remote.Remotemessage.RemoteKeyInject.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: remote.Remotemessage.RemoteKeyInject.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): remote.Remotemessage.RemoteKeyInject = _builder.build()

    /**
     * <code>.remote.RemoteKeyCode key_code = 1;</code>
     */
     var keyCode: remote.Remotemessage.RemoteKeyCode
      @JvmName("getKeyCode")
      get() = _builder.getKeyCode()
      @JvmName("setKeyCode")
      set(value) {
        _builder.setKeyCode(value)
      }
    /**
     * <code>.remote.RemoteKeyCode key_code = 1;</code>
     */
    fun clearKeyCode() {
      _builder.clearKeyCode()
    }

    /**
     * <code>.remote.RemoteDirection direction = 2;</code>
     */
     var direction: remote.Remotemessage.RemoteDirection
      @JvmName("getDirection")
      get() = _builder.getDirection()
      @JvmName("setDirection")
      set(value) {
        _builder.setDirection(value)
      }
    /**
     * <code>.remote.RemoteDirection direction = 2;</code>
     */
    fun clearDirection() {
      _builder.clearDirection()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun remote.Remotemessage.RemoteKeyInject.copy(block: remote.RemoteKeyInjectKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteKeyInject =
  remote.RemoteKeyInjectKt.Dsl._create(this.toBuilder()).apply { block() }._build()
