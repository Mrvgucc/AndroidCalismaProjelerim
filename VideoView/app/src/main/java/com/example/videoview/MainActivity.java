package com.example.videoview;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // videoView: kullanabilmek icin raw dosyasi olusturulmali. Video nesnleri buraya konur.
    // raw dosyasinin icine video,ses gibi dosyalar eklenebilir.
    private VideoView videoView;
    private ToggleButton toggleButton;
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

        videoView = findViewById(R.id.videoView);
        toggleButton = findViewById(R.id.toggleButton);

        // video URL
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView.setVideoURI(videoUri);

        // Tek butonla baslatma ve durdurma
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (videoView.isPlaying()){
                    videoView.pause();
                    toggleButton.setText("BASLAT");
                }
                else {
                    videoView.start();
                    toggleButton.setText("DURDUR");
                }


            }
        });

    }
}