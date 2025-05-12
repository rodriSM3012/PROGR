package com.cuentas;

public class CuentaCorriente extends Cuenta {
    // atributos
    private double limiteCredito;

    // constructores
    public CuentaCorriente() {
        this.limiteCredito = 0;
    }

    public CuentaCorriente(Titular t, double saldo, double limiteCredito) {
        super(t, saldo);
        this.limiteCredito = limiteCredito;
    }

    // metodos
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double calcularLimite() {
        return this.saldo * 1.5;
    }

    @Override
    public String toString() {
        return "CuentaCorriente [limiteCredito=" + limiteCredito + "]";
    }
}
