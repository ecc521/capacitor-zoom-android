import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(ZoomPluginPlugin)
public class ZoomPluginPlugin: CAPPlugin {
    private let implementation = ZoomPlugin()

    @objc func enableZoom(_ call: CAPPluginCall) {
        call.resolve([:])
    }

    @objc func disableZoom(_ call: CAPPluginCall) {
        call.resolve([:])
    }
}
