import java.util.Scanner;

public class B6_5Ejerc1 {
    final static int DIM = 10;

    public static void main(String[] args) {
        // Crea un array de 10 posiciones de números con valores pedidos por teclado.
        // Muestra por consola el índice y el valor al que corresponde.
        // Haz dos métodos, uno para rellenar valores y otro para mostrar.
        int[] array = new int[DIM];
        array = customArrayInt(array);
        mostrarArrayInt(array);
    }

    /**
     * Prompts the user to enter integer values to fill an array.
     *
     * @param array The array to be filled with values provided by the user.
     * @return The array filled with the values provided by the user.
     */
    public static int[] customArrayInt(int[] array) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Se van a solicitar " + DIM + " números enteros para crear un array.");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor en posición " + (i + 1) + " del array: ");
            array[i] = teclado.nextInt();
        }
        teclado.close();
        return array;
    }

    /**
     * This method prints the elements of an integer array to the console.
     * Each element is followed by a space, and a newline is printed at the end.
     *
     * @param array the integer array to be printed
     */
    public static void mostrarArrayInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
