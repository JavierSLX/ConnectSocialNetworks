/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pintor;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class AplicacionDeDibujo
{
    private Pincel pincel;
    private Lienzo lienzo;
    
    public void crearPapel(double ancho, double largo, String marca, double grosor)
    {
        this.lienzo = new Papel(ancho, largo, marca, grosor);
    }
    
    public void crearTela(double ancho, double largo, String marca, double grosor, String color)
    {
        this.lienzo = new Tela(ancho, largo, marca, grosor, color);
    }
    
    public void mostrarLienzo()
    {
        JOptionPane.showMessageDialog(null, this.lienzo);
    }
    
    public void crearBrocha(int medida, String marca, double anchura, int numero)
    {
        this.pincel = new Brocha(medida, marca, anchura, numero);
    }
    
    public void mostrarPincel()
    {
        JOptionPane.showMessageDialog(null, this.pincel);
    }
}
