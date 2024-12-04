import java.util.Scanner;

public class B3_3Ejerc10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        int x;

        System.out.println("Se va a solicitar una sucesión de valores y " +
                "se va realizar una cuenta de todos aquellos valores que sean divisibles entre 5. " +
                "Para terminar la sucesión introduce un 0: ");
        System.out.print("Introduce un valor: ");
        x = teclado.nextInt();

        while (x != 0) {
            // la comprobación se realiza antes de pedir el siguiente valor para tener en
            // cuenta el primero
            if (x % 5 == 0)
                i++;
            System.out.print("Introduce otro valor: ");
            x = teclado.nextInt();
            // comprobar si es divisible entre 5 o no y sumar al contador
        }

        System.out.println("Has introducido un total de " + i +
                " valor(es) divisibles entre 5.");

        teclado.close();
    }
}
