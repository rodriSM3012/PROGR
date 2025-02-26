import java.util.Scanner;

public class B6_3Ejerc1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cad1;

        System.out.print("Introduce una cadena: ");
        cad1 = teclado.nextLine();
        char[] array = almacenarStringVectorInv(cad1);

        System.out.println("String introducido: " + cad1);
        System.out.print("String invertido (en un array): ");
        mostrarArrayChar(array);
        System.out.println();
        teclado.close();
    }

    /**
     * The function "mostrarArrayChar" prints out each character in a char array.
     * 
     * @param array The parameter `array` is an array of characters (`char[]`). The
     *              method `mostrarArrayChar` takes this array as input and prints
     *              out each character in the array without any spaces or new lines.
     */
    public static void mostrarArrayChar(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    /**
     * The function `almacenarStringVectorInv` takes a string as input and returns a
     * character array with the characters of the string stored in reverse order.
     * 
     * @param cad cad is a String parameter that represents the input string that
     *            needs to be stored in a character array in reverse order.
     * @return An array of characters is being returned.
     */
    public static char[] almacenarStringVectorInv(String cad) {
        char[] array = new char[cad.length()];
        int j = cad.length() - 1; // -1 por que si no esta fuera de los limites del vector/string
        for (int i = 0; i < cad.length(); i++) {
            array[j] = cad.charAt(i);
            j--;
        }
        return array;
    }
}
