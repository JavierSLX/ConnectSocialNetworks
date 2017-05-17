/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appejemplo;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class AppEjemplo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Cine cine = new Cine();
        cine.setDireccion("Zaragoza 212");
        JOptionPane.showMessageDialog(null, cine.getDireccion());
        JOptionPane.showMessageDialog(null, cine.getId());
    }
    
}
