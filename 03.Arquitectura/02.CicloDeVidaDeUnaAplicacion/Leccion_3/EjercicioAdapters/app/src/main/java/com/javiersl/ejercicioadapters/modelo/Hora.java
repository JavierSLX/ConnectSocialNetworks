package com.javiersl.ejercicioadapters.modelo;

/**
 * Created by JavierSL on 19/08/2017.
 */
public class Hora
{
    private String hora;
    private boolean estado;

    public Hora(boolean estado, String hora)
    {
        this.estado = estado;
        this.hora = hora;
    }

    public boolean isEstado()
    {
        return estado;
    }

    public void setEstado(boolean estado)
    {
        this.estado = estado;
    }

    public String getHora()
    {
        return hora;
    }

    public void setHora(String hora)
    {
        this.hora = hora;
    }
}
