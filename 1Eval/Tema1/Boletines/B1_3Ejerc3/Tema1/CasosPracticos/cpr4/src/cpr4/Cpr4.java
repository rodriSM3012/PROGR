/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr4;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class Cpr4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado =  new Scanner(System.in);
        String nom, apell;
        int edad;
        
        System.out.print("Introduce tu nombre: ");
        nom = teclado.nextLine();
        System.out.print("Introduce tu primer apellido: ");
        apell = teclado.nextLine();
        System.out.print("Introduce tu edad: ");
        edad = teclado.nextInt();
        
        System.out.printf("Perfil\n\tNombre: %s\n\tApellido: %s\n\tEdad: %d\n", nom, apell, edad);
        teclado.close();
    }    
}
