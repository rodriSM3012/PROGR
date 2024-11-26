package com.example;

public class Superheroe {
    // atributos
    private String nombre, descrip;
    private boolean capa;

    // constructor
    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.descrip = " ";
        this.capa = false;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    // toString
    @Override
    public String toString() {
        return "Superheroe [nombre=" + this.nombre + ", descrip=" + this.descrip + ", capa=" + this.capa + "]";
    }

}
