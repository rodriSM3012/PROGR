public class B6_3Ejerc4 {
    final static int DIM = 10;

    public static void main(String[] args) {
        int[] array = new int[DIM];
        array = arrayOrdenAscendente(arrayRandomInt(array, DIM));
        mostrarArrayInt(array);
    }

    /**
     * The function `arrayRandomInt` generates an array of random integers between 1
     * and 9 (inclusive) of a specified length.
     * 
     * @param array The `array` parameter is an array of integers that you want to
     *              populate with random integer values.
     * @param DIM   The `DIM` parameter in the `arrayRandomInt` method represents
     *              the size or dimension of the array that will be filled with
     *              random integers. It determines how many random integers will be
     *              generated and stored in the array.
     * @return The method `arrayRandomInt` is returning an array of integers that
     *         was passed as a parameter after filling it with random integers
     *         between 1 and 9 (inclusive).
     */
    public static int[] arrayRandomInt(int[] array, int DIM) {
        for (int i = 0; i < DIM; i++) {
            // Genera un número aleatorio entre 1 y 9 (ambos inclusive)
            // +1 es porque math.random genera num aleatorio double entre 0 y 0.99999
            // al poner * 9 seria 0 y 8.99999 pero al pasarlo a int (int) 8.9999 seria 8
            // al sumar 1 el 0 seria 1 y el 8 seria 9, cumpliendo asi el rango [1, 9]
            array[i] = (int) (Math.random() * 9) + 1;
        }
        return array;
    }

    /**
     * The function "mostrarArrayInt" prints out the elements of an integer array.
     * 
     * @param array An array of integers that will be displayed by the method
     *              `mostrarArrayInt`.
     */
    public static void mostrarArrayInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * The function `arrayOrdenAscendente` sorts an input array in ascending order
     * using a nested loop.
     * 
     * @param array The `arrayOrdenAscendente` method you provided seems to be
     *              attempting to sort an array in ascending order using a simple
     *              bubble sort algorithm. However, the implementation is incorrect
     *              as it is swapping elements in a nested loop without properly
     *              comparing them.
     * @return The method `arrayOrdenAscendente` is returning the input array sorted
     *         in ascending order.
     */

    public static int[] arrayOrdenAscendente(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                // i + 1 para no comparar innecesariamente los numeros anteriores y el mismo
                // numero (solo hace falta con los que esten despues)
                if (array[i] > array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }
}
