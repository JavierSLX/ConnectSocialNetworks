package com.javiersl.projectfinalnextu.herramientas;

import com.google.android.gms.location.Geofence;

/**
 * Created by JavierSL on 22/07/2018.
 */

public interface Constants
{
    int CONNECTION_FAILURE_RESOLUTION_REQUEST = 9000;
    long CONNECTION_TIME_OUT_MS = 100;
    long GEOFENCE_EXPIRATION_TIME = Geofence.NEVER_EXPIRE;
    String ANDROID_ID = "1";
    double ANDROID_LATITUDE = 20.212677;
    double ANDROID_LONGITUDE = -100.875757;
    float ANDROID_RADIUS_METERS = 500f;
    int ANDROID_LOITERING_DELAY = 10000;
}
