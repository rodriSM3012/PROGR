/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_3ejerc5;
import java.util.Scanner;
/**
 *
 * @author ALUMNOS_FP
 */
public class B1_3Ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double velKMH, velMS;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la velocidad en kilómetros por hora: ");
        velKMH = teclado.nextDouble();
        velMS = (double) 1000 / 3600 * velKMH;

        System.out.printf("La velocidad de %f km/h equivale a %f m/s.", velKMH, velMS);
        teclado.close();
    }    
}
