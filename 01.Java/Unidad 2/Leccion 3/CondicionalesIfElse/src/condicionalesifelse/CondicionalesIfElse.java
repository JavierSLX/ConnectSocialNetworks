/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesifelse;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class CondicionalesIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tu edad"));
        
        if (edad > 0 && edad < 18)
            JOptionPane.showMessageDialog(null, "Eres Joven");
        else if (edad >= 18 && edad < 60)
            JOptionPane.showMessageDialog(null, "Eres un Adulto");
        else
            JOptionPane.showMessageDialog(null, "Eres un Adulto Mayor");
    }
    
}
