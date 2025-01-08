import java.util.Scanner;

public class B3_3Menu1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int r;

        System.out.print("¿Quieres hacer el ejercicio 8 o 14? (introduce 8 o 14): ");
        r = teclado.nextInt();

        if (r == 8) {
            System.out.println("Reproduciendo ejercicio 8: ");

            int n1;

            System.out.print("Introduce un número entero: ");
            n1 = teclado.nextInt();

            System.out.println("Números impares desde el 1 hasta el " + n1 + ":");
            // for (int i = 0; i < n; i++) {
            // if (i % 2 != 0) {
            // if (((i + 1) >= n)) {
            // System.out.println(i);
            // break;
            // }
            // System.out.print(i + ", ");
            // }
            // }

            // no hace falta comprobar cada vez, ya que los impares siguen la misma sucesion
            for (int i = 1; i < (n1 - 1); i += 2) {
                System.out.print(i + ", ");
            }

            // para imprimr el ultimo numero y que aparezca sin la coma
            // (por eso es i<(n-1) en el bucle for)
            if (n1 % 2 != 0)
                System.out.println(n1);
            else
                System.out.println(n1 - 1);

            teclado.close();
            return;
        } else if (r == 14) {
            System.out.println("Reproduciendo ejercicio 14: ");

            // n para guardar el número original
            int n2;
            // // pot para guardar la potencia de 10 que se usara para dividir
            // int pot = 10;
            // ^ no hace falta una variable ya que se puede usar (10^cont)
            // el contador empieza en 1 porque se asume que tiene como minimo 1 digito
            int cont = 1;

            System.out.print("Introduce un número entero: ");
            n2 = teclado.nextInt();

            // 456/1000=0 ; 456/100=4 ; 456/10=45
            // (int) para que salga resultado exacto
            while ((n2 / (int) Math.pow(10, cont)) != 0) {
                cont++;
            }

            System.out.println("El número " + n2 + " posee " + cont + " dígitos.");
            teclado.close();
            return;
        } 
        // else {
        //     System.out.print("Has introducido un número que no coincide con 8 o 14, " +
        //             "¿deseas salir del programa?(s/n): ");
        // }
        System.out.println("Finalizando el programa...");
        teclado.close();
    }
}
