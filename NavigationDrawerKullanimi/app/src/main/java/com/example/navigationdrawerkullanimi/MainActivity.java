package com.example.navigationdrawerkullanimi;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.navigationdrawerkullanimi.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private NavigationView navigationView;
    private DrawerLayout drawer;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        navigationView = findViewById(R.id.navigationView);
        drawer = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolbar);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);

        //baglantiyi sagladik
        NavigationUI.setupWithNavController(binding.navigationView,navHostFragment.getNavController());

        toolbar.setTitle("Ana Sayfa");

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,binding.drawer,binding.toolbar,0,0);
        binding.drawer.addDrawerListener(toggle);
        toggle.syncState(); //Senkronize calismalarini sagliyoruz

        View baslik = binding.navigationView.inflateHeaderView(R.layout.navigation_baslik);
        TextView textViewBaslik = baslik.findViewById(R.id.textViewBaslik);
        textViewBaslik.setText("Merhaba");

    }

    @Override
    public void onBackPressed() { // geri tusunun calismasini saglayan metot
        if(binding.drawer.isDrawerOpen((GravityCompat.START))){ // drawer aciksa
            binding.drawer.closeDrawer(GravityCompat.START); // geri tusuna basildiginda draweri kapat
        }
        else {
            super.onBackPressed(); //butonun varsayilan ozelligidir yani geri tusuna basildiginda uygulama kapanir
        }
    }
}