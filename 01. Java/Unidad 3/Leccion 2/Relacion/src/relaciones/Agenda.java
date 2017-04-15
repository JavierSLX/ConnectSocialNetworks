/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class Agenda
{
    private List<Contacto> contactos;
    public Agenda()
    {
        this.contactos = new ArrayList<>();
    }
    
    public Agenda(List<Contacto> contactos)
    {
        this.contactos = contactos;
    }
    
    public void mostrarAgenda()
    {
        for (int i = 0; i < this.contactos.size(); i++)
        {
            JOptionPane.showMessageDialog(null, "Contacto: " + this.contactos.get(i).getNombre());
        }
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
