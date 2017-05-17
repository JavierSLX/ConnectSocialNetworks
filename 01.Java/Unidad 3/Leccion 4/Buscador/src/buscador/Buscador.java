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
public class Buscador
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Buscador buscador = new Buscador();
        List<Pagina> paginas = new ArrayList<>();
        paginas = buscador.construirPagina();
    }
    
    public List<Pagina> construirPagina()
    {
        List<Pagina> paginas = new ArrayList<>();
        
        for (int i = 0; i < 2; i++)
        {
            //Saca los elementos que tendrá la página
            int cantidad = this.sacarNumeroAlAzar(10) + 1;
            
            for (int j = 0; j < cantidad; j++)
            {
                Elemento elemento = new Elemento(this.sacarNombre(this.sacarNumeroAlAzar(2)), 
                    this.sacarTipo(this.sacarNumeroAlAzar(2)), this.sacarURL(this.sacarNumeroAlAzar(2)));
                
                paginas.get(i).getElementosContenidos().add(elemento);
            }
        }
        
        return paginas;
    }
    
    public String sacarNombre(int indice)
    {
        String cadena = "Vacía";
        switch(indice)
        {
            case 0:
                cadena = "Estándar";
                break;
            case 1:
                cadena = "VIP";
                break;
            case 2:
                cadena = "Básica";
                break;
        }
        
        return cadena;
    }
    
    public String sacarTipo(int indice)
    {
        String cadena = "Vacía";
        switch(indice)
        {
            case 0:
                cadena = "Imagen";
                break;
            case 1:
                cadena = "Documento";
                break;
            case 2:
                cadena = "Video";
                break;
        }
        
        return cadena;
    }
    
    public String sacarURL(int indice)
    {
        String cadena = "Vacía";
        switch(indice)
        {
            case 0:
                cadena = "xxx.com";
                break;
            case 1:
                cadena = "yyy.com.mx";
                break;
            case 2:
                cadena = "zzz.org.edu";
                break;
        }
        
        return cadena;
    }
    
    public int sacarNumeroAlAzar(int limite)
    {
        return (int) (Math.random() * limite);
    }
}

