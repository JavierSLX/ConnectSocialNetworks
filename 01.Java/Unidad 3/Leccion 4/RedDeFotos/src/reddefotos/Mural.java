/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddefotos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Mural
{
    private Usuario usuario;
    private List<Foto> fotos;

    public Mural(Usuario usuario)
    {
        this.usuario = usuario;
        this.fotos = new ArrayList<>();
    }

    public Usuario getUsuario()
    {
        return usuario;
    }

    public void setUsuario(Usuario usuario)
    {
        this.usuario = usuario;
    }

    public List<Foto> getFotos()
    {
        return fotos;
    }

    public void setFotos(List<Foto> fotos)
    {
        this.fotos = fotos;
    }
    
    public void insertarFoto(Foto foto)
    {
        this.fotos.add(foto);
        JOptionPane.showMessageDialog(null, "Foto " + foto.getNombre() + " insertada al mural de " + 
            getUsuario().getNombre());
    }

    @Override
    public String toString()
    {
        return "Mural{" + "usuario=" + usuario + ", fotos=" + fotos + '}';
    }
}
