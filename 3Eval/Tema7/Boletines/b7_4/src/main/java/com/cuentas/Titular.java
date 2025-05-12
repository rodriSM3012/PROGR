package com.cuentas;

public class Titular {
    // atributos
    private String nombre, apellidos;
    private int edad;

    // constructores
    public Titular() {
        this.nombre = ("N/S");
        this.apellidos = ("N/S");
        this.edad = 18;
    }

    public Titular(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // metodos
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
    }
}