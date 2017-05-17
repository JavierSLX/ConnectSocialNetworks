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
public class Harina
{
    private Vegetal trigo;
    private double kilos;
    
    public Harina(Trigo trigo)
    {
        this.trigo = trigo;
        setKilos();
    }

    public Vegetal getTrigo()
    {
        return trigo;
    }

    public void setTrigo(Vegetal trigo)
    {
        this.trigo = trigo;
    }

    public double getKilos()
    {
        return kilos;
    }

    private void setKilos()
    {
        this.kilos = (trigo.getPorcentajeDeAlimento() / trigo.getDias());
    }
    
    public String toString()
    {
        return String.format("De %s de obtuvieron %.2f kilos de harina", trigo.getTipo(), getKilos());
    }
}
