//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: remotemessage.proto

package remote;

@kotlin.jvm.JvmName("-initializeremoteSetActive")
inline fun remoteSetActive(block: remote.RemoteSetActiveKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteSetActive =
  remote.RemoteSetActiveKt.Dsl._create(remote.Remotemessage.RemoteSetActive.newBuilder()).apply { block() }._build()
object RemoteSetActiveKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: remote.Remotemessage.RemoteSetActive.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: remote.Remotemessage.RemoteSetActive.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): remote.Remotemessage.RemoteSetActive = _builder.build()

    /**
     * <code>int32 active = 1;</code>
     */
    var active: kotlin.Int
      @JvmName("getActive")
      get() = _builder.getActive()
      @JvmName("setActive")
      set(value) {
        _builder.setActive(value)
      }
    /**
     * <code>int32 active = 1;</code>
     */
    fun clearActive() {
      _builder.clearActive()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun remote.Remotemessage.RemoteSetActive.copy(block: remote.RemoteSetActiveKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteSetActive =
  remote.RemoteSetActiveKt.Dsl._create(this.toBuilder()).apply { block() }._build()

