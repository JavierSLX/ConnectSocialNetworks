/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class EjercicioMatriz
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int a = 0;
        int b = 0;
        
        try
        {
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque el numero de filas de las matrices"));
            b = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque el numero de columnas de las matrices"));
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "No se puede ingresar valores no enteras");
        }
        
        int[][] matrizA = new int[a][b];
        int[][] matrizB = new int[a][b];
        Matriz matriz = new Matriz();
        
        //Llena al azar
        matrizA = matriz.llenarAlAzar(a, b);
        matrizB = matriz.llenarAlAzar(a, b);
        
        //Muestra al usuario las matrices
        JOptionPane.showMessageDialog(null, matriz.imprimirMatriz(matrizA));
        JOptionPane.showMessageDialog(null, matriz.imprimirMatriz(matrizB));
        
        //Muestra la suma de las matrices al usuario
        JOptionPane.showMessageDialog(null, matriz.imprimirMatriz(matriz.sumarMatrices(matrizA, matrizB)));
    }
    
}
