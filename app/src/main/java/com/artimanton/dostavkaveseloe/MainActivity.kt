package com.artimanton.dostavkaveseloe

import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mWebView = findViewById<WebView>(R.id.webView)
        /*mWebView.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }*/
        mWebView.loadUrl("http://dostavka.veseloe.tilda.ws")
        mWebView.settings.javaScriptEnabled=true
        mWebView.settings.allowContentAccess=true
        mWebView.settings.domStorageEnabled=true
        mWebView.settings.useWideViewPort=true
        mWebView.settings.builtInZoomControls=true
        mWebView.settings.displayZoomControls=false

    }
}