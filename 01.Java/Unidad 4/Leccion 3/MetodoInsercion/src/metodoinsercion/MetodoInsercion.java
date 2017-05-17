/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoinsercion;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class MetodoInsercion
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int arreglo[] = {11, 7, 9, 12, 1, 4, 98, 6, 3};
       
        insercion(arreglo);
        JOptionPane.showMessageDialog(null, Arrays.toString(arreglo));
    }
    
    private static void insercion(int[] arreglo)
    {
        for (int i = 1; i < arreglo.length; i++)
        {
            int aux = arreglo[i];
            int j = i-1;
            while (j >= 0 && aux < arreglo[j])
            {
                arreglo[j+1] = arreglo[j];
                j--;
            }
            
            arreglo[j+1] = aux;
        }
    }
}
