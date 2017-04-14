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
public class EmpleadoBaseMasComision extends EmpleadoPorComision
{
    private double salarioBase;
    
    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double ventas, double tarifa, double salario)
    {
        super(nombre, apellido, nss, ventas, tarifa);
        this.salarioBase = salario;
    }

    public double getSalarioBase()
    {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase)
    {
        this.salarioBase = (salarioBase < 0.0) ? 0.0 : salarioBase;
    }
    
    public double ingresos()
    {
        return getSalarioBase() + super.ingresos();
    }
    
    public String toString()
    {
        return String.format("%s %s\n%s: $%,.2f", "son salario base", super.toString(), "salario base",
            getSalarioBase());
    }
}
