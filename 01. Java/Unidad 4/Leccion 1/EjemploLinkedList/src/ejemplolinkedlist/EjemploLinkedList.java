/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolinkedlist;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelo.Persona;

/**
 *
 * @author JavierSLX
 */
public class EjemploLinkedList
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LinkedList<Persona> lista = new LinkedList<>();
        
        lista.add(new Persona("1", "Hugo"));
        lista.add(new Persona("2", "Paco"));
        lista.add(new Persona("3", "Luis"));
        
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
        lista.addFirst(new Persona("4", "Tio McPato"));
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
        lista.removeFirst();
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
    }
    
    private static String imprimirLista(LinkedList<Persona> lista)
    {
        String resultado = "";
        
        for (int i = 0; i < lista.size(); i++)
            resultado += lista.get(i).toString();
        
        return resultado;
    }
}
