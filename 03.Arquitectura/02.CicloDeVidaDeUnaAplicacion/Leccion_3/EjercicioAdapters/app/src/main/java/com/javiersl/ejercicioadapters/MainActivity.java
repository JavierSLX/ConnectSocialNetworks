package com.javiersl.ejercicioadapters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    private Button alarma, reproductor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlaza los view con sus objetos
        alarma = (Button)findViewById(R.id.alarma);
        reproductor = (Button)findViewById(R.id.reproductor);

        //Evento del botón alarma
        alarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, Alarma.class);
                startActivity(intent);
            }
        });

        //Evento del botón reproductor
        reproductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, Reproductor.class);
                startActivity(intent);
            }
        });
    }
}
