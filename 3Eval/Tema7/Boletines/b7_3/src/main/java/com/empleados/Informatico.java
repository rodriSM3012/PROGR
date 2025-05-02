package com.empleados;

public class Informatico extends Empleado {
    // atributos
    private String departamento;
    
    // constructores
    public Informatico() {
        this.departamento = ("N/S");
    }

    public Informatico(String nombre, int edad, String cargo, double sueldo, String departamento) {
        super(nombre, edad, cargo, sueldo);
        this.departamento = departamento;
    }

    // metodos
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Informatico [departamento=" + departamento + "]";
    }  
}
