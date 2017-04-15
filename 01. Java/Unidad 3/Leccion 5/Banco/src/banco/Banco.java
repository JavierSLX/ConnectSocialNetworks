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
public class Banco
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //Se crea una cuenta
        CuentaAhorro cuenta = new CuentaAhorro("123456", 10000);
        cuenta.saldo();
        cuenta.retirar(1000);
        cuenta.saldo();
        
        Prestramo prestramo = new Prestramo();
        prestramo.retirar(20000);
        prestramo.saldo();
        prestramo.pagar(15000);
        prestramo.saldo();
        prestramo.pagar(10000);
    }
    
}
