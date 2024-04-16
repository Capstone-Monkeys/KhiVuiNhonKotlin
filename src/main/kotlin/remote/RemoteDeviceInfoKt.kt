//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: remotemessage.proto

package remote;

@kotlin.jvm.JvmName("-initializeremoteDeviceInfo")
inline fun remoteDeviceInfo(block: remote.RemoteDeviceInfoKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteDeviceInfo =
  remote.RemoteDeviceInfoKt.Dsl._create(remote.Remotemessage.RemoteDeviceInfo.newBuilder()).apply { block() }._build()
object RemoteDeviceInfoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: remote.Remotemessage.RemoteDeviceInfo.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: remote.Remotemessage.RemoteDeviceInfo.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): remote.Remotemessage.RemoteDeviceInfo = _builder.build()

    /**
     * <code>string model = 1;</code>
     */
    var model: kotlin.String
      @JvmName("getModel")
      get() = _builder.getModel()
      @JvmName("setModel")
      set(value) {
        _builder.setModel(value)
      }
    /**
     * <code>string model = 1;</code>
     */
    fun clearModel() {
      _builder.clearModel()
    }

    /**
     * <code>string vendor = 2;</code>
     */
    var vendor: kotlin.String
      @JvmName("getVendor")
      get() = _builder.getVendor()
      @JvmName("setVendor")
      set(value) {
        _builder.setVendor(value)
      }
    /**
     * <code>string vendor = 2;</code>
     */
    fun clearVendor() {
      _builder.clearVendor()
    }

    /**
     * <code>int32 unknown1 = 3;</code>
     */
    var unknown1: kotlin.Int
      @JvmName("getUnknown1")
      get() = _builder.getUnknown1()
      @JvmName("setUnknown1")
      set(value) {
        _builder.setUnknown1(value)
      }
    /**
     * <code>int32 unknown1 = 3;</code>
     */
    fun clearUnknown1() {
      _builder.clearUnknown1()
    }

    /**
     * <code>string unknown2 = 4;</code>
     */
    var unknown2: kotlin.String
      @JvmName("getUnknown2")
      get() = _builder.getUnknown2()
      @JvmName("setUnknown2")
      set(value) {
        _builder.setUnknown2(value)
      }
    /**
     * <code>string unknown2 = 4;</code>
     */
    fun clearUnknown2() {
      _builder.clearUnknown2()
    }

    /**
     * <code>string package_name = 5;</code>
     */
    var packageName: kotlin.String
      @JvmName("getPackageName")
      get() = _builder.getPackageName()
      @JvmName("setPackageName")
      set(value) {
        _builder.setPackageName(value)
      }
    /**
     * <code>string package_name = 5;</code>
     */
    fun clearPackageName() {
      _builder.clearPackageName()
    }

    /**
     * <code>string app_version = 6;</code>
     */
    var appVersion: kotlin.String
      @JvmName("getAppVersion")
      get() = _builder.getAppVersion()
      @JvmName("setAppVersion")
      set(value) {
        _builder.setAppVersion(value)
      }
    /**
     * <code>string app_version = 6;</code>
     */
    fun clearAppVersion() {
      _builder.clearAppVersion()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun remote.Remotemessage.RemoteDeviceInfo.copy(block: remote.RemoteDeviceInfoKt.Dsl.() -> kotlin.Unit): remote.Remotemessage.RemoteDeviceInfo =
  remote.RemoteDeviceInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

