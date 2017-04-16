/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglobidimensional;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class ArregloBidimensional
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[][] arreglo = new int[2][3];
        
        for (int i = 0; i < arreglo.length; i++)
            for (int j = 0; j < arreglo[i].length; j++)
                arreglo[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque el elemento del arrego [" +
                    i + "][" + j + "]"));
        
         JOptionPane.showMessageDialog(null, imprimirArreglo(arreglo));
    }
    
    private static String imprimirArreglo(int arreglo[][])
    {
        String resultado = "";
        for (int i = 0; i < arreglo.length; i++)
            resultado += Arrays.toString(arreglo[i]) + "\n";
        return resultado;
    }
}
