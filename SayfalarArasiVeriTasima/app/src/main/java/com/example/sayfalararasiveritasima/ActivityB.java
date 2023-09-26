package com.example.sayfalararasiveritasima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        String gelenMesaj = getIntent().getStringExtra("mesaj");
        int gelenYas = getIntent().getIntExtra("yas" , 0);
        double gelenBoy = getIntent().getDoubleExtra("boy" , 0.0);

        Kisiler gelenNesne = (Kisiler) getIntent().getSerializableExtra("nesne"); //Serializable interface dem alındığı için downCasting işlemi yapıldı bu yuzden Kisiler sınıfına çevirdik.

        Log.e("Gelen Mesaj" ,gelenMesaj);
        Log.e("Gelen Yas" , String.valueOf(gelenYas)); // yas degeri int girildiği icin burada tip dönüşümü yaptık
        Log.e("Gelen Boy" , String.valueOf(gelenBoy)); // boy degeri double girildiği icin burada tip dönüşümü yaptık

        Log.e("Gelen tcNO" , String.valueOf(gelenNesne.getTcNo()));
        Log.e("Gelen İsim" , String.valueOf(gelenNesne.getIsim()));
        Log.e("Gelen Kişi Boy" , String.valueOf(gelenNesne.getBoy()));

    }
}