// import java.util.Scanner;

public class cpr6_3 {
    final static int dim = 5; // establecer constante final
    final static double PI = 3.1415926535;

    public static void main(String[] args) {
        // Scanner teclado = new Scanner(System.in);
        // int[] notas;
        int[] notas = new int[dim]; // para declarar la longitud del array
        int i; // se declara fuera del for para guardar el valor y usarlo fuera del bucle

        for (i = 0; i < dim; i++) { // i < notas.length
            // System.out.printf("Introduce el valor de la posicion %d del vector: ", i +
            // 1);
            // notas[i] = teclado.nextInt();
            notas[i] = (int) (Math.random() * (50 - 1) + 1);
        }

        System.out.print("Array: ");
        for (i = 0; i < dim; i++) {
            System.out.printf("%d ", notas[i]);
        }

        // media
        int suma = 0;
        for (int j = 0; j < notas.length; j++) {
            suma += notas[j];
        }
        System.out.printf("\nMedia: %.10f", ((double) suma / notas.length) * (PI - 2));

        // ordenar > o <
        for (i = 0; i < notas.length; i++) {
            for (int j = i; j < notas.length; j++) {
                if (notas[i] > notas[j]) {
                    int aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                }
            }
        }

        System.out.print("\nArray ordenado: ");
        for (i = 0; i < notas.length; i++) {
            System.out.printf("%d ", notas[i]);
        }

        // teclado.close();
    }
}
