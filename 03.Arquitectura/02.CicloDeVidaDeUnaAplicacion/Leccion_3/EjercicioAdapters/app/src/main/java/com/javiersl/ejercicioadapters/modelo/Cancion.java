package com.javiersl.ejercicioadapters.modelo;

/**
 * Created by JavierSL on 20/08/2017.
 */
public class Cancion
{
    private String cancion;
    private String autor;

    public Cancion(String autor, String cancion)
    {
        this.autor = autor;
        this.cancion = cancion;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getCancion()
    {
        return cancion;
    }

    public void setCancion(String cancion)
    {
        this.cancion = cancion;
    }
}
