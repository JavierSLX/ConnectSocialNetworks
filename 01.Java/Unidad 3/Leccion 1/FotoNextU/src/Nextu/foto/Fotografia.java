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
public class Fotografia
{
    public Fotografia(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }
    
    private String etiqueta;

    public String getEtiqueta()
    {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }
    
    public void tomarFotografia()
    {
        setEtiqueta(JOptionPane.showInputDialog(null, "¡Se ha tomado una fotografía! Dele un nombre"));
    }
}
