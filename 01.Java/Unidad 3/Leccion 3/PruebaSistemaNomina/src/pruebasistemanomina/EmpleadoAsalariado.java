/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasistemanomina;

/**
 *
 * @author JavierSLX
 */
public class EmpleadoAsalariado extends Empleado
{
    private double salarioSemanal;
    
    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario)
    {
        super(nombre, apellido, nss);
        this.salarioSemanal = salario;
    }

    public double getSalarioSemanal()
    {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal)
    {
        this.salarioSemanal = salarioSemanal < 0.0 ? 0.0 : salarioSemanal;
    }
    
    public double ingresos()
    {
        return getSalarioSemanal();
    }
    
    public String toString()
    {
        return String.format("empleado asalariado: %s\n%s $%,.2f", super.toString(), "salario semanal", 
            getSalarioSemanal());
    }
}
