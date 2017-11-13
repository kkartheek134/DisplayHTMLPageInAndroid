package com.example.kartheek.htmlproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.web);

        webView.loadUrl("file:///android_asset/mysample.html");
        WebViewClient webViewClient = new WebViewClient();
        webView.setWebViewClient(webViewClient);
        webView.addJavascriptInterface(this, "interface");
        WebSettings webSettings = webView.getSettings();
        // webSettings.getDefaultFontSize();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);

    }
    @JavascriptInterface
                public void displayMsg(String name,String pass){
        Toast.makeText(this, ""+name+" "+pass, Toast.LENGTH_SHORT).show();
        }
    }

