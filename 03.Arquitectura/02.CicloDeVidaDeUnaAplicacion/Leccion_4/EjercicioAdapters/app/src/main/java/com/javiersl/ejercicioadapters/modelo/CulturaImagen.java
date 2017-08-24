package com.javiersl.ejercicioadapters.modelo;

/**
 * Created by JavierSL on 23/08/2017.
 */
public class CulturaImagen
{
    private String cultura;
    private String templo;
    private int imagen;

    public CulturaImagen(String cultura, int imagen, String templo)
    {
        this.cultura = cultura;
        this.imagen = imagen;
        this.templo = templo;
    }

    public String getCultura()
    {
        return cultura;
    }

    public void setCultura(String cultura)
    {
        this.cultura = cultura;
    }

    public int getImagen()
    {
        return imagen;
    }

    public void setImagen(int imagen)
    {
        this.imagen = imagen;
    }

    public String getTemplo()
    {
        return templo;
    }

    public void setTemplo(String templo)
    {
        this.templo = templo;
    }
}
