/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author JavierSLX
 */
public class App
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Piano piano = new Piano();
        piano.tocar();
        piano.detener();
        
        Guitarra guitarra = new Guitarra();
        guitarra.tocar();
        guitarra.afinar();
        guitarra.detener();
        
        Violin violin = new Violin();
        violin.tocar();
        violin.afinar();
        violin.detener();
    }
    
}
