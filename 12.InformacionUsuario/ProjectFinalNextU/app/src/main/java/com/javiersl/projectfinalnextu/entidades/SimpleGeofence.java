package com.javiersl.projectfinalnextu.entidades;

import com.google.android.gms.location.Geofence;

/**
 * Created by JavierSL on 22/07/2018.
 */

public class SimpleGeofence
{
    private final String id;
    private final double latitude;
    private final double longitud;
    private final float radius;
    private long expirationDuration;
    private int transitionType;
    private int loitering;

    public SimpleGeofence(String id, double latitude, double longitud, float radius, long expirationDuration, int transitionType, int loitering)
    {
        this.id = id;
        this.latitude = latitude;
        this.longitud = longitud;
        this.radius = radius;
        this.expirationDuration = expirationDuration;
        this.transitionType = transitionType;
        this.loitering = loitering;
    }

    public String getId()
    {
        return id;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitud()
    {
        return longitud;
    }

    public float getRadius()
    {
        return radius;
    }

    public long getExpirationDuration()
    {
        return expirationDuration;
    }

    public void setExpirationDuration(long expirationDuration)
    {
        this.expirationDuration = expirationDuration;
    }

    public int getTransitionType()
    {
        return transitionType;
    }

    public void setTransitionType(int transitionType)
    {
        this.transitionType = transitionType;
    }

    public int getLoitering()
    {
        return loitering;
    }

    public void setLoitering(int loitering)
    {
        this.loitering = loitering;
    }

    public Geofence toGeofence()
    {
        return new Geofence.Builder()
                .setRequestId(getId())
                .setTransitionTypes(getTransitionType())
                .setCircularRegion(getLatitude(), getLongitud(), getRadius())
                .setExpirationDuration(getExpirationDuration())
                .setLoiteringDelay(getLoitering())
                .build();
    }
}
