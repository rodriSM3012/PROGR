import java.util.Scanner;

public class B6_3Ejerc2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe una cadena: ");
        String cad = teclado.nextLine();
        imprimirCadenaMayus(cad);
        teclado.close();
    }

    public static void imprimirCadenaMayus(String cad) {
        System.out.println("Cadena en mayúsculas: " + cad.toUpperCase());
    }
}
