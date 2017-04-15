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
public class Cuadrado extends Figura
{
    public Cuadrado(double lado)
    {
        super.setAncho(lado);
        super.setLargo(lado);
    }

    @Override
    public double area()
    {
        return (super.getAncho() * super.getLargo());
    }

    @Override
    public double perimetro()
    {
        return (super.getAncho() + super.getAncho() + super.getAncho() + super.getAncho());
    }
}
