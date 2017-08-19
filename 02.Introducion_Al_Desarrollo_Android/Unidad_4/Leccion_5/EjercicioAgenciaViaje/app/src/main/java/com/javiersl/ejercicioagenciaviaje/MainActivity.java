package com.javiersl.ejercicioagenciaviaje;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.location.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LocationManager locationManager = null;
        LocationProvider locationProvider = null;
        LocationListener locationListener = null;
        locationManager.getAllProviders();
        locationProvider.requiresNetwork();
        locationListener.onProviderDisabled("Hola");
    }
}
