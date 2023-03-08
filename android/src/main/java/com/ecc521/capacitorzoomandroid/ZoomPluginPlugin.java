package com.ecc521.capacitorzoomandroid;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import android.webkit.WebView;

@CapacitorPlugin(name = "ZoomPlugin")
public class ZoomPluginPlugin extends Plugin {

    private ZoomPlugin implementation = new ZoomPlugin();

    @PluginMethod
    public void enableZoom(PluginCall call) {
        WebView view = this.bridge.getWebView();

        view.post(new Runnable() {
            @Override
            public void run() {
                view.getSettings().setBuiltInZoomControls(true);
                view.getSettings().setDisplayZoomControls(false);
            }
        });

        call.resolve();
    }

    @PluginMethod
    public void disableZoom(PluginCall call) {
        WebView view = this.bridge.getWebView();

        view.post(new Runnable() {
            @Override
            public void run() {
                view.getSettings().setBuiltInZoomControls(false);
            }
        });
        call.resolve();
    }
}