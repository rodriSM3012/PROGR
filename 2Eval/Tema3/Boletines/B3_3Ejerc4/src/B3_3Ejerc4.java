import java.util.Scanner;

public class B3_3Ejerc4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resp = 0;

        while (resp != 4) {
            System.out.print("Introduce un número: ");
            resp = teclado.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("Calor.");
                    break;
                case 2:
                    System.out.println("Templado.");
                    break;
                case 3:
                    System.out.println("Frío.");
                    break;
                case 4:
                    System.out.println("Fuera de rango.");
                    break;
                default:
            }
        }

        teclado.close();
    }
}
