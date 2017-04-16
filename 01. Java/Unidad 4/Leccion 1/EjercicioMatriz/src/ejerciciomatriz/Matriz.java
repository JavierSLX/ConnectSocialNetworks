/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomatriz;

import java.util.Arrays;

/**
 *
 * @author JavierSLX
 */
public class Matriz
{
    private int[][] matriz1;
    private int[][] matriz2;

    public Matriz()
    {
    }

    public Matriz(int[][] matriz1, int[][] matriz2)
    {
        this.matriz1 = matriz1;
        this.matriz2 = matriz2;
    }

    public int[][] getMatriz1()
    {
        return matriz1;
    }

    public void setMatriz1(int[][] matriz1)
    {
        this.matriz1 = matriz1;
    }

    public int[][] getMatriz2()
    {
        return matriz2;
    }

    public void setMatriz2(int[][] matriz2)
    {
        this.matriz2 = matriz2;
    }
    
    public int[][] sumarMatrices()
    {
        int[][] matriz = new int[this.matriz1.length][this.matriz1[0].length];
        
        for (int i = 0; i < this.matriz1.length; i++)
            for (int j = 0; j < this.matriz1[i].length; j++)
                matriz[i][j] = this.matriz1[i][j] + this.matriz2[i][j];
        
        return matriz;
    }
    
    public int[][] sumarMatrices(int[][] matrizA, int[][] matrizB)
    {
        int[][] matriz = new int[matrizA.length][matrizA[0].length];
        
        for (int i = 0; i < matrizA.length; i++)
            for (int j = 0; j < matrizA[i].length; j++)
                matriz[i][j] = matrizA[i][j] + matrizB[i][j];
        
        return matriz;
    }
    
    public String imprimirMatriz(int[][] matriz)
    {
        String resultado = "";
        for (int i = 0; i < matriz.length; i++)
            resultado += Arrays.toString(matriz[i]) + "\n\n";
        
        return resultado;
    }
    
    public int[][] llenarAlAzar(int a, int b)
    {
        int[][] matriz = new int[a][b];
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                matriz[i][j] = (int)(Math.random() * 100);
        
        return matriz;
    }
}
