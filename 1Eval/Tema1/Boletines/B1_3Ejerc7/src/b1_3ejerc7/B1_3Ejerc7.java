/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_3ejerc7;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class B1_3Ejerc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String codProd, concepto, sec;
        int temp;
        double precio, precioReb;
        
        System.out.print("Introduce el código de producto: ");
        codProd = teclado.nextLine();
        System.out.print("Introduce el concepto: ");
        concepto = teclado.nextLine();
        System.out.print("Introduce la sección: ");
        sec = teclado.nextLine();
        System.out.print("Introduce la temporada: ");
        temp = teclado.nextInt();
        System.out.print("Introduce el precio: ");
        precio = teclado.nextDouble();
        precioReb = precio * 0.6;

        System.out.printf("Código de producto: %s\n" +
                          "Concepto: %s\n" +
                          "Sección: %s\n" +
                          "Temporada: %d\n" +
                          "Precio: %.2f\n",
                          codProd, concepto, sec, temp, precio);
        if (temp < 2018) System.out.printf("El precio (del/de la) %s rebajada es %.2f Euros", concepto, precioReb);
        else System.out.println("El producto no está aún rebajado");

        teclado.close();
    }
    
}