/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextu.reproductor;

/**
 *
 * @author JavierSLX
 */
public class Cancion
{
    private String nombre;
    private String artista;
    int duracion;
    
    public Cancion()
    {
        
    }
    
    public Cancion(String nombre, String artista, int duracion)
    {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getArtista()
    {
        return artista;
    }

    public void setArtista(String artista)
    {
        this.artista = artista;
    }

    public int getDuracion()
    {
        return duracion;
    }

    public void setDuracion(int duracion)
    {
        this.duracion = duracion;
    }
}
