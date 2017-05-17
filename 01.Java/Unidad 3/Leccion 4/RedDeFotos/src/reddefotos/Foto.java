/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddefotos;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Foto
{
    private String nombre;
    private String url;

    public Foto(String url)
    {
        this.nombre = "SinNombre";
        this.url = url;
    }

    public Foto(String nombre, String url)
    {
        this.nombre = nombre;
        this.url = url;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }
    
    public void fotoAlAzar()
    {
        int indice = numeroAlAzar(2);
        setNombre(obtenerNombreAzar(indice));
        indice = numeroAlAzar(2);
        setUrl(obtenerURLAzar(indice));
        JOptionPane.showMessageDialog(null, "Foto generada al azar con nombre " + getNombre() + " y URL " +
            getUrl());
    }
    
    private int numeroAlAzar(int limite)
    {
        return (int) (Math.random() * limite);
    }
    
    private String obtenerNombreAzar(int indice)
    {
        String cadena = "Vacío";
        switch(indice)
        {
            case 0:
                cadena = "Playa";
                break;
            case 1:
                cadena = "Memoria";
                break;
            case 2:
                cadena = "Hotel";
                break;
        }
        
        return cadena;
    }
    
    private String obtenerURLAzar(int indice)
    {
        String cadena = "Vacío";
        switch(indice)
        {
            case 0:
                cadena = "mural_" + getNombre() + "01";
                break;
            case 1:
                cadena = "mural_" + getNombre() + "02";
                break;
            case 2:
                cadena = "mural_" + getNombre() + "03";
                break;
        }
        
        return cadena;
    }

    @Override
    public String toString()
    {
        return "Foto{" + "nombre=" + nombre + ", url=" + url + '}';
    }
}
