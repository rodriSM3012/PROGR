public class Medicos { // medicos es la entidad generica
    // atributos
    String nombre, apel1, apel2; // no se ponen privados por que Medicos es la entidad generica y estos
                                 // atributos van a ser heredados por otras clases

    // constructores
    public Medicos() {
        setNombre("N/S");
        setApel1("N/S");
        setApel2("N/S");
    }

    public Medicos(String nombre, String apel1, String apel2) {
        setNombre(nombre);
        setApel1(apel1);
        setApel2(apel2);
    }

    // metodos
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setApel1(String apel1) {
        this.apel1 = apel1;
    }

    private void setApel2(String apel2) {
        this.apel2 = apel2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApel1() {
        return apel1;
    }

    public String getApel2() {
        return apel2;
    }

    @Override
    public String toString() {
        return "Medicos [nombre=" + nombre + ", apel1=" + apel1 + ", apel2=" + apel2 + "]";
    }

    // en el programa principal no hay que llamar a Medico
}
