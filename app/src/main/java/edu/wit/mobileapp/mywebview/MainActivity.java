package edu.wit.mobileapp.mywebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = (WebView) findViewById(R.id.webView1);


        webView.setWebViewClient(new WebViewClient());

        // Enable JavaScript
        webView.getSettings().setJavaScriptEnabled(true);

        // Zoom out the page to fit the display
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        // Provide pinch zoom operation
        webView.getSettings().setBuiltInZoomControls(true);


        webView.loadUrl("https://www.youtube.com/");

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        WebView webView = (WebView) findViewById(R.id.webView1);

        webView.goBack();
        return true;


    }

}
