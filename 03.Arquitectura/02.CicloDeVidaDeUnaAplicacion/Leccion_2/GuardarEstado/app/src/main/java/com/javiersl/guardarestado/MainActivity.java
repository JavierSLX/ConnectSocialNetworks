package com.javiersl.guardarestado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tbxMostrar;
    private static final String STATE_MENSAJE = "estado_mensaje";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbxMostrar = (TextView)findViewById(R.id.txt_mostrar);

        //Si hay datos guardados que se han mantenido
        /*if (savedInstanceState != null)
        {
            tbxMostrar.setText(savedInstanceState.getString("estado_mensaje"));
        }*/
    }

    public void onClickMostrar(View view)
    {
        tbxMostrar.setText("Mensaje");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        //Método para guardar un valor de cadena para evitar perdida de datos al pasar por el estado Stopped
        outState.putString("estado_mensaje", tbxMostrar.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        //Recupera los datos que se quieren mantener
        tbxMostrar.setText(savedInstanceState.getString("estado_mensaje"));
    }
}
