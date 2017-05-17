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
public class Pincel
{
    private int medida;
    private String marca;
    
    public Pincel(int medida, String marca)
    {
        this.medida = medida;
        this.marca = marca;
    }

    public int getMedida()
    {
        return medida;
    }

    public void setMedida(int medida)
    {
        this.medida = medida;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public String toString()
    {
        return String.format("Marca: %s Medida: %d", getMarca(), getMedida());
    }
}
