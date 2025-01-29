import java.util.Scanner;

public class B6_1Ejerc2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cad;

        System.out.print("Introduce una cadena: ");
        cad = teclado.nextLine();
        cortarCadena(cad);

        teclado.close();
    }

    public static void cortarCadena(String cad) {
        StringBuilder sb = new StringBuilder(cad);
        if (sb.length() > 10) {
            sb.delete(0, 5);
            sb.delete((sb.length() - 2), sb.length());
            System.out.println(sb);
            // System.out.println(cad.substring(5, cad.length() - 2));
        } else {
            System.out.println("La longitud de la cadena no es superior a 10.");
        }
    }
}
