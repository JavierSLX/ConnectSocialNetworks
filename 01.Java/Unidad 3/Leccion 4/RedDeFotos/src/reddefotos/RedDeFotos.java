/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reddefotos;

import javax.swing.JOptionPane;

/**
 *
 * @author JavierSLX
 */
public class RedDeFotos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //Se crean dos usuarios
        Usuario yop = new Usuario("Javier", "JavierSLX");
        Usuario alguien = new Usuario("Eli", "Ely");
        
        //Se crean los muros
        Mural MuroJavier = new Mural(yop);
        Mural MuroEli = new Mural(alguien);
        
        //Inserta 3 fotos nuevas a los murales
        Foto foto;
        for (int i = 0; i < 3; i++)
        {
            foto = new Foto("Vacío");
            foto.fotoAlAzar();
            MuroJavier.insertarFoto(foto);
        }
        
        for (int i = 0; i < 3; i++)
        {
            foto = new Foto("Vacío");
            foto.fotoAlAzar();
            MuroEli.insertarFoto(foto);
        }
        
        //Los usuarios se siguen
        yop.seguirUsuario(MuroEli);
        alguien.seguirUsuario(MuroJavier);
        
        //Veo los murales que sigo
        yop.verMuralesSeguidos();
        
        //Veo la primera foto de eli
        String primera = String.format("La primera foto llamada %s es del usuario %s que tu sigues", 
            yop.getMurales().get(0).getFotos().get(0).getNombre(), yop.getMurales().get(0).getUsuario().getNombre());
        JOptionPane.showMessageDialog(null, primera);
    }
    
}
