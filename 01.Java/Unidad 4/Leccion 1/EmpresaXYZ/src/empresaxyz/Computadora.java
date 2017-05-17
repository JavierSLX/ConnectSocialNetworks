/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresaxyz;

/**
 *
 * @author JavierSLX
 */
public class Computadora
{
    private String numeroMAC;
    private String procesador;
    private double memoriaRAM;
    private double discoDuro;

    public Computadora(String numeroMAC, String procesador, double memoriaRAM, double discoDuro)
    {
        this.numeroMAC = numeroMAC;
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.discoDuro = discoDuro;
    }

    public String getNumeroMAC()
    {
        return numeroMAC;
    }

    public void setNumeroMAC(String numeroMAC)
    {
        this.numeroMAC = numeroMAC;
    }

    public String getProcesador()
    {
        return procesador;
    }

    public void setProcesador(String procesador)
    {
        this.procesador = procesador;
    }

    public double getMemoriaRAM()
    {
        return memoriaRAM;
    }

    public void setMemoriaRAM(double memoriaRAM)
    {
        this.memoriaRAM = memoriaRAM;
    }

    public double getDiscoDuro()
    {
        return discoDuro;
    }

    public void setDiscoDuro(double discoDuro)
    {
        this.discoDuro = discoDuro;
    }

    @Override
    public String toString()
    {
        return String.format("Numero MAC: %s Procesador: %s Memoria RAM: %.0f Disco Duro: %.0f\n", 
            getNumeroMAC(), getProcesador(), getMemoriaRAM(), getDiscoDuro());
    }
}
