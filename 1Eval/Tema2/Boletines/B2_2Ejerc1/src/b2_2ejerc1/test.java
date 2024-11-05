package b2_2ejerc1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double euro, dolar, cambio;
        int result;
        Finanzas f;
        System.out.print("Si el cambio de moneda está a 1.36 (1), si no es así (2): ");
        result = teclado.nextInt();

        if (result == 1)
            f = new Finanzas();
        else {
            System.out.print("Introduzca el cambio que desea utilizar: ");
            cambio = teclado.nextDouble();
            f = new Finanzas(cambio);
        }

        System.out.print("¿Desea cabiar dólares(1) o euros(2)? ");
        result = teclado.nextInt();

        if (result == 1) {
            System.out.print("Indique la cantidad de dólares que desea cambiar: ");
            dolar = teclado.nextDouble();
            euro = f.dolaresToEuros(dolar);
            System.out.printf("%.2f dólares al cambio serán %.2f euros.", dolar, euro);
        }
        else {
            System.out.print("Indique la cantidad de euros que desea cambiar: ");
            euro = teclado.nextDouble();
            dolar = f.eurosToDolares(euro);
            System.out.printf("%.2f euros al cambio serán %.2f dólares.", euro, dolar);
        }

        teclado.close();
    }
}
