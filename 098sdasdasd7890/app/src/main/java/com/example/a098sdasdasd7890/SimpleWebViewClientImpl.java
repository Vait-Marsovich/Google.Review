package com.example.a098sdasdasd7890;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SimpleWebViewClientImpl extends WebViewClient {

    private Activity activity = null;

    public SimpleWebViewClientImpl(Activity activity) {
        this.activity = activity;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        // все ссылки, в которых содержится 'javadevblog.com'
        // будут открываться внутри приложения
//        if (url.contains("habr.com/ru/")) {
            return false;
//        }
//        // все остальные ссылки будут спрашивать какой браузер открывать
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//        activity.startActivity(intent);
//        return true;
    }
}