package com.creditease.cweblayout;

import com.creditease.cweblayout.jsbridge.CallBackFunction;

/**
 * Created by zhxh on 2019/07/01
 */
interface JsUpdateWebViewListener {
    void setTitle(String string); // 修改标题

    void reloadWebView(); // 刷新页面

    void showShareButton(String data, CallBackFunction function); // 最新设置是否可以分享

    void closeWebView(); // 关闭webview所在页面
}
