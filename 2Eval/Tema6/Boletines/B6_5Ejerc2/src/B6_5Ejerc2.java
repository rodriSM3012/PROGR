import java.util.Scanner;

public class B6_5Ejerc2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la longitud del array: ");
        int[] array = new int[teclado.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = RNG(10);
        }

        mostrarArrayInt(array);
        teclado.close();
    }

    /**
     * The function `mostrarArrayInt` in Java prints the elements of an integer
     * array in a formatted way.
     * 
     * @param array The parameter `array` in the `mostrarArrayInt` method is an
     *              array of integers. The method is designed to display the
     *              elements of this integer array in a formatted way.
     */
    public static void mostrarArrayInt(int[] array) {
        int i;
        System.out.print("Array: [");
        for (i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[i] + "]");
    }

    /**
     * The function `sumaElemArray` calculates the sum of elements in an integer
     * array.
     * 
     * @param array An array of integers.
     * @return The method `sumaElemArray` is returning the sum of all elements in
     *         the input array.
     */
    public static int sumaElemArray(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    /**
     * The function RNG generates a random integer within a specified range.
     * 
     * @param rango The parameter `rango` in the `RNG` method represents the range
     *              of random numbers that can be generated. The method uses this
     *              range to generate a random integer between 1 and the specified
     *              range (exclusive).
     * @return The RNG method returns a random integer between 1 and the specified
     *         range (rango).
     */
    private static int RNG(int rango) {
        return (int) (Math.random() * (rango - 1)) + 1;
    }
}
