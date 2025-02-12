public class B6_5Ejerc10 {
    final static int DIM = 10;

    public static void main(String[] args) {
        int[] array1 = new int[DIM];
        int[] array2 = new int[DIM];

        array1 = randomArrayInt(array1, 50);

        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            if (comprobarMayor25(array1[i]) && comprobarPar(array1[i])) {
                array2[j] = array1[i];
                j++;
            }
        }

        System.out.print("Primer array: ");
        mostrarArrayIntSinCero(array1);
        System.out.print("Segundo array: ");
        mostrarArrayIntSinCero(array2);
    }

    /**
     * The function `randomArrayInt` generates an array of random integers within a
     * specified range.
     * 
     * @param array The `array` parameter is an array of integers that you want to
     *              populate with random values within a specified range.
     * @param rango The `rango` parameter in the `randomArrayInt` method represents
     *              the range of random numbers that can be generated. The method
     *              will generate random integers between 1 and the specified
     *              `rango` value (inclusive) and store them in the provided
     *              `array`.
     * @return An array of integers is being returned.
     */
    public static int[] randomArrayInt(int[] array, int rango) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * rango + 1);
        }
        return array;
    }

    /**
     * The function "mostrarArrayIntSinCero" prints all non-zero elements of an
     * integer array in Java.
     * 
     * @param array The parameter `array` is an array of integers that you want to
     *              display without including any zeros. The method
     *              `mostrarArrayIntSinCero` iterates through the elements of the
     *              array and prints out only the elements that are not equal to
     *              zero.
     */
    public static void mostrarArrayIntSinCero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    /**
     * The function `comprobarMayor25` in Java checks if a given number is greater
     * than 25 and returns true if it is.
     * 
     * @param n The method `comprobarMayor25` takes an integer `n` as a parameter
     *          and checks if `n` is greater than 25. If `n` is greater than 25, the
     *          method returns `true`; otherwise, it returns `false`.
     * @return The method `comprobarMayor25` returns a boolean value - `true` if the
     *         input `n` is greater than 25, and `false` otherwise.
     */
    public static boolean comprobarMayor25(int n) {
        if (n > 25) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The function "comprobarPar" in Java checks if a given integer is even and
     * returns true if it is, otherwise returns false.
     * 
     * @param n The method `comprobarPar` checks if a given number `n` is even. If
     *          `n` is divisible by 2 without a remainder, the method returns
     *          `true`, indicating that `n` is even. Otherwise, it returns `false`,
     *          indicating that `n` is not
     * @return The method `comprobarPar` is returning a boolean value. It returns
     *         `true` if the input integer `n` is even (i.e., divisible by 2) and
     *         `false` otherwise.
     */
    public static boolean comprobarPar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
