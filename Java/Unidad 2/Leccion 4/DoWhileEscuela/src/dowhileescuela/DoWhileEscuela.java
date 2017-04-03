/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhileescuela;

import java.util.Scanner;

/**
 *
 * @author JavierSLX
 */
public class DoWhileEscuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int numero1 = 0;
        int numero2 = 0;
        
        do
        {
            
            System.out.print("Menú\n1. Suma 2 números.\n2. Resta 2 números\n0. Salir\nOpcion: ");
            opcion = entrada.nextInt();
            
            if (opcion >= 1 && opcion <= 2)
            {
                System.out.print("Coloque el primer número: ");
                numero1 = entrada.nextInt();

                System.out.print("Coloque el segundo número: ");
                numero2 = entrada.nextInt();
            }
            
            switch(opcion)
            {
                case 1:
                    System.out.println("\nLa suma de los dos números es " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("\nLa resta de los dos números es " + (numero1 - numero2));
                    break;
                default:
                    System.out.println("\nOpción no registrada");
            }
            
        }while (opcion != 0);
    }
    
}
