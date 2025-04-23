public class Profesor extends Persona {
    // atributos
    private int codProf;
    private String asignatura;

    // constructores
    public Profesor() {
        super();
        setCodProf(0);
        setAsignatura("N/S");
    }

    public Profesor(String nombre, String apel1, String apel2, String tel, int codProf, String asignatura) {
        super(nombre, apel1, apel2, tel);
        setCodProf(codProf);
        setAsignatura(asignatura);
    }

    // metodos
    public int getCodProf() {
        return codProf;
    }

    public String getAsignatura() {
        return asignatura;
    }

    private void setCodProf(int codProf) {
        this.codProf = codProf;
    }

    private void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString() + " Profesor [codProf=" + codProf + ", asignatura=" + asignatura + "]";
    }
}
