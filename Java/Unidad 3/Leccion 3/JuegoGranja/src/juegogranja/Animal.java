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
public abstract class Animal
{
    private String tipo;
    private double tamano;
    private double porcentajeDeAlimento;
    private int contComida;
    private int dias;
    
    public Animal (String tipo, double tamano)
    {
        this.tipo = tipo;
        this.tamano = tamano;
        this.porcentajeDeAlimento = 0;
        this.contComida = 0;
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
    
    public String toString()
    {
        return String.format("Animal: %s\nTamaño: %s\nAlimento: %.2f\nHa comido: %d\nVivo hasta %d", 
            getTipo(), getTamano(), getPorcentajeDeAlimento(), getContComida(), getDias());
    }
    
    public void setPorcentajeDeAlimento(double porcentajeDeAlimento)
    {
        this.porcentajeDeAlimento = porcentajeDeAlimento;
    }

    public int getContComida()
    {
        return contComida;
    }

    public void setContComida(int contComida)
    {
        this.contComida = contComida;
    }

    public int getDias()
    {
        return dias;
    }

    public void setDias(int dias)
    {
        this.dias = dias;
    }

    public abstract void setPorcentajeAlimento();
    public abstract void comer();
    public abstract void tiempoVivo();
}
