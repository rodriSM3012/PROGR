import java.util.Scanner;

public class B6_1Ejerc6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cad1, cad2;
        int n;

        System.out.println("Se le van a solicitar dos cadenas por teclado.");
        System.out.print("Introduce la primera: ");
        cad1 = teclado.nextLine();
        System.out.print("Introduce la segunda: ");
        cad2 = teclado.nextLine();

        do {
            System.out.print("\nElige entre una de estas opciones introduciendo el número correspondiente.\n" +
                    "(1) Buscar cadena.\n" +
                    "(2) Iniciales.\n" +
                    "(3) Finales.\n" +
                    "(4) Cambio.\n" +
                    "(-1) Salir.\n" +
                    "Ahora introduce el número: ");
            n = teclado.nextInt();
            n = comprobarOpcion(n, teclado);

            switch (n) {
                case 1:
                    buscarCadena(cad1, cad2);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case -1:
                    break;
                default:
            }
        } while (n != -1);

        teclado.close();
    }

    public static int comprobarOpcion(int n, Scanner teclado) {
        while (n < 1 || n > 4 || n != -1) {
            System.out.print("El número introducido no coincide con ninguna de las posibles opciones, " +
                    "introdúcelo de nuevo:");
            n = teclado.nextInt();
        }
        return n;
    }

    // opcion 1
    public static void buscarCadena(String cad1, String cad2) {
        if (cad1.contains(cad2)) {
            System.out.println("La segunda cadena está contenida en la primera cadena.");
        } else {
            System.out.println("La segunda cadena no está contenida en la primera cadena.");
        }
    }

    // opcion 2
    public static void coincideIniciales(String cad1, String cad2) {
        if (cad1.startsWith(cad2)) {
            System.out.println("La primera cadena comienza por la segunda cadena.");
        } else {
            System.out.println("La primera cadena no comienza por la segunda cadena.");
        }
    }

    // opcion 3
    public static void coincideFinal(String cad1, String cad2) {
        if (cad1.endsWith(cad2)) {
            System.out.println("La primera cadena termina por la segunda cadena.");
        } else {
            System.out.println("La primera cadena no termina por la segunda cadena.");
        }
    }

    // opcion 4 - sobreescribir la primera cadena con la segunda sustituyendo sus
    // ultimos caracteres por los de una 3ª cadena
    public static String cambiarCadena(String cad1, String cad2, Scanner teclado) {
        StringBuilder sb1 = new StringBuilder(cad2);
        String aux;

        System.out.print("Introduce una tercera cadena: ");
        String cad3 = teclado.nextLine();
        /*
         * int i = cad2.length();
         * while (i > 0) {
         * cad3.charAt(i)
         * i--;
         * }
         */
        for (int i = 0; (i < cad2.length() && i < cad3.length()); i++) {
            aux = Character.toString(cad3.charAt(cad3.length() - i - 1));
            sb1.replace(sb1.length() - i - 1, sb1.length() - i, aux);
        }

        return sb1.toString();
    }
}
