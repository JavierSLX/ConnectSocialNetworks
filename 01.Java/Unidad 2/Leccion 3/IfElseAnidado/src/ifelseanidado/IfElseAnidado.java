/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseanidado;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class IfElseAnidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque el número 1"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque el número 2"));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque el número 3"));
        
        if (a > b)
        {
            if (a > c)
                JOptionPane.showMessageDialog(null, "El número 1 (" + a + ") es el mayor");
            else
                JOptionPane.showMessageDialog(null, "El número 3 (" + c + ") es el mayor");
        }
        else if (b > a)
        {
            if (b > c)
                JOptionPane.showMessageDialog(null, "El número 2 (" + b + ") es el mayor");
            else
                JOptionPane.showMessageDialog(null, "El número 3 (" + c + ") es el mayor");
        }
                    
    }
    
}
