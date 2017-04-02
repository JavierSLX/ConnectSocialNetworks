/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salidas2;
import java.util.Scanner;
/**
 *
 * @author JavierSLX
 */
public class Salidas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int numeroTelefonico = 123456;
        
        System.out.println("Hola, este es mi número telefónico " + numeroTelefonico);
        System.err.println("\tProgramando en Java");
        System.out.println("Hola \nme encuentro trabajando en Netbeans");
        System.out.println("Hola \nmi número telefónico es " + numeroTelefonico);
       
        System.out.println("Ingrese una cadena: ");
        String cadena = teclado.nextLine();
        System.out.println("La cadena captura es: " + cadena);
        teclado.close();
    }
    
}
