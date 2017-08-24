package com.javiersl.ejercicioadapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.javiersl.ejercicioadapters.adapter.CancionAdapter;
import com.javiersl.ejercicioadapters.modelo.Cancion;

import java.util.ArrayList;

public class Reproductor extends AppCompatActivity
{
    private EditText cancion, autor;
    private Button agregar;
    private ListView canciones;
    private TextView anuncio;
    private ArrayList<Cancion> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);

        //Instancia la lista de canciones
        lista = new ArrayList<>();

        //Relaciona cada objeto a su view
        cancion = (EditText)findViewById(R.id.cancion);
        autor = (EditText)findViewById(R.id.autor);
        agregar = (Button)findViewById(R.id.agregar);
        canciones = (ListView)findViewById(R.id.canciones);
        anuncio = (TextView)findViewById(R.id.anuncio);

        //Crea la listview a partir del adapter
        final CancionAdapter adapter = new CancionAdapter(this, lista);
        canciones.setAdapter(adapter);

        //Evento del botón agregar
        agregar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (cancion.getText().toString().length() == 0 || autor.getText().toString().length() == 0)
                    Toast.makeText(getApplicationContext(), "Complete las casillas de texto", Toast.LENGTH_SHORT).show();
                else
                {
                    lista.add(new Cancion(autor.getText().toString(), cancion.getText().toString()));
                    adapter.notifyDataSetChanged();
                    cancion.setText("");
                    autor.setText("");
                }
            }
        });

        //Evento cuando se presiona un elemento de la listview
        canciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                anuncio.setText("Reproduciendo: " + adapter.getCanciones().get(position).getCancion());
            }
        });
    }
}
