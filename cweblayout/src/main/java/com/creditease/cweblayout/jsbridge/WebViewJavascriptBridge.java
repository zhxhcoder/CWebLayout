package com.creditease.cweblayout.jsbridge;

/**
 * Created by zhxh on 2019/07/01
 */
public interface WebViewJavascriptBridge {

    public void send(String data);

    public void send(String data, CallBackFunction responseCallback);

}
