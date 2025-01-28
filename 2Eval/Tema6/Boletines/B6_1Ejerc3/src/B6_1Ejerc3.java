import java.util.Scanner;

public class B6_1Ejerc3 {
    public static void main(String[] args) {
        StringBuilder password = new StringBuilder("1234");
        Scanner teclado = new Scanner(System.in);
        String cad1, cad2;
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
                    if (cad1.equals(password.toString())) {
                        System.out.println("\nLa cadena introducida coincide con la contraseña.");
                    } else {
                        System.out.println("\nLa cadena introducida no coincide con la contraseña.");
                    }
                    break;
                case 2:
                    System.out.println("\nLa longitud de la cadena es de " + cad1.length() + " caracteres.");
                    break;
                case 3:
                    System.out.print("\nIntroduce otra cadena: ");
                    cad2 = teclado.nextLine();
                    if (cad1.length() > cad2.length()) {
                        System.out.println("La primera cadena es más larga que la segunda.");
                    } else if (cad1.length() == cad2.length()) {
                        System.out.println("Ambas cadenas tienen la misma longitud.");
                    } else {
                        System.out.println("La segunda cadena es más larga que la primera.");
                    }
                case -1:
                    System.out.println("\nFinalizando programa.");
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
}
