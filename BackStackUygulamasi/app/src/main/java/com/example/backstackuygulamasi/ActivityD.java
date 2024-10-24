package com.example.backstackuygulamasi;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.backstackuygulamasi.databinding.ActivityDBinding;

public class ActivityD extends AppCompatActivity {
    private ActivityDBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding =ActivityDBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        /*binding.buttonGoToMain.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityD.this,MainActivity.class);
            startActivity(intent);
        });*/

        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                // ActivityB'ye gecis yapmak icin Intent olusturulur.
                Intent intent = new Intent(ActivityD.this,ActivityB.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                // Flagler ile mevcut activity yiginini temizliyoruz.Eger Flag leri eklemezsek;
                // A -> B -> C -> D gittik. Geri bastik A -> B -> C -> B seklinde olur. ancak burada d nin silindigi gibi
                // c nin de silinmesi gerektiginden flag ekleyerek d'den b'ye gecildiginde bir daha Geri basarsak b'den de
                // a'ya gecis saglikli bir sekilde yapilacaktir.
                startActivity(intent);
                finish(); // ActivityD yi kapatiyoruz. Boylelikle ActiviyB'ye dogru bir gecis sagliyoruz.
                // finish() metodu ile isteifigmiz sayfayi backStack ten silebliriz.
                // hangi sayfanin aradan cikmasini istiyorsak finis metodunu oraya yazmaliyiz.
            }
        });

    }

    // Normalde geri tusuna bastigimizda d den bir onceki sayfa olan c ye gecis yapilir ancak bunu degistirebiliriz
    // Bu metodun kullanimi eskidi bunu yerine
    /*@Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(ActivityD.this, ActivityB.class));
    }*/


}