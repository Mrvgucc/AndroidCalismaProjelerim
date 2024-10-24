package com.example.navigationcomponent;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponent.databinding.FragmentAnasayfaBinding;
import com.google.android.material.snackbar.Snackbar;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(getLayoutInflater(), container,false);

        binding.buttonOyunaBasla.setOnClickListener(view -> {
            // asagidaki ifade ile veri transferini gerceklestirebilecegiz.
            Kisiler kisi1 = new Kisiler(12,"Mehmet");
            AnasayfaFragmentDirections.OyunEkraninaGecis gecis = AnasayfaFragmentDirections.oyunEkraninaGecis(kisi1);
            gecis.setAd("Ahmet");
            gecis.setYas(21);
            gecis.setBoy(1.78f);
            gecis.setBekarMi(true);

            Navigation.findNavController(view).navigate(gecis);
        });

        return binding.getRoot();
    }
}