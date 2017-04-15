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
public class ResultadoDeBusqueda
{
    private List<Pagina> paginas;
    private Elemento elemento;

    public ResultadoDeBusqueda()
    {
        this.paginas = new ArrayList<>();
        this.elemento = new Elemento();
    }

    public ResultadoDeBusqueda(List<Pagina> paginas)
    {
        this.paginas = paginas;
        this.elemento = new Elemento();
    }

    public ResultadoDeBusqueda(Elemento elemento)
    {
        this.elemento = elemento;
    }

    public ResultadoDeBusqueda(List<Pagina> paginas, Elemento elemento)
    {
        this.paginas = paginas;
        this.elemento = elemento;
    }

    public List<Pagina> getPaginas()
    {
        return paginas;
    }

    public void setPaginas(List<Pagina> paginas)
    {
        this.paginas = paginas;
    }

    public Elemento getElemento()
    {
        return elemento;
    }

    public void setElemento(Elemento elemento)
    {
        this.elemento = elemento;
    }
    
    public void resultadoBusqueda(String tipo)
    {
        for (int i = 0; i < this.paginas.size(); i++)
        {
            paginas.get(i).insertarElementosEncontrados(tipo);
        }
    }
}
