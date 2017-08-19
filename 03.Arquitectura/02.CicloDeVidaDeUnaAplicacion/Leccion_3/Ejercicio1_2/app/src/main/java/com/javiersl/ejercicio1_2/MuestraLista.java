package com.javiersl.ejercicio1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.javiersl.ejercicio1_2.adapter.SerieAdapter;
import com.javiersl.ejercicio1_2.modelo.Serie;

import java.util.ArrayList;

public class MuestraLista extends AppCompatActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muestra_lista);

        //Inicializa el adapter y la listview
        SerieAdapter adapter = new SerieAdapter(this, listar());
        lista = (ListView)findViewById(R.id.lista);
        lista.setAdapter(adapter);
    }

    private ArrayList<Serie> listar()
    {
        //Saca los recursos de string.xml e inicializa un objeto
        String[] articulos = getResources().getStringArray(R.array.articulos);
        ArrayList<Serie> arreglo = new ArrayList<>();

        //Coloca todos los elementos dentro de la lista
        for(String articulo: articulos)
            arreglo.add(new Serie(false, articulo));

        return arreglo;
    }
}
