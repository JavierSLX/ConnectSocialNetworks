package com.javiersl.ejercicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.javiersl.libreria.Operacion;

public class MainActivity extends AppCompatActivity {

    private EditText caja1, caja2;
    private TextView caja3;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caja1 = (EditText)findViewById(R.id.caja1);
        caja2 = (EditText)findViewById(R.id.caja2);
        boton = (Button)findViewById(R.id.calcular);
    }

    public void calcular(View view)
    {
        caja3 = (TextView)findViewById(R.id.caja3);
        Operacion operacion = new Operacion();

        double valor = operacion.suma(Double.parseDouble(caja1.getText().toString()),
                Double.parseDouble(caja2.getText().toString()));
        caja3.setText(Double.toString(valor));
    }
}
