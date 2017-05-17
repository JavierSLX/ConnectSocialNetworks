/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementanumero;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class IncrementaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Ingrese el 1er número"));
        
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "Ingrese el 2do número"));
        
        if (numero1 >= numero2)
            JOptionPane.showMessageDialog(null, 
                "No hay que proceso que realizar, el primer número es mayor o igual que el segundo");
        else
        {
            while(numero1 < numero2)
            {
                numero1++;
                JOptionPane.showMessageDialog(null, 
                    "Se incrementa el 1er número a " + numero1);
            }
            
            JOptionPane.showMessageDialog(null, "Numeros igualados");
        }
        
    }
    
}
