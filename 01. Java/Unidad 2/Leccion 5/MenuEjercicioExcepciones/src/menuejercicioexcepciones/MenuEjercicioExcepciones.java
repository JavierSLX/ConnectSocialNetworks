/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuejercicioexcepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class MenuEjercicioExcepciones
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try
        {
            int opcion;
            do
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Menú\n1. Suma.\n2. Resta\n0. Salir"));
                
                int numero1 = 0;
                int numero2 = 0;
                if (opcion >= 1 && opcion <= 2)
                {
                    numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Ingrese el primer número"));
                    
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Ingrese el segundo número"));
                }
                
                switch(opcion)
                {
                    case 0: break;
                    case 1:
                        JOptionPane.showMessageDialog(null, 
                            "La suma de los dos números es " + (numero1 + numero2));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, 
                            "La resta de los dos números es "+ (numero1 - numero2));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no registrada");
                }
            
            }while (opcion != 0);
        } 
        catch (NullPointerException npe)
        {
            JOptionPane.showMessageDialog(null, "Error, valor nulo");
        }
        catch (NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null, "Error, el dato no es un valor numérico");
        }
                
    }
    
}
