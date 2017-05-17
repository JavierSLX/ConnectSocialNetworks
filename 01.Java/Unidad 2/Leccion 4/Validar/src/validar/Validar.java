/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validar;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Validar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor;
        
        do
        {
            valor = JOptionPane.showInputDialog(null, "Ingrese un número");
        }while(!esNumero(valor));
        
        JOptionPane.showMessageDialog(null, "Su número es " + valor);
    }
    
    public static boolean esNumero (String cadena)
    {
        try
        {
            double d = Double.parseDouble(cadena);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        
        return true;
    }
    
}
