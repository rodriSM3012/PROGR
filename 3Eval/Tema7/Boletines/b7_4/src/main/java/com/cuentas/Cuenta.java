package com.cuentas;

public class Cuenta {
    // atributos
    public String numeroCuenta;
    public double saldo;

    // constructores
    public Cuenta() {
        this.numeroCuenta = "0";
        this.saldo = 0;
    }

    public Cuenta(Titular t1, double saldo) {
        this.saldo = saldo;
    }

    // metodos
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double cantidad) {
        this.saldo += cantidad;
    }

    public void reintegro(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva.");
        } else {
            if (this.saldo >= cantidad) {
                this.saldo -= cantidad;
            } else {
                throw new IllegalArgumentException("Saldo insuficiente.");
            }
        }
    }

    public void imprimir() {
        // System.out.printf(String.format("%-15s %s", "Nombre", this.nombre));
        System.out.printf("\nSaldo de la cuenta: %.2f€", this.saldo);
    }

    public boolean compararCuentas(Cuenta otraCuenta) {
        return this.saldo > otraCuenta.saldo ? true : false;
    }

    @Override
    public String toString() {
        return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + "]";
    }
}
