/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nextu.foto;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Album
{
    private String nombre;
    private Fotografia fotoAlbum;
    public Album(Fotografia foto, String name)
    {
        this.fotoAlbum = foto;
        this.nombre = name;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Fotografia getFotoAlbum()
    {
        return fotoAlbum;
    }

    public void setFotoAlbum(Fotografia fotoAlbum)
    {
        this.fotoAlbum = fotoAlbum;
    }
    
    public void grabarFoto()
    {
        JOptionPane.showMessageDialog(null, 
            "Foto " + fotoAlbum.getEtiqueta() + " guardada en el albúm " + getNombre());
    }
}
