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
public class Circulo extends Figura
{
    private double radio;

    public Circulo(double radio)
    {
        this.radio = radio;
    }

    public double getRadio()
    {
        return radio;
    }

    public void setRadio(double radio)
    {
        this.radio = radio;
    }

    @Override
    public double area()
    {
        return (3.1416 * radio * radio);
    }

    @Override
    public double perimetro()
    {
        return (3.1416 * (radio + radio));
    }
}
