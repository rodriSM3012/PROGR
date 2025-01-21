import java.util.Scanner;

public class B3_6Ejerc4 {
    public static void main(String[] args) {
        // programa que lea 2 numeros enteros positivos
        // calcular producto con sumas sucesivas
        Scanner teclado = new Scanner(System.in);
        int n1, n2;

        System.out.print("Introduce el primer número: ");
        n1 = teclado.nextInt();
        n1 = comprobar(n1, teclado);
        System.out.print("Introduce el segundo número: ");
        n2 = teclado.nextInt();
        n2 = comprobar(n2, teclado);
        System.out.printf("%d x %d = %d\n", n1, n2, productoPorSumas(n1, n2));
    }

    public static int comprobar(int n, Scanner teclado) {
        while (n < 0) {
            System.out.print("El número que has introducido no es positivo, introduce otro número: ");
            n = teclado.nextInt();
        }
        return n;
    }

    public static int productoPorSumas(int n1, int n2) {
        int prod = 0;
        // 2 distintos para hacer el bucle el menor numero de veces
        // (comparando los 2 numeros y eligiendo el q sea menor para contar las
        // iteraciones del bucle)
        // tb se podria crear las variables min y max y solo tener 1 for
        if (n1 < n2) {
            for (int i = 0; i < n1; i++) {
                prod += n2;
            }
            return prod;
        } else {
            for (int i = 0; i < n2; i++) {
                prod += n1;
            }
            return prod;
        }
    }
}
