/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterativasdowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class IterativasDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Menú de Opciones\n1. Opción 1\n2. Opción 2\n3. Opción 3\n0. Salir"));
            
            switch(opcion)
            {
                case 1:
                    JOptionPane.showMessageDialog(null, "Elegiste la opción 1");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Elegiste la opción 2");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Elegiste la opción 3");
                    break;
            }
            
        }while(opcion != 0);
    }
    
}
