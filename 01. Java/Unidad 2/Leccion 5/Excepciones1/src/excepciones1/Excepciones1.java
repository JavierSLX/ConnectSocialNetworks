/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones1;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Excepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try 
        {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al ingresar los datos");
        }
    }
    
}
