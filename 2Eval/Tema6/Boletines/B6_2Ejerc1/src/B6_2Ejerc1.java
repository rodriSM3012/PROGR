import java.util.Scanner;

public class B6_2Ejerc1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cad;
        int n;

        System.out.print("Introduce un número entero: ");
        n = teclado.nextInt();

        cad = String.valueOf(n);
        System.out.println(separarMiles(cad));
        teclado.close();
    }

    public static String separarMiles(String cad) {
        StringBuilder sb1 = new StringBuilder(cad);
        int i = sb1.length() - 3;
        while (i > 0) {
            sb1.insert(i, '.');
            i -= 3;
        }
        return sb1.toString();
    }
}
