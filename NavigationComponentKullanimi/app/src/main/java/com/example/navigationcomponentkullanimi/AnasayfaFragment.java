package com.example.navigationcomponentkullanimi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding;
import com.google.android.material.snackbar.Snackbar;

public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding tasarim;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        tasarim = FragmentAnasayfaBinding.inflate(inflater,container,false);

        tasarim.buttonBaslaa.setOnClickListener(v -> {
            Kisiler kisi1 = new Kisiler(12,"Talha");
            Kisiler kisi2 = new Kisiler();
            AnasayfaFragmentDirections.OyunEkraniGecisCizgisi gecis = AnasayfaFragmentDirections.oyunEkraniGecisCizgisi(kisi1,kisi2);
            gecis.setAd("Merve");
            gecis.setBoy(1.58f);
            gecis.setBekarMi(true);
            gecis.setYas(21);
            kisi2.setKisiAd("Ali");
            kisi2.setKisiNo(13);

            Snackbar.make(v,"Merhaba" ,Snackbar.LENGTH_LONG).show();
            //Snackbar.make = bir snackbar nesnesi olusturmak icin kullanilir
            //"Merhaba"  = Snackbar da gosterilecek metni belirtir.
            //Snackbar.LENGT_LONG = mesajin ne kadar sureyle gosterilecegini belirtir (4 sn tekabul eder)
            //show() =  Snackbar nesnesini gosterir.

            Navigation.findNavController(v).navigate(gecis);
       });

        return tasarim.getRoot();
    }
}