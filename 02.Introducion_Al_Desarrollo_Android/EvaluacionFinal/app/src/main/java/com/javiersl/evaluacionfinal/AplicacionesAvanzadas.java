package com.javiersl.evaluacionfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.javiersl.libreria.Mensaje;

public class AplicacionesAvanzadas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplicaciones_avanzadas);

        Log.i("mensaje", Mensaje.aplicaciones);
    }
}
