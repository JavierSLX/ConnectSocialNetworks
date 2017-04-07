/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nextu.pizzeria;

/**
 *
 * @author JavierSLX
 */
public class Orden
{
    private Cliente cliente;
    private Pizza pizza;
    
    public Orden()
    {
        //cliente = new Cliente();
        //pizza = new Pizza();
    }
    
    public Orden(Cliente cliente, Pizza pizza)
    {
        //cliente = new Cliente();
        //pizza = new Pizza();
        this.cliente = cliente;
        this.pizza = pizza;
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public Pizza getPizza()
    {
        return pizza;
    }

    public void setPizza(Pizza pizza)
    {
        this.pizza = pizza;
    }
}
