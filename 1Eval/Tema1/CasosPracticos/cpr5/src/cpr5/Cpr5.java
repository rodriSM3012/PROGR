/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr5;
import java.util.Scanner;
/**
 *
 * @author ALUMNOS_FP
 */
public class Cpr5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer valor: ");
        x = teclado.nextInt();
        System.out.print("Introduce el segundo valor: ");
        y = teclado.nextInt();

        x /= y;
        System.out.print(x);

        teclado.close();
    }
    
}
