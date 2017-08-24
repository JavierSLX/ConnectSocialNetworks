package com.javiersl.ejercicioadapters.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.javiersl.ejercicioadapters.R;
import com.javiersl.ejercicioadapters.modelo.Hora;

import java.util.List;

/**
 * Created by JavierSL on 19/08/2017.
 */
public class HoraAdapter extends ArrayAdapter<Hora>
{

    public HoraAdapter(Context context, List<Hora> objects)
    {
        super(context, R.layout.list_template, objects);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {
        //Infla el layout para mostrar los demás elementos
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = convertView;

        //Asigna un elemento en caso de estar vacío
        if (convertView == null)
        {
            item = inflater.inflate(R.layout.list_template, null);
        }

        //Relaciona los view con cada objeto
        TextView hora = (TextView)item.findViewById(R.id.hora);
        final TextView estado = (TextView)item.findViewById(R.id.estado);
        Switch boton = (Switch)item.findViewById(R.id.boton);

        //Asigna los valores
        hora.setText(getItem(position).getHora());
        if(getItem(position).isEstado())
            estado.setText("Activado");
        else
            estado.setText("Desactivado");

        //Evento del Switch
        boton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                //Depende del estado del botón cambia el estado
                if(isChecked)
                {
                    estado.setText("Activado");
                    getItem(position).setEstado(isChecked);
                }
                else
                {
                    estado.setText("Desactivado");
                    getItem(position).setEstado(isChecked);
                }
            }
        });

        return item;
    }
}
