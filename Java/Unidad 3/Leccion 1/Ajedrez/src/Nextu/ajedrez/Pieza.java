/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nextu.ajedrez;

/**
 *
 * @author JavierSLX
 */
public class Pieza
{
    private boolean activa;
    private int posicionX;
    private int posicionY;

    public boolean isActiva()
    {
        return activa;
    }

    public void setActiva(boolean activa)
    {
        this.activa = activa;
    }

    public int getPosicionX()
    {
        return posicionX;
    }

    public void setPosicionX(int posicionX)
    {
        this.posicionX = posicionX;
    }

    public int getPosicionY()
    {
        return posicionY;
    }

    public void setPosicionY(int posicionY)
    {
        this.posicionY = posicionY;
    }
    
}
