package com.empleados;

public class GestionEmpleados {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(
                "Tolomiro Casiveo",
                32,
                "Técnico soldador",
                2000);
        Director dir1 = new Director(
                "Gerardo Mandón",
                58,
                "Director General",
                9000,
                100);
        Mantenimiento mant1 = new Mantenimiento(
                "Telva Latuerca",
                28,
                "Técnica Refrigación",
                1800,
                5,
                20);
        Informatico inf1 = new Informatico(
                "Tecla McIntosh",
                36,
                "Técnica de Gestión",
                1850,
                "Administración");

        System.out.println(emp1.toString());
        System.out.println(dir1.toString());
        System.out.println(mant1.toString());
        System.out.println(inf1.toString());
    }
}
