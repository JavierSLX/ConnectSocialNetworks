package com.javiersl.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.wtf("MainActivity", "onCreate");
    }

    public void segundaActivity(View view)
    {
        Intent intent = new Intent(this, Segundo.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.wtf("MainActivity", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.wtf("MainActivity", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf("MainActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.wtf("MainActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf("MainActivity", "onDestroy");
    }
}
