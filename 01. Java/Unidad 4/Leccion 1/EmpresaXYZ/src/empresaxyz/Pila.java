/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaxyz;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Pila
{
    private LinkedList<Computadora> pila;

    public Pila()
    {
        this.pila = new LinkedList<>();
    }

    public Pila(LinkedList<Computadora> pila)
    {
        this.pila = pila;
    }

    public LinkedList<Computadora> getPila()
    {
        return pila;
    }

    public void setPila(LinkedList<Computadora> pila)
    {
        this.pila = pila;
    }

    @Override
    public String toString()
    {
        String cadena = "";
        for (int i = 0; i < this.pila.size(); i++)
            cadena += pila.get(i).toString() + "\n";
        
        return cadena;
    }
    
    public void agregar(Computadora computadora)
    {
        this.pila.addLast(computadora);
        JOptionPane.showMessageDialog(null, "Se ha agregado la computadora a la pila:\n" + computadora);
    }
    
    public void eliminar()
    {
        JOptionPane.showMessageDialog(null, "Se elimina la última computadora de la pila:\n" + 
            this.pila.getLast().toString());
        this.pila.removeLast();
    }
    
    public void mostrar()
    {
        JOptionPane.showMessageDialog(null, this.toString());
    }
}
