/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author JavierSLX
 */
public interface PrestamoBancario
{
    public void saldo();
    public void pagar(double cantidad);
    public void retirar(double cantidad);
}
