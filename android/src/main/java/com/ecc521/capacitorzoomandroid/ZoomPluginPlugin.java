package com.ecc521.capacitorzoomandroid;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "ZoomPlugin")
public class ZoomPluginPlugin extends Plugin {

    private ZoomPlugin implementation = new ZoomPlugin();

    @PluginMethod
    public void enableZoom(PluginCall call) {
        this.bridge.getWebView().getSettings().setBuiltInZoomControls(true);
        this.bridge.getWebView().getSettings().setDisplayZoomControls(false);
        call.resolve();
    }

    @PluginMethod
    public void disableZoom(PluginCall call) {
        this.bridge.getWebView().getSettings().setBuiltInZoomControls(false);
        call.resolve();
    }
}