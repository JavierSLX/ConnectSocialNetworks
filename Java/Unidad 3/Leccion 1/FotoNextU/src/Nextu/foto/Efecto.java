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
public class Efecto
{
    private Fotografia fotoEfecto;
    public Efecto(Fotografia foto)
    {
        this.fotoEfecto = foto;
    }

    public Fotografia getFotoEfecto()
    {
        return fotoEfecto;
    }

    public void setFotoEfecto(Fotografia fotoEfecto)
    {
        this.fotoEfecto = fotoEfecto;
    }
    
    public void aplicarEfecto()
    {
        JOptionPane.showMessageDialog(null, "Efecto aplicado a la fotografía " + fotoEfecto.getEtiqueta());
    }
}
