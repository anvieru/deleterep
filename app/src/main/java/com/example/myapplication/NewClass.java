package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class NewClass extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newl);

        WebView webView =findViewById(R.id.webview);
        //VideoView videoView = findViewById(R.id.videoView);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("https://media.discordapp.net/attachments/701701502313431061/" +
                "888004824837275689/unamused-cat.gif");

        // данный участок кода запрещает андройд искать другое
        // приложение для запуска видео через сторонние приложения

//        WebViewClient webViewClient = new WebViewClient() {
//
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                view.loadUrl(url);
//                return super.shouldOverrideUrlLoading(view, url);
//            }
//
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
//                view.loadUrl(request.getUrl().toString());
//                return super.shouldOverrideUrlLoading(view, request);
//            }
//        };
//        webView.setWebViewClient(webViewClient);


       // String videoZveri = "and"+R.raw.zveri_do_skoroy_vstrechi;


    }

    public void btn_new(View view) {
        Intent intent = new Intent(NewClass.this, LogoActivity.class);
        startActivity(intent);
    }
}
