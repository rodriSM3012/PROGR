package b2_2ejerc3;

public class Entero {
    // atributos
    private static int n;

    // constructores
    public Entero() {
        n = 0;
    }

    public Entero(int newN) {
        n = newN;
    }

    // getters y setters
    public void setN(int newN) {
        n = newN;
    }

    public int getN() {
        return n;
    }

    // metodos
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int resta(int n1, int n2) {
        return n1 - n2;
    }

    public int getDoble() {
        return 2 * n;
    }

    public int getTriple() {
        return 3 * n;
    }
}
