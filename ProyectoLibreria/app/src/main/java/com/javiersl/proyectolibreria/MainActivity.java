package com.javiersl.proyectolibreria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.javiersl.libreria.PruebaLibreria;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      PruebaLibreria lib = new PruebaLibreria();
      Log.i("Texto", PruebaLibreria.texto);
    }
}
