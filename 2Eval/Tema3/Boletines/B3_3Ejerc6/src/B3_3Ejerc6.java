import java.util.Scanner;

public class B3_3Ejerc6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        // solo es necesaria 1 variable
        // int suma;

        System.out.print("Introduce un valor por teclado: ");
        x = teclado.nextInt();
        // suma = x;

        for (int i = 0; i < 4; i++) {
            System.out.print("Introduce otro valor: ");
            x += teclado.nextInt();
            // suma += x;
        }

        System.out.print("La suma de todos lo valores que has introducido equivale a " + x + ".");

        teclado.close();
    }
}