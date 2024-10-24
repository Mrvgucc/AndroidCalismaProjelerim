package com.example.navigationcomponentkullanimi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponentkullanimi.databinding.FragmentOyunEkraniBinding;
import com.google.android.material.snackbar.Snackbar;

public class OyunEkraniFragment extends Fragment {

    private FragmentOyunEkraniBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentOyunEkraniBinding.inflate(inflater, container, false);

        OyunEkraniFragmentArgs bundle = OyunEkraniFragmentArgs.fromBundle(getArguments());
        String gelenAd = bundle.getAd();
        int gelenYas = bundle.getYas();
        boolean gelenBekarMi = bundle.getBekarMi();
        float gelenBoy = bundle.getBoy();
        Kisiler gelenKisi1 = bundle.getNesneBilgiler();
        Kisiler gelenKisi2 = bundle.getNesneBilgiler2();

        Log.e("Gelen Ad: ", gelenAd);
        Log.e("Gelen Yas: ",String.valueOf(gelenYas));
        Log.e("Gelen Boy: ",String.valueOf(gelenBoy));
        Log.e("Gelen Bekar Mi: ",String.valueOf(gelenBekarMi));
        Log.e("Gelen Ad 2: ", gelenKisi1.getKisiAd());
        Log.e("Gelen Yas 2: ",String.valueOf(gelenKisi1.getKisiNo()));
        Log.e("Gelen Ad 3: ", gelenKisi2.getKisiAd());
        Log.e("Gelen Yas 9: ",String.valueOf(gelenKisi2.getKisiNo()));

        tasarim.buttonBitir.setOnClickListener(v ->{
            Snackbar.make(v,"Sonuc Ekranina Gecildi",Snackbar.LENGTH_SHORT).show();



            Navigation.findNavController(v).navigate(R.id.sonucEkraniGecis);

        });
        return tasarim.getRoot();
    }
}