package com.javiersl.projectfinalnextu.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.javiersl.projectfinalnextu.LoginActivity;
import com.javiersl.projectfinalnextu.R;

/**
 * Created by JavierSL on 22/07/2018.
 */

public class AsistenteFragment extends Fragment
{
    private String usuario;

    public static AsistenteFragment getInstance(String usuario)
    {
        AsistenteFragment fragment = new AsistenteFragment();
        Bundle bundle = new Bundle();
        bundle.putString(LoginActivity.USUARIO, usuario);
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        if(getArguments() != null)
            usuario = getArguments().getString(LoginActivity.USUARIO);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_asistente, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        TextView txtUsuario = (TextView)view.findViewById(R.id.txtUsuario);
        FloatingActionButton btContactos = (FloatingActionButton)view.findViewById(R.id.btContactos);

        txtUsuario.setText(usuario);

        btContactos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ((AppCompatActivity)getContext()).getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenedor, new ContactosFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
