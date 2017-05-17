/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseleccion;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class EjercicioSeleccion
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] arreglo;
        int n = 0;
        
        try
        {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque el valor de N"));
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Valor erroneo");
        }
        
        arreglo = new int[n];
        for (int i = 0; i < arreglo.length; i++)
            arreglo[i] = numeroRandom(100);
        
        JOptionPane.showMessageDialog(null, Arrays.toString(arreglo));
        seleccion(arreglo);
        JOptionPane.showMessageDialog(null, Arrays.toString(arreglo));
    }
    
    private static int numeroRandom(int limite)
    {
        return (int) (Math.random() * limite);
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
