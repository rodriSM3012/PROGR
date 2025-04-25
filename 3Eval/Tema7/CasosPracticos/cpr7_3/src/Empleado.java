public class Empleado {
    // atributos
    public String nombre;
    public int numEmpleado;
    public double sueldo;
    static private int cont = 0;

    // constructores
    public Empleado() {
        setNombre("(N/S)");
        setNumEmpleado(0);
        setSueldo(1000);
    }

    public Empleado(String nombre, double sueldo) {
        setNombre(nombre);
        setSueldo(sueldo);
        numEmpleado = ++cont; // hace el incremento antes de hacer la operacion
    }

    // metodos
    public String getNombre() {
        return nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    private void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // metodo para aumentar sueldo a los empleados
    public void aumentarSueldo(double porcentajeAumento) {
        this.sueldo = this.sueldo + ((this.sueldo * porcentajeAumento) / 100);
    }

    @Override
    public String toString() {
        return "Empleado [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
    }
}
