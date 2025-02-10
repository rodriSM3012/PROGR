import java.util.Scanner;

public class B6_3Ejerc3 {
    final static int DIM = 10;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = new int[DIM];
        int i;

        System.out.println("Se van a solicitar números enteros cuyo valor será incorporado a un array.");
        for (i = 0; i < array.length; i++) {
            int aux = 0;
            System.out.print("Introduce el número en posición " + (i + 1) + ": ");
            aux = teclado.nextInt();
            if (aux == 0)
                break;
            array[i] = aux;
        }
        mostrarArray(array);
        System.out.println("Media: " + calcularMediaArray(array, i));
        teclado.close();
    }

    public static void mostrarArray(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static double calcularMediaArray(int[] array, int i) {
        int suma = 0;
        for (int j = 0; j < array.length; j++) {
            suma += array[j];
        }
        return (double) suma / i;
    }
}
