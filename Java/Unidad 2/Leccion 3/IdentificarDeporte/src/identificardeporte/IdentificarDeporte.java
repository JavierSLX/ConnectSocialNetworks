/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identificardeporte;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class IdentificarDeporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad"));
        double estatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la estatura"));
        
        if (estatura >= 2)
        {
            if (edad >= 18)
                JOptionPane.showMessageDialog(null, "Puede jugar Baloncesto, Voleibol y Futbol");
            else
                JOptionPane.showMessageDialog(null, "Puede jugar Voleibol y Futbol");
        }
        else
        {
            if (edad < 18)
                JOptionPane.showMessageDialog(null, "Puede jugar Voleibol y Futbol");
            else
                JOptionPane.showMessageDialog(null, "Mala suerte :v");
        }
    }
    
}
