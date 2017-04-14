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
public class Pintor
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        AplicacionDeDibujo aplicacion = new AplicacionDeDibujo();
        aplicacion.crearPapel(10, 20, "Estándar", 0.02);
        aplicacion.mostrarLienzo();
        aplicacion.crearTela(20, 50, "Parisina", 0.05, "Negro");
        aplicacion.mostrarLienzo();
        aplicacion.crearBrocha(2, "Vinci", 10, 5);
        aplicacion.mostrarPincel();
    }
    
}
