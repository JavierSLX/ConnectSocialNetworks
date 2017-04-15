/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nextu.pizzeria;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Cocinero
{
    private Orden orden;

    public Cocinero()
    {
        //orden = new Orden();
    }
    
    public Cocinero(Orden orden)
    {
        //orden = new Orden();
        this.orden = orden;
    }

    public Orden getOrden()
    {
        return orden;
    }

    public void setOrden(Orden orden)
    {
        this.orden = orden;
    }
    
    public void cocinarPizza()
    {
        JOptionPane.showMessageDialog(null, "Se prepara y se cocina la pizza de " 
                + orden.getCliente().getNombre());
    }
    
    public void entregarAMensajero()
    {
        JOptionPane.showMessageDialog(null, "Se entrega la pizza al mensajero");
    }
}
