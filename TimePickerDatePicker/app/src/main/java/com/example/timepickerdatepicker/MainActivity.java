package com.example.timepickerdatepicker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    // Kullanicidan saat ve tarih girdisi almak istedigimizde ekrana saat ve takvim cikaran iki nesnedir.
    private EditText editTextSaat, editTextTarih;

    // TimePicker ve DatePicker calisirken editText alanina 2. tiklandiginda saat ve tarih ekranlarinin acilir.
    // Eger ilk tiklanmada acilmasini istiyorsak editText in focusIntouchMode = false yapilamlidir.
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

        editTextSaat = findViewById(R.id.editTextSaat);
        editTextTarih = findViewById(R.id.editTextTarih);

        editTextSaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TimePicker kullanildigin zaman cihazin guncel saatine ve dakikasina ihitiyac duyar.
                Calendar calendar = Calendar.getInstance();
                int saat = calendar.get(Calendar.HOUR_OF_DAY); // anlik saat alindi
                int dakika = calendar.get(Calendar.MINUTE); // anlik dakika alindi

                TimePickerDialog timePicker;

                timePicker = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        editTextSaat.setText(hourOfDay + "." + minute);
                    }
                },saat,dakika,true); // true 24 saatlik demek false olsa 12 saatlik olurdu

                timePicker.setTitle("Saat Seciniz");
                timePicker.setButton(DialogInterface.BUTTON_POSITIVE, "Ayarla",timePicker);
                timePicker.setButton(DialogInterface.BUTTON_NEGATIVE, "Iptal",timePicker);

                timePicker.show();

            }
        });

        editTextTarih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int gun = calendar.get(Calendar.DAY_OF_MONTH);
                int ay = calendar.get(Calendar.MONTH);
                int yil = calendar.get(Calendar.YEAR);

                DatePickerDialog datePicker;

                datePicker = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        editTextTarih.setText(dayOfMonth + "." + month + "." + year );
                    }
                },yil,ay,gun);

                datePicker.setTitle("Tarih Seciniz");
                datePicker.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarla",datePicker);
                datePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"Iptal",datePicker);
                datePicker.show();



            }
        });

    }
}