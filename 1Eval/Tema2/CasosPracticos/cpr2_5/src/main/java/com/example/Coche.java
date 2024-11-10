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
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setMarca(String marca) {
        Coche.marca = marca;
    }

    public void setColor(String color) {
        Coche.color = color;
    }

    public void setVelocidad(double velocidad) {
        Coche.velocidad = velocidad;
    }

    // metodos
    public double acelerar(double acel) {
        return velocidad = velocidad + acel;
    }

    public double frenar(double fren) {
        return velocidad = velocidad - fren;
    }
}
