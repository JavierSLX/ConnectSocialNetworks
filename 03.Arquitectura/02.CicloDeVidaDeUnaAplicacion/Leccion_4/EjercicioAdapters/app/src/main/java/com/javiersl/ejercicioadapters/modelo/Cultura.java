package com.javiersl.ejercicioadapters.modelo;

/**
 * Created by JavierSL on 23/08/2017.
 */
public class Cultura
{
    private String cultura;
    private String templo;

    public Cultura(String cultura, String templo)
    {
        this.cultura = cultura;
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

    public String getTemplo()
    {
        return templo;
    }

    public void setTemplo(String templo)
    {
        this.templo = templo;
    }
}
