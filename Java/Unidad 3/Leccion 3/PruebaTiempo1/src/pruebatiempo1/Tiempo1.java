/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatiempo1;

/**
 *
 * @author JavierSLX
 */
public class Tiempo1
{
    private int hora;
    private int minuto;
    private int segundo;
    
    public void establecerTiempo(int hora, int minuto, int segundo)
    {
        this.hora = ((hora >= 0 && hora <= 24) ? hora : 0);
        this.minuto = ((minuto >= 0 && minuto < 60) ? minuto : 0);
        this.segundo = ((segundo >= 0 && segundo < 60) ? segundo : 0);
    }
    
    public String tiempoAUniversal()
    {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
    
    public String tiempoAEstandar()
    {
        return String.format("%d:%02d:%02d %s", ((this.hora == 0 || this.hora == 12) ? 12 : hora % 12),
            this.minuto, this.segundo, (this.hora < 12 ? "AM" : "PM"));
    }
}
