/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_2ejerc1;

/**
 *
 * @author ALUMNOS_FP
 */
public class Finanzas {
    // atributos
    private static double valorConv;

    // constructor por defecto
    public Finanzas() {
        valorConv = 1.36;
    }

    // constructor por parametros
    public Finanzas(double val) {
        valorConv = val;
    }

    // metodos
    public double dolaresToEuros(double dol) {
        return dol / valorConv;
    }

    public double eurosToDolares(double eur) {
        return eur * valorConv;
    }
    
}
