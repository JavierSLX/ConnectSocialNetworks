/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaxyz;

import java.util.LinkedList;

/**
 *
 * @author JavierSLX
 */
public class EmpresaXYZ
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Pila pila = new Pila();
        
        //Agrega unos elementos a la pila
        pila.agregar(new Computadora("34:78:12:9F", "Corel", 1024, 2000));
        pila.agregar(new Computadora("24:68:16:AF", "Intel", 2000, 3000));
        pila.agregar(new Computadora("98:26:33:5F", "Pro", 3000, 5000));
        
        //Muestra la lista
        pila.mostrar();
        
        //Sale una computadora
        pila.eliminar();
        
        //Muestra la lista
        pila.mostrar();
        
        //Agrega una nueva computadora
        pila.agregar(new Computadora("55:21:32:56", "Quo Pro", 2300, 12300));
        
        //Muestra la lista
        pila.mostrar();
        
    }
    
}
