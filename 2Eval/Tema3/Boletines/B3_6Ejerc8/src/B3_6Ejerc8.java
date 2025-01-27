import java.util.Scanner;

public class B3_6Ejerc8 {
    public static void main(String[] args) {
        // calcular con multiplicaciones sucesivas x^n comprobando que x y n son enteros
        // positivos
        Scanner teclado = new Scanner(System.in);
        int x, n;

        System.out.print("Introduce un número entero positivo: ");
        x = teclado.nextInt();
        x = comprobar(x, teclado);

        System.out.print("Introduce un número que actuará como exponente del anterior número: ");
        n = teclado.nextInt();
        n = comprobar(n, teclado);

        System.out.printf("La potencia de %d elevado a %d es igual a %d.\n",
                x, n, potencia(x, n));
        teclado.close();
    }

    public static int comprobar(int n, Scanner teclado) {
        while (n < 0) {
            System.out.print("El número que has introducido no es positivo, introduce otro número: ");
            n = teclado.nextInt();
        }
        return n;
    }

    public static int potencia(int x, int n) {
        int pot = 1;
        for (int i = 1; i <= n; i++) {
            pot = pot * x;
        }
        return pot;
    }
}
