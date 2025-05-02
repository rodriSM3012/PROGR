package com.empleados;

public class Director extends Empleado {
    // atributos
    private int dietas;

    // constructores
    public Director() {
        this.dietas = 0;
    }

    public Director(String nombre, int edad, String cargo, double sueldo, int dietas) {
        super(nombre, edad, cargo, sueldo);
        this.dietas = dietas;
    }

    // metodos
    public int getDietas() {
        return dietas;
    }

    public void setDietas(int dietas) {
        this.dietas = dietas;
    }

    @Override
    public String toString() {
        return "Director [dietas=" + dietas + "]";
    }
}
