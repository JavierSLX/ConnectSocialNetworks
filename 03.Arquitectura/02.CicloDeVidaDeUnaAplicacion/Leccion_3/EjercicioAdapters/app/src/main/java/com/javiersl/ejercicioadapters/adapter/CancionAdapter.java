package com.javiersl.ejercicioadapters.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.javiersl.ejercicioadapters.R;
import com.javiersl.ejercicioadapters.modelo.Cancion;

import java.util.ArrayList;

/**
 * Created by JavierSL on 20/08/2017.
 */
public class CancionAdapter extends BaseAdapter
{
    private Context context;
    private ArrayList<Cancion> canciones;

    public CancionAdapter(Context context, ArrayList<Cancion> objects)
    {
        this.context = context;
        this.canciones = objects;
    }

    public ArrayList<Cancion> getCanciones()
    {
        return canciones;
    }

    @Override
    public int getCount()
    {
        return canciones.size();
    }

    @Override
    public Object getItem(int position)
    {
        return canciones.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        //Infla el layout para crear el adapter
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View item = convertView;
        if (convertView == null)
        {
            item = inflater.inflate(R.layout.list_reproductor, null);
        }

        //Relaciona cada view con su objeto
        TextView cancion = (TextView)item.findViewById(R.id.listaCancion);
        TextView autor = (TextView)item.findViewById(R.id.listaAutor);

        //Asigna el valor a cada objeto
        cancion.setText(canciones.get(position).getCancion());
        autor.setText(canciones.get(position).getAutor());

        return item;
    }
}
