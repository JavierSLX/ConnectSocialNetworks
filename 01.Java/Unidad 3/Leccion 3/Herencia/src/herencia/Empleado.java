/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author JavierSLX
 */
public class Empleado extends Persona
{
    private String nombre;
    private String profesion;

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getProfesion()
    {
        return profesion;
    }

    public void setProfesion(String profesion)
    {
        this.profesion = profesion;
    }
}
