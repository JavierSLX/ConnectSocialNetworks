package com.javiersl.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText pass;
    private static final String EMAIL_STATE = "estado_email";
    private static final String PASS_STATE = "estado_pass";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText)findViewById(R.id.email);
        pass = (EditText)findViewById(R.id.password);
    }

    public void onClickLogin(View view)
    {
        TextView salida = (TextView)findViewById(R.id.salida);
        salida.setText("¡Login correcto!");
    }

    //Guarda el estado de la información en caso de que la aplicación pase por el estado Stopped
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("estado_email", email.getText().toString());
        outState.putString("estado_pass", pass.getText().toString());
    }

    //Recupera la información por si se paso por el estado Stopped
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        email.setText(savedInstanceState.getString("estado_email"));
        pass.setText(savedInstanceState.getString("estado_pass"));
    }
}
