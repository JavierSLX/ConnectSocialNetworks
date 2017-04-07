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
public class Tablero
{
    private int[][] tablero = new int[8][8];

    public int[][] getTablero()
    {
        return tablero;
    }

    public void setTablero(int[][] tablero)
    {
        this.tablero = tablero;
    }
}
