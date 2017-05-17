/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioinsercion;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class EjercicioInsercion
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
        insercion(arreglo);
        JOptionPane.showMessageDialog(null, Arrays.toString(arreglo));
    }
    
    private static int numeroRandom(int limite)
    {
        return (int) (Math.random() * limite);
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
