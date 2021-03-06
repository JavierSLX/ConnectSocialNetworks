package com.javiersl.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navegarAlarma(View view)
    {
        Intent intent = new Intent(this, AlarmaActivity.class);
        startActivity(intent);
    }

    public void navegarReproductor(View view)
    {
        Intent intent = new Intent(this, Reproductor.class);
        startActivity(intent);
    }
}
