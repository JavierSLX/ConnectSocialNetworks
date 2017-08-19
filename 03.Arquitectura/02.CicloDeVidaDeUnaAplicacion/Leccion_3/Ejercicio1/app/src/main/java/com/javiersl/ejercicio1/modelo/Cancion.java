package com.javiersl.ejercicio1.modelo;

/**
 * Created by JavierSL on 04/06/2017.
 */
public class Cancion
{
    private String cancion;
    private String artista;

    public Cancion(String artista, String cancion)
    {
        this.artista = artista;
        this.cancion = cancion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }
}
