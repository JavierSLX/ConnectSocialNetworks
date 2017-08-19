package com.javiersl.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.javiersl.ejercicio1.adapter.AlarmaAdapter;
import com.javiersl.ejercicio1.modelo.Alarma;

import java.util.ArrayList;

public class AlarmaActivity extends AppCompatActivity {

    private ListView listaAlarma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarma);

        AlarmaAdapter adapter = new AlarmaAdapter(this, listar());
        listaAlarma = (ListView)findViewById(R.id.listaAlarma);
        listaAlarma.setAdapter(adapter);
    }

    private ArrayList<Alarma> listar()
    {
        //Crea una lista de cadena de alarmas a partir del recurso String
        String[] alarmas = getResources().getStringArray(R.array.alarmas);
        ArrayList<Alarma> lista = new ArrayList<>();

        for (String alarma: alarmas)
        {
            lista.add(new Alarma(false, alarma));
        }

        return lista;
    }
}
