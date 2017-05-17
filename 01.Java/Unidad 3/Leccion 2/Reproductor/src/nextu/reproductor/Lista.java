/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextu.reproductor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Lista
{
    private List<Cancion> lista;
    private String nombre;
    
    public Lista()
    {
        lista = new ArrayList<>();
    }
    
    public Lista(String nombre, List<Cancion> lista)
    {
        this.nombre = nombre;
        this.lista = lista;
    }

    public List<Cancion> getLista()
    {
        return lista;
    }

    public void setLista(List<Cancion> lista)
    {
        this.lista = lista;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void ponerCancionALista(Cancion cancion)
    {
        this.lista.add(cancion);
    }
    
    public void mostrarLista()
    {
        for (int i = 0; i < this.lista.size(); i++)
        {
            JOptionPane.showMessageDialog(null, "Cancion " + (i + 1) + ": " + this.lista.get(i).getNombre());
        }
    }
}
