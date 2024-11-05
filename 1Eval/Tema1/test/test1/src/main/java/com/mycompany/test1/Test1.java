/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test1;

/**
 * test de operadores a++ y i++ con asignaciones a otras variables
 * @author USUARIO
 */
public class Test1 {

    public static void main(String[] args) {
        int a = 5, b = 8;
        System.out.printf("variables sin cambio:\na = %d , b = %d\n\n", a, b);
        b = ++a;
        System.out.printf("Después de b = ++a:\na = %d , b = %d\n\n", a, b);

        System.out.printf("--RESETTING--\n\n", a = 5, b = 8);
        System.out.printf("variables sin cambio:\na = %d , b = %d\n\n", a, b);
        b = a++;
        System.out.printf("Después de b = a++:\na = %d , b = %d\n\n", a, b);
    }
}
