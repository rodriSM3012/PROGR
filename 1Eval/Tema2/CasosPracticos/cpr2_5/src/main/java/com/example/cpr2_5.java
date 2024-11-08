package com.example;

import java.util.Scanner;

public class cpr2_5 {
    public static void main(String[] args) {
        // 1 -> promocion 2 -> personalizarlo
        // a -> acelerar f -> frenar
        Scanner teclado = new Scanner(System.in);
        double velocidad, acel = 0, fren = 0;
        String color, marca, p2;
        Coche coche1 = new Coche();

        System.out.print("Introduce la marca del coche: ");
        marca = teclado.nextLine();
        System.out.print("Introduce el color del coche: ");
        color = teclado.nextLine();
        System.out.print("¿A qué velocidad en km/h va el coche? ");
        velocidad = teclado.nextDouble();
        coche1 = new Coche(marca, color, velocidad);
        teclado.nextLine();
        System.out.print("¿El coche está acelerando o frenando? (a/f): ");
        p2 = teclado.nextLine();

        if (p2.equals("a")) {
            System.out.print("Introduce cuántos km/h ha acelerado el coche: ");
            acel = teclado.nextDouble();
            coche1.acelerar(acel);
        } else {
            System.out.print("Introduce cuántos km/h ha frenado el coche: ");
            fren = teclado.nextDouble();
            coche1.frenar(fren);
        }

        System.out.printf("Coche de marca %s y de color %s.\n", marca, color);
        System.out.print("La velocidad del coche después de ");
        if (p2.equals("a")) {
            velocidad = coche1.acelerar(acel);
            System.out.printf("acelerar es de %.2f km/h\n", velocidad);
        } else {
            velocidad = coche1.frenar(fren);
            System.out.printf("frenar es de %.2f km/h\n", velocidad);
        }

        teclado.close();
    }
}