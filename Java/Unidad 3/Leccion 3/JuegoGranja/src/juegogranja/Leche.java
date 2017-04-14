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
public class Leche
{
    private Animal vaca;
    private int litros;
    
    public Leche(Vaca vaca)
    {
        this.vaca = vaca;
        setLitros();
    }

    public Animal getVaca()
    {
        return vaca;
    }

    public void setVaca(Animal vaca)
    {
        this.vaca = vaca;
    }

    public int getLitros()
    {
        return litros;
    }

    private void setLitros()
    {
        this.litros = (int) vaca.getPorcentajeDeAlimento()/vaca.getDias();
    }
    
    public String toString()
    {
        return String.format("Del animal %s se obtienen %d litros", vaca.getTipo(), getLitros());
    }
}
