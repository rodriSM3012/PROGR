import java.util.Scanner;

public class B6_3Ejerc5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String cad = teclado.nextLine();

        System.out.println("La frase introducida está compuesta por " + contarNumPalabras(cad) + " palabras.");

        teclado.close();
    }

    /**
     * The function `contarNumPalabras` in Java counts the number of words in a
     * given string by counting the spaces between words and adding 1 to account for
     * the last word.
     * 
     * @param cad The `contarNumPalabras` method is designed to count the number of
     *            words in a given string `cad`. The method iterates through the
     *            characters of the string and increments the count whenever a space
     *            character is encountered. Finally, it returns the count plus 1 to
     *            account for the last word
     * @return The method `contarNumPalabras` is returning the total number of words
     *         in the input string `cad`.
     */
    public static int contarNumPalabras(String cad) {
        int cont = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == ' ') {
                cont++;
            }
        }
        return cont + 1; // +1 para contar la ultima palabra
    }
}