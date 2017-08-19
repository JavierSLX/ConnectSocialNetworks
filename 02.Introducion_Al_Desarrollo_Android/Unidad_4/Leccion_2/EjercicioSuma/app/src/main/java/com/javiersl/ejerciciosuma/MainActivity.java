package com.javiersl.ejerciciosuma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.javiersl.operaciones.Suma;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Suma suma = new Suma();
        Log.i("Suma", Integer.toString(suma.sumar(2, 2)));
    }
}
