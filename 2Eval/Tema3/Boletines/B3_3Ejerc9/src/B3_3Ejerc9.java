import java.util.Scanner;

public class B3_3Ejerc9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.print("Introduce un número entre 1 y 10: ");
        n = teclado.nextInt();
        
        // tambien se puede usar ((n < 1) || (n >= 10)) para el bucle
        while (!((n >= 1) && (n <= 10))) {
            System.out.print("El número introducido no se encuentra dentro del rango, introduce otro: ");
            n = teclado.nextInt();
        }

        System.out.println("Fin del bucle.");

        teclado.close();
    }
}
