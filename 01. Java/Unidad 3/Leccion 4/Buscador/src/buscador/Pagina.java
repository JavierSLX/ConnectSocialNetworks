/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JavierSLX
 */
public class Pagina
{
    private ResultadoElemento resultado;
    private List<Elemento> elementosContenidos;
    private List<Elemento> elementosEncontrados;

    public Pagina()
    {
        this.resultado = new ResultadoElemento();
        this.elementosContenidos = new ArrayList<>();
        this.elementosEncontrados = new ArrayList<>();
    }

    public Pagina(ResultadoElemento resultado)
    {
        this.resultado = resultado;
        this.elementosContenidos = new ArrayList<>();
        this.elementosEncontrados = new ArrayList<>();
    }

    public Pagina(List<Elemento> elementosContenidos)
    {
        this.resultado = new ResultadoElemento();
        this.elementosContenidos = elementosContenidos;
        this.elementosEncontrados = new ArrayList<>();
    }

    public Pagina(ResultadoElemento resultado, List<Elemento> elementosContenidos)
    {
        this.resultado = resultado;
        this.elementosContenidos = elementosContenidos;
        this.elementosEncontrados = new ArrayList<>();
    }

    public ResultadoElemento getResultado()
    {
        return resultado;
    }

    public void setResultado(ResultadoElemento resultado)
    {
        this.resultado = resultado;
    }

    public List<Elemento> getElementosContenidos()
    {
        return elementosContenidos;
    }

    public void setElementosContenidos(List<Elemento> elementosContenidos)
    {
        this.elementosContenidos = elementosContenidos;
    }

    public List<Elemento> getElementosEncontrados()
    {
        return elementosEncontrados;
    }

    public void setElementosEncontrados(List<Elemento> elementosEncontrados)
    {
        this.elementosEncontrados = elementosEncontrados;
    }
    
    public void insertarElementosEncontrados(String tipo)
    {
        for (int i = 0; i < elementosContenidos.size(); i++)
        {
            ResultadoElemento resultado = new ResultadoElemento(elementosContenidos.get(i));
            if (resultado.compararElemento(tipo))
                resultado.guardarElemento(elementosEncontrados, elementosContenidos.get(i));
        }
    }
}
