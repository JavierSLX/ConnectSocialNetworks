/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pintor;

/**
 *
 * @author JavierSLX
 */
public class Tela extends Lienzo
{
    private String marca;
    private double grosor;
    private String color;
    
    public Tela(double ancho, double largo)
    {
        super(ancho, largo);
    }
    
    public Tela(double ancho, double largo, String marca, double grosor, String color)
    {
        super(ancho, largo);
        this.marca = marca;
        this.grosor = grosor;
        this.color = color;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public double getGrosor()
    {
        return grosor;
    }

    public void setGrosor(double grosor)
    {
        this.grosor = grosor;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    
    public String toString()
    {
        return String.format("Tela:\n%s\nMarca: %s Grosor: %.2f Color: %s", super.toString(), getMarca(), 
            getGrosor(), getColor());
    }
}
