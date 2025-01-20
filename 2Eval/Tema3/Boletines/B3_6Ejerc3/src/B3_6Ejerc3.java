import java.util.Scanner;

public class B3_6Ejerc3 {
    public static void main(String[] args) {
        // Crear un programa Java que calcule y muestre la suma de los números impares
        // comprendidos entre 1 y un número positivo mayor que 1 (que se introduce por
        // teclado y que debe ser comprobado) ambos incluidos si este es impar.
        Scanner teclado = new Scanner(System.in);
        int n;
        int suma = 0;

        System.out.print("Introduce un número entero positivo: ");
        n = teclado.nextInt();
        n = comprobar(n);

        if (esImpar(n)) {
            for (int i = 1; i <= n; i += 2) {
                suma += i;
            }
        } else {
            for (int i = 1; i < n; i += 2) {
                suma += i;
            }
        }

        System.out.println("La suma de los números impares comprendidos entre 1 y " + n + " es: " + suma);
        teclado.close();
    }

    public static int comprobar(int n) {
        Scanner teclado = new Scanner(System.in);
        while (n <= 0) {
            System.out.print("El número que has introducido no es positivo," +
                    " introduce otro número: ");
            n = teclado.nextInt();
        }
        teclado.close();
        return n;
    }

    public static boolean esImpar(int n) {
        return n % 2 != 0;
    }
}
