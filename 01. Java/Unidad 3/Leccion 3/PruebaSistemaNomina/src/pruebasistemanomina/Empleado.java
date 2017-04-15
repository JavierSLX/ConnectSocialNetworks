/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasistemanomina;

/**
 *
 * @author JavierSLX
 */
public abstract class Empleado
{
    private String nombre;
    private String apellido;
    private String numeroSeguroSocial;
    
    //Constructor SIEMPRE de los elementos necesarios
    public Empleado(String nombre, String apellido, String numeroSeguroSocial)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getNumeroSeguroSocial()
    {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial)
    {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    
    public String toString()
    {
        return String.format("%s %s\nnumero de seguro social: %s", getNombre(), getApellido(), getNumeroSeguroSocial());
    }
    
    //Método abstracto sobreescrito por la subclase
    public abstract double ingresos();
}
