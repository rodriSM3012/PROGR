import java.util.Scanner;

public class B6_8Ejerc2 {
    final static int FILAS = 5;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.print("Introduce el número de columnas de la matriz: ");
        n = teclado.nextInt();
        int[][] m = new int[FILAS][n];

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = randomNum(10);
            }
        }

        mostrarMatriz(m, n);
        teclado.close();
    }

    public static void mostrarMatriz(int[][] m, int n) {
        int j;
        for (int i = 0; i < FILAS; i++) {
            System.out.print("[");
            for (j = 0; j < n - 1; j++) {
                System.out.print(m[i][j] + ", ");
            }
            System.out.println(m[i][j] + "]");
        }
    }

    public static int randomNum(int rango) {
        return (int) ((Math.random() * (rango - 1)) + 1);
    }
}
