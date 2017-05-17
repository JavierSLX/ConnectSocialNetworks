/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farostadium;

import java.util.Scanner;

/**
 *
 * @author JavierSLX
 */
public class FaroStadium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Coloque el marcador del equipo 1: ");
        int marcador1 = teclado.nextInt();
        System.out.print("Coloque el marcador del equipo 2: ");
        int marcador2 = teclado.nextInt();
        
        if (marcador1 > marcador2)
            System.out.println("\nEl equipo 1 ha ganado!");
        else if (marcador2 > marcador1)
            System.out.println("\nEl equipo 2 ha ganado!");
        else
            System.out.println("\nNingún equipo ha ganado!");
        
        teclado.close();
    }
    
}
