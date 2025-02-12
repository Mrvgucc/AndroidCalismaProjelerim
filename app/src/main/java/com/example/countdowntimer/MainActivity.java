package com.example.countdowntimer;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
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

        // geri sayim yapabilen belirli sure araliklariyla calisan bir yapidir
        // belirli sure araliginda tekrarlatılmak istenen yapilar icin kullanilabilir.

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new CountDownTimer(20000,1000){ // 20 kere 1 er saniye ara ile calisacak

                    @Override
                    public void onTick(long l) { // her calistiginda burasi calisir
                        textView.setText("KALAN SÜRE : " + l/1000 + " sn");
                    }

                    @Override
                    public void onFinish() { // Sure bittikten sonra burasi calisir
                        textView.setText("Sure Bitti");
                    }
                }.start();
            }
        });
    }
}