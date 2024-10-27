package com.example.imageview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button buttonResim1,buttonResim2;
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

        imageView = findViewById(R.id.imageView);
        buttonResim1 = findViewById(R.id.buttonResim1);
        buttonResim2 = findViewById(R.id.buttonResim2);

        buttonResim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // burada resim1 ogesini dosya yoluyla aldik
                imageView.setImageResource(R.drawable.resim1);
            }
        });

        buttonResim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // burada resim ogesini dosya adi ile aldik
                //imageView.setImageResource(getResources().getIdentifier("resim","drawable",getPackageName()));
                imageView.setImageResource(R.drawable.resim);
            }
        });

    }
}