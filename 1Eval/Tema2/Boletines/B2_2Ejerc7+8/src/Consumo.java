public class Consumo {
    // atributos
    private double kms, litros, vMed, pGas;

    // constructores
    public Consumo() {
        this.kms = 0;
        this.litros = 0;
        this.vMed = 0;
        this.pGas = 0;
    }

    public Consumo(double kms, double litros, double vMed, double pGas) {
        this.kms = kms;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    // getters y setters
    public double getKms() {
        return kms;
    }

    public void setKms(double kms) {
        this.kms = kms;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getvMed() {
        return vMed;
    }

    public void setvMed(double vMed) {
        this.vMed = vMed;
    }

    public double getpGas() {
        return pGas;
    }

    public void setpGas(double pGas) {
        this.pGas = pGas;
    }

    // metodos
    public double getTiempo() {
        return this.kms / this.vMed;
    }

    public double consumoMedio() {
        return this.litros / this.kms * 100;
    }

    public double consumoEuros() {
        return this.consumoMedio() * this.pGas;
    }
}
