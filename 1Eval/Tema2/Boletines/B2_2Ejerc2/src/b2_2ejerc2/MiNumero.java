/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_2ejerc2;

/**
 *
 * @author ALUMNOS_FP
 */
public class MiNumero {
    // atributos
    private int n;
    
        // constructor por defecto
        public MiNumero() {
            n = 2;
        }
    
        // constructor por parametros
        public MiNumero(int n) {
            this.n = n;
        }
    
        // setters
        public void setN(int n) {
            this.n = n;
    }

    // getters
    public int getN() {
        return n;
    }

    // metodos
    public int dobleNumero(int n) {
        return n * 2;
    }

    public int tripleNumero(int n) {
        return 3 * n;
    }

    public int cuadrupleNumero(int n) {
        return 4 * n;
    }
}
