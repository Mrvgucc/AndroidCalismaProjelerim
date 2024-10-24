package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.bottomnavigation.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    private BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());


        bottomNav = findViewById(R.id.bottomNav); // 1 ve 2 nin bulundugu menu ye eristik

        // Yazdigimiz BIR ve IKI fragmentelarina da eristik
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_fragment_host);

        //Baglanti icin;(bottomNav ile navHostFragmenti birlestirdik)
        NavigationUI.setupWithNavController(tasarim.bottomNav,navHostFragment.getNavController());

    }
}