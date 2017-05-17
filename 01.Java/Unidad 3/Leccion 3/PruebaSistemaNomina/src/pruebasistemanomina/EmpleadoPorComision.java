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
public class EmpleadoPorComision extends Empleado
{
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa)
    {
        super(nombre, apellido, nss);
        this.tarifaComision = tarifa;
        this.ventasBrutas = ventas;
    }

    public double getVentasBrutas()
    {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas)
    {
        this.ventasBrutas = (ventasBrutas < 0.0) ? 0.0 : ventasBrutas;
    }

    public double getTarifaComision()
    {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision)
    {
        this.tarifaComision = (tarifaComision > 0.0 && tarifaComision < 1.0) ? tarifaComision : 0.0;
    }
    
    public double ingresos()
    {
        return getTarifaComision() * getVentasBrutas();
    }
    
    public String toString()
    {
        return String.format("%s: %s\n%s: $%,.2f\n%s: %.2f", "empleado por comision", super.toString(),
            "ventas brutas", getVentasBrutas(), "tarifa de comisión", getTarifaComision());
    }
}
