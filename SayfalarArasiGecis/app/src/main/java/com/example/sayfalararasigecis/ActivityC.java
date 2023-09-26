package com.example.sayfalararasigecis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.sayfalararasigecis.databinding.ActivityCBinding;
import com.example.sayfalararasigecis.databinding.ActivityMainBinding;

public class ActivityC extends AppCompatActivity {

    private ActivityCBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonGotoMain.setOnClickListener(view -> {
            Intent yeniIntent = new Intent(ActivityC.this , MainActivity.class);
            startActivity(yeniIntent);
        });
    }
}