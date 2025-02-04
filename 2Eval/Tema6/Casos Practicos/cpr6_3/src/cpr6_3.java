public class cpr6_3 {
    final static int dim = 10; // establecer constante final

    public static void main(String[] args) {
        // int[] notas;
        int[] notas = new int[dim]; // para declarar la longitud del array
        int i; // se declara fuera del for para guardar el valor y usarlo fuera del bucle

        for (i = 0; i < dim; i++) { // i < notas.length
            notas[i] = i;
        }

        System.out.print("Array: ");
        for (i = 0; i < dim; i++) {
            System.out.printf("%d ", notas[i]);
        }
    }
}
