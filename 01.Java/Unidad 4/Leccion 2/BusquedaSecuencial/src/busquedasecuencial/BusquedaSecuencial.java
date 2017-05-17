/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasecuencial;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class BusquedaSecuencial
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int arreglo[] = {3, 7, 5, 4, 9, 2, 8, 1};
        
        int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento que quiere buscar"));
        
        int busqueda = busquedaSecuencial(arreglo, dato);
        if (busqueda != -1)
        {
            JOptionPane.showMessageDialog(null, "El elemento ha sido encontrado en la posición " + busqueda);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El dato no ha sido encontrado en el arreglo");
        }
    }
    
    private static int busquedaSecuencial(int arreglo[], int dato)
    {
        for (int i = 0; i < arreglo.length; i++)
            if (arreglo[i] == dato)
            {
                return i;
            }
        
        return -1;
    }
}
