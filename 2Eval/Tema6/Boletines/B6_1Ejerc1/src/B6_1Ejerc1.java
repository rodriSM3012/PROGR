import java.util.Scanner;

public class B6_1Ejerc1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cad1, cad2;

        System.out.println("Se le solicitarán 2 cadenas que deberá introducir por teclado.");
        System.out.print("Primera cadena: ");
        cad1 = teclado.nextLine();
        System.out.print("Segunda cadena: ");
        cad2 = teclado.nextLine();

        if (compararString(cad1, cad2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son distintas.");
        }

        teclado.close();
    }

    public static boolean compararString(String cad1, String cad2) {
        return cad1.equalsIgnoreCase(cad2);
    }
}
