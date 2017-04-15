/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasistemanomina;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class PruebaSistemaNomina
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //Crea objetos de las subclases
        EmpleadoAsalariado asalariado = new EmpleadoAsalariado("John", "Smith", "111-11-111", 800.00);
        EmpleadoPorHoras porHoras = new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40);
        EmpleadoPorComision porComision = new EmpleadoPorComision("Sue", "Jones", "333-33-3333", 10000, 0.06);
        EmpleadoBaseMasComision masComision = new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);
        
        JOptionPane.showMessageDialog(null, "Empleados procesados por separado");
        String cadena = String.format("%s\n%s: $%,.2f\n\n", asalariado, "ingresos", asalariado.ingresos());
        JOptionPane.showMessageDialog(null, cadena);
        
        cadena = String.format("%s\n%s: $%,.2f\n\n", porHoras, "ingresos", porHoras.ingresos());
        JOptionPane.showMessageDialog(null, cadena);
        
        cadena = String.format("%s\n%s: $%,.2f\n\n", porComision, "ingresos", porComision.ingresos());
        JOptionPane.showMessageDialog(null, cadena);
        
        cadena = String.format("%s\n%s: $%,.2f\n\n", masComision, "ingresos", masComision.ingresos());
        JOptionPane.showMessageDialog(null, cadena);
        
        //Crea un arreglo Empleado de cuatro elementos
        Empleado empleados[] = new Empleado[4];
        
        //Inicializa el arreglo con objetos Empleado
        empleados[0] = asalariado;
        empleados[1] = porHoras;
        empleados[2] = porComision;
        empleados[3] = masComision;
        
        JOptionPane.showMessageDialog(null, "Empleados procesados en forma polifórmica:");
        
        //Procesa en forma genérica a cada elemento en el arreglo de empleados
        for (Empleado empleadoActual : empleados)
        {
            JOptionPane.showMessageDialog(null, empleadoActual);
            
            //Determina si el elemento es un EmpleadoBaseMasComision
            if (empleadoActual instanceof EmpleadoBaseMasComision)
            {
                //Conversión descendente de la referencia de Empleado a una referencia de EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
                
                double salarioBaseAnterior = empleado.getSalarioBase();
                empleado.setSalarioBase(1.10 * salarioBaseAnterior);
                JOptionPane.showMessageDialog(null, "El salario base con 10% de aumento es: $ " + 
                    empleado.getSalarioBase());
            }
            
            JOptionPane.showMessageDialog(null, "ingresos $" + empleadoActual.ingresos());
        }
        
        for (int j = 0; j < empleados.length; j++)
        {
            cadena = String.format("El empleado %d es un %s", j, empleados[j].getClass().getName());
            JOptionPane.showMessageDialog(null, cadena);
        }
    }
    
}
