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
public class Prestramo implements PrestamoBancario
{
    private double costo;
    private double prestramo;

    public Prestramo()
    {
        this.costo = 0;
        this.prestramo = 0;
    }

    public Prestramo(double costo, double prestramo)
    {
        this.costo = costo;
        this.prestramo = prestramo;
    }

    public double getCosto()
    {
        return costo;
    }

    public void setCosto(double costo)
    {
        this.costo = costo;
    }

    public double getPrestramo()
    {
        return prestramo;
    }

    public void setPrestramo(double prestramo)
    {
        this.prestramo = prestramo;
    }

    @Override
    public void pagar(double cantidad)
    {
        if (getPrestramo() - (getCosto() + cantidad) < 0)
        {
            JOptionPane.showMessageDialog(null, "Ha pagado su deuda! Su sobrante es de $ " 
                + ((getCosto() + cantidad) - getPrestramo()));
            setCosto(0);
            setPrestramo(0);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Se ha hecho una abono de $ " + cantidad + " al prestramo");
            setCosto(getCosto()+cantidad);
        }
    }

    @Override
    public void retirar(double cantidad)
    {
        JOptionPane.showMessageDialog(null, "Se ha prestrado $ " + cantidad);
        setPrestramo(cantidad);
    }

    @Override
    public void saldo()
    {
        JOptionPane.showMessageDialog(null, "Aún se debe $ " + (getPrestramo() - getCosto()) + " del préstramo");
    }
}
