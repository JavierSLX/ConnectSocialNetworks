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
public class Pizza
{
    private String tipo;
    private String tamano;
    private double precio;
    private String[] ingredientes;

    public Pizza()
    {
    }
    
    public Pizza(String tipo, String tamano, double precio, String[] ingredientes)
    {
        this.tipo = tipo;
        this.tamano = tamano;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getTamano()
    {
        return tamano;
    }

    public void setTamano(String tamano)
    {
        this.tamano = tamano;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public String[] getIngredientes()
    {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes)
    {
        this.ingredientes = ingredientes;
    }
    
    public void escogerIngredientes()
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantos ingredientes quiere?"));
        String[] ingrediente = new String[n];
        
        for (int i = 0; i < 2; i++)
        {
            try
            {
                ingrediente[i] = JOptionPane.showInputDialog(null, "¿Qué ingrediente quiere? (" + (i+1) + ")");
            }
            catch(NullPointerException npe)
            {
                i--;
            }
        }
        
        this.ingredientes = ingrediente;
    }
}
