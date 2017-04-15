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
public class EmpleadoPorComision3
{
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision3(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, 
        double ventasBrutas, double tarifaComision)
    {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public String getPrimerNombre()
    {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre)
    {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno()
    {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno)
    {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNumeroSeguroSocial()
    {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial)
    {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public double getVentasBrutas()
    {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas)
    {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision()
    {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision)
    {
        this.tarifaComision = tarifaComision;
    }
    
    public double ingresos()
    {
        return getTarifaComision() * getVentasBrutas();
    }
    
    //Regresa en String la representacion de los elementos del objeto
    public String toString()
    {
        return String.format("%s: %s %s\n%s: %s\n%s %.2f\n%s %.2f", "empleado por comision", 
            getPrimerNombre(), getApellidoPaterno(), "numero de seguro social", getNumeroSeguroSocial(),
            "ventas brutas", getVentasBrutas(), "tarifa de comisión", getTarifaComision());
    }
}
