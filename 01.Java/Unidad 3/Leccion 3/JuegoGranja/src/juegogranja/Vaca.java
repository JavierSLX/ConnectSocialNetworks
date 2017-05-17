/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegogranja;

/**
 *
 * @author JavierSLX
 */
public class Vaca extends Animal
{
    private String color;
    private int edad;
    
    
    public Vaca (String color, int edad, double tamano)
    {
        super("Vaca", tamano);
        this.color = color;
        this.edad = edad;
    }
    
    public void setPorcentajeAlimento()
    {
       super.setPorcentajeDeAlimento(Math.random() * 100);
    }
    
    public void comer()
    {
        super.setContComida(super.getContComida() + 1);
    }
    
    public void tiempoVivo()
    {
        super.setDias((int) (Math.random() * 10));
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    
    public String toString()
    {
        return String.format("%s\nColor: %s\nEdad: %d", super.toString(), getColor(), getEdad());
    }
}
