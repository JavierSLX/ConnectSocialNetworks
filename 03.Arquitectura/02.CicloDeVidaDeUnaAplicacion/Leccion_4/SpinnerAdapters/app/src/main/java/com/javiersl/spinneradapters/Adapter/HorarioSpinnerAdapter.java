package com.javiersl.spinneradapters.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.javiersl.spinneradapters.R;
import com.javiersl.spinneradapters.modelo.DiaHorario;

import java.util.List;

/**
 * Created by JavierSL on 22/08/2017.
 */
public class HorarioSpinnerAdapter extends ArrayAdapter<DiaHorario>
{
    public HorarioSpinnerAdapter(Context context, List<DiaHorario> objects)
    {
        super(context, R.layout.spinner_template, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        //Infla el layout
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = convertView;
        if (convertView == null)
            item = inflater.inflate(R.layout.spinner_template, null);

        //Se cargan los elementos del layout
        TextView titulo = (TextView)item.findViewById(R.id.titulo);
        TextView subtitulo = (TextView)item.findViewById(R.id.subtitulo);

        //Se asigna los valores a los TextView
        titulo.setText(getItem(position).getAsignatura());
        subtitulo.setText(getItem(position).getDia());

        return item;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent)
    {
        //Infla el layout
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = convertView;
        if (convertView == null)
            item = inflater.inflate(R.layout.spinner_template, null);

        //Se cargan los elementos del layout
        TextView titulo = (TextView)item.findViewById(R.id.titulo);
        TextView subtitulo = (TextView)item.findViewById(R.id.subtitulo);

        //Se asignan los valores a los TextView
        titulo.setText(getItem(position).getAsignatura());
        subtitulo.setText(getItem(position).getDia());

        return item;
    }
}
