package com.javiersl.ejercicioadapters;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.javiersl.ejercicioadapters.adapter.CulturaImagenAdapter;
import com.javiersl.ejercicioadapters.modelo.CulturaImagen;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity
{
    private GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        //Relaciona un elemento con su view
        grid = (GridView)findViewById(R.id.gridview);

        //Crea el adapter y lo asigna
        CulturaImagenAdapter adapter = new CulturaImagenAdapter(this, listar());
        grid.setAdapter(adapter);
    }

    private ArrayList<CulturaImagen> listar()
    {
        ArrayList<CulturaImagen> lista = new ArrayList<>();
        String[] titulos = getResources().getStringArray(R.array.culturas);
        String[] subtitulos = getResources().getStringArray(R.array.lugares);
        TypedArray imagenes = getResources().obtainTypedArray(R.array.fotos);

        for (int i = 0; i < titulos.length; i++)
            lista.add(new CulturaImagen(titulos[i], imagenes.getResourceId(i, 0), subtitulos[i]));

        return lista;
    }
}
