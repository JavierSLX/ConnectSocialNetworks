/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchmenu;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class SwitchMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Menú de opciones\n1. Opción 1\n2. Opción 2\n3. Opción 3"));
        
        switch(opcion)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "Seleccionaste la opción 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Seleccionaste la opción 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Seleccionaste la opción 3");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no registrada");
        }
    }
    
}
