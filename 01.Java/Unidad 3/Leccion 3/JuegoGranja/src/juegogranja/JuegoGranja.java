/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegogranja;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class JuegoGranja
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Usuario granjero = new Granjero();
        granjero.setNombre("Javier");
        
        //Comienza el juego
        Granjero jugador = (Granjero) granjero;
        jugador.setNick(granjero.getNombre());
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos animales quiere registrar"));
        Animal []animal = new Animal[cantidad];
        int cont = 0;
        do
        {
            String cadena;
            cadena = JOptionPane.showInputDialog(null, "¿Qué animal quiere registrar");
            if (cadena.equals("Vaca"))
            {
                String color = JOptionPane.showInputDialog(null, "¿Qué color tiene la vaca?");
                int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque su edad"));
                double tamano = Double.parseDouble(JOptionPane.showInputDialog(null, "Coloque su tamaño"));
                animal[cont] = new Vaca(color, edad, tamano);
                animal[cont].setPorcentajeAlimento();
                JOptionPane.showMessageDialog(null, animal[cont]);
                cont++;
            }
            else if (cadena.equals("Gallina"))
            {
                String plumaje = JOptionPane.showInputDialog(null, "¿Qué plumaje tiene la gallina?");
                int patas = Integer.parseInt(JOptionPane.showInputDialog(null, "Coloque las patas"));
                double tamano = Double.parseDouble(JOptionPane.showInputDialog(null, "Coloque su tamaño"));
                animal[cont] = new Gallina(plumaje, patas, tamano);
                animal[cont].setPorcentajeAlimento();
                JOptionPane.showMessageDialog(null, animal[cont]);
                cont++;
            }
            
        }while(cont < cantidad);
        
        jugador.alimentar(animal[0]);
        JOptionPane.showMessageDialog(null, animal[0]);
    }
    
}
