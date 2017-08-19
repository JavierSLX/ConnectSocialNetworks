package com.javiersl.ejercicio1_2.modelo;

/**
 * Created by JavierSL on 04/06/2017.
 */
public class Serie
{
    private String articulo;
    private boolean activo;

    public Serie(boolean activo, String articulo)
    {
        this.activo = activo;
        this.articulo = articulo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
}
