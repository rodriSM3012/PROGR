import java.util.Scanner;

public class B6_3Ejerc1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cad1;

        System.out.print("Introduce una cadena: ");
        cad1 = teclado.nextLine();
        char[] array = almacenarStringVector(cad1);

        System.out.println("String introducido: " + cad1);
        System.out.print("String invertido (en un array): ");
        mostrarArrayChar(array);
        System.out.println();
        teclado.close();
    }

    public static void mostrarArrayChar(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static char[] almacenarStringVector(String cad) {
        char[] array = new char[cad.length()];
        int j = cad.length() - 1; // -1 por que si no esta fuera de los limites del vector/string
        for (int i = 0; i < cad.length(); i++) {
            array[j] = cad.charAt(i);
            j--;
        }
        return array;
    }
}
