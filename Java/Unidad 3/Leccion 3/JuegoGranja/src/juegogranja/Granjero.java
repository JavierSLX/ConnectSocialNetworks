/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegogranja;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Granjero extends Usuario
{
    private String nick;
    private double estatura;
    private String descripcion;

    public String getNick()
    {
        return nick;
    }

    public void setNick(String nick)
    {
        this.nick = nick;
    }

    public double getEstatura()
    {
        return estatura;
    }

    public void setEstatura(double estatura)
    {
        this.estatura = estatura;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
    
    public String toString()
    {
        return String.format("", getNick());
    }
    
    public void sembrar(Vegetal vegetal)
    {
        JOptionPane.showMessageDialog(null, "El jugador " + getNick() + " sembró " + vegetal.getTipo());
        vegetal.tiempoVida();
    }
    
    public void regar(Vegetal vegetal)
    {
        JOptionPane.showMessageDialog(null, "El jugador " + getNick() + " regó " + vegetal.getTipo());
        vegetal.riegos();
    }
    
    public void cosechar(Vegetal vegetal)
    {
        JOptionPane.showMessageDialog(null, "El jugador " + getNick() + " cosechó " + vegetal.getTipo());
    }
    
    public void criar(Animal animal)
    {
        JOptionPane.showMessageDialog(null, "El jugador " + getNick() + " cria " + animal.getTipo());
        animal.tiempoVivo();
    }
    
    public void alimentar(Animal animal)
    {
        JOptionPane.showMessageDialog(null, "El jugador " + getNick() + " alimenta " + animal.getTipo());
        animal.comer();
    }
}
