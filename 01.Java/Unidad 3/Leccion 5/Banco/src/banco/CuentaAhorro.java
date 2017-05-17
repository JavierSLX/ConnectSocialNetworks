/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class CuentaAhorro implements CuentaBancaria
{
    private String numero;
    private double cantidad;

    public CuentaAhorro()
    {
    }

    public CuentaAhorro(String numero, double cantidad)
    {
        this.numero = numero;
        this.cantidad = cantidad;
    }

    public String getNumero()
    {
        return numero;
    }

    public void setNumero(String numero)
    {
        this.numero = numero;
    }

    public double getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(double cantidad)
    {
        this.cantidad = cantidad;
    }

    @Override
    public void saldo()
    {
        JOptionPane.showMessageDialog(null, "El saldo de la cuenta " + getNumero() + " es de $ " + getCantidad()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void depositar(double cantidad)
    {
        JOptionPane.showMessageDialog(null, "Se ha depositado $ " + cantidad + " a la cuenta " + getNumero()); 
        this.cantidad += cantidad;
    }

    @Override
    public void retirar(double cantidad)
    {
        if (cantidad > this.cantidad)
            JOptionPane.showMessageDialog(null, "No se puede retirar más del dinero que tiene la cuenta");
        else
        {
            JOptionPane.showMessageDialog(null, "Se ha retirado $ " + cantidad + " de la cuenta " + getNumero());
            this.cantidad -= cantidad;
        }
    }
    
}
