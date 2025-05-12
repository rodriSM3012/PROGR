package com.cuentas;

public class CuentaAhorro extends Cuenta {
    // atributos
    private double interes;

    // constructores
    public CuentaAhorro() {
        this.interes = 0;
    }

    public CuentaAhorro(Titular t, double saldo, double interes) {
        super(t, saldo);
        this.interes = interes;
    }

    // metodos
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

}
