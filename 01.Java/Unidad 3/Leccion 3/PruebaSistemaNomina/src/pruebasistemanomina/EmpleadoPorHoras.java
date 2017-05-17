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
public class EmpleadoPorHoras extends Empleado
{
    private double sueldo;
    private double horas;
    
    public EmpleadoPorHoras(String nombre, String apellido, String nss, double sueldoPorHoras, double horasTrabajadas)
    {
        super(nombre, apellido, nss);
        this.sueldo = sueldoPorHoras;
        this.horas = horasTrabajadas;
    }

    public double getSueldo()
    {
        return sueldo;
    }

    public void setSueldo(double sueldo)
    {
        this.sueldo = (sueldo < 0.0) ? 0.0 : sueldo;
    }

    public double getHoras()
    {
        return horas;
    }

    public void setHoras(double horas)
    {
        this.horas = ((horas >= 0.0) && (horas <= 168.0)) ? horas : 0.0;
    }
    
    public double ingresos()
    {
        if (this.horas <= 40)
            return this.horas * this.sueldo;
        else
            return this.sueldo + (this.horas - 40) * this.sueldo * 1.5;
    }
    
    public String toString()
    {
        return String.format("empleado por horas: %s\n%s: $%,.2f\n%s: %,.2f", super.toString(), "sueldo por hora",
            getSueldo(), "horas trabajadas", getHoras());
    }
}
