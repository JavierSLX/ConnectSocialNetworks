/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistenciaempleado;

import java.util.Scanner;

/**
 *
 * @author JavierSLX
 */
public class AsistenciaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.err.println("¡No deber llegar tarde!");
        System.out.println("\nEl empleando ha llegado temprano\n8:00 am");
        
        System.out.print("Coloque el nombre del empleado: ");
        String nombre = teclado.nextLine();
        
        System.out.println("\nEl nombre del empleado es " + nombre);
    }
    
}
