/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fotonextu;

import Nextu.foto.Album;
import Nextu.foto.Efecto;
import Nextu.foto.Fotografia;

/**
 *
 * @author JavierSLX
 */
public class FotoNextU
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Fotografia foto = new Fotografia("Nueva");
        foto.tomarFotografia();
        
        Efecto efecto = new Efecto(foto);
        efecto.aplicarEfecto();
        
        Album album = new Album(foto, "Mi álbum");
        album.grabarFoto();
    }
    
}
