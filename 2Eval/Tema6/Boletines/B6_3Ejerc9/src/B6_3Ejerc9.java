import java.util.Scanner;

public class B6_3Ejerc9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = teclado.nextInt();
        if (esCapicua(n)) {
            System.out.println("El número " + n + " es capicúa.");
        } else {
            System.out.println("El número " + n + " no es capicúa.");
        }
        teclado.close();
    }

    /**
     * The `esCapicua` function in Java checks if a given integer is a palindrome by
     * comparing it with its reversed version.
     * 
     * @param n The provided code is a Java method named `esCapicua` that checks if
     *          a given integer `n` is a palindrome number. A palindrome number is a
     *          number that remains the same when its digits are reversed.
     * @return The method `esCapicua` is returning a boolean value. It returns
     *         `true` if the input number `n` is a palindrome (reads the same
     *         forwards and backwards), and `false` otherwise.
     */
    public static boolean esCapicua(int n) {
        int original = n; // guarda el valor original de n
        int invertido = 0; // variable en la que se guardara el valor de n pero invertido
        while (n != 0) { // bucle que termina cuando se han sacado todos los digitos de n
            int digit = n % 10; // digit es una variable en la que se almacena el ultimo digito de n
            invertido = invertido * 10 + digit; // se pone digit (ult. digito de n) en la siguiente posicion del nuevo
                                                // numero y se multiplica x10 lo que haya a la izq para que cambie la
                                                // posicion del digito
            n /= 10; // se borra el ultimo digito en n
        }
        return original == invertido; // compara el numero original y que se ha creado siendo invertido
    }

    /**
     * The function "contarDigitos" in Java counts the number of digits in a given
     * integer.
     * 
     * @param n The given method `contarDigitos` is designed to count the number of
     *          digits in a given integer `n`.
     * @return The method `contarDigitos` is returning the count of digits in the
     *         integer `n` plus 1.
     */
    public static int contarDigitos(int n) {
        int cont = 0;
        while (n != 0) {
            n /= 10;
            cont++;
        }
        return cont + 1;
    }
}
