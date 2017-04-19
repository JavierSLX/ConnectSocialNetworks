/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoseleccion;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class MetodoSeleccion
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int arreglo[] = {11, 7, 9, 12, 1, 4, 98, 6, 3};
        seleccion(arreglo);
       
        JOptionPane.showMessageDialog(null, Arrays.toString(arreglo));
    }
    
    private static void seleccion(int[] arreglo)
    {
        for (int i = 0; i < arreglo.length; i++)
        {
            int minimo = i;
            
            for (int j = i+1; j < arreglo.length; j++)
                if (arreglo[j] < arreglo[minimo])
                    minimo = j;
            
            if (i != minimo)
            {
                int aux = arreglo[i];
                arreglo[i] = arreglo[minimo];
                arreglo[minimo] = aux;
            }
        }
    }
}
