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
public class Manzana extends Vegetal
{
    private String clase;
    private double volumen;
    
    public Manzana(String clase, double volumen, double tamano)
    {
        super("Manzana", tamano);
        this.clase = clase;
        this.volumen = volumen;
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

    public double getVolumen()
    {
        return volumen;
    }

    public void setVolumen(double volumen)
    {
        this.volumen = volumen;
    }
    
    public String toString()
    {
        return String.format("%s\nClase: %s\nVolumen: %.2f", super.toString(), getClase(), getVolumen());
    }
}
