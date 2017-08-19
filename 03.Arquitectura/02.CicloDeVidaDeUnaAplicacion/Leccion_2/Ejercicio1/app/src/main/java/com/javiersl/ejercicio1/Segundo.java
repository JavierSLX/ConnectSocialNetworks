package com.javiersl.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Segundo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        Log.wtf("SegundaActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf("SegundaActivity", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.wtf("SegundaActivity", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf("SegundaActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf("SegundaActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf("SegundaActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf("SegundaActivity", "onDestroy");
    }
}
