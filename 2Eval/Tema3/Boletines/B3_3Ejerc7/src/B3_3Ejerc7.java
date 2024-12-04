import java.util.Scanner;

public class B3_3Ejerc7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        int suma = 0;
        int x;

        System.out.print("Introduce un número como primer elemento de una sucesión" +
                " (la sucesión termina en cuanto introduzcas un 0): ");
        x = teclado.nextInt();

        while (x != 0) {
            System.out.print("Introduce el siguiente número: ");
            x = teclado.nextInt();
            suma += x;
            i++;
        }

        System.out.printf("La media de los %d números que has introducido equivale a %.2f.",
                i, ((double) suma / i));

        teclado.close();
    }
}
