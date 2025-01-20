import java.util.Scanner;

public class B3_6Ejerc8 {
    public static void main(String[] args) {
        // calcular con multiplicaciones sucesivas x^n comprobando que x y n son enteros
        // positivos
        Scanner teclado = new Scanner(System.in);
        int x, n;

        System.out.print("Introduce un número entero positivo: ");
        x = teclado.nextInt();
        // ⚠ x = comprobar(x);

        System.out.print("Introduce un número que actuará como exponente del anterior número: ");
        n = teclado.nextInt();
        n = comprobar(n);

        System.out.printf("La potencia de %d elevado a %d es igual a %d.",
                x, n, potencia(x, n));
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

    public static int potencia(int x, int n) {
        int pot = 1;
        for (int i = n; i > 0; i--) {
            pot = pot * x;
        }
        return pot;
    }
}
