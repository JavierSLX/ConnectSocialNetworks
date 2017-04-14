/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcine;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Cine
{
    private String direccion;
    private String telefono;

    public Cine()
    {
        JOptionPane.showMessageDialog(null, "Este es un constructor vacío");
        this.direccion = "Ocampo 2";
        this.telefono = "4661636088";
    }

    public Cine(String direccion)
    {
        this.direccion = direccion;
        JOptionPane.showMessageDialog(null, "Este es un constructor con dirección");
        this.telefono = "4661636089";
    }

    public Cine(String direccion, String telefono)
    {
        this.direccion = direccion;
        this.telefono = telefono;
        JOptionPane.showMessageDialog(null, "Este es un constructor con dirección y teléfono");
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    @Override
    public String toString()
    {
        return "Cine{" + "direccion=" + direccion + ", telefono=" + telefono + '}';
    }
}
