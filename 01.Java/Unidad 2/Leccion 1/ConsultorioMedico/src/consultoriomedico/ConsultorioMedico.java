/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriomedico;

import java.util.Scanner;

/**
 *
 * @author JavierSLX
 */
public class ConsultorioMedico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int identificacion;
        double estatura;
        
        System.out.println("Coloque el nombre del paciente: ");
        nombre = teclado.nextLine();
        System.out.println("Coloque la identificación del paciente: ");
        identificacion = teclado.nextInt();
        System.out.println("Coloque la estatura del paciente: ");
        estatura = teclado.nextDouble();
        
        System.out.println("El nombre del paciente es " + nombre);
        System.out.println("La identificación del paciente es " + identificacion);
        System.out.println("La estatura del paciente es " + estatura);
    }
    
}
