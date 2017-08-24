package com.javiersl.gridviewadapters.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.javiersl.gridviewadapters.R;
import com.javiersl.gridviewadapters.modelo.Calendario;

import java.util.ArrayList;

/**
 * Created by JavierSL on 22/08/2017.
 */
public class CalendarioAdapter extends BaseAdapter
{
    private ArrayList<Calendario> elementos;
    private Context context;

    public CalendarioAdapter(Context context, ArrayList<Calendario> elementos)
    {
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public int getCount()
    {
        return elementos.size();
    }

    @Override
    public Calendario getItem(int position)
    {
        return elementos.get(position);
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
            item = inflater.inflate(R.layout.grid_template, null);

        //Relaciona cada elemento con su view
        TextView titulo = (TextView)item.findViewById(R.id.tituloImagen);
        ImageView imagen = (ImageView)item.findViewById(R.id.imagen);

        //Llena los elementos con sus datos
        titulo.setText(getItem(position).getMes());
        imagen.setImageResource(getItem(position).getImagen());
        return item;
    }
}
