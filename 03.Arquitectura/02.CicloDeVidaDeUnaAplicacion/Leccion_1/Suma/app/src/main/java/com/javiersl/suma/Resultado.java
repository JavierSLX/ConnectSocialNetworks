package com.javiersl.suma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //Define los elementos del layout
        resultado = (TextView)findViewById(R.id.resultado);

        //Línea opcional para la obtención de datos
        /*Bundle datos = this.getIntent().getExtras();
        int a = datos.getInt("n1");
        int b = datos.getInt("n2");*/
        int a = getIntent().getIntExtra("n1", 0);
        int b = getIntent().getIntExtra("n2", 0);

        resultado.setText("El resultado de la suma es " + (a+b));
    }
}
