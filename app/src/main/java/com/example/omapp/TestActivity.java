package com.example.omapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        WebView testWebView = (WebView) findViewById(R.id.webView2);
        testWebView.loadUrl("https://electronics.rkinformative.online/");
        testWebView.getSettings().setJavaScriptEnabled(true);
        testWebView.setWebViewClient(new WebViewClient());
        testWebView.getSettings().setBuiltInZoomControls(true);

        //   WebSettings webSettings = myWebView.getSettings();
        //   webSettings.setJavaScriptEnabled(true);
        testWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        //some extra dodes

        // webSettings.setAllowContentAccess(true);
        //  webSettings.setDomStorageEnabled(true);
    }
}