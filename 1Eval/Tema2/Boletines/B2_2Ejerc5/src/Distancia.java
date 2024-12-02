public class Distancia {
    // atributos
    private double distancia;

    // constructores
    public Distancia() {
        this.distancia = 0;
    }

    public Distancia(double distancia) {
        this.distancia = distancia;
    }

    // getters y setters
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    // metodos
    public double millasAMetros() {
        return this.distancia * 1852;
    }

    public double millasAKilometros() {
        return this.distancia * 1.852;
    }

}
