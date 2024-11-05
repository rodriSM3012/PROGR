package cpr2_3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cintura, cadera, longitud, corte;
        char color;
        String c;


    // primer constructor (por defecto)
        Pantalones pant1 = new Pantalones(), pant2, pant3;        

        System.out.printf("(pant1)\nEl pantalón solicitado tiene las siguientes características:\n" +
                "Cintura: %.2f cm\nCadera: %.2f cm\nLongitud: %.2f cm\nColor: Azul\n\n",
                pant1.getCintura(), pant1.getCadera(), pant1.getLargo(),pant1.getColor());

        
    // segundo constructor (2 param)
        System.out.print("Introduce por teclado las medidas de la cintura en cm: ");
        cintura = teclado.nextDouble();
        System.out.print("Introduce por teclado el color del pantalón: ");
        c = teclado.nextLine();
        color = c.charAt(0);
        pant2 = new Pantalones(cintura, color);

        System.out.printf("El pantalón solicitado tiene las siguientes características:\n" +
                "Cintura: %.2f cm\nCadera: %.2f cm\nLongitud: %.2f cm\nColor: ",
                pant2.getCintura(), pant2.getCadera(), pant2.getLargo());
        
        switch (pant2.getColor()) {
            case 'a':
                System.out.println("Azul");
                break;

            default:
                System.out.println("El color introducido no es válido.");
        }


    // tercer constructor (4 param)
        System.out.print("Introduce por teclado las medidas de la cintura en cm: ");
        cintura = teclado.nextDouble();
        System.out.print("Introduce por teclado las medidas de la cadera en cm: ");
        cadera = teclado.nextDouble();
        System.out.print("Introduce por teclado la longitud en cm: ");
        longitud = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Introduce por teclado el color del pantalón: ");
        c = teclado.nextLine();
        color = c.charAt(0);

        pant3 = new Pantalones(cintura, cadera, longitud, color); // la asignación es después de pedir los datos

        System.out.print("Introduce un valor si desea cortar el largo: ");
        corte = teclado.nextDouble();
        pant3.cortarLargo(corte);
                

        System.out.printf("El pantalón solicitado tiene las siguientes características:\n" +
                "Cintura: %.2f cm\nCadera: %.2f cm\nLongitud: %.2f cm\nColor: ",
                pant1.getCintura(), pant1.getCadera(), pant1.getLargo());

        switch (pant3.getColor()) {
            case 'a':
                System.out.println("Azul");
                break;

            default:
                System.out.println("El color introducido no es válido.");
        }

        teclado.close();
    }
}
