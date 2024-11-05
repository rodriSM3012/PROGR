/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_3ejerc1;
import java.util.Scanner;
/**
 *
 * @author ALUMNOS_FP
 */
public class B1_3Ejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Escribe un número entero: ");
        n = teclado.nextInt();
        System.out.printf("El doble del número %d es %d.\nEl triple del número %d es %d\n",
                          n, 2*n, n, 3*n);
        teclado.close();
    }    
}
