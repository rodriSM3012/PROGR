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

        if (x == 0) {
            System.out.println("No has introducido ningún número para realizar una media.");
            teclado.close();
            return;
        }

        while (x != 0) {
            System.out.print("Introduce el siguiente número: ");
            x = teclado.nextInt();
            suma += x;
            i++;
        }

        // para saltar la division entre 1 si solo se introdujo 1 unico numero
        if (i == 1)
            System.out.println("Ya que sólo has introducido un único número," +
                    " la media sería el mismo número, o sea " + x);
        else
            System.out.printf("La media de los %d números que has introducido equivale a %.2f\n",
                    i, ((double) suma / i));

        teclado.close();
    }
}
