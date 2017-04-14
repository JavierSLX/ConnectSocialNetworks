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
public class Triangulo extends Figura
{
    private double base;
    private double altura;
    
    public Triangulo()
    {
        this.base = 2;
        this.altura = 4;
    }
    
    public void area()
    {
        JOptionPane.showMessageDialog(null, "El área de un triángulo es " + (base*altura)/2);
    }
}
