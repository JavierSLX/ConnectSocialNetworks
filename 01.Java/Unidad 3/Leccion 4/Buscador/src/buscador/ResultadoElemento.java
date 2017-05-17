/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscador;

import java.util.List;

/**
 *
 * @author JavierSLX
 */
public class ResultadoElemento
{
    private Elemento elemento;

    public ResultadoElemento()
    {
        this.elemento = new Elemento();
    }

    public ResultadoElemento(Elemento elemento)
    {
        this.elemento = elemento;
    }
    
    public boolean compararElemento(String tipo)
    {
        return this.elemento.getTipo().equals(tipo);
    }

    public void guardarElemento(List<Elemento> resultado, Elemento elemento)
    {
        resultado.add(elemento);
    }
}
