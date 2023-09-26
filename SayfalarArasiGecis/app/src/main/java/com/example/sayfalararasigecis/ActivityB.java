package com.example.sayfalararasigecis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.sayfalararasigecis.databinding.ActivityBBinding;
import com.example.sayfalararasigecis.databinding.ActivityMainBinding;

public class ActivityB extends AppCompatActivity {

    private ActivityBBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonGotoC.setOnClickListener(view -> {
            Intent yeniIntent= new Intent(ActivityB.this, ActivityC.class);
            startActivity(yeniIntent);
        });
    }
}