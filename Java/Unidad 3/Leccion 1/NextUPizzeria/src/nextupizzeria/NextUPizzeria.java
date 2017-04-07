/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextupizzeria;

import Nextu.pizzeria.Cliente;
import Nextu.pizzeria.Cocinero;
import Nextu.pizzeria.Mensajero;
import Nextu.pizzeria.Orden;
import Nextu.pizzeria.Pizza;

/**
 *
 * @author JavierSLX
 */
public class NextUPizzeria
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        //Elige los ingredientes de la pizza
        Pizza pizza = new Pizza();
        pizza.escogerIngredientes();
        
        //Toma los datos del cliente
        Cliente cliente = new Cliente();
        cliente.pedirDatos();
        
        //Crea la orden
        Orden orden = new Orden(cliente, pizza);
        
        //Se pasa la orden al cocinero
        Cocinero cocinero = new Cocinero(orden);
        cocinero.cocinarPizza();
        cocinero.entregarAMensajero();
        
        //El mensajero hace la parte de aviso y entrega
        Mensajero mensajero = new Mensajero(orden);
        mensajero.enviarEmail();
        mensajero.notificarEntrega();
    }
    
}
