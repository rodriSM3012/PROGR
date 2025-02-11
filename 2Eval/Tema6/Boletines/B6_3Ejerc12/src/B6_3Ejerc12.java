import java.util.Scanner;

public class B6_3Ejerc12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, apell;

        System.out.print("Introduce el nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Introduce el primer apellido: ");
        apell = teclado.nextLine();

        nombre = nombre.concat(" ").concat(apell);
        System.out.println(nombre);

        teclado.close();
    }
}
