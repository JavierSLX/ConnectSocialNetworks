package com.javiersl.ejerciciolibrerias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.javiersl.libreria.Calculador;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calculador calculo = new Calculador();
        calculo.promedio(1, 2);
        Log.i("Texto", Calculador.texto);

    }
}
