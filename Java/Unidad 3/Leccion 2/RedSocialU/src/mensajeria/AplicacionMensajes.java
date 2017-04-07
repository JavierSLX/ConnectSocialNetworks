/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajeria;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author JavierSLX
 */
public class AplicacionMensajes
{
    private Grupo grupo;
    private List<Bitacora> mensajes;
    
    public AplicacionMensajes()
    {
        grupo = new Grupo();
        mensajes = new ArrayList<>();
    }
    
    public void crearGrupo()
    {
        List<Usuario> usuarios = new ArrayList<>();
        
        int integrantes = Integer.parseInt(JOptionPane.showInputDialog(null, 
            "¿Cuántos integrantes tendrá su grupo?"));
        Usuario[] users = new Usuario[integrantes];
        
        this.grupo.setNombre(JOptionPane.showInputDialog(null, "Coloque el nombre de su grupo"));
        
        for (int i = 0; i < integrantes; i++)
        {
            users[i] = new Usuario();
            users[i].setNombre(JOptionPane.showInputDialog(null, "Coloque el integrante " + (i+1)));
            usuarios.add(users[i]);
        }
        
        this.grupo.setGrupo(usuarios);
    }
}
