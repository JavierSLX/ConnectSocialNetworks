/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuexcepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class MenuExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            int opcion;
            
            do
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Menú\n1. Opción 1.\n2. Opción 2\n3. Opcion 3\n0. Salir"));
                
                switch(opcion)
                {
                    case 0: break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Elegiste la opción 1");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Elegiste la opción 2");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Elegiste la opción 3");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no registrada");
                }
                
            }while(opcion != 0);
            
        } 
        catch (NullPointerException npe)
        {
            JOptionPane.showMessageDialog(null, "Error al ingresar los datos");
        } 
        catch (NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null, "El dato no es numérico");
        }
    }
    
}
