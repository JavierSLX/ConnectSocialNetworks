package com.javiersl.gridviewadapters.modelo;

/**
 * Created by JavierSL on 22/08/2017.
 */
public class Calendario
{
    private String mes;
    private int imagen;

    public Calendario(int imagen, String mes)
    {
        this.imagen = imagen;
        this.mes = mes;
    }

    public int getImagen()
    {
        return imagen;
    }

    public void setImagen(int imagen)
    {
        this.imagen = imagen;
    }

    public String getMes()
    {
        return mes;
    }

    public void setMes(String mes)
    {
        this.mes = mes;
    }
}
