package b2_2ejerc3;

public class Entero {
    // atributos
    private int n;

    // constructores
    public Entero() {
        this.n = 0;
    }

    public Entero(int n) {
        this.n = n;
    }

    // getters y setters
    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return this.n;
    }

    // metodos
    public int add(int n1, int n2) {
        return n1 += n2;
    }

    public int resta(int n1, int n2) {
        return n1 -= n2;
    }

    public int getDoble() {
        return 2 * this.n;
    }

    public int getTriple() {
        return 3 * n;
    }
}
