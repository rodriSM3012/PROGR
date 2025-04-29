package seleccion;

public class Futbolista extends Persona {
    // atributos
    private int dorsal;
    private String demarcacion;

    // constructores
    public Futbolista() {
        super();
        setDorsal(1);
        setDemarcacion("N/S");
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        setDorsal(dorsal);
        setDemarcacion(demarcacion);
    }

    // metodos
    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println(this.toString() + " -> AHORA ESTOY JUGANDO...");
    }

    public void entrenar() {
        System.out.println(this.toString() + " -> AQUÍ...DE ENTRENAMIENTO...");
    }

    @Override
    public String toString() {
        return super.toString() + " (Futbolista)";
    }
}
