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
public class Huevo
{
    private Animal gallina;
    private int cantidad;
    
    public Huevo(Gallina gallina)
    {
        this.gallina = gallina;
        setCantidad();
    }

    public Animal getGallina()
    {
        return gallina;
    }

    public void setGallina(Animal gallina)
    {
        this.gallina = gallina;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    private void setCantidad()
    {
        this.cantidad = (int) (gallina.getPorcentajeDeAlimento()/ gallina.getDias());
    }
    
    public String toString()
    {
        return String.format("Del animal %s se obtienen %d huevos", gallina.getTipo(), getCantidad());
    }
}
