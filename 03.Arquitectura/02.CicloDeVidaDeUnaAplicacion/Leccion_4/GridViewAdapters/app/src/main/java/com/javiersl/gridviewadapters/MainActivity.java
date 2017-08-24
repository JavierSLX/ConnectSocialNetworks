package com.javiersl.gridviewadapters;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.javiersl.gridviewadapters.adapter.CalendarioAdapter;
import com.javiersl.gridviewadapters.modelo.Calendario;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

    private GridView grid;
    private ArrayList<Calendario> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enlaza cada view con su elemento
        grid = (GridView)findViewById(R.id.grid);
        lista = listar();

       //Crea el adapter
        CalendarioAdapter adapter = new CalendarioAdapter(this, lista);
        grid.setAdapter(adapter);
    }

    private ArrayList<Calendario> listar()
    {
        ArrayList<Calendario> elementos = new ArrayList<>();

         //Saca los arreglos definidos
        String[] titulos = getResources().getStringArray(R.array.meses);
        TypedArray imagenes = getResources().obtainTypedArray(R.array.zodiaco);

        //Agrega los elementos a la lista
        for (int i = 0; i < titulos.length; i++)
            elementos.add(new Calendario(imagenes.getResourceId(i, 0), titulos[i]));

        return elementos;
    }
}
