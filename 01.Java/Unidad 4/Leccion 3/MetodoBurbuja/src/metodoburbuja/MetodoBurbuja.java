/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoburbuja;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class MetodoBurbuja
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int arreglo[] = {11, 7, 9, 12, 1, 4, 98, 6, 3};
        
        burbuja(arreglo);
        JOptionPane.showMessageDialog(null, Arrays.toString(arreglo));
    }
    
    private static void burbuja(int[] arreglo)
    {
        for (int i = 1; i < arreglo.length; i++)
            for (int j = 0; j < arreglo.length-i; j++)
                if (arreglo[j] > arreglo[j+1])
                {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
    }
}
