import java.util.Scanner;

public class cpr3_3 {
    public static void enteroPositivo(int x) {
        if (x <= 0) {
            return;
        }
        System.out.println("El número es entero positivo.");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;

        System.out.print("Inserta un número entero: ");
        x = teclado.nextInt();

        enteroPositivo(x);

        teclado.close();
    }
}
