package com.example.progressbarseekbarratingbar;

import android.media.Rating;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button buttonBasla, buttonBitir, buttonSonucAl;
    private SeekBar seekBar;
    private ProgressBar progressBar;
    private RatingBar ratingBar;
    private TextView textViewSonuc;
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

        buttonBasla = findViewById(R.id.buttonBasla);
        buttonBitir = findViewById(R.id.buttonBitir);
        buttonSonucAl = findViewById(R.id.buttonSonucAl);
        textViewSonuc = findViewById(R.id.textViewSonuc);
        ratingBar = findViewById(R.id.ratingBar);
        seekBar = findViewById(R.id.seekBar);
        progressBar = findViewById(R.id.progressBar);


        buttonBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });

        buttonBitir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.INVISIBLE);
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewSonuc.setText("SONUC: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        buttonSonucAl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float gelenOylama = ratingBar.getRating();
                Log.e("Oylama Sonucu: ", String.valueOf(gelenOylama));
            }
        });
    }
}