package com.example.myo2024hafta0402;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler handle = new Handler();

        Runnable rn= new Runnable() {
            @Override
            public void run() {

                Log.d("MCK","Bir Saniye Geçti");
                handle.postDelayed(this,1000);
            }
        };

        handle.post(rn);
    }
}