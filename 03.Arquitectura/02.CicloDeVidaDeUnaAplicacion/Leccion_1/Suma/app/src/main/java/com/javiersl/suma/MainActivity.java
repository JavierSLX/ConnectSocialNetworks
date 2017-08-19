package com.javiersl.suma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asigna los objetos del layout
        numero1 = (EditText)findViewById(R.id.numero1);
        numero2 = (EditText)findViewById(R.id.numero2);
    }

    public void sumar (View view)
    {
        Intent intent = new Intent(this, Resultado.class);

        if (numero1.getText().toString().equals("") || numero2.getText().toString().equals(""))
        {
            intent.putExtra("n1", 0);
            intent.putExtra("n2", 0);
        }
        else
        {
            intent.putExtra("n1", Integer.parseInt(numero1.getText().toString()));
            intent.putExtra("n2", Integer.parseInt(numero2.getText().toString()));
        }

        startActivity(intent);
    }
}
