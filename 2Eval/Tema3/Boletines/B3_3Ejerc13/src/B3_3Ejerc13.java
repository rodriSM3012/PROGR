import java.util.Scanner;

public class B3_3Ejerc13 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.print("Se va a pedir una serie de números que estén comprendidos entre 1 y 5 inclusive." +
                " Al introducir un 0 la secuencia terminará.\n" +
                "Introduce el primer número: ");
        n = teclado.nextInt();

        // if (!((n >= 1) && (n <= 5))) {
        // System.out.println("INCORRECTO");
        // return;
        // }

        while (n != 0) {
            if (!((n >= 1) && (n <= 5))) {
                System.out.println("INCORRECTO");
                return;
            }
            System.out.print("Introduce el siguiente número: ");
            n = teclado.nextInt();
        }

        System.out.println("Secuencia finalizada.");
        teclado.close();
    }
}
