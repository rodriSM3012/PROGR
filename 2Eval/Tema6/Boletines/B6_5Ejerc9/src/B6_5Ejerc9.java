import java.util.Scanner;

public class B6_5Ejerc9 {
    final static int DIM = 10;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] arrayNum = new double[DIM];
        String[] arrayNomb = new String[DIM];
        String[] arrayNotas = new String[DIM];
        String[] nombresAleatorios = { "Ana", "Luis", "Carlos", "Marta", "Jorge", "Lucia", "Pedro", "Sofia", "Diego",
                "Elena" };

        char resp;
        System.out.println("Random? (s/n): ");
        resp = teclado.nextLine().charAt(0);

        System.out.println("Se va a solicitar el nombre y la nota de los 10 alumnos por orden.");
        for (int i = 0; i < DIM; i++) {
            System.out.print("- Alumno " + (i + 1) + " -" + "\nNombre: ");
            if (resp == 'n') {
                arrayNomb[i] = teclado.nextLine();
            } else {
                arrayNomb[i] = nombresAleatorios[(int) randomNota()];
            }
            System.out.print("Nota: ");
            if (resp == 'n') {
                arrayNum[i] = teclado.nextDouble();
                arrayNum[i] = comprobarNota(arrayNum[i], teclado);
                teclado.nextLine();
            } else {
                arrayNum[i] = randomNota();
            }
        }

        for (int i = 0; i < DIM; i++) {
            arrayNotas[i] = notaAString(arrayNum[i]);
        }

        mostrarArrayNotas(arrayNum, arrayNomb, arrayNotas);
        teclado.close();
    }

    /**
     * The function `comprobarNota` ensures that a given grade is within the range
     * of 0 to 10 inclusive by prompting the user to input a valid grade if it falls
     * outside this range.
     * 
     * @param nota    `nota` is a double variable representing the grade that needs
     *                to be checked for validity.
     * @param teclado The `teclado` parameter in the `comprobarNota` method is of
     *                type `Scanner`. This parameter is used to read input from the
     *                user in order to validate the inputted grade. The `Scanner`
     *                class in Java is used for obtaining the input of the primitive
     *                types like int,
     * @return The method `comprobarNota` is returning a `double` value, which is
     *         the validated and corrected input `nota` that falls within the range
     *         of 0 to 10 inclusive.
     */
    public static double comprobarNota(double nota, Scanner teclado) {
        while ((nota < 0) || (nota > 10)) {
            System.out.print("La nota debe estar comprendida entre 0 y 10 inclusive, introduce una nota válida: ");
            nota = teclado.nextDouble();
        }
        return nota;
    }

    /**
     * The function "mostrarArrayNotas" displays the names, numerical grades, and
     * corresponding letter grades of students in an array.
     * 
     * @param arrayNum   An array of double values representing the grades of the
     *                   students.
     * @param arrayNomb  An array containing the names of the students.
     * @param arrayNotas The `arrayNotas` parameter in the `mostrarArrayNotas`
     *                   method is an array of strings that contains the grades or
     *                   notes corresponding to each student in the array. Each
     *                   element in the `arrayNotas` array corresponds to a
     *                   student's grade or note at the same index position in
     */
    public static void mostrarArrayNotas(double[] arrayNum, String[] arrayNomb, String[] arrayNotas) {
        for (int i = 0; i < arrayNomb.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": [Nombre: " + arrayNomb[i] +
                    " | Nota: " + arrayNum[i]
                    + " (" + arrayNotas[i] + ")]\n");
        }
    }

    /**
     * Converts a numerical grade to its corresponding string representation.
     *
     * @param nota the numerical grade to be converted
     * @return a string representing the grade:
     *         "Suspenso" for grades less than 5,
     *         "Bien" for grades between 5 (inclusive) and 7 (exclusive),
     *         "Notable" for grades between 7 (inclusive) and 9 (exclusive),
     *         "Sobresaliente" for grades 9 and above,
     *         "Nota no válida" for any other case.
     */
    public static String notaAString(double nota) {
        if (nota < 5) {
            return "Suspenso";
        } else if (nota >= 5 && nota < 7) {
            return "Bien";
        } else if (nota >= 7 && nota < 9) {
            return "Notable";
        } else if (nota >= 9) {
            return "Sobresaliente";
        } else {
            return "Nota no válida";
        }
    }

    /**
     * The function `randomNota()` generates a random decimal number between 0 and
     * 10 with two decimal places.
     * 
     * @return The method `randomNota()` returns a random double value between 0 and
     *         10, rounded to two decimal places.
     */
    public static double randomNota() {
        return Math.round(Math.random() * 10 * 100.0) / 100.0;
    }
}
