/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegogranja;

/**
 *
 * @author JavierSLX
 */
public abstract class Vegetal
{
    private String tipo;
    private double tamano;
    private double porcentajeDeAlimento;
    private int contRiego;
    private int dias;
    
    public Vegetal(String tipo, double tamano)
    {
        this.tipo = tipo;
        this.tamano = tamano;
        this.porcentajeDeAlimento = 0;
        this.contRiego = 0;
        this.dias = 0;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public double getTamano()
    {
        return tamano;
    }

    public void setTamano(double tamano)
    {
        this.tamano = tamano;
    }

    public double getPorcentajeDeAlimento()
    {
        return porcentajeDeAlimento;
    }

    public void setPorcentajeDeAlimento(double porcentajeDeAlimento)
    {
        this.porcentajeDeAlimento = porcentajeDeAlimento;
    }

    public int getContRiego()
    {
        return contRiego;
    }

    public void setContRiego(int contRiego)
    {
        this.contRiego = contRiego;
    }

    public int getDias()
    {
        return dias;
    }

    public void setDias(int dias)
    {
        this.dias = dias;
    }
    
    public abstract void porcentajeAlimento();
    public abstract void riegos();
    public abstract void tiempoVida();
    
    public String toString()
    {
        return String.format("Vegetal: %s\nTamaño: %s\nAlimento: %.2f\nRiegos: %d\nVida: %d", 
            getTipo(), getTamano(), getPorcentajeDeAlimento(), getContRiego(), getDias());
    }
}
