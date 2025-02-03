import java.util.Scanner;

public class B6_1Ejerc3 {
    public static void main(String[] args) {
        StringBuilder password = new StringBuilder("1234");
        Scanner teclado = new Scanner(System.in);
        String cad1;
        int n;

        System.out.print("Introduce una cadena de caracteres: ");
        cad1 = teclado.nextLine();
        do {
            System.out.println("\nIntroduce un número para elegir entre una de estas opciones:");
            System.out.print("Contraseña (1)\n" +
                    "Longitud (2)\n" +
                    "Más Larga (3)\n" +
                    "Salir (-1)\n" +
                    "Número: ");
            n = teclado.nextInt();
            teclado.nextLine();
            n = comprobarOpcion(n, teclado);

            switch (n) {
                case 1:
                    checkPassword(cad1, password);
                    break;
                case 2:
                    longitud(cad1);
                    break;
                case 3:
                    cadMasLarga(cad1, teclado);
                    break;
                case -1:
                    System.out.println("\nFinalizando programa.");
                    break;
                default:
                    break;
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

    // opcion 1
    public static void checkPassword(String cad1, StringBuilder password) {
        if (cad1.equals(password.toString())) {
            System.out.println("\nLa cadena introducida coincide con la contraseña.");
        } else {
            System.out.println("\nLa cadena introducida no coincide con la contraseña.");
        }
    }

    // opcion 2
    public static void longitud(String cad1) {
        System.out.println("\nLa longitud de la cadena es de " + cad1.length() + " caracteres.");
    }

    // opcion 3
    public static void cadMasLarga(String cad1, Scanner teclado) {
        System.out.print("\nIntroduce otra cadena: ");
        String cad2 = teclado.nextLine();
        if (cad1.length() > cad2.length()) {
            System.out.println("La primera cadena es más larga que la segunda.");
        } else if (cad1.length() == cad2.length()) {
            System.out.println("Ambas cadenas tienen la misma longitud.");
        } else {
            System.out.println("La segunda cadena es más larga que la primera.");
        }
    }
}
