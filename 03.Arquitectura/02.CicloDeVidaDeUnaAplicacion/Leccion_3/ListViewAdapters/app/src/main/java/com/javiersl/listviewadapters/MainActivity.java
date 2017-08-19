package com.javiersl.listviewadapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.javiersl.listviewadapters.adapter.DiaHorarioAdapter;
import com.javiersl.listviewadapters.modelo.DiaHorario;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView horario;
    private ArrayList<DiaHorario> lista;
    private TextView opcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] titulos = getResources().getStringArray(R.array.horario_de_clases);
        String[] subtitulos = getResources().getStringArray(R.array.dias_semanas);

        lista = new ArrayList<>();
        for (int i = 0; i < titulos.length; i++)
        {
            lista.add(new DiaHorario(titulos[i], subtitulos[i]));
        }

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, titulos);
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.dias_semanas, android.R.layout.simple_expandable_list_item_1);
        DiaHorarioAdapter adapter = new DiaHorarioAdapter(this, lista);
        opcion = (TextView) findViewById(R.id.opcion);

        horario = (ListView)findViewById(R.id.lista);
        horario.setAdapter(adapter);
        horario.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                opcion.setText("Opcion: " +titulos[position]);
            }
        });
    }
}
