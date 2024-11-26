package com.example;

public class Dimension {
    // atributos
    private double alto, ancho, profundidad;

    // constructor
    public Dimension() {
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    // getters y setters
    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    // metodos
    public double getVolumen() {
        return alto * ancho * profundidad;
    }

    // toString
    @Override
    public String toString() {
        return "Dimension [alto = " + this.alto + ", ancho = " + this.ancho + ", profundidad = " + this.profundidad
                + "]";
    }
}
