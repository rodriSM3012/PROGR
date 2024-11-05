/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_3ejerc3;
import java.util.Scanner;
/**
 *
 * @author ALUMNOS_FP
 */
public class B1_3Ejerc3 {

    /**
     * @param args the command line arguments
     */
    final static double PI = 3.1416;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double radio, lon, area;
        
        System.out.print("Introduce el radio de la circunferencia: ");
        radio = teclado.nextDouble();
        lon = 2 * PI * radio;
        area = PI * Math.pow(radio, 2);
        System.out.printf("La longitud de la circunferencia de radio %f es %f.\nEl área del círculo de radio %f es %f.\n", radio, lon, radio, area);
        teclado.close();
    }
    
}
