package com.example.androidcalismayapisi;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidcalismayapisi.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;
// Tasarim uzerindeki gorsel nesneleri kodlmaya aktarmak ve baglamak icin kullandigimiz bir yapidir.
// layout ta olustudugumuz herhangi bir gorsel nesneyi main activity de kullanabilmek icin oncelikle viewBind,ng yapilmasi gerekir.
// Bunun icin de oncelikle Gradle Scripts dosyasina girilerek buildingFeatures { viewBinding = true } yapilarak bu yapi etkinlestirilir.
// Binding yapisi ile layout dosya isminin sonuna Binding eklenir. Ornegin viewbinding.xml dosyasi icin = ViewbindingBinding olmus olur
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this); // arayuzde daha genis bir alanda calisma sunar
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/

        tasarim.buttonYap.setOnClickListener(view -> {
            Snackbar.make(view, "Merhaba", Snackbar.LENGTH_SHORT).show();
        });

        /* LogCat Kullanimi
        int x = 10;
        int y = 0;
        int sonuc = x / y ;

        Log.e("Sonuc" ,  Integer.toString(sonuc));*/
    }
}