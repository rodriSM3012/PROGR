/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr2_8;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // declaracion de variables
        Scanner teclado = new Scanner(System.in);
        double precio, pInicial, descuento;
        String resp;
        Articulo art1 = new Articulo();

        // introducir precio o dejarlo por defecto
        System.out.println("¿Necesitas introducir un precio para el artículo o quieres dejarlo por defecto? (s/n)");
        resp = teclado.nextLine();
        if (resp.equals("s")) {
            System.out.print("Introduce el precio del artículo: ");
            precio = teclado.nextDouble();
            art1.setPrecio(precio);
        } else
            art1 = new Articulo();

        // preguntar por el descuento
        System.out.println("¿Quieres aplicarle un descuento? (sólo para artículos por encima de 200€) (s/n)");
        teclado.nextLine();
        resp = teclado.nextLine();
        if (resp.equals("s")) {
            System.out.print("Introduce el descuento que quieres aplicarle en %: ");
            descuento = teclado.nextDouble();

            pInicial = art1.getPrecio();
            precio = art1.descuento(descuento);
            if (precio == pInicial) {
                System.out.printf(
                        "El artículo con precio inicial de %.2f pasa a valer %.2f después del descuento del %.2f por ciento.",
                        pInicial, precio, descuento);
                teclado.close();
                return;
            } else
                System.out.println("El precio del artículo no ha sufrido ningún cambio ya que " +
                        "su valor no alcanza los 200€ y no se le puede aplicar el descuento.");
        }

        System.out.printf("El precio del artículo es de %.2f euros.\n", art1.getPrecio());

        teclado.close();
    }

}
