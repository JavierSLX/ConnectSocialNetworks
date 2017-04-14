/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

/**
 *
 * @author JavierSLX
 */
public class Futbol
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Jugador jugador = new Jugador();
        jugador.setNombre("Juan");
        jugador.setNumero(0);
        jugador.mostrarDatosJugador();
        
        Jugador portero = new Portero();
        portero.setNombre("Héctor");
        portero.setNumero(55);
        portero.mostrarDatosJugador();
        
        Jugador defensa = new Defensa();
        defensa.setNombre("Miguel");
        defensa.setNumero(2);
        defensa.mostrarDatosJugador();
        
        Jugador medio = new Medio();
        medio.setNombre("Charlie");
        medio.setNumero(21);
        medio.mostrarDatosJugador();
        
        Jugador delantero = new Delantero();
        delantero.setNombre("Javier");
        delantero.setNumero(9);
        delantero.mostrarDatosJugador();
    }
}
