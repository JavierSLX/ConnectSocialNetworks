package com.javiersl.ejercicio1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.javiersl.ejercicio1.R;
import com.javiersl.ejercicio1.modelo.Cancion;

import java.util.ArrayList;

/**
 * Created by JavierSL on 04/06/2017.
 */
public class CancionAdapter extends BaseAdapter
{
    private Context context;
    private ArrayList<Cancion> lista;

    public CancionAdapter(Context context, ArrayList<Cancion> objects)
    {
        this.context = context;
        this.lista = objects;
    }

    public ArrayList<Cancion> getLista() {
        return lista;
    }

    @Override
    public int getCount()
    {
        return lista.size();
    }

    @Override
    public Cancion getItem(int position)
    {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        //Crea los objetos para poder inflar el layout
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View item = convertView;

        if (convertView == null)
            item = inflater.inflate(R.layout.reproductor_template, null);

        //Define los objetos que intervienen en el proceso
        TextView cancion = (TextView)item.findViewById(R.id.cancion);
        TextView artista = (TextView)item.findViewById(R.id.artista);

        cancion.setText(getItem(position).getCancion());
        artista.setText(getItem(position).getArtista());
        return item;
    }
}
