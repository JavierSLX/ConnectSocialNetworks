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
public class Mensaje
{
    private String texto;
    private Imagen imagen;
    private Usuario remitente;
    private Usuario destinatario;
    
    public Mensaje()
    {
        this.imagen = new Imagen();
        this.remitente = new Usuario();
        this.destinatario = new Usuario();
    }
    
    public Mensaje (String texto, Usuario remitente, Usuario destinatario)
    {
        this.texto = texto;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }
    
    public Mensaje (Imagen imagen, Usuario remitente, Usuario destinatario)
    {
        this.imagen = imagen;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public String getTexto()
    {
        return texto;
    }

    public void setTexto(String texto)
    {
        this.texto = texto;
    }

    public Imagen getImagen()
    {
        return imagen;
    }

    public void setImagen(Imagen imagen)
    {
        this.imagen = imagen;
    }

    public Usuario getRemitente()
    {
        return remitente;
    }

    public void setRemitente(Usuario remitente)
    {
        this.remitente = remitente;
    }

    public Usuario getDestinatario()
    {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario)
    {
        this.destinatario = destinatario;
    }
}
