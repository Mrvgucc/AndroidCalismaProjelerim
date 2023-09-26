package com.example.yasamdongusu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Yaşam Döngüsü" , "onCreate");



        {onStart();
        Log.e("Yaşam Döngüsü" , "onStart");}

        onResume();
        Log.e("Yaşam Döngüsü" , "onResume");

        onPause();
        Log.e("Yaşam Döngüsü" , "onPause");

        onStop();
        Log.e("Yaşam Döngüsü" , "onStop");

        onDestroy();
        Log.e("Yaşam Döngüsü" , "onDestroy");

        onRestart();
        Log.e("Yaşam Döngüsü" , "onRestart");




    }
}