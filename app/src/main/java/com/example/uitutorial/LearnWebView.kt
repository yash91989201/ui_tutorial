package com.example.uitutorial

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uitutorial.databinding.ActivityLearnWebViewBinding

class LearnWebView : AppCompatActivity() {

    private lateinit var binding:ActivityLearnWebViewBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityLearnWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val webview=binding.wvContainer
        // setting web view attributes
        webview.loadUrl("https://brokingbisons.com")
        webview.settings.javaScriptEnabled=true
        webview.webViewClient= WebViewClient()
        }
        // handle back navigation in web view
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {

            if(keyCode == KeyEvent.KEYCODE_BACK && binding.wvContainer.canGoBack()){
                binding.wvContainer.goBack()
                return true
            }

            // default onKeyDown behaviour using from base method
            return super.onKeyDown(keyCode, event)
    }
}