package com.javiersl.spinneradapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.javiersl.spinneradapters.Adapter.HorarioSpinnerAdapter;
import com.javiersl.spinneradapters.modelo.DiaHorario;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private Spinner spinner;
    private TextView opcion;
    private ArrayList<DiaHorario> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relaciona los elementos a su view
        spinner = (Spinner)findViewById(R.id.spinner);
        opcion = (TextView)findViewById(R.id.opcion);
        String[] asignatura = getResources().getStringArray(R.array.horario_de_clases);
        String[] dia = getResources().getStringArray(R.array.dias_semana);
        lista = new ArrayList<>();

        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.dias_semana, android.R.layout.simple_spinner_item);

        //Para ver las opciones sin abrir el elemento
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        for (int i = 0; i < asignatura.length; i++)
            lista.add(new DiaHorario(asignatura[i], dia[i]));

        final HorarioSpinnerAdapter adapter = new HorarioSpinnerAdapter(this, lista);
        spinner.setAdapter(adapter);

        //Evento cuando un elemento es seleccionado/no seleccionado del spinner
       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
           {
               opcion.setText("Asignatura: " + adapter.getItem(position).getAsignatura());
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent)
           {
                opcion.setText("Asignatura: ");
           }
       });
    }
}
