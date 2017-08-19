package com.javiersl.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.javiersl.ejercicio1.adapter.CancionAdapter;
import com.javiersl.ejercicio1.modelo.Cancion;

import java.util.ArrayList;

public class Reproductor extends AppCompatActivity {

    private ListView listaCanciones;
    private CancionAdapter adapter;
    private Button btnAgregar;
    private EditText edtCancion, edtArtista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);
        createList();
        agregarCancion();
    }

    private ArrayList<Cancion> listar()
    {
        ArrayList<Cancion> lista = new ArrayList<>();
        lista.add(new Cancion("Artista 1", "Canción 1"));
        lista.add(new Cancion("Artista 2", "Canción 2"));

        return lista;
    }

    private void createList()
    {
        adapter = new CancionAdapter(this, listar());
        listaCanciones = (ListView)findViewById(R.id.lista);
        listaCanciones.setAdapter(adapter);
        listaCanciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView txtReproduccion = (TextView) findViewById(R.id.mensaje);
                txtReproduccion.setText("Reproduciendo: " + adapter.getLista().get(position).getCancion());
            }
        });
    }

    private void agregarCancion()
    {
        btnAgregar = (Button)findViewById(R.id.btAgregar);
        edtArtista = (EditText)findViewById(R.id.artista);
        edtCancion = (EditText)findViewById(R.id.cancion);

        btnAgregar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(edtCancion.getText().toString().equals("") || edtArtista.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Complete las casillas de texto", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    adapter.getLista().add(new Cancion(edtArtista.getText().toString(), edtCancion.getText().toString()));
                    adapter.notifyDataSetChanged();
                    edtArtista.setText("");
                    edtCancion.setText("");
                }
            }
        });
    }
}
