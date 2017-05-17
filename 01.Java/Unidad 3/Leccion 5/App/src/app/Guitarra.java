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
public class Guitarra extends InstrumentoMusical implements InstrumentoAfinable
{
    @Override
    public void afinar()
    {
        JOptionPane.showMessageDialog(null, "Afinando...");
    }

    @Override
    public void tocar()
    {
        JOptionPane.showMessageDialog(null, "Tocando Guitarra"); //To change body of generated methods, choose Tools | Templates.
    }
}
