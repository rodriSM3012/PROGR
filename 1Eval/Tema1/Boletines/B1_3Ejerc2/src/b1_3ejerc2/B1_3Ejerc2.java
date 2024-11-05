/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_3ejerc2;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class B1_3Ejerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa, suma;
        
        System.out.print("Introduce el valor del primer cateto en cm: ");
        cateto1 = teclado.nextDouble();
        System.out.print("Introduce el valor del segundo cateto en cm: ");
        cateto2 = teclado.nextDouble();
        suma = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        
        hipotenusa = Math.sqrt(suma);
        System.out.printf("La hipotenusa del triángulo mide %.2f cm.\n", hipotenusa);
        teclado.close();
    }    
}
