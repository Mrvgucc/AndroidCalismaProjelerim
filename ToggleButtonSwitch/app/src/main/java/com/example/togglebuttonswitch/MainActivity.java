package com.example.togglebuttonswitch;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Switch switch1;
    private ToggleButton toggleButton;
    private Button button;
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

        switch1 = findViewById(R.id.switch1);
        toggleButton = findViewById(R.id.toggleButton);
        button = findViewById(R.id.button);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            // Switch'e her basildiginda burasi calisir
                if (isChecked) { // isChecked true ise
                    Log.e("Switch", "ON");
                }
                else  { // isChecked false ise
                    Log.e("Switch", "OFF");
                }
            }
        });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) Log.e("Toggle Button", "ON");
                else Log.e("Toggle Button", "OFF");
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean switchDurum = switch1.isChecked();
                Boolean toogleButtonDurum = toggleButton.isChecked();

                Log.e("SwitchDurum: ", switchDurum.toString());
                Log.e("SwitchDurum: ", toogleButtonDurum.toString());


            }
        });

    }
}