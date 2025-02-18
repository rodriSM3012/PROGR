import java.util.Scanner;

public class cpr6_5 {
    final static int FIL = 3, COL = 4;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] mat = new int[FIL][COL];
        // mat = insertarTeclado(mat, teclado);
        mat = insertarRandom(mat);
        mostrarMatriz(mat);
        teclado.close();
    }

    /**
     * The function `insertarTeclado` takes a 2D array and a Scanner object as
     * input, prompts the user to input values for each cell of the array, and
     * returns the updated array.
     * 
     * @param mat     A 2D integer array representing the matrix where the user
     *                input will be inserted.
     * @param teclado `teclado` is a `Scanner` object that is used to read input
     *                from the user. In this method, it is used to read integer
     *                values from the user to fill in a 2D array (`mat`).
     * @return The method `insertarTeclado` is returning a 2D integer array `mat`
     *         after filling it with user input values from the Scanner `teclado`.
     */
    public static int[][] insertarTeclado(int[][] mat, Scanner teclado) {
        System.out.println("Inserta los datos en cada casilla para rellenar la matriz:");
        for (int i = 0; i < FIL; i++)
            for (int j = 0; j < COL; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                mat[i][j] = teclado.nextInt();
            }

        teclado.close();
        return mat;
    }

    /**
     * The function `insertarRandom` populates a 2D array with random integer values
     * between 1 and 100.
     * 
     * @param mat The parameter `mat` is a 2D integer array that represents a
     *            matrix. The method* `insertarRandom` populates this matrix with
     *            random integer values between 1 and 100.
     * @return The method `insertarRandom` returns a 2D integer array `mat` after
     *         filling it with random* integer values between 1 and 100 inclusive.
     */
    public static int[][] insertarRandom(int[][] mat) {
        for (int i = 0; i < FIL; i++)
            for (int j = 0; j < COL; j++) {
                mat[i][j] = (int) (Math.random() * 100 + 1);
            }

        return mat;
    }

    /**
     * The function "mostrarMatriz" prints a 2D array with formatting to ensure
     * single-digit numbers are displayed with a leading zero.
     * 
     * @param mat The `mostrarMatriz` method is used to display a 2D array (matrix)
     *            in a specific format. The method takes a 2D integer array `mat` as
     *            a parameter and prints each element of the matrix with a leading
     *            zero if the element is less than
     */
    public static void mostrarMatriz(int[][] mat) {
        for (int i = 0; i < FIL; i++) {
            System.out.print("[");
            for (int j = 0; j < COL - 1; j++) {
                if (mat[i][j] < 10) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("0" + mat[i][j] + " ");
                }
            }
            if (mat[i][COL - 1] < 10) {
                System.out.print(mat[i][COL - 1] + "]\n");
            } else {
                System.out.print("0" + mat[i][COL - 1] + "]\n");
            }
        }
    }
}
