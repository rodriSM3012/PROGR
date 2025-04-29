package seleccion;

public class Masajista extends Persona {
    // atributos
    private String titulacion;
    private int aniosExperiencia;

    // constructores
    public Masajista() {
        super();
        setTitulacion("N/S");
        setAniosExperiencia(0);
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        setTitulacion(titulacion);
        setAniosExperiencia(aniosExperiencia);
    }

    // metodos
    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje() {
        System.out.println(this.toString() + " -> ESTOY DANDO UN MASAJE");
    }

    @Override
    public String toString() {
        return super.toString() + " (Masajista)";
    }
}
