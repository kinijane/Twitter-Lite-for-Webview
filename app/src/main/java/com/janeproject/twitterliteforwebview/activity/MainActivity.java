package com.janeproject.twitterliteforwebview.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.janeproject.twitterliteforwebview.R;

public class MainActivity extends Activity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initWebview();
        setContentView(webView);

    }

    @Override
    protected void onStart() {
        super.onStart();
        webView.loadUrl(getString(R.string.twitter_url));
    }

    /**
     * Webviewの初期化
     * @return 初期化済みwebview
     */
    @SuppressLint("SetJavaScriptEnabled")
    private void initWebview(){
        webView = new WebView(this);
        WebSettings settings = webView.getSettings();
        settings.setUserAgentString(getString(R.string.user_agent));
        settings.setJavaScriptEnabled(true);

    }




}
