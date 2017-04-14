/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapolimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class PruebaPolimorfismo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //Asigna la referencia a la superclase
        EmpleadoPorComision3 empleadoPorComision = new EmpleadoPorComision3("Sue", 
            "Jones", "222-22-2222", 10000, 0.06);
        
        //Asigna la referencia a la subclase
        EmpleadoBaseMasComision4 empleadoBaseMasComision = new EmpleadoBaseMasComision4("Bob", 
            "Lewis", "333-33-3333", 5000, 0.04, 300);
        
        //Invoca el método toString de la superclase
        JOptionPane.showMessageDialog(null, "Llamada a toString de EmpleadoPorComision3 con referencia "
            + " de superclase a un objeto de la superclase:\n\n" + empleadoPorComision.toString());
        
        //Invoca el método toString de la subclase
        JOptionPane.showMessageDialog(null, "Llamada a toString de EmpleadoBaseMasComision4 con referencia "
            + " de subclase a un objeto de la subclase:\n\n" + empleadoBaseMasComision.toString());
        
        EmpleadoPorComision3 empleadoPorComision2 = empleadoBaseMasComision;
        JOptionPane.showMessageDialog(null, "Llamada a toString de EmpleadoBaseMasComision4 con referencia "
            + " de superclase a un objeto de la subclase:\n\n" + empleadoPorComision2.toString());
    }
    
}
