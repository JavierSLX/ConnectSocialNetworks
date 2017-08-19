package com.javiersl.listviewadapters.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.javiersl.listviewadapters.R;
import com.javiersl.listviewadapters.modelo.DiaHorario;

import java.util.List;

/**
 * Created by JavierSL on 31/05/2017.
 */
public class DiaHorarioAdapter extends ArrayAdapter<DiaHorario>
{
    public DiaHorarioAdapter(Context context, List<DiaHorario> objetos)
    {
        super(context, R.layout.list_template, objetos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.list_template, null);

        TextView titulo = (TextView)item.findViewById(R.id.titulo);
        TextView subtitulo = (TextView)item.findViewById(R.id.subtitulo);

        titulo.setText(getItem(position).getAsignatura());
        subtitulo.setText(getItem(position).getDia());

        return item;
    }
}
