import java.util.Scanner;

public class B6_1Ejerc5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // StringBuilder datosAlumno;
        // String aux;
        // int lengthApel1;
        // System.out.println("Se le van a solicitar los datos de uno de los alumnos.");
        // System.out.print("Introduce el nombre: ");
        // datosAlumno = new StringBuilder(teclado.nextLine());
        // System.out.print("Introduce el primer apellido: ");
        // aux = teclado.nextLine();
        // lengthApel1 = aux.length();
        // datosAlumno.insert(0, aux);
        // System.out.print("Introduce el segundo apellido: ");
        // datosAlumno.insert(lengthApel1, teclado.nextLine());

        String nombre, apel1, apel2;

        System.out.println("Se le van a solicitar los datos de uno de los alumnos.");
        System.out.print("Introduce el nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Introduce el primer apellido: ");
        apel1 = teclado.nextLine();
        System.out.print("Introduce el segundo apellido: ");
        apel2 = teclado.nextLine();

        System.out.println(ordenarCadenas(nombre, apel1, apel2).toUpperCase());

        teclado.close();
    }

    public static String ordenarCadenas(String nombre, String apel1, String apel2) {
        if (nombre.length() > 3) {
            StringBuilder sb = new StringBuilder(nombre);
            sb.delete(3, sb.length());
            return apel1.concat(apel2).concat(sb.toString());
        }
        return apel1.concat(apel2).concat(nombre);
    }
}
