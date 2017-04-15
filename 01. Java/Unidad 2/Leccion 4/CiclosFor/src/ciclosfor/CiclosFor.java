/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosfor;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class CiclosFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ciclos = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Ingresa el número de iteraciones"));
        
        for (int i = 0; i < ciclos; i++)
            JOptionPane.showMessageDialog(null, 
                    "Esta es la iteración número " + i);
    }
    
}
