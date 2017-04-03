/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuestudiante;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class MenuEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el 1er numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el 2do número"));
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU\n"
                + "1. Número mayor\n2. Sumar dos números\n3. Restar dos números"));
        
        String cadena;
        switch(opcion)
        {
            case 1:
                if (numero1 > numero2)
                    JOptionPane.showMessageDialog(null, "El número " + numero1 
                    + " es mayor que " + numero2);
                else if (numero2 > numero1)
                    JOptionPane.showMessageDialog(null, "El número " + numero2
                    + " es mayor que " + numero1);
                else
                    JOptionPane.showMessageDialog(null, "Los números son iguales");
                break;
            case 2:
                cadena = "El resultado de " + numero1 + " + " + numero2 
                        + " = " + Integer.toString(numero1+numero2);
                JOptionPane.showMessageDialog(null, cadena);
                break;
            case 3:
                cadena = "El resultado de " + numero1 + " - " + numero2 
                        + " = " + Integer.toString(numero1-numero2);
                JOptionPane.showMessageDialog(null, cadena);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no registrada");
        }
    }
    
}
