//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: remotemessage.proto

package remote;

@kotlin.jvm.JvmName("-initializeremoteVoiceBegin")
inline fun remoteVoiceBegin(block: remote.RemoteVoiceBeginKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteVoiceBegin =
  remote.RemoteVoiceBeginKt.Dsl._create(remote.Remotemessage.RemoteVoiceBegin.newBuilder()).apply { block() }._build()
object RemoteVoiceBeginKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: remote.Remotemessage.RemoteVoiceBegin.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: remote.Remotemessage.RemoteVoiceBegin.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): remote.Remotemessage.RemoteVoiceBegin = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun remote.Remotemessage.RemoteVoiceBegin.copy(block: remote.RemoteVoiceBeginKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteVoiceBegin =
  remote.RemoteVoiceBeginKt.Dsl._create(this.toBuilder()).apply { block() }._build()
