import java.util.Scanner;

public class B3_3Ejerc8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.print("Introduce un número entero: ");
        n = teclado.nextInt();

        System.out.println("Números impares desde el 1 hasta el " + n + ":");
        // for (int i = 0; i < n; i++) {
        // if (i % 2 != 0) {
        // if (((i + 1) >= n)) {
        // System.out.println(i);
        // break;
        // }
        // System.out.print(i + ", ");
        // }
        // }

        // no hace falta comprobar cada vez, ya que los impares siguen la misma sucesion
        for (int i = 1; i < (n - 1); i += 2) {
            System.out.print(i + ", ");
        }

        // para imprimr el ultimo numero y que aparezca sin la coma 
        // (por eso es i<(n-1) en el bucle for)
        if (n % 2 != 0)
            System.out.println(n);
        else
            System.out.println(n - 1);

        teclado.close();
    }
}
