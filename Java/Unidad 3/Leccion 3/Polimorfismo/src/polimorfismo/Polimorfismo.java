/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author JavierSLX
 */
public class Polimorfismo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Figura figura = new Figura();
        figura.area();
        figura.posicion();
        
        Figura triangulo = new Triangulo();
        Figura cuadrado = new Cuadrado();
        
        triangulo.area();
        cuadrado.area();
    }
    
}
