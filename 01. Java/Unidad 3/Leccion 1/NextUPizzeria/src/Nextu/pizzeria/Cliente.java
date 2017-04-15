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
public class Cliente
{
    private String nombre;
    private Direccion direccion;
    private String telefono;
    private String email;

    public Cliente()
    {
        this.direccion = new Direccion();
    }
    
    public Cliente(String nombre, Direccion direccion, String telefono, String email)
    {
        this.direccion = direccion;
        this.email = email;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Direccion getDireccion()
    {
        return direccion;
    }

    public void setDireccion(Direccion direccion)
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

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void pedirDatos()
    {
        String cadena;
        try
        {
            cadena = JOptionPane.showInputDialog(null, "Coloque su nombre");
            if (cadena != null)
                this.nombre = cadena;
            
            cadena = JOptionPane.showInputDialog(null, "¿Cual su calle?");
            if (cadena != null)
                this.direccion.setCalle(cadena);
            
            this.direccion.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Su numero de casa")));
            this.telefono = JOptionPane.showInputDialog(null, "Su teléfono");
            this.email = JOptionPane.showInputDialog(null, "Su e-mail");
        }
        catch (NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null, "Error al registrar el cliente");
        }
    }
}
