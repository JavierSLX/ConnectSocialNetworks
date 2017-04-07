/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import Clases.Rectangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Metodos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try
        {
            Rectangulo rectangulo = new Rectangulo();
            rectangulo.setAncho(Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Coloque el ancho del rectángulo")));
            rectangulo.setAlto(Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Coloque el alto del rectángulo")));
            JOptionPane.showMessageDialog(null, "Esta es el área de un rectángulo: " + rectangulo.area());
            JOptionPane.showMessageDialog(null, "Esta es el área de un triángulo: " + rectangulo.area()/2);
        } catch (NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null, "Datos no validos");
        }
        
    }
    
}
