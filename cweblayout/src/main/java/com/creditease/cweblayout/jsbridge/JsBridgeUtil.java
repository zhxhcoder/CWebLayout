package com.creditease.cweblayout.jsbridge;

import android.content.Context;
import android.webkit.WebView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by zhxh on 2019/07/08
 */
public class JsBridgeUtil {

    /**
     * 方法描述：从一个jsUrl中获得方法名
     */
    public static String parseFunctionName(String jsUrl) {
        return jsUrl.replace("javascript:WebViewJavascriptBridge.", "").replaceAll("\\(.*\\);", "");
    }

    /**
     * 方法描述：从url中获得返回的数据
     */
    public static String getDataFromReturnUrl(String url) {
        // 如果是调用App的接口，直接获得返回数据
        if (url.startsWith(WebViewConstant.CREDITWEALTH_FETCH_QUEUE)) {
            return url.replace(WebViewConstant.CREDITWEALTH_FETCH_QUEUE, WebViewConstant.EMPTY_STR);
        }
        // 如果是App调用h5之后的返回
        String temp = url.replace(WebViewConstant.CREDITWEALTH_RETURN_DATA, WebViewConstant.EMPTY_STR);
        String[] functionAndData = temp.split(WebViewConstant.SPLIT_MARK);
        if (functionAndData.length >= 2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < functionAndData.length; i++) {
                sb.append(functionAndData[i]);
            }
            return sb.toString();
        }
        return null;
    }

    /**
     * 方法描述：从url中获取回调的方法名
     *
     * @author renmeng
     * @time 2018/6/6
     */
    public static String getFunctionFromReturnUrl(String url) {
        String temp = url.replace(WebViewConstant.CREDITWEALTH_RETURN_DATA, WebViewConstant.EMPTY_STR);
        String[] functionAndData = temp.split(WebViewConstant.SPLIT_MARK);
        if (functionAndData.length >= 1) {
            return functionAndData[0];
        }
        return null;
    }

    /**
     * 方法描述：加载本地assets中的js
     */
    public static void webviewLoadLocalJs(WebView webview, String path) {
        String jsContent = assetFile2Str(webview.getContext(), path);
        webview.loadUrl("javascript:" + jsContent);
    }

    /**
     * 方法描述：从assets文件夹中加载内容
     */
    public static String assetFile2Str(Context c, String urlStr) {
        InputStream in = null;
        try {
            in = c.getAssets().open(urlStr);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            String line = null;
            StringBuilder sb = new StringBuilder();
            do {
                line = bufferedReader.readLine();
                if (line != null && !line.matches("^\\s*\\/\\/.*")) {
                    sb.append(line);
                }
            } while (line != null);
            bufferedReader.close();
            in.close();
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
        }
        return null;
    }

}