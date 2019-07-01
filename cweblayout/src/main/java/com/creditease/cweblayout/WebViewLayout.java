package com.creditease.cweblayout;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.RelativeLayout;

import com.creditease.cweblayout.jsbridge.CallBackFunction;

/**
 * Created by zhxh on 2019/07/01
 */

public class WebViewLayout extends RelativeLayout implements WebViewLoadListener, JsUpdateWebViewListener {

    public WebViewLayout(Context context) {
        super(context);
    }

    public WebViewLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WebViewLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public void setTitle(String string) {

    }

    @Override
    public void reloadWebView() {

    }

    @Override
    public void showShareButton(String data, CallBackFunction function) {

    }

    @Override
    public void closeWebView() {

    }

    @Override
    public void onWebViewPageStarted(WebView view, String url, Bitmap favicon) {

    }

    @Override
    public void onWebViewPageFinished(WebView view, String url) {

    }

    @Override
    public void onWebViewLoadError(WebView view, int errorCode, String description, String failingUrl) {

    }

    @Override
    public boolean webViewShouldOverrideUrlLoading(WebView view, String url) {
        return false;
    }

    @Override
    public WebResourceResponse webViewShouldInterceptRequest(WebView view, String url) {
        return null;
    }
}
