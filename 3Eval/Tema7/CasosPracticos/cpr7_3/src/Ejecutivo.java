public class Ejecutivo extends Empleado {
    // atributos
    private double presupuesto;

    // constructores
    public Ejecutivo() {
        super();
        setPresupuesto(0);
    }

    public Ejecutivo(String nombre, int numEmpleado, double sueldo, double presupuesto) {
        super(nombre, numEmpleado, sueldo);
        setPresupuesto(presupuesto);
    }

    // metodos
    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Ejecutivo [presupuesto=" + presupuesto + "]";
    }
}
