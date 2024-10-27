package com.example.webview;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // WebView: olan web sayfalarin sayfanizda gorunmesini saglayan bir gorsle nesnedir
    // Her web site acilmaz bazi siteler bunu yasaklamistir. Ancak kendi web sitemizde bunu rahatlikla kullanabiliriz.
    // cok profesyonel olmayan bir yontemdir pek onerilmez bunun yerine o tasarimin uygulama icinde kendisinin yapilmasi daha dogru olacaktir.

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        webView = findViewById(R.id.webView);
        Boolean a = webView.getSettings().getJavaScriptEnabled();

        webView.loadUrl("https://www.google.com/");
    }
}