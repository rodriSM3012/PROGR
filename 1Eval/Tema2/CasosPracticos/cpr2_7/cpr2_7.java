import java.lang.Exception;

public class cpr2_7 {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 0;

        try {
            c = a / b;
        } catch (ArithmeticException e) {
            // en la e recoge el error si ocurre
            System.err.println("Error: " + e.getMessage());
            return;
            // return para salir del programa
        }

        System.out.printf("El resultado de la operacion es: %d", c);
    }
}
