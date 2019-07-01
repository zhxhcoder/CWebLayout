package com.creditease.cweblayout;

import android.graphics.Bitmap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/**
 * Created by zhxh on 2019/07/01
 */
interface WebViewLoadListener {
    public void onWebViewPageStarted(WebView view, String url, Bitmap favicon); // webview加载开始

    public void onWebViewPageFinished(WebView view, String url); // webview加载结束

    public void onWebViewLoadError(WebView view, int errorCode, String description, String failingUrl); // webview加载出现错误

    public boolean webViewShouldOverrideUrlLoading(WebView view, String url); // 加载每一个url回调

    public WebResourceResponse webViewShouldInterceptRequest(WebView view, String url); // 是否打断传资源

}
