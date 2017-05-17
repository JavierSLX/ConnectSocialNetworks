/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Defensa extends Jugador
{
    private String nombre;
    private int numero;
    
    public void mostrarDatosJugador()
    {
        JOptionPane.showMessageDialog(null, "El jugador " + this.nombre + " tiene el numero " + this.numero);
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
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
