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
public class Trigo extends Vegetal
{
    private String clase;
    private int edad;
    
    public Trigo(String clase, int edad, double tamano)
    {
        super("Trigo", tamano);
        this.clase = clase;
        this.edad = edad;
    }
    
    public void porcentajeAlimento()
    {
        super.setPorcentajeDeAlimento(Math.random() * 100);
    }
    
    public void riegos()
    {
        super.setContRiego(super.getContRiego() + 1);
    }
    
    public void tiempoVida()
    {
        super.setDias((int) (Math.random() * 5));
    }

    public String getClase()
    {
        return clase;
    }

    public void setClase(String clase)
    {
        this.clase = clase;
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
        return String.format("%s\nClase: %s\nEdad: %d", super.toString(), getClase(), getEdad());
    }
}
