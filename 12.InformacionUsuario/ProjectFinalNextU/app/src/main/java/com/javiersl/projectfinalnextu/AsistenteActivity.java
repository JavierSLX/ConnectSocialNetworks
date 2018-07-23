package com.javiersl.projectfinalnextu;

import android.Manifest;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.LocationServices;
import com.javiersl.projectfinalnextu.fragments.AsistenteFragment;
import com.javiersl.projectfinalnextu.geofence.GeofenceTransitionService;
import com.javiersl.projectfinalnextu.herramientas.Constants;
import com.javiersl.projectfinalnextu.entidades.SimpleGeofence;

import java.util.ArrayList;
import java.util.List;

public class AsistenteActivity extends AppCompatActivity implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, Constants
{
    private SimpleGeofence androidGeofence;
    private List<Geofence> geofences;
    private PendingIntent geofenceRequestIntent;
    private GoogleApiClient googleApiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistente);

        String usuario = getIntent().getStringExtra(LoginActivity.USUARIO);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.contenedor, AsistenteFragment.getInstance(usuario))
                .addToBackStack(null)
                .commit();

        //Checa si los servicios están disponibles
        if(!disponiblesGooglePlayServices())
        {
            Toast.makeText(this, "Servicios de Google Play no disponibles", Toast.LENGTH_SHORT).show();
            finish();
            return;
        }

        googleApiClient = new GoogleApiClient.Builder(this)
                .addApi(LocationServices.API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build();

        googleApiClient.connect();
        geofences = new ArrayList<>();
        crearGeofences();
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        setTitle("Asistente de Seguridad");
    }

    private void crearGeofences()
    {
        androidGeofence = new SimpleGeofence(ANDROID_ID, ANDROID_LATITUDE, ANDROID_LONGITUDE, ANDROID_RADIUS_METERS, GEOFENCE_EXPIRATION_TIME,
                Geofence.GEOFENCE_TRANSITION_ENTER | Geofence.GEOFENCE_TRANSITION_EXIT | Geofence.GEOFENCE_TRANSITION_DWELL, ANDROID_LOITERING_DELAY);

        geofences.add(androidGeofence.toGeofence());
    }

    private boolean disponiblesGooglePlayServices()
    {
        int result = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);

        if(ConnectionResult.SUCCESS == result)
        {
            Toast.makeText(this, "Servicios de Google Play disponibles", Toast.LENGTH_SHORT).show();
            return true;
        }
        else
            return false;

    }

    //Cuando el cliente se conecta
    @Override
    public void onConnected(@Nullable Bundle bundle)
    {
        int localizacion = ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
        if(localizacion == PackageManager.PERMISSION_DENIED)
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);

        geofenceRequestIntent = getGeofenceRequestIntent();
        LocationServices.GeofencingApi.addGeofences(googleApiClient, geofences, geofenceRequestIntent);

        Toast.makeText(this, "Iniciando servicio de Geofence", Toast.LENGTH_SHORT).show();
    }

    private PendingIntent getGeofenceRequestIntent()
    {
        Intent intent = new Intent(this, GeofenceTransitionService.class);
        return PendingIntent.getService(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    @Override
    public void onConnectionSuspended(int i)
    {
        Toast.makeText(this, "Servicio suspendido", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult)
    {
        if(connectionResult.hasResolution())
        {
            try
            {
                connectionResult.startResolutionForResult(this, CONNECTION_FAILURE_RESOLUTION_REQUEST);
            }catch (IntentSender.SendIntentException e)
            {
                Toast.makeText(this, "Error ejecutando Google Play Services", Toast.LENGTH_SHORT).show();
            }
        }
        else
            Toast.makeText(this, "Ocurrio un error", Toast.LENGTH_SHORT).show();
    }
}
