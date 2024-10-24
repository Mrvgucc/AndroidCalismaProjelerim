package com.example.androidcalismayapisi2;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidcalismayapisi2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

// Uygulamalar birden fazla sayfadan olusabilir. Bu sayfalarin yonetimi, sayfalar arasindaki gecisler,
// sayfalar arasinda veri transferlerinin nasil yapildigi incelenecektir.

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =  ActivityMainBinding.inflate(getLayoutInflater());
        EdgeToEdge.enable(this);
        // burada neyin calismasini istiyorsak setContentView in icerisine o yazilir.
        setContentView(binding.getRoot()); // bu kod ile activity ve layout birlesir.
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding.benimButton.setOnClickListener( view -> {
            binding.benimTextViev.setText("Merhaba Dunya");
            Log.e("Mesaj","Merhaba");
        });
    }
}