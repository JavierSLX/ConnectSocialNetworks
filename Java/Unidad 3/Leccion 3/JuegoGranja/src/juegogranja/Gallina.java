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
public class Gallina extends Animal
{
    private String plumaje;
    private int patas;
    
    public Gallina(String plumaje, int patas, double tamano)
    {
        super("Gallina", tamano);
        this.plumaje = plumaje;
        this.patas = patas;
    }
    
    public void setPorcentajeAlimento()
    {
        super.setPorcentajeDeAlimento(Math.random() * 50);
    }
    
     public void comer()
    {
        super.setContComida(super.getContComida() + 1);
    }
    
    public void tiempoVivo()
    {
        super.setDias((int) (Math.random() * 20));
    }

    public String getPlumaje()
    {
        return plumaje;
    }

    public void setPlumaje(String plumaje)
    {
        this.plumaje = plumaje;
    }

    public int getPatas()
    {
        return patas;
    }

    public void setPatas(int patas)
    {
        this.patas = patas;
    }
    
    public String toString()
    {
        return String.format("%s\nPlumaje: %s\nPatas: %d", super.toString(), getPlumaje(), getPatas());
    }
}
