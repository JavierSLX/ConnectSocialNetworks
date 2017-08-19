package com.javiersl.area;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculos extends AppCompatActivity {

    private TextView resultadoRectangulo;
    private TextView resultadoTriangulo;
    private double ancho;
    private double alto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculos);

        resultadoRectangulo = (TextView)findViewById(R.id.rectangulo);
        resultadoTriangulo = (TextView)findViewById(R.id.triangulo);

        ancho = getIntent().getDoubleExtra("n1", 0);
        alto = getIntent().getDoubleExtra("n2", 0);
    }

    public void areaRectangulo(View view)
    {
        resultadoRectangulo.setText("Área = " + (ancho * alto));
    }

    public void areaTriangulo(View view)
    {
        resultadoTriangulo.setText("Área = " + ((ancho * alto) / 2));
    }
}
