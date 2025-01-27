import java.util.Scanner;

public class B3_6Ejerc2 {
    public static void main(String[] args) {
        // pedir 1 numero entero positivo y luego 8 mas;
        // mostrar los que son mayores que el inicial y decir cuantos son
        Scanner teclado = new Scanner(System.in);
        int nInicial, n;
        int cont = 0;
        System.out.print("Introduce el número inicial: ");
        nInicial = teclado.nextInt();
        nInicial = comprobarIntPosit(nInicial, teclado);

        for (int i = 1; i <= 8; i++) {
            System.out.print("Introduce el número en posición " + i + " en la secuencia: ");
            n = teclado.nextInt();
            n = comprobarIntPosit(n, teclado);
            if (n > nInicial) {
                cont++;
                System.out.println("El número " + n + " es mayor que " + nInicial + ".");
            }
        }

        System.out.println(
                "Has introducido un total de 8 números, de los cuales " + cont + " son mayores que " + nInicial);
    }

    public static int comprobarIntPosit(int n, Scanner teclado) {
        while (n <= 0) {
            System.out.print("El número que has introducido no es positivo, introduce otro número: ");
            n = teclado.nextInt();
        }
        return n;
    }
}
