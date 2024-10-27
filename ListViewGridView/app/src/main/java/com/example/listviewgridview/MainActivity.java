package com.example.listviewgridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // ListView & GridView & Spinner yapilari listeleme icin kullanilir.
    // Ancak ListView ve GridView yapilarinin yerini RecyclerView isimli yeni Material-Design3 yapisi almistir. Bu sebeple cok detay incelenmeyecektir.
    // RecyclerView daha modern bir yapidir.

    // Bu yapilari kullanmak icin oncelikle bir veri kumemizin olmasi gerekir. Bu veri kumesi bir veritabani olabilir, bir liste yapisi olabilir
    // Adapter: veri kumesini duzenleyen yapidir. Yani hangi verinin nereye yerlesecegini belirler.

    private ListView listView;
    private ArrayList<String> ulkeler = new ArrayList<>();
    private ArrayAdapter<String> veriAdapteri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listView = findViewById(R.id.listView);

        ulkeler.add("Türkiye");
        ulkeler.add("İtalya");
        ulkeler.add("Güney Kore");
        ulkeler.add("Almanya");
        ulkeler.add("Çin");
        ulkeler.add("İspanya");
        ulkeler.add("Portekiz");
        ulkeler.add("Japonya");

        veriAdapteri = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1,ulkeler);

        listView.setAdapter(veriAdapteri);

        // OLusturulan her ulke icin tiklandiginda bir Toast Mesaj acilsin (listelerin de tiklanilma ozelligi vardir)
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Sectiginiz Ulke: " + ulkeler.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        // GridView yapisi da ListView yapisi ile aynidir aralarindaki fark: ListView nesneleri alt alta gosterirken GridView yan yana gosterir



    }
}