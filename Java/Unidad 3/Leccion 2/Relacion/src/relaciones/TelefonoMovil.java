/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class TelefonoMovil
{
    private Bateria bateria;
    private AplicacionContactos aplicacionDeContactos;
    private Agenda agenda;
    public TelefonoMovil()
    {
        this.bateria = new Bateria();
        this.aplicacionDeContactos = new AplicacionContactos();
        this.agenda = new Agenda();
    }
    
    public void encender()
    {
        JOptionPane.showMessageDialog(null, "¡Encender telefono!");
        JOptionPane.showMessageDialog(null, "El porcentaje de bateria es: "
            + bateria.porcentajeDeBateria() + "%");
    }
    
    public void agregar(Contacto contacto)
    {
        this.aplicacionDeContactos.agregarContacto(contacto);
    }
    
    public void verAgenda()
    {
        agenda.setContactos(aplicacionDeContactos.getContactos());
        agenda.mostrarAgenda();
    }
    
    public class Bateria
    {
        public int porcentajeDeBateria()
        {
            return (int)(Math.random() * 100);
        }
    }
}
