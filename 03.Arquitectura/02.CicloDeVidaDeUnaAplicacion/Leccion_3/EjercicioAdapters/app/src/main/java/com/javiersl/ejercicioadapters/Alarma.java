package com.javiersl.ejercicioadapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.javiersl.ejercicioadapters.adapter.HoraAdapter;
import com.javiersl.ejercicioadapters.modelo.Hora;

import java.util.ArrayList;
import java.util.List;

public class Alarma extends AppCompatActivity
{
    private ListView lista;
    private ArrayList<Hora> arreglo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarma);

        //Saca el arreglo de elementos de horas
        String[] horas = getResources().getStringArray(R.array.alarmas);

        //Instancia la lista y asigna cada elemento
        arreglo = new ArrayList<>();
        for(int i = 0; i < horas.length; i++)
        {
            arreglo.add(new Hora(false, horas[i]));
        }

        //Enlaza los view con los objetos
        lista = (ListView)findViewById(R.id.lista);

        //Crea el adapter y lo asigna al ListView para que se muestre
        HoraAdapter adapter = new HoraAdapter(this, arreglo);
        lista.setAdapter(adapter);
    }
}
