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
public class Pizzeria
{
    private String nombre;
    private Direccion direccion;
    private String telefono;

    public Pizzeria()
    {
    }
    
    public Pizzeria(String nombre, Direccion direccion, String telefono)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
