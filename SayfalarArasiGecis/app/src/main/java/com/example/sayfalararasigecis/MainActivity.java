package com.example.sayfalararasigecis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.sayfalararasigecis.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonGotoB.setOnClickListener(view -> {
            Intent yeniIntent = new Intent(MainActivity.this,ActivityB.class);
            startActivity(yeniIntent);
        });


    }
}