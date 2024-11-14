public class Persona {
    // atributos
    private String nombre, apellidos;
    private int edad, altura;
    private float peso;

    // constructores
    public Persona() {
        this.nombre = "Desconocido";
        this.apellidos = "Desconocido";
        this.edad = 0;
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this(nombre, apellidos); // se puede hacer porque hay otro constructor (el de arriba) con los mismos
                                 // parametros en el mismo orden
        this.edad = edad;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    // metodos
    public void caminar() {
        System.out.println("Estoy caminando.");
    }

    public void hablar() {
        System.out.println("Estoy hablando.");
    }

    public void nacer() {
        System.out.println("Acabo de nacer.");
    }

    public void morir() {
        System.out.println("Hasta más ver.");
    }

    public void presentacion() {
        System.out.println(
                "Mi nombre es " + this.nombre + " " + this.apellidos + ", y tengo " + this.edad + " años de edad.");
    }

    public void saludo(String mensj) {
        System.out.println(
                "Hola, soy " + this.nombre + " " + this.apellidos + ", y quiero saludarte diciendote " + mensj);
    }

    public String obtenerNomCompleto() {
        return this.nombre + " " + this.apellidos;
    }

    @Override
    public String toString() {
        return "Persona [nombre = " + this.nombre +
                ", apellidos = " + this.apellidos +
                ", edad = " + this.edad +
                ", altura = " + this.altura +
                ", peso = " + this.peso + "]";
    }
}
