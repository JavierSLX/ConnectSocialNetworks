/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatiempo1;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class PruebaTiempo1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Tiempo1 tiempo = new Tiempo1();
        
        JOptionPane.showMessageDialog(null, "La hora universal es " + tiempo.tiempoAUniversal());
        JOptionPane.showMessageDialog(null, "La hora estándar es " + tiempo.tiempoAEstandar());
        
        tiempo.establecerTiempo(13, 27, 6);
        JOptionPane.showMessageDialog(null, "La hora universal después de establecerTiempo es " + tiempo.tiempoAUniversal());
        JOptionPane.showMessageDialog(null, "La hora estándar después de establecerTiempo es " + tiempo.tiempoAEstandar());
        
        tiempo.establecerTiempo(99, 99, 99);
        JOptionPane.showMessageDialog(null, "La hora universal después de un valor inválido es " + tiempo.tiempoAUniversal());
        JOptionPane.showMessageDialog(null, "La hora estándar después de un valor inválido es " + tiempo.tiempoAEstandar());
    }
    
}
