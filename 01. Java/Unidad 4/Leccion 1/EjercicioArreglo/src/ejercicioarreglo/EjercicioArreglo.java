/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarreglo;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class EjercicioArreglo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int arreglo[] = {12, 69, 42, 35, 74, 56, 87, 5, 29, 14};
        JOptionPane.showMessageDialog(null, "El número mayor del arreglo es " + sacarMayor(arreglo));
        JOptionPane.showMessageDialog(null, "El número menor del arreglo es " + sacarMenor(arreglo));
    }
    
    private static int sacarMayor(int[] arreglo)
    {
        int mayor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++)
        {
            if (arreglo[i] > mayor)
                mayor = arreglo[i];
        }
        
        return mayor;
    }
    
    private static int sacarMenor(int[] arreglo)
    {
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++)
        {
            if (arreglo[i] < menor)
                menor = arreglo[i];
        }
        
        return menor;
    }
}
