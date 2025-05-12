package com.cuentas;

public class Main {
    public static void main(String[] args) {
        Titular t1 = new Titular("Pepe", "García", 28);
        Titular t2 = new Titular("Lola", "Montero", 35);
        Titular t3 = new Titular("Chindasvinto", "Martinez", 32);

        Cuenta c = new Cuenta(t1, "CC001", 10000);
        CuentaCorriente cc = new CuentaCorriente(t1, "CC002", 20500);
        CuentaAhorro ca = new CuentaAhorro(t2, "CA001", 3500, 0.1);


    }
}