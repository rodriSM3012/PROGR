/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_2ejerc2;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class test {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        MiNumero n1 = new MiNumero();
        int n = 0;

        System.out.print("Introduce un número entero: ");
        n = teclado.nextInt();
        n1.setN(n);

        System.out.println("Doble: " + n1.dobleNumero(n));
        System.out.println("Triple: " + n1.tripleNumero(n));
        System.out.println("Cuádruple: " + n1.cuadrupleNumero(n));

        teclado.close();
    }
}
