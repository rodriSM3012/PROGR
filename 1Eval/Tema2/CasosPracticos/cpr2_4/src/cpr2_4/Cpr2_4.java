/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr2_4;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class Cpr2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // pedir valor numerico de temperatura con sout con mensaje temp bajo 0 o 0ºC o
        // positiva
        Scanner teclado = new Scanner(System.in);
        double temp;
        System.out.print("Introduce un número para indicar la temperatura: ");
        temp = teclado.nextDouble();

        if (temp > 0)
            System.out.printf("La temperatura son %.2fºC.", temp);
        else if (temp == 0)
            System.out.println("La temperatura es de 0ºC.");
        else
            System.out.printf("La temperatura son %.2fºC bajo cero", Math.sqrt(temp * temp)); // Math.abs(temp)

        teclado.close();
    }
}
