package com.empleados;

public class Empleado {
    // atributos
    public String nombre, cargo;
    public int edad;
    public double sueldo;

    // constructores
    public Empleado() {
        setNombre("N/S");
        setEdad(18);
        setCargo("N/S");
        setSueldo(1000);
    }

    public Empleado(String nombre, int edad, String cargo, double sueldo) {
        setNombre(nombre);
        setEdad(edad);
        setCargo(cargo);
        setSueldo(sueldo);
    }

    // metodos
    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        // return String.format("\nNombre:\t\t" + this.nombre +
        // "\nCargo: \t\t" + this.cargo +
        // "\nEdad: \t\t" + this.edad +
        // "\nSueldo:\t\t" + this.sueldo);

        String datos = String.format("\n %-20s %s", "Nombre:", nombre);
        // %-10s → reserva espacio y se va a usar para "Nombre" y lo que no se use
        // quedara vacio
        datos += String.format("\n %-20s %s", "Edad:", edad);
        datos += String.format("\n %-20s %s", "Cargo:", cargo);
        datos += String.format("\n %-20s %.0f", "Sueldo:", sueldo);

        return datos;
    }
}