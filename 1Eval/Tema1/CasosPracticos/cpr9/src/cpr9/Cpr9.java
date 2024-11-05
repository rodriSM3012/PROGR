/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr9;
import java.util.Scanner;
/**
 *
 * @author ALUMNOS_FP
 */
public class Cpr9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean estaLloviendo = true, haceFrio = false;
        int num = estaLloviendo ? 3 : 4; //como un if: si estaLloviendo es true num = 3, si no num = 4 (hay que poner los 2);
        System.out.printf("El código asociado al clima de hoy es %d", num);
    }

}
