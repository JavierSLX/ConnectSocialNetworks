package com.javiersl.estructuraactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mensaje;
    private EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Para sacar el TextView y el EditView que se diseño en el archivo .xml
        mensaje = (TextView)findViewById(R.id.mensaje);
        nombre = (EditText)findViewById(R.id.nombre);
    }

    public void mostrarMensaje (View view)
    {
        String cadena = getString(R.string.cadena) + " " + nombre.getText();
        mensaje.setText(cadena);
    }

    public void navegacion(View view)
    {
        Intent intent = new Intent(this, Navegacion.class);
        intent.putExtra("nombre", nombre.getText().toString());
        startActivity(intent);
    }
}
