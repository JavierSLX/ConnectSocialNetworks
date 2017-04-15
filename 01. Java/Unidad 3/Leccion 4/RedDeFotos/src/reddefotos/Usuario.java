/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddefotos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Usuario
{
    private String nombre;
    private String nick;
    private List<Mural> murales;

    public Usuario(String nombre, String nick)
    {
        this.nombre = nombre;
        this.nick = nick;
        this.murales = new ArrayList<>();
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNick()
    {
        return nick;
    }

    public void setNick(String nick)
    {
        this.nick = nick;
    }

    public List<Mural> getMurales()
    {
        return murales;
    }

    public void setMurales(List<Mural> murales)
    {
        this.murales = murales;
    }
    
    public void seguirUsuario(Mural mural)
    {
        this.murales.add(mural);
        JOptionPane.showMessageDialog(null, "Has seguido el mural del usuario " + mural.getUsuario().getNombre());
    }
    
    public void verMuralesSeguidos()
    {
        String info = "";
        for (int i = 0; i < this.murales.size(); i++)
        {
            info += String.format("Mural: %d\nUsuario: %s\n", (i + 1), murales.get(i).getUsuario().getNombre());
        }
        
        JOptionPane.showMessageDialog(null, info);
    }
}
