package com.javiersl.estructuraactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Navegacion extends AppCompatActivity {

    private TextView mensaje2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegacion);

        mensaje2 = (TextView)findViewById(R.id.mensaje2);

        //Obtener la cadena de la primera activity
        String cadena = getIntent().getStringExtra("nombre");
        mensaje2.setText("Bienvenido a la segunda Activity " + cadena);
    }
}
