package com.javiersl.ejercicio1.modelo;

/**
 * Created by JavierSL on 04/06/2017.
 */
public class Alarma
{
    private String hora;
    private boolean activo;

    public Alarma(boolean activo, String hora)
    {
        this.activo = activo;
        this.hora = hora;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
