/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajeria;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author JavierSLX
 */
public class Grupo
{
    private String nombre;
    private List<Usuario> grupo;
    
    public Grupo()
    {
        this.grupo = new ArrayList<>();
    }
    
    public Grupo(String nombre, List<Usuario> grupo)
    {
        this.nombre = nombre;
        this.grupo = grupo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public List<Usuario> getGrupo()
    {
        return grupo;
    }

    public void setGrupo(List<Usuario> grupo)
    {
        this.grupo = grupo;
    }
}
