//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: remotemessage.proto

package remote;

@kotlin.jvm.JvmName("-initializeremoteSetPreferredAudioDevice")
inline fun remoteSetPreferredAudioDevice(block: remote.RemoteSetPreferredAudioDeviceKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteSetPreferredAudioDevice =
  remote.RemoteSetPreferredAudioDeviceKt.Dsl._create(remote.Remotemessage.RemoteSetPreferredAudioDevice.newBuilder()).apply { block() }._build()
object RemoteSetPreferredAudioDeviceKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: remote.Remotemessage.RemoteSetPreferredAudioDevice.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: remote.Remotemessage.RemoteSetPreferredAudioDevice.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): remote.Remotemessage.RemoteSetPreferredAudioDevice = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun remote.Remotemessage.RemoteSetPreferredAudioDevice.copy(block: remote.RemoteSetPreferredAudioDeviceKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteSetPreferredAudioDevice =
  remote.RemoteSetPreferredAudioDeviceKt.Dsl._create(this.toBuilder()).apply { block() }._build()
