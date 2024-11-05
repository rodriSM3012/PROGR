/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr2;

/**
 *
 * @author ALUMNOS_FP
 */
public class Cpr2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // operadores relacionales: < , > , <= , >= , == , !=
        // asignacion: a = b , comparacion: a == b
        int x = 3 , y = 7;
        if ( x > y ) 
            System.out.println("La variable x es mayor que y");
        else 
            System.out.println("La variable x no es mayor que y");
        
        // operadores logicos: && (AND) , || (OR) , ! (NOT)
        int edad = 30;
        if (edad >= 18 || edad <= 25)
            System.out.println("Puede usted realizar la solicitud.");
        else
            System.out.println("No puede realizar la solicitud.");
            
    }
}