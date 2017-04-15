/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package destructor;

/**
 *
 * @author JavierSLX
 */
public class Destructor
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Cine cine = new Cine();
        cine = null;
        System.gc();
    }
    
}
