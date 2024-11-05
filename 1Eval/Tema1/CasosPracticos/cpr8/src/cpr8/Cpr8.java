/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr8;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class Cpr8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int a;
        double d;
        char resp;
        boolean encontrado;
        String cad, r; 


        System.out.print("Introduce un entero: ");
        a = teclado.nextInt();
        System.out.println(a);
        System.out.printf("%d\n", a);

        System.out.print("Introduce un decimal: ");
        d = teclado.nextDouble();
        teclado.nextLine(); //limpieza de buffer
        System.out.println(d);
        System.out.printf("%f\n", d);

        System.out.print("Introduce la respuesta: ");
        r = teclado.nextLine();
        resp = r.charAt(0); //coge lo que hay en r (string) y lee lo que hay en la posición que coincida con el número entre () en este caso 0
        System.out.println(resp);
        System.out.printf("%c\n", resp);

        System.out.print("Introduce un booleano: ");
        encontrado = teclado.nextBoolean();
        teclado.nextLine(); //limipeza de buffer (de booleano a cadena tambien hace falta)
        System.out.println(encontrado);
        System.out.printf("%b\n", encontrado);

        System.out.print("Introduce una cadena de caracteres: ");
        cad = teclado.nextLine();
        System.out.println(cad);
        System.out.printf("%s\n", cad);


        teclado.close();
    }
    
}
