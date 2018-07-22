package com.javiersl.projectfinalnextu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.javiersl.projectfinalnextu.Fragments.AsistenteFragment;

public class AsistenteActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistente);

        String usuario = getIntent().getStringExtra(LoginActivity.USUARIO);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.contenedor, AsistenteFragment.getInstance(usuario))
                .addToBackStack(null)
                .commit();
    }
}
