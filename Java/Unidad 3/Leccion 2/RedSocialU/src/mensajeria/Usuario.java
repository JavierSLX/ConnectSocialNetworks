/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajeria;

/**
 *
 * @author JavierSLX
 */
public class Usuario
{
    private String nombre;
    private String contrasena;
    
    public Usuario()
    {
        
    }
    
    public Usuario(String nombre, String contrasena)
    {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getContrasena()
    {
        return contrasena;
    }

    public void setContrasena(String contrasena)
    {
        this.contrasena = contrasena;
    }
}
