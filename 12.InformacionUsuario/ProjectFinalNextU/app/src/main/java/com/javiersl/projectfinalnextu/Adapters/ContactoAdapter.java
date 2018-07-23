package com.javiersl.projectfinalnextu.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.javiersl.projectfinalnextu.entidades.Contacto;
import com.javiersl.projectfinalnextu.R;

import java.util.List;

/**
 * Created by JavierSL on 22/07/2018.
 */

public class ContactoAdapter extends BaseAdapter
{
    private List<Contacto> lista;
    private Context context;

    public ContactoAdapter(List<Contacto> lista)
    {
        this.lista = lista;
    }

    @Override
    public int getCount()
    {
        return lista.size();
    }

    @Override
    public Contacto getItem(int position)
    {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {
        context = parent.getContext();
        View view = convertView;
        if(convertView == null)
            view = LayoutInflater.from(context).inflate(R.layout.item_contacto, parent, false);

        TextView txtNombre = (TextView)view.findViewById(R.id.txtNombre);
        TextView txtNumero = (TextView)view.findViewById(R.id.txtNumero);
        CheckBox chkInforme = (CheckBox)view.findViewById(R.id.chkInforme);

        txtNombre.setText(getItem(position).getNombre());
        txtNumero.setText(getItem(position).getTelefono());
        chkInforme.setChecked(false);

        //Cuando se presiona sobre la caja de chequeo
        chkInforme.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked)
                    Toast.makeText(context, "Se notificará a " + getItem(position).getNombre() + " en caso de emergencia", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
