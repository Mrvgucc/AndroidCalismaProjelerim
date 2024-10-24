package com.example.navigationcomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponent.databinding.FragmentOyunEkraniBinding;

public class OyunEkraniFragment extends Fragment {
    private FragmentOyunEkraniBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentOyunEkraniBinding.inflate(getLayoutInflater());

        // AnasayfaFragment tan gelen verileri bu sekilde yakaladik
        OyunEkraniFragmentArgs bundle = OyunEkraniFragmentArgs.fromBundle(getArguments());
        String gelenAd = bundle.getAd();
        int gelenYas = bundle.getYas();
        float gelenBoy = bundle.getBoy();
        Boolean gelenBekarMi = bundle.getBekarMi();
        String gelenMedeniHal = String.valueOf(gelenBekarMi);
        if (gelenBekarMi) {
            gelenMedeniHal = "Bekar";
        }
        else {
            gelenMedeniHal = "Evli";
        }
        Kisiler gelenKisi1 = bundle.getKisiNesnesi();
        Log.e("Gelen Ad: " ,gelenAd);
        Log.e("Gelen Yas: " ,String.valueOf(gelenYas));
        Log.e("Gelen Boy: " ,String.valueOf(gelenBoy));
        Log.e("Gelen Bekar mi: " , gelenMedeniHal);
        Log.e("cizgi", "------------------------------------------------");
        Log.e("Gelen Kisi1 No: " ,String.valueOf(gelenKisi1.getKisiNo()));
        Log.e("Gelen Kisi1 Ad: " ,gelenKisi1.getKisiAd());
        binding.buttonOyunuBitir.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.sonucEkraninaGecis);

        });

        return binding.getRoot();

    }
}