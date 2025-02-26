import java.util.Scanner;

public class B6_8Ejerc2 {
    final static int FILAS = 5;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número de columnas de la matriz: ");
        int[][] m = new int[FILAS][teclado.nextInt()];

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = randomNum(10);
            }
        }

        mostrarMatriz(m);
        teclado.close();
    }

    public static void mostrarMatriz(int[][] m) {
        int nCol = m[0].length;
        int j;
        for (int i = 0; i < FILAS; i++) {
            System.out.print("[");
            for (j = 0; j < nCol - 1; j++) {
                System.out.print(m[i][j] + ", ");
            }
            System.out.println(m[i][j] + "]");
        }
    }

    public static int randomNum(int rango) {
        return (int) ((Math.random() * (rango - 1)) + 1);
    }
}
