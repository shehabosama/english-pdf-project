package com.english.pdf

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity(){
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openPdfInBrowser("https://ati.dae.gov.in/ati12052021_2.pdf")

    }
    private fun openPdfInBrowser(pdfUrl: String) {
//        // Create an Intent to open the URL in a browser
//        val googleDocsUrl = "https://docs.google.com/viewer?url=$pdfUrl"
//
//        // Create an Intent to open the URL in a browser
//        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(googleDocsUrl))
//        startActivity(browserIntent)
//        // Verify that there's an app available to handle this Intent
        webView = findViewById(R.id.web_view)

        // Enable JavaScript to load PDF in WebView
        webView.settings.javaScriptEnabled = true

        // Ensure links in the WebView open within the WebView, not an external browser
        webView.webViewClient = WebViewClient()

        // Load the PDF via Google Docs Viewer
        webView.loadUrl("https://docs.google.com/gview?embedded=true&url=$pdfUrl")
    }
}