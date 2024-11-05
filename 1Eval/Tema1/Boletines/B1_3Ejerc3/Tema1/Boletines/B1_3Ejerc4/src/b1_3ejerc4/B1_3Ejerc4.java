/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_3ejerc4;
import java.util.Scanner;
/**
 *
 * @author ALUMNOS_FP
 */
public class B1_3Ejerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double tempC;
        
        System.out.print("Introduce la temperatura en Cº: ");
        tempC = teclado.nextDouble();
        double tempF = 32 + (9 * tempC / 5);
        
        System.out.printf("La temperatura de %.2f Cº equivale a %.2f Fº.\n", tempC, tempF);
        teclado.close();
    }
    
}
