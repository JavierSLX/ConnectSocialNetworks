/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantefor;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class RestauranteFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int veces = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Ingrese las veces que quiere que se muestre el letrero"));
        
        for (int i = 0; i < veces; i++)
            JOptionPane.showMessageDialog(null, 
                "Restaurante para programadores. (Anuncio hecho " + i + " vez)");
    }
    
}
