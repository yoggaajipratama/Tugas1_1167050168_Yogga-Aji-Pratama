package com.future.sunrise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Contacts extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("https://www.google.com");
    }
}
