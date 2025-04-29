package seleccion;

public class Persona {
    // atributos
    public int id, edad;
    public String nombre, apellidos;

    // constructores
    public Persona() {
        setId(0);
        setNombre("N/S");
        setApellidos("N/S");
        setEdad(16);
    }

    public Persona(int id, String nombre, String apellidos, int edad) {
        setId(id);
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
    }

    // metodos
    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void concentrarse() {
        System.out.println(this.toString() + " -> EN CONCENTRACIÓN...");
    }

    public void viajar() {
        System.out.println(this.toString() + " -> DE VIAJE...");
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }
}