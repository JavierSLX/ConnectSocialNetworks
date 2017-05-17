/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarreglo;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class EjemploArreglo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] arreglo = new int[3];
        int arreglo2[] = {2, 4, 6};
        
        for (int i = 0; i < arreglo2.length; i++)
            JOptionPane.showMessageDialog(null, "El arreglo2[" + i + "] = " + arreglo2[i]);
        
        for (int i = 0; i < arreglo.length; i++)
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento " + i));
        
        for (int i = 0; i < arreglo.length; i++)
            JOptionPane.showMessageDialog(null, "El arreglo[" + i + "] = " + arreglo[i]);
    }
    
}
