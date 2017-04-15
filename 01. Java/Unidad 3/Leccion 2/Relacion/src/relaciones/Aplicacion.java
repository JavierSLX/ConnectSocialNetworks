/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones;

/**
 *
 * @author JavierSLX
 */
public class Aplicacion
{
    public static void main(String []args)
    {
        TelefonoMovil telefono = new TelefonoMovil();
        telefono.encender();
        
        Contacto contacto1 = new Contacto("Javier");
        telefono.agregar(contacto1);
        
        telefono.verAgenda();
    }
}
