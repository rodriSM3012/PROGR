import java.util.Scanner;

public class B3_3Ejerc11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        int suma = 1;

        System.out.print(
                "Introduce un número para comenzar una sucesión de números (introduce 0 para terminar la sucesión): ");
        n = teclado.nextInt();

        while (n != 0) {
            System.out.print("Introduce el siguiente número: ");
            n = teclado.nextInt();
            suma++;
        }

        System.out.println("Has introducido un total de " + suma + " números.");
        teclado.close();
    }
}
