/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscador;

/**
 *
 * @author JavierSLX
 */
public class Elemento
{
    private String nombre;
    private String tipo;
    private String URL;

    public Elemento()
    {
        this.nombre = "Vacío";
        this.URL = "Vacío";
        this.tipo = "Vacío";
    }

    public Elemento(String nombre)
    {
        this.nombre = nombre;
        this.URL = "Vacío";
        this.tipo = "Vacío";
    }

    public Elemento(String nombre, String URL)
    {
        this.nombre = nombre;
        this.URL = URL;
        this.tipo = "Vacío";
    }

    public Elemento(String nombre, String tipo, String URL)
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.URL = URL;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getURL()
    {
        return URL;
    }

    public void setURL(String URL)
    {
        this.URL = URL;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
}
