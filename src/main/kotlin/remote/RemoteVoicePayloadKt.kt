//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: remotemessage.proto

package remote;

@kotlin.jvm.JvmName("-initializeremoteVoicePayload")
inline fun remoteVoicePayload(block: remote.RemoteVoicePayloadKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteVoicePayload =
  remote.RemoteVoicePayloadKt.Dsl._create(remote.Remotemessage.RemoteVoicePayload.newBuilder()).apply { block() }._build()
object RemoteVoicePayloadKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: remote.Remotemessage.RemoteVoicePayload.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: remote.Remotemessage.RemoteVoicePayload.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): remote.Remotemessage.RemoteVoicePayload = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun remote.Remotemessage.RemoteVoicePayload.copy(block: remote.RemoteVoicePayloadKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteVoicePayload =
  remote.RemoteVoicePayloadKt.Dsl._create(this.toBuilder()).apply { block() }._build()
