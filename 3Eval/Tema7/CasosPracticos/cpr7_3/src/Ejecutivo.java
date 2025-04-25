public class Ejecutivo extends Empleado {
    // atributos
    private double presupuesto;

    // constructores
    public Ejecutivo() {
        super();
        setPresupuesto(0);
    }

    public Ejecutivo(String nombre, double sueldo, double presupuesto) {
        super(nombre, sueldo);
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
        return super.toString() + "Ejecutivo [presupuesto=" + presupuesto + "]";
    }
}
