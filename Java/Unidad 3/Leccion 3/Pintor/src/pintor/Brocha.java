/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pintor;

/**
 *
 * @author JavierSLX
 */
public class Brocha extends Pincel
{
    private double anchura;
    private int numero;
    
    public Brocha(int medida, String marca)
    {
        super(medida, marca);
    }
    
    public Brocha(int medida, String marca, double anchura, int numero)
    {
        super(medida, marca);
        this.anchura = anchura;
        this.numero = numero;
    }

    public double getAnchura()
    {
        return anchura;
    }

    public void setAnchura(double anchura)
    {
        this.anchura = anchura;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }
    
    public String toString()
    {
        return String.format("Brocha:\n%s\nNumero: %d Anchura: %.2f", super.toString(), getNumero(), getAnchura());
    }
}
