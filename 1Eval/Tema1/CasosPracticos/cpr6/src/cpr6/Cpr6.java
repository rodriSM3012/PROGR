/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr6;

/**
 *
 * @author ALUMNOS_FP
 */
public class Cpr6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cad1 = "CICLO DAW",
               cad2 = "ciclo daw";
        System.out.printf("La cadena cad1 es: %s\nLa cadena cad2 es: %s\n", cad1, cad2);
        System.out.printf("La longitud de cad1 es: %d caracteres.\n", cad1.length());
        System.out.printf("Las cadenas concatenadas son: %s\n", cad1.concat(cad2));     //cad1 + cad2
        
        //no se puede usar cad1 == cad2
        System.out.printf("¿Las cadenas son iguales? %b\n", cad1.equals(cad2));     //cad1.equalsIgnoreCase(cad2) para ignorar mayus

        System.out.printf("Los cinco primeros caracteres de cad1 son: %s\n", cad1.substring(0, 5));
        System.out.printf("Quiero que cad1 aparezca en minúscula: %s\n", cad1.toLowerCase());
        System.out.printf("Quiero que cad2 aparezca en mayúscula: %s\n", cad2.toUpperCase());        
    }    
}
