package com.javiersl.ejercicio1_2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.javiersl.ejercicio1_2.R;
import com.javiersl.ejercicio1_2.modelo.Serie;

import java.util.List;

/**
 * Created by JavierSL on 04/06/2017.
 */
public class SerieAdapter extends ArrayAdapter<Serie>
{

    public SerieAdapter(Context context, List<Serie> objects)
    {
        super(context, R.layout.lista_template, objects);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {
        //Crea un objeto para poder inflarse el layout
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lista_template, null);

        //Define los objetos que se encuentran en el layout
        TextView articulo = (TextView)item.findViewById(R.id.articulo);
        final TextView activo = (TextView)item.findViewById(R.id.activo);
        Switch btSwitch = (Switch)item.findViewById(R.id.btActivar);

        //Se asigna los valores del Adapter
        articulo.setText(getItem(position).getArticulo());
        if (getItem(position).isActivo())
            activo.setText("Activo");
        else
            activo.setText("Inactivo");

        //Se crea el evento del Switch
        btSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked)
                    activo.setText("Activo");
                else
                    activo.setText("Inactivo");
                getItem(position).setActivo(isChecked);
            }
        });

        return item;
    }
}
