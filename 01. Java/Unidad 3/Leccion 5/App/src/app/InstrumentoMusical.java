/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public abstract class InstrumentoMusical
{
    public void detener()
    {
        JOptionPane.showMessageDialog(null, "Deteniendo...");
    }
    
    public abstract void tocar();
}