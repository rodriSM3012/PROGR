package seleccion;

public class Entrenador extends Persona {
    // atributos
    private String idFederacion;

    // constructores
    public Entrenador() {
        super();
        setIdFederacion("N/S");
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        setIdFederacion(idFederacion);
    }

    // metodos
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println(this.toString() + " -> ESTOY DIRIGIENDO UN PARTIDO...");
    }

    public void dirigirEntrenamiento() {
        System.out.println(this.toString() + " -> ESTOY DIRIGIENDO UN ENTRENAMIENTO...");
    }

    @Override
    public String toString() {
        return super.toString() + " (Entrenador)";
    }
}
