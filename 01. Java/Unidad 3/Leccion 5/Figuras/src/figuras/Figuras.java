/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Figuras
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //Sacan area y perimetros de las figuras
        Triangulo triangulo = new Triangulo(10, 12, 15);
        JOptionPane.showMessageDialog(null, "El área del triángulo es " + triangulo.area());
        JOptionPane.showMessageDialog(null, "El perímetro del triángulo es " + triangulo.perimetro());
        
        Cuadrado cuadrado = new Cuadrado(10);
        JOptionPane.showMessageDialog(null, "El área del cuadrado es " + cuadrado.area());
        JOptionPane.showMessageDialog(null, "El perímetro del cuadrado es " + cuadrado.perimetro());
        
        Circulo circulo = new Circulo(5);
        JOptionPane.showMessageDialog(null, "El área del círculo es " + circulo.area());
        JOptionPane.showMessageDialog(null, "El perímetro del círculo es " + circulo.perimetro());
        
        Triangulo equilatero = new TrianguloEquilatero(15);
        JOptionPane.showMessageDialog(null, "El área del triángulo equilatero es " + equilatero.area());
        JOptionPane.showMessageDialog(null, "El perímetro del triángulo equilatero es " + equilatero.perimetro());
    }
    
}
