/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author JavierSLX
 */
public abstract class Figura
{
    private double ancho;
    private double largo;

    public Figura()
    {
    }

    public Figura(double ancho, double largo)
    {
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAncho()
    {
        return ancho;
    }

    public void setAncho(double ancho)
    {
        this.ancho = ancho;
    }

    public double getLargo()
    {
        return largo;
    }

    public void setLargo(double largo)
    {
        this.largo = largo;
    }
    
    public abstract double area();
    public abstract double perimetro();
}
