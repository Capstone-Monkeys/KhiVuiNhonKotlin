//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: remotemessage.proto

package remote;

@kotlin.jvm.JvmName("-initializeremoteVoiceEnd")
inline fun remoteVoiceEnd(block: remote.RemoteVoiceEndKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteVoiceEnd =
  remote.RemoteVoiceEndKt.Dsl._create(remote.Remotemessage.RemoteVoiceEnd.newBuilder()).apply { block() }._build()
object RemoteVoiceEndKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: remote.Remotemessage.RemoteVoiceEnd.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: remote.Remotemessage.RemoteVoiceEnd.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): remote.Remotemessage.RemoteVoiceEnd = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun remote.Remotemessage.RemoteVoiceEnd.copy(block: remote.RemoteVoiceEndKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteVoiceEnd =
  remote.RemoteVoiceEndKt.Dsl._create(this.toBuilder()).apply { block() }._build()

