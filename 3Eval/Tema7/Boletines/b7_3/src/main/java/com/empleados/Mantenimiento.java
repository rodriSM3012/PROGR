package com.empleados;

public class Mantenimiento extends Empleado {
    // atributos
    private int horasExtra;
    private float precioHorasExtra;

    // constructores
    public Mantenimiento() {
        this.horasExtra = 0;
        this.precioHorasExtra = 0;
    }

    public Mantenimiento(String nombre, int edad, String cargo, double sueldo, int horasExtra, float precioHorasExtra) {
        super(nombre, edad, cargo, sueldo);
        this.horasExtra = horasExtra;
        this.precioHorasExtra = precioHorasExtra;
    }

    // metodos
    public int getHorasExtra() {
        return horasExtra;
    }

    public float getPrecioHorasExtra() {
        return precioHorasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void setPrecioHorasExtra(float precioHorasExtra) {
        this.precioHorasExtra = precioHorasExtra;
    }

    @Override
    public String toString() {
        return "Mantenimiento [horasExtra=" + horasExtra + ", precioHorasExtra=" + precioHorasExtra + "]";
    }
}
