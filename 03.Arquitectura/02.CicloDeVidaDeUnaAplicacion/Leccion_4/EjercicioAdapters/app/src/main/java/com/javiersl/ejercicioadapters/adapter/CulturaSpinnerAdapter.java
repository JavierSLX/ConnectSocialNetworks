package com.javiersl.ejercicioadapters.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.javiersl.ejercicioadapters.R;
import com.javiersl.ejercicioadapters.modelo.Cultura;

import java.util.ArrayList;

/**
 * Created by JavierSL on 23/08/2017.
 */
public class CulturaSpinnerAdapter extends BaseAdapter
{
    private ArrayList<Cultura> lista;
    private Context context;

    public CulturaSpinnerAdapter(Context context, ArrayList<Cultura> lista)
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
    public Cultura getItem(int position)
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
        if(convertView == null)
            item = inflater.inflate(R.layout.spinner_template, null);

        //Relaciona cada elemento con su view
        TextView titulo = (TextView)item.findViewById(R.id.titulo);
        TextView subtitulo = (TextView)item.findViewById(R.id.subtitulo);

        //Coloca los valores de cada elemento
        titulo.setText(getItem(position).getCultura());
        subtitulo.setText(getItem(position).getTemplo());
        return item;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent)
    {
        //Infla el layout
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View item = convertView;
        if(convertView == null)
            item = inflater.inflate(R.layout.spinner_template, null);

        //Relaciona cada elemento con su view
        TextView titulo = (TextView)item.findViewById(R.id.titulo);
        TextView subtitulo = (TextView)item.findViewById(R.id.subtitulo);

        //Coloca los valores de cada elemento
        titulo.setText(getItem(position).getCultura());
        subtitulo.setText(getItem(position).getTemplo());
        return item;
    }
}
