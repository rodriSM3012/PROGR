import java.util.Scanner;

public class B6_1Ejerc4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cad1, cad2;
        int n;

        System.out.print("Se le van a solicitar dos cadenas por teclado.\n" +
                "Introduce la primera cadena: ");
        cad1 = teclado.nextLine();
        System.out.print("Introduce la segunda cadena: ");
        cad2 = teclado.nextLine();

        do {
            System.out.print("\nElige entre una de estas opciones introduciendo el número correspondiente.\n" +
                    "(1) Sobrescribir: Copiará el contenido de la segunda cadena sobre la primera.\n" +
                    "(2) Mayúsculas: Mostrará el contenido de la segunda cadena en mayúsculas.\n" +
                    "(3) Longitud: Calculará la Longitud de cada cadena.\n" +
                    "(-1) Salir: Permite abandonar la ejecución del programa.\n" +
                    "Ahora introduce el número: ");
            n = teclado.nextInt();
            teclado.nextLine();
            n = comprobarOpcion(n, teclado);

            switch (n) {
                case 1:
                    cad1 = cad2;
                    System.out.println("\nSe ha sobreescrito la primera cadena con el contenido de la segunda.");
                    break;
                case 2:
                    mayusculas(cad1, cad2);
                    break;
                case 3:
                    longitud(cad1, cad2);
                    break;
                case -1:
                    System.out.println("\nFinalizando programa.");
                    break;
                default:
            }
            System.out.print("Pulsa 'Enter' para continuar.");
            teclado.nextLine();
        } while (n != -1);

        teclado.close();
    }

    public static int comprobarOpcion(int n, Scanner teclado) {
        while (!(n == 1 || n == 2 || n == 3 || n == -1)) {
            System.out.print("El número introducido no coincide con ninguna de las opciones, " +
                    "introduce el número de nuevo: ");
            n = teclado.nextInt();
        }
        return n;
    }

    // public static String sobreescribir (String cad) {
    // }

    // opcion 2
    public static void mayusculas(String cad1, String cad2) {
        System.out.println("\n" + cad2.toUpperCase());
    }

    // opcion 3
    public static void longitud(String cad1, String cad2) {
        System.out.println("\nLongitud cadena 1: " + cad1.length() +
                "\nLongitud cadena 2: " + cad2.length());
    }
}
