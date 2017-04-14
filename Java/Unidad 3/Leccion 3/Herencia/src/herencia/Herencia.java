/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author JavierSLX
 */
public class Herencia
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Persona persona = new Persona ("Javier", "Serrano");
        persona.saludar();
        
        Empleado empleado = new Empleado();
        empleado.saludar();
    }
    
}
