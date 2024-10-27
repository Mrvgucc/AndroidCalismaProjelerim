package com.example.buttonedittexttextviewkullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private TextView textView;
     private Button button;
     private EditText editText;
     private Switch switch2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextText);
        button = findViewById(R.id.button);
        switch2 = findViewById(R.id.switch2);

        //ToggleButton da Switch mantigiyla aynidir
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) { //isChecked: durumu belirtir mesela False dan True ya gectiginde bu True olcak
                if(isChecked){ // true donerse yani False dan True ya gecilmisse
                    Log.e("Switch", "ON");
                }
                else { // false olursa yani True dan False a gecilmisse
                    Log.e("Switch", "OFF");
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alinanVeri =  editText.getText().toString();
                if(alinanVeri.equals("05313603365")){
                    textView.setText("Merhaba Merve!");
                }
                else{
                    textView.setText("Merhaba " + alinanVeri + "!");
                }

            }
        });

       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean alinanDurum = switch2.isChecked();
                Log.e("Button Calisma Kontrol", String.valueOf(alinanDurum));
            }
        });*/
    }
}