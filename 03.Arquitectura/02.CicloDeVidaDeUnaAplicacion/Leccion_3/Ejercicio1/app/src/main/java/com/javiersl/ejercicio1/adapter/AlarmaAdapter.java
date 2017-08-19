package com.javiersl.ejercicio1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.javiersl.ejercicio1.R;
import com.javiersl.ejercicio1.modelo.Alarma;

import java.util.List;

/**
 * Created by JavierSL on 04/06/2017.
 */
public class AlarmaAdapter extends ArrayAdapter<Alarma>
{
    public AlarmaAdapter(Context context, List<Alarma> objetos)
    {
        //Coloca en el constructor el contexto, el template del adapter y las lista de objetos
        super(context, R.layout.alarma_template, objetos);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        //Crea un objeto para inflar el layout
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.alarma_template, null);

        //Definición de objetos en la interfaz gráfica
        TextView hora = (TextView)item.findViewById(R.id.hora);
        final TextView activo = (TextView)item.findViewById(R.id.activo);
        Switch btActivo = (Switch)item.findViewById(R.id.btnActivo);

        //Se asigna los valores
        hora.setText(getItem(position).getHora());
        if(getItem(position).isActivo())
            activo.setText("Activo");
        else
            activo.setText("Inactivo");

        //Se crea el evento del botón de Switch
        btActivo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
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
