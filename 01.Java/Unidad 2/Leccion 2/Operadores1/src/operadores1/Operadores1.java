/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores1;

/**
 *
 * @author JavierSLX
 */
public class Operadores1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 6;
        int b = 4;
        
        System.out.println("Esta es la suma: " + (a + b));
        System.out.println("Esta es la resta: " + (a - b));
        System.out.println("Esta es la multiplicación: " + (a*b));
        System.out.println("Esta es la división: " + (a/b));
        System.out.println("Este es el módulo: " + (a%b));
        
        a += 4;
        b -= 2;
        
        System.out.println("El resultado de += es " + a);
        System.out.println("El resultado de -= es " + b);
    }
    
}
