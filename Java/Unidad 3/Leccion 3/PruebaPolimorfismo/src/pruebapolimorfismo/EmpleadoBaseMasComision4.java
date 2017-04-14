/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapolimorfismo;

/**
 *
 * @author JavierSLX
 */
public class EmpleadoBaseMasComision4 extends EmpleadoPorComision3
{
    private double salarioBase;
    
    public EmpleadoBaseMasComision4(String nombre, String apellido, String nss, 
        double ventas, double tarifa, double salario)
    {
        //Manda llamar al constructor de la superclase (EmpleadoPorComision3)
        super(nombre, apellido, nss, ventas, tarifa);
        this.salarioBase = salario;
    }

    public double getSalarioBase()
    {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase)
    {
        this.salarioBase = salarioBase;
    }
    
    public double ingresos()
    {
        return getSalarioBase() + super.ingresos();
    }
    
    public String toString()
    {
        return String.format("%s %s\n%s: %.2f", "con sueldo base", super.toString(), "sueldo base",
            getSalarioBase());
    }
    
    @Override
    public void setNumeroSeguroSocial(String numeroSeguroSocial)
    {
        super.setNumeroSeguroSocial(numeroSeguroSocial); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setApellidoPaterno(String apellidoPaterno)
    {
        super.setApellidoPaterno(apellidoPaterno); //To change body of generated methods, choose Tools | Templates.
    }
}
