/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr1;

/**
 *
 * @author ALUMNOS_FP
 */
public class Cpr1 {

    /**
     * @param args the command line arguments
     */
    final static double PI = 3.1416; //valor constante que no cambia nunca
    public static void main(String[] args) {
        // TODO code application logic here
        double r = 2.5 , l;
        l = 2 * PI * r;
        // operadores aritmeticos: suma + , resta - , mult * , division / , modulo %
        // si los operadores de la division son int el resultado no tendra decimales,
        // solo salen decimales si 1 de los 2 es float/double o usar un cast:
        // c = (float) a / b
        // si se declara la variable del resultado como float/double, 
        // el resultado saldra con decimales pero la operacion ya se ha hecho con enteros y siempre saldra X.0
        int a = 5 , b = 2;
        float c;
        System.out.println("Buenos días");
        System.out.println("Bienvenidos a la clase de programación");
        c = a % b;
        System.out.println(c);
        System.out.println(l);
    }
}
