package com.creditease.cweblayout;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

import com.creditease.cweblayout.jsbridge.CallBackFunction;
import com.creditease.cweblayout.jsbridge.WebViewJavascriptBridge;

/**
 * Created by zhxh on 2019/07/01
 */
public class JsBridgeWebView extends WebView implements WebViewJavascriptBridge {

    public JsBridgeWebView(Context context) {
        super(context);
    }

    public JsBridgeWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public JsBridgeWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public void send(String data) {

    }

    @Override
    public void send(String data, CallBackFunction responseCallback) {

    }
}
