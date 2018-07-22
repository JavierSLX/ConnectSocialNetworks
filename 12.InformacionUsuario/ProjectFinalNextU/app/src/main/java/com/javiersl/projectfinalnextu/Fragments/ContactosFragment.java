package com.javiersl.projectfinalnextu.Fragments;

import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.javiersl.projectfinalnextu.Adapters.ContactoAdapter;
import com.javiersl.projectfinalnextu.Entidades.Contacto;
import com.javiersl.projectfinalnextu.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JavierSL on 22/07/2018.
 */

public class ContactosFragment extends Fragment
{
    private ListView listView;
    private List<Contacto> lista;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_contactos, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        listView = (ListView)view.findViewById(R.id.listView);
        FloatingActionButton btGuardar = (FloatingActionButton)view.findViewById(R.id.btGuardar);
        lista = new ArrayList<>();

        //Ejecuta el hilo en segundo plano
        LecturaContactos lecturaContactos = new LecturaContactos();
        lecturaContactos.execute();

        btGuardar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getContext(), "¡Datos guardados!", Toast.LENGTH_SHORT).show();
                FragmentManager fragmentManager = ((AppCompatActivity)getContext()).getSupportFragmentManager();

                if(fragmentManager.getBackStackEntryCount() > 0)
                    fragmentManager.popBackStack();
            }
        });
    }

    //Clase que se ejecuta en segundo plano para la lectura de los contactos
    private class LecturaContactos extends AsyncTask<Void, Integer, Void>
    {
        private ProgressDialog progressDialog;

        @Override
        protected void onPreExecute()
        {
            super.onPreExecute();
            progressDialog = new ProgressDialog(getContext());
            progressDialog.setMessage("Leyendo");
            progressDialog.setCancelable(false);
            progressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params)
        {
            //La URI de los contactos
            Uri CONTENT_URI = ContactsContract.Contacts.CONTENT_URI;

            //Define los nombres de las columnas
            String ID = ContactsContract.Contacts._ID;
            String DISPLAY_NAME = ContactsContract.Contacts.DISPLAY_NAME;
            String HAS_PHONE_NUMBER = ContactsContract.Contacts.HAS_PHONE_NUMBER;

            Uri PHONE_CONTENT_URI = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
            String PHONE_CONTACT_ID = ContactsContract.CommonDataKinds.Phone.CONTACT_ID;
            String NUMBER = ContactsContract.CommonDataKinds.Phone.NUMBER;

            Cursor cursor = getContext().getContentResolver().query(CONTENT_URI, null, null, null, null);

            if(cursor.getCount() > 0)
            {
                int contador = 0;
                while (cursor.moveToNext())
                {
                    //Actualiza el mensaje del ProgressDialog
                    publishProgress(cursor.getCount(), ++contador);

                    String contacto_id = cursor.getString(cursor.getColumnIndex(ID));
                    String nombre = cursor.getString(cursor.getColumnIndex(DISPLAY_NAME));
                    int hasPhoneNumber = Integer.parseInt(cursor.getString(cursor.getColumnIndex(HAS_PHONE_NUMBER)));

                    String numero = null;
                    if(hasPhoneNumber > 0)
                    {
                        //Cursor para los numeros de telefono
                        Cursor phoneCursor = getContext().getContentResolver().query(PHONE_CONTENT_URI, null, PHONE_CONTACT_ID + " = ?", new String[]{contacto_id}, null);
                        while (phoneCursor.moveToNext())
                            numero = phoneCursor.getString(phoneCursor.getColumnIndex(NUMBER));

                        phoneCursor.close();
                    }

                    lista.add(new Contacto(nombre, numero));
                }
            }

            cursor.close();
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values)
        {
            super.onProgressUpdate(values);

            progressDialog.setMessage("Leyendo: " + values[1] + "/" + values[0]);
        }

        @Override
        protected void onPostExecute(Void aVoid)
        {
            super.onPostExecute(aVoid);

            progressDialog.dismiss();
            ContactoAdapter adapter = new ContactoAdapter(lista);
            listView.setAdapter(adapter);
        }
    }
}
