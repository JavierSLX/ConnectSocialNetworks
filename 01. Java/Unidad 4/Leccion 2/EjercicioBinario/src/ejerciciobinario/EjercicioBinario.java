/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobinario;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class EjercicioBinario
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int arreglo[] = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        int cont = 1;
        int n;
        
        do
        {
            int num = valorAlAzar(50);
            n = busquedaBinaria(arreglo, num);
            if (n != -1)
                JOptionPane.showMessageDialog(null, "Se encontró un número primo (" + num + ") hasta el " + cont 
                    + " intento en la posición " + n);
            else
                cont++;
        }while(n == -1);
    }
    
    private static int valorAlAzar(int limite)
    {
        return (int) (Math.random() * limite);
    }
    
    private static int busquedaBinaria(int arreglo[], int elemento)
    {
        int centro;
        int inicial = 0;
        int termino = arreglo.length-1;
        
        while(inicial <= termino)
        {
            centro = (inicial + termino) / 2;
            if (arreglo[centro] == elemento)
                return centro;
            else if (arreglo[centro] > elemento)
                termino = centro - 1;
            else
                inicial = centro + 1;
        }
        
        return -1;
    }
}
