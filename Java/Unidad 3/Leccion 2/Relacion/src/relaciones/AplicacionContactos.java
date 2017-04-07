/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class AplicacionContactos
{
    private List<Contacto> contactos;
    
    public AplicacionContactos()
    {
        this.contactos = new ArrayList<>();
    }
    
    public void agregarContacto(Contacto contacto)
    {
        JOptionPane.showMessageDialog(null, "Se ha agregado un contacto");
        this.contactos.add(contacto);
    }

    public List<Contacto> getContactos()
    {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos)
    {
        this.contactos = contactos;
    }
}
