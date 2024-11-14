package b2_2ejerc4;

public class Peso {
    // atributos
    private double masa;
    // private String tipoMedida;

    // constructores
    public Peso() {
        masa = 0;
    }

    public Peso(double masa) {
        this.masa = masa;
        // this.tipoMedida = tipoMedida;
    }

    // getters y setters
    public double getMasa() {
        return masa;
    }

    // public String getTipoMedida() {
    //     return tipoMedida;
    // }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    // public void setTipoMedida(String tipoMedida) {
    //     this.tipoMedida = tipoMedida;
    // }

    // metodos
    public double getLibras() {
        return this.masa / 2.20462;
    }

    public double getLingotes() {
        return this.masa * 12.44;
    }

    public double getPeso(double masa, String tipoMedida) {
        // 1 libra (lb) = 0.453592 kg
        // 1 lingote de oro ≈ 12.44 kg
        // 1 lingote de plata ≈ 31.1 kg
        // 1 onza (oz) = 0.0283495 kg
        // 1 penique (d) ≈ 0.00189 kg
        // 1 gramo (g) = 0.001 kg
        // 1 quintal métrico = 100 kg
        if (tipoMedida.equals("Lb"))
            return masa * 0.453592;
        else if (tipoMedida.equals("Li"))
            return masa * 12.44;
        else if (tipoMedida.equals("Oz"))
            return masa * 0.0283495;
        else if (tipoMedida.equals("P"))
            return masa * 0.00189;
        else if (tipoMedida.equals("G"))
            return masa * 0.001;
        else if (tipoMedida.equals("Q"))
            return masa * 100;
        else
            return -1;
    }
}
