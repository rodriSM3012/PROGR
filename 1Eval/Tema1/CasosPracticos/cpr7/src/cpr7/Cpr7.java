/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr7;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class Cpr7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        String nombre, pob;
        int edad;

        System.out.print("Introduce tu nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Introduce tu edad: ");
        edad = teclado.nextInt();
        //en este ejercicio no se permite introducir "población"; esto es por introducir un String depués de un entero
        //al poner "teclado.nextLine();" se soluciona
        teclado.nextLine();
        System.out.printf("Población: ");
        pob = teclado.nextLine();

        System.out.printf("Nombre: %s\nEdad: %d\nPoblación: %s\n", nombre, edad, pob);

        teclado.close();
    }    
}
