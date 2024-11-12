/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_2ejerc3;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n1, n2;
        Entero numero1 = new Entero();

        System.out.print("Introduce un número entero: ");
        n1 = teclado.nextInt();
        numero1.setN(n1);
        System.out.printf("Introduce otro número entero: ");
        n2 = teclado.nextInt();

        System.out.printf("%d + %d = %d\n", n1, n2, numero1.add(n1, n2));
        System.out.printf("%d - %d = %d\n", n1, n2, numero1.resta(n1, n2));
        System.out.printf("%d * 2 = %d\n" +
                "%d * 3 = %d\n",
                n1, numero1.getDoble(), n1, numero1.getTriple());

        teclado.close();
    }

}
