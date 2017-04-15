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
public class Arroz extends Vegetal
{
    private String clase;
    private int nivel;
    
    public Arroz(String clase, int nivel, double tamano)
    {
        super("Arroz", tamano);
        this.clase = clase;
        this.nivel = nivel;
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

    public int getNivel()
    {
        return nivel;
    }

    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }
    
    public String toString()
    {
        return String.format("%s\nClase: %s\nNivel: %d", super.toString(), getClase(), getNivel());
    }
}
