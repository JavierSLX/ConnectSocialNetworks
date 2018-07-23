package com.javiersl.projectfinalnextu.geofence;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.google.android.gms.location.LocationServices;
import com.javiersl.projectfinalnextu.herramientas.Constants;

import java.util.concurrent.TimeUnit;

/**
 * Created by JavierSL on 22/07/2018.
 */

public class GeofenceTransitionService extends IntentService implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, Constants
{
    private static final String TAG = GeofenceTransitionService.class.getSimpleName();
    private GoogleApiClient googleApiClient;

    public GeofenceTransitionService()
    {
        super(TAG);
    }

    @Override
    public void onCreate()
    {
        super.onCreate();

        googleApiClient = new GoogleApiClient.Builder(this)
                .addApi(LocationServices.API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build();
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent)
    {
        GeofencingEvent geofencingEvent = GeofencingEvent.fromIntent(intent);

        if(geofencingEvent.hasError())
            Toast.makeText(this, "Error conectando con Geofence", Toast.LENGTH_SHORT).show();
        else
        {
            int transitionType = geofencingEvent.getGeofenceTransition();

            switch (transitionType)
            {
                case Geofence.GEOFENCE_TRANSITION_ENTER:
                    googleApiClient.blockingConnect(CONNECTION_TIME_OUT_MS, TimeUnit.MILLISECONDS);

                    Toast.makeText(this, "Has entrado a una zona peligrosa", Toast.LENGTH_LONG).show();
                    googleApiClient.disconnect();
                    break;

                case Geofence.GEOFENCE_TRANSITION_EXIT:
                    googleApiClient.blockingConnect(CONNECTION_TIME_OUT_MS, TimeUnit.MILLISECONDS);

                    Toast.makeText(this, "Has salido de la zona peligrosa", Toast.LENGTH_LONG).show();
                    googleApiClient.disconnect();
                    break;

                case Geofence.GEOFENCE_TRANSITION_DWELL:
                    googleApiClient.blockingConnect(CONNECTION_TIME_OUT_MS, TimeUnit.MILLISECONDS);

                    Toast.makeText(this, "Has permanecido mucho en una zona peligrosa", Toast.LENGTH_LONG).show();
                    googleApiClient.disconnect();
                    break;
            }
        }
    }

    @Override
    public void onConnected(@Nullable Bundle bundle)
    {
        Log.i(TAG, "Conexion establecida");
    }

    @Override
    public void onConnectionSuspended(int i)
    {
        Log.i(TAG, "Conexion suspendida");
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult)
    {
        Log.i(TAG, "Error en la conexión");
    }
}
