public class Restaurante {
    // atributos
    private double kgPapas, kgChocos;

    // constructores
    public Restaurante() {
        this.kgChocos = 0;
        this.kgPapas = 0;
    }

    public Restaurante(double kgChocos, double kgPapas) {
        this.kgChocos = kgChocos;
        this.kgPapas = kgPapas;
    }

    // getters y setters
    public double getKgPapas() {
        return kgPapas;
    }

    public void setKgPapas(double kgPapas) {
        this.kgPapas = kgPapas;
    }

    public double getKgChocos() {
        return kgChocos;
    }

    public void setKgChocos(double kgChocos) {
        this.kgChocos = kgChocos;
    }

    // metodos
    public int getComensales() {
        // variables necesarias para guardar los numeros y compararlos
        int aux;
        int nP = (int) kgPapas / 3;
        aux = nP;
        nP = (int) kgChocos / 3;
        // comparar para elegir el valor más pequeño
        // aunque sobre del otro, hay que elegir el valo menor para que haya suficiente
        // de ambos
        if (nP < aux)
            return nP;
        else
            return aux;
    }

    public void addChocos(double x) {
        this.kgChocos += x;
    }

    public void addPapas(double x) {
        this.kgPapas += x;
    }

    public void showChocos() {
        System.out.printf("Hay un total de %.2f kg de chocos.\n", this.kgChocos);
    }

    public void showPapas() {
        System.out.printf("Hay un total de %.2f kg de papas.\n", this.kgPapas);
    }

}
