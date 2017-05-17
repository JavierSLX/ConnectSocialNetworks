/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Persona;
/**
 *
 * @author JavierSLX
 */
public class EjemploArrayList
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        ArrayList<Persona> lista = new ArrayList<>();
        
        lista.add(new Persona("1", "Pedro"));
        lista.add(new Persona("2", "Juan"));
        lista.add(new Persona("3", "Javier"));
        
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
        lista.remove(0);
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
        lista.add(0, new Persona("4", "Jorge"));
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
    }
    
    private static String imprimirLista(ArrayList<Persona> lista)
    {
        String resultado = "";
        
        for (int i = 0; i < lista.size(); i++)
            resultado += lista.get(i).toString();
        
        return resultado;
    }
}
