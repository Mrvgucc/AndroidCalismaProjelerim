package com.example.sayfalararasiveritasima;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.sayfalararasiveritasima.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonGotoB2.setOnClickListener(view -> {

            Kisiler kisi = new Kisiler(9999 , "Ahmet" , 1.87);

            Intent yeniIntent = new Intent(MainActivity.this , ActivityB.class);
            yeniIntent.putExtra("mesaj" , "merhaba");
            yeniIntent.putExtra("yas" , 18);
            yeniIntent.putExtra("boy" , 1.78);

            yeniIntent.putExtra("nesne" , kisi);
            startActivity(yeniIntent);
        });


    }
}