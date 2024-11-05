/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr2_2;

/**
 *
 * @author ALUMNOS_FP
 */
public class Mesa {
    // atributos
    private double alto, largo, ancho;
    private String material;

    // cosntructor por defecto
    public Mesa() {
        alto = 100;
        largo = 100;
        ancho = 100;
        material = "Madera de roble";
    }

    // constructor por parametros
    public Mesa(double newAlto, double newLargo, double newAncho, String newMaterial) {
        alto = newAlto;
        largo = newLargo;
        ancho = newAncho;
        material = newMaterial;
    }

    // setters
    public void setAlto(double newAlto) {
        alto = newAlto;
    }

    public void setLargo(double newLargo) {
        largo = newLargo;
    }

    public void setAncho(double newAncho) {
        ancho = newAncho;
    }

    public void setMaterial(String newMaterial) {
        material = newMaterial;
    }

    // getters
    public double getAlto() {
        return alto;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public String getMaterial() {
        return material;
    }
}
