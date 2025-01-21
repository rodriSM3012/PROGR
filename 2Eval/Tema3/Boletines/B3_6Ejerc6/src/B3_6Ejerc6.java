import java.util.Scanner;

public class B3_6Ejerc6 {
    public static void main(String[] args) {
        // serie de numeros positivos que termina al introducir 0
        // mostrar por pantalla cantidad de numeros multiplos de 2 y de 3
        Scanner teclado = new Scanner(System.in);
        int n;
        int contMult2 = 0;
        int contMult3 = 0;

        System.out.print("Introduce un número entero positivo para iniciar una secuencia (termina al introducir 0): ");
        n = teclado.nextInt();
        n = comprobar(n, teclado);
        while (n != 0) {
            if (n % 2 == 0)
                contMult2++;
            if (n % 3 == 0)
                contMult3++;
            System.out.print("Introduce el siguiente número: ");
            n = teclado.nextInt();
            n = comprobar(n, teclado);
        }
        System.out.println("La cantidad de números que son múltiplos de 2 es: " + contMult2);
        System.out.println("La cantidad de números que son múltiplos de 3 es: " + contMult3);
        teclado.close();
    }

    public static int comprobar(int n, Scanner teclado) {
        // Scanner teclado = new Scanner(System.in);
        while (n < 0) {
            System.out.print("El número que has introducido no es positivo," +
                    " introduce otro número: ");
            n = teclado.nextInt();
        }
        // teclado.close();
        return n;
    }
}
