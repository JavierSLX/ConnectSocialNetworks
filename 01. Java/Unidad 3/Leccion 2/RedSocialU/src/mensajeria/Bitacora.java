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
public class Bitacora
{
    private Usuario usuario;
    private List<Mensaje> mensajes;
    
    public Bitacora()
    {
        this.usuario = new Usuario();
        this.mensajes = new ArrayList<>();
    }
    
    public Bitacora(Usuario usuario, List<Mensaje> mensajes)
    {
        this.usuario = usuario;
        this.mensajes = mensajes;
    }

    public Usuario getUsuario()
    {
        return usuario;
    }

    public void setUsuario(Usuario usuario)
    {
        this.usuario = usuario;
    }

    public List<Mensaje> getMensajes()
    {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes)
    {
        this.mensajes = mensajes;
    }
}
