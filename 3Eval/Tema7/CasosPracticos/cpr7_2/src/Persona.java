public class Persona {
    // atributos
    public String nombre, apel1, apel2, tel;

    // constructores
    public Persona() {
        setNombre("N/S");
        setApel1("N/S");
        setApel2("N/S");
        setTel("N/S");
    }

    public Persona(String nombre, String apel1, String apel2, String tel) {
        setNombre(nombre);
        setApel1(apel1);
        setApel2(apel2);
        setTel(tel);
    }

    // metodos
    public String getNombre() {
        return nombre;
    }

    public String getApel1() {
        return apel1;
    }

    public String getApel2() {
        return apel2;
    }

    public String getTel() {
        return tel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApel1(String apel1) {
        this.apel1 = apel1;
    }

    public void setApel2(String apel2) {
        this.apel2 = apel2;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apel1=" + apel1 + ", apel2=" + apel2 + ", tel=" + tel + "]";
    }
}
