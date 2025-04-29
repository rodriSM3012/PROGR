public class cpr7_3 {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Pelayo", 1000);
        Empleado emp2 = new Empleado("Guillermo", 1500);
        Empleado emp3 = new Empleado("Jorge", 1250);

        Ejecutivo ejec1 = new Ejecutivo("Alvaro", 1250, 1600);
        Ejecutivo ejec2 = new Ejecutivo("Miguel", 1300, 1600);

        System.out.println("emp1: " + emp1.toString() + "→(" + emp1.getClass().getSimpleName() + ")" +
                "\nemp2: " + emp2.toString() + "→(" + emp2.getClass().getSimpleName() + ")" +
                "\nemp3: " + emp3.toString() + "→(" + emp3.getClass().getSimpleName() + ")");

        System.out.println("ejec1: " + ejec1.toString() +
                "\nejec2: " + ejec2.toString());
    }
}
