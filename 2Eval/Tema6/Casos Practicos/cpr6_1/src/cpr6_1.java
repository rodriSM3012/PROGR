import java.util.Scanner;

public class cpr6_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cad = "         Bienvenido Rodrigo";
        String cad2 = "Rodrigo";
        String cad3;
        String inicial;
        String ejemplos;
        char ini;

        cad = cad.trim(); // elimina los espacios a los lados
        // String union = "Bienvenido " + "Rodrigo";
        String union = cad.concat(cad2);

        System.out.println("La cadena insertada es: " + union);

        System.out.print("Introduce una cadena: ");
        inicial = teclado.nextLine();
        ini = inicial.charAt(0);
        System.out.println(ini);

        ejemplos = inicial.substring(0, 4); // utiliza los caracteres entre 0 y 4 incluidos
        ejemplos = inicial.substring(2); // utiliza la cadena a partir del caracter en posicion 2

        System.out.println(ejemplos);

        if (cad.equals(cad2)) { // cad.equalsIgnoreCase(cad2)
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas no son iguales.");
        }

        cad3 = cad.toUpperCase();
        System.out.println(cad3);
        cad3 = cad.toLowerCase();
        System.out.println(cad3);

        /*
         * string.indexOf()
         * devuelve la posicion (int) en la que localiza una cadena dentro de otra
         * pone la posicion en la que empieza la cadena que esta dentro de la otra
         * si no la encuentra devuelve -1
         * aunque aparezca varias veces solo detectaria la primera vez que aparezca
         */
        int posicion = cad.indexOf(cad2);
        System.out.println(posicion);
        posicion = cad.indexOf(cad2, 12); // para empezar a buscar a partir de una posicion concreta
        System.out.println(posicion);

        // detecta si la contiene o no y devuelve true o false
        if (cad.contains(cad2)) {
            System.out.println("La cadena está contenida en la principal. ");
        } else {
            System.out.println("La cadena no está contenida en la principal. ");
        }

        // para detectar si empieza / acaba con un string o no (true / false)
        String cad4 = "Bien";
        if (cad.startsWith(cad4)) {
            System.out.println("La cadena empieza con 'Bien'. ");
        } else {
            System.out.println("La cadena no empieza con 'Bien'. ");
        }

        cad4 = "Rodrigo";
        if (cad.endsWith(cad4)) {
            System.out.println("La cadena empieza con 'Rodrigo'. ");
        } else {
            System.out.println("La cadena no empieza con 'Rodrigo'. ");
        }

        // para sacar la longitud de una cadena
        int n = cad.length();
        System.out.println("La longitud de la cadena '" + cad + "' es de " + n);

        // para sustituir una parte de una cadena por otra secuencia
        String cad5 = "Hotel";
        String cad6 = "te";
        String cad7 = "sta";
        cad5 = cad5.replace(cad6, cad7); // primer param: lo que quiero quitar ; segundo param: por lo que se sustituye
        System.out.println(cad5);

        teclado.close();
    }
}
