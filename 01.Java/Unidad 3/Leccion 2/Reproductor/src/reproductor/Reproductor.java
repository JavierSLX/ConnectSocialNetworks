/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reproductor;

import javax.swing.JOptionPane;
import nextu.reproductor.Cancion;
import nextu.reproductor.Lista;

/**
 *
 * @author JavierSLX
 */
public class Reproductor
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Cancion cancion;
        Lista lista = new Lista();
        
        String nombre;
        do
        {
            cancion = new Cancion();
            nombre = JOptionPane.showInputDialog(null, "¿Qué canción quiere poner a la lista?");
            
            if (nombre.equals("salir") == true)
                break;
            else
                cancion.setNombre(nombre);
            lista.ponerCancionALista(cancion);
           
        }while(true);
        
        lista.mostrarLista();
    }
}
