package com.example;

import java.util.*;

public class b6_4ejerc10 {
    public static void main(String[] args) {
        Collection<String> semana = new HashSet<>(
                Arrays.asList("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"));
        Collection<String> horario = new HashSet<>(semana);

        // 1.
        System.out.println(semana);

        // 2.
        horario.remove("sabado");
        horario.remove("domingo");

        // 3.
        System.out.println(horario);

        // 4.
        if (horario.contains("Monday")) {
            System.out.println("horario contiene Monday");
        } else {
            System.out.println("horario no contiene Monday");
        }

        // 5.
        semana.retainAll(horario);
        System.out.println(semana);
    }
}