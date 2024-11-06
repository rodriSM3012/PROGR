package com.example;

public class Coche {
    // atributos
    private static String marca, color;
    private static double velocidad;

    // constructores
    public Coche() {
        marca = "Ford";
        color = "blanco";
        velocidad = 0;
    }

    public Coche(String newMarca, String newColor, double newVelocidad) {
        marca = newMarca;
        color = newColor;
        velocidad = newVelocidad;
    }

    // getters y setters
    public static String getMarca() {
        return marca;
    }

    public static String getColor() {
        return color;
    }

    public static double getVelocidad() {
        return velocidad;
    }

    public static void setMarca(String marca) {
        Coche.marca = marca;
    }

    public static void setColor(String color) {
        Coche.color = color;
    }

    public static void setVelocidad(double velocidad) {
        Coche.velocidad = velocidad;
    }

    // metodos
    public double acelerar(double acel) {
        return velocidad =+ acel;
    }

    public double frenar(double fren) {
        return velocidad =- fren;
    }
}
