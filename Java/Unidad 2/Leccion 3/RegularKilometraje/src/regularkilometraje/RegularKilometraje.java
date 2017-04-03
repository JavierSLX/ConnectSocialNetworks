/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularkilometraje;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class RegularKilometraje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int kilometraje = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Coloque el kilometraje al que va"));
        
        if (kilometraje >= 0 && kilometraje <= 60)
            JOptionPane.showMessageDialog(null, "Vas a una velocidad adecuada");
        else if (kilometraje > 60 && kilometraje <= 80)
            JOptionPane.showMessageDialog(null, "Vas rápido");
        else
            JOptionPane.showMessageDialog(null, "¡Llevas exceso de velocidad!");
    }
    
}
