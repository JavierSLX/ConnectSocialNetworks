/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nextu.pizzeria;

/**
 *
 * @author JavierSLX
 */
public class Direccion
{
    private String calle;
    private int numero;
    public Direccion()
    {
    }
    
    public Direccion(String calle, int numero)
    {
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle()
    {
        return calle;
    }

    public void setCalle(String calle)
    {
        this.calle = calle;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }
}
