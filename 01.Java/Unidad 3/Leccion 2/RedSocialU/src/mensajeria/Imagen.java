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
public class Imagen
{
    private String nombre;
    private String ruta;
    
    public Imagen()
    {
        
    }
    
    public Imagen(String nombre, String ruta)
    {
        this.nombre = nombre;
        this.ruta = ruta;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getRuta()
    {
        return ruta;
    }

    public void setRuta(String ruta)
    {
        this.ruta = ruta;
    }
}
