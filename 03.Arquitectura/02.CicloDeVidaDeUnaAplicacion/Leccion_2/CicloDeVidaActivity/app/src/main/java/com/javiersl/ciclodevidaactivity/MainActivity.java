package com.javiersl.ciclodevidaactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.wtf("Ciclo de vida", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf("Ciclo de vida", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.wtf("Ciclo de vida", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf("Ciclo de vida", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf("Ciclo de vida", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf("Ciclo de vida", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf("Ciclo de vida", "onDestroy");
    }
}
