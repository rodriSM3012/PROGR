/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr2_3;

/**
 *
 * @author ALUMNOS_FP
 */
public class Pantalones {
    // atributos
    private double cintura, cadera, largo; // no se pasan nunca por parámetros
    private char color;

    // variable
    private static double largoCorte = 0;

    // constructor por defecto
    public Pantalones() {
        cintura = 100;
        cadera = 50;
        largo = 120;
        color = 'a';
    }

    // constructor por parametros
    public Pantalones(double newCintura, double newCadera, double newLargo, char newColor) {
        cintura = newCintura;
        cadera = newCadera;
        largo = newLargo;
        color = newColor;
    }

    public Pantalones(double newCintura, char newColor) {
        cintura = newCintura;
        cadera = 50;
        largo = 120;
        color = newColor;
    }

    // setters
    public void setCintura(double newCintura) {
        cintura = newCintura;
    }

    public void setCadera(double newCadera) {
        cadera = newCadera;
    }

    public void setLargo(double newLargo) {
        largo = newLargo;
    }

    public void setColor(char newColor) {
        color = newColor;
    }

    // getters
    public double getCintura() {
        return cintura;
    }

    public double getCadera() {
        return cadera;
    }

    public double getLargo() {
        return largo;
    }

    public char getColor() {
        return color;
    }

    // otros metodos
    public double cortarLargo(double largoCorte) {
        largo = largo - largoCorte;
        return largo;
    }
}