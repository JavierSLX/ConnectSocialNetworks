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
public class Figura
{
    private int x;
    private int y;
    
    public Figura()
    {
        this.x = 0;
        this.y = 0;
    }
    
    public void posicion()
    {
        JOptionPane.showMessageDialog(null, "x: " + x + " y: " + y);
    }
    
    public void area()
    {
        JOptionPane.showMessageDialog(null, "Area");
    }
}
