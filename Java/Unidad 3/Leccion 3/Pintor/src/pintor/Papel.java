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
public class Papel extends Lienzo
{
    private String marca;
    private double grosor;
    
    public Papel(double ancho, double largo)
    {
        super(ancho, largo);
    }
    
    public Papel(double ancho, double largo, String marca, double grosor)
    {
        super(ancho, largo);
        this.marca = marca;
        this.grosor = grosor;
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
    
    public String toString()
    {
        return String.format("Papel:\n%s\nMarca: %s Grosor: %.2f", super.toString(), getMarca(), getGrosor());
    }
}
