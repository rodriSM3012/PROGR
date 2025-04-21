public class Cirujanos extends Medicos {
    // atributos
    private int codHospital;
    private String tipoSeguro;

    // constructores
    public Cirujanos() {
        super();
        setCodHospital(0);
        setTipoSeguro("N/S");
    }

    public Cirujanos(String nombre, String apel1, String apel2, int codHospital, String tipoSeguro) {
        super(nombre, apel1, apel2);
        setCodHospital(codHospital);
        setTipoSeguro(tipoSeguro);
    }

    // metodos

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public void setCodHospital(int codHospital) {
        this.codHospital = codHospital;
    }

    public int getCodHospital() {
        return codHospital;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    @Override
    public String toString() {
        return "Cirujanos [codHospital=" + codHospital + ", tipoSeguro=" + tipoSeguro + super.toString() + "]";
    }

}
