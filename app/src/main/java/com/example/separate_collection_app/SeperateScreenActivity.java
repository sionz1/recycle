package com.example.separate_collection_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

@SuppressWarnings("deprecation")
public class SeperateScreenActivity extends AppCompatActivity {
    Button search_screenBtn;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seperate_screen);

        //검색 화면 이동
        search_screenBtn = (Button) findViewById(R.id.search_screen_btn);

        search_screenBtn.setOnClickListener((v) -> {
            Intent intent_seperate = new Intent(getApplicationContext(), SearchScreenActivity.class);
            startActivity(intent_seperate);
        });

        web = (WebView) findViewById(R.id.webView1);

        web.setWebViewClient(new CookWedviewClient());

        WebSettings webSet = web.getSettings();
        webSet.setBuiltInZoomControls(true);
        webSet.setJavaScriptEnabled(true);

        web.loadUrl("https://www.sasang.go.kr/index.sasang?menuCd=DOM_000000110001001000&cpath=");

    }

    class CookWedviewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
