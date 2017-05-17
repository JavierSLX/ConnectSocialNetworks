/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores2;

/**
 *
 * @author JavierSLX
 */
public class Operadores2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean a = 5 < 4;
        System.out.println("El resultado es " + a);
        boolean b = 6 <= 6;
        System.out.println("El resultado es " + b);
        boolean c = 7 > 5;
        System.out.println("El resultado es " + c);
        
        boolean d = (5 < 6 && 4 < 5);
        System.out.println("El resultado es " + d);
        boolean e = (5 < 6 || 8 > 10);
        System.out.println("El resultado es " + e);
        boolean f = a || b;
        System.out.println("El resultado es " + f);
    }
    
}
