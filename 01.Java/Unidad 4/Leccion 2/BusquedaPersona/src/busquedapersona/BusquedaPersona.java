/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedapersona;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class BusquedaPersona
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona("3", "Hugo", 10));
        lista.add(new Persona("1", "Paco", 11));
        lista.add(new Persona("6", "Luis", 9));
        lista.add(new Persona("5", "McPato", 70));
        lista.add(new Persona("2", "Eli", 21));
        lista.add(new Persona("8", "Javier", 29));
        
        String cadena = JOptionPane.showInputDialog(null, "Coloque lo que quiere buscar");
        int n;
        n = busquedaPorNombre(lista, cadena);
        if (n != -1)
            JOptionPane.showMessageDialog(null, "El nombre está en la posición " + n);
        else
        {
            n = busquedaPorID(lista, cadena);
            if (n != -1)
                JOptionPane.showMessageDialog(null, "El id está en la posición " + n);
            else
                JOptionPane.showMessageDialog(null, "No se encontró ninguna coincidencia");
        }
    }
    
    private static int busquedaPorID(ArrayList<Persona> lista, String id)
    {
        for (int i = 0; i < lista.size(); i++)
        {
            if (lista.get(i).getId().equals(id))
                return i;
        }
        
        return -1;
    }
    
    private static int busquedaPorNombre(ArrayList<Persona> lista, String nombre)
    {
        for (int i = 0; i < lista.size(); i++)
        {
            if (lista.get(i).getNombre().equals(nombre))
                return i;
        }
        
        return -1;
    }
}
