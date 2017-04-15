/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Cuadrado extends Figura
{
    private double lado;
    
    public Cuadrado()
    {
        this.lado = 3;
    }
    
    public void area()
    {
        JOptionPane.showMessageDialog(null, "El área de un cuadrado es " + (lado*lado));
    }
}
