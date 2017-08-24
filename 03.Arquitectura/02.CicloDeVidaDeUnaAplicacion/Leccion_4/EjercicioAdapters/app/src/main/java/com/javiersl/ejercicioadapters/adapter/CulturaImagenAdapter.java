package com.javiersl.ejercicioadapters.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.javiersl.ejercicioadapters.R;
import com.javiersl.ejercicioadapters.modelo.CulturaImagen;

import java.util.ArrayList;

/**
 * Created by JavierSL on 23/08/2017.
 */
public class CulturaImagenAdapter extends BaseAdapter
{
    private ArrayList<CulturaImagen> lista;
    private Context context;

    public CulturaImagenAdapter(Context context, ArrayList<CulturaImagen> lista)
    {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount()
    {
        return lista.size();
    }

    @Override
    public CulturaImagen getItem(int position)
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
        //Infla el layout
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View item = convertView;
        if (convertView == null)
            item = inflater.inflate(R.layout.grid_template, null);

        //Asigna cada elemento a su view
        TextView titulo = (TextView)item.findViewById(R.id.titulo);
        TextView subtitulo = (TextView)item.findViewById(R.id.subtitulo);
        ImageView imagen = (ImageView)item.findViewById(R.id.imagen);

        //Asigna los valores a sus elementos
        titulo.setText(getItem(position).getCultura());
        subtitulo.setText(getItem(position).getTemplo());
        imagen.setImageResource(getItem(position).getImagen());

        return item;
    }
}
