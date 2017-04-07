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
public class Mensajero
{
    private Orden orden;

    public Mensajero()
    {
        //orden = new Orden();
    }
    
    public Mensajero(Orden orden)
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
    
    public void enviarEmail()
    {
        JOptionPane.showMessageDialog(null, "Se ha enviado un correo a la dirección "
            + orden.getCliente().getEmail() + " que la pizza va en camino");
    }
    
    public void notificarEntrega()
    {
        JOptionPane.showMessageDialog(null, "La pizza ha sido entregada al cliente "
            + orden.getCliente().getNombre());
    }
}
