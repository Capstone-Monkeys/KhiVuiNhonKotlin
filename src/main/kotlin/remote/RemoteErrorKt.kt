//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: remotemessage.proto

package remote;

@kotlin.jvm.JvmName("-initializeremoteError")
inline fun remoteError(block: remote.RemoteErrorKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteError =
  remote.RemoteErrorKt.Dsl._create(remote.Remotemessage.RemoteError.newBuilder()).apply { block() }._build()
object RemoteErrorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: remote.Remotemessage.RemoteError.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: remote.Remotemessage.RemoteError.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): remote.Remotemessage.RemoteError = _builder.build()

    /**
     * <code>bool value = 1;</code>
     */
    var value: kotlin.Boolean
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>bool value = 1;</code>
     */
    fun clearValue() {
      _builder.clearValue()
    }

    /**
     * <code>.remote.RemoteMessage message = 2;</code>
     */
    var message: remote.Remotemessage.RemoteMessage
      @JvmName("getMessage")
      get() = _builder.getMessage()
      @JvmName("setMessage")
      set(value) {
        _builder.setMessage(value)
      }
    /**
     * <code>.remote.RemoteMessage message = 2;</code>
     */
    fun clearMessage() {
      _builder.clearMessage()
    }
    /**
     * <code>.remote.RemoteMessage message = 2;</code>
     * @return Whether the message field is set.
     */
    fun hasMessage(): kotlin.Boolean {
      return _builder.hasMessage()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun remote.Remotemessage.RemoteError.copy(block: remote.RemoteErrorKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteError =
  remote.RemoteErrorKt.Dsl._create(this.toBuilder()).apply { block() }._build()

val remote.Remotemessage.RemoteErrorOrBuilder.messageOrNull: remote.Remotemessage.RemoteMessage?
  get() = if (hasMessage()) getMessage() else null

