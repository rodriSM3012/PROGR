public class Empleado {
    // atributos
    public String nombre;
    public int numEmpleado;
    public double sueldo;

    // constructores
    public Empleado() {
        setNombre("(N/S)");
        setNumEmpleado(0);
        setSueldo(1000);
    }

    public Empleado(String nombre, int numEmpleado, double sueldo) {
        setNombre(nombre);
        setNumEmpleado(numEmpleado);
        setSueldo(sueldo);
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

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + "]";
    }

}
