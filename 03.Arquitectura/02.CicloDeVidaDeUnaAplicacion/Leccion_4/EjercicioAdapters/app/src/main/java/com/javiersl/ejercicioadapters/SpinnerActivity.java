package com.javiersl.ejercicioadapters;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

import com.javiersl.ejercicioadapters.adapter.CulturaSpinnerAdapter;
import com.javiersl.ejercicioadapters.modelo.Cultura;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity
{
    private Spinner spinner;
    private ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        //Define cada elemento con su view
        spinner = (Spinner)findViewById(R.id.spinner);
        imagen = (ImageView)findViewById(R.id.imagen);

        //Crea el adapter
        CulturaSpinnerAdapter adapter = new CulturaSpinnerAdapter(this, listar());
        spinner.setAdapter(adapter);

        //Saca el arreglo de elementos de la imagen
        final TypedArray imagenes = getResources().obtainTypedArray(R.array.fotos);

        //Evento cuando se selecciona un elemento del spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                imagen.setImageResource(imagenes.getResourceId(position, 0));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                imagen.setImageResource(imagenes.getResourceId(0, 0));
            }
        });
    }

    private ArrayList<Cultura> listar()
    {
        ArrayList<Cultura> lista = new ArrayList<>();
        String[] titulos = getResources().getStringArray(R.array.culturas);
        String[] subtitulos = getResources().getStringArray(R.array.lugares);

        //Crea la lista
        for (int i = 0; i < titulos.length; i++)
            lista.add(new Cultura(titulos[i], subtitulos[i]));

        return lista;
    }
}
