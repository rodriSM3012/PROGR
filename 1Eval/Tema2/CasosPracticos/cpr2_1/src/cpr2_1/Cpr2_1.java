/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr2_1;

/**
 *
 * @author ALUMNOS_FP
 */
public class Cpr2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pajaro p1, p2;
        p1 = new Pajaro();
        p2 = new Pajaro(3, 'a');

        p1.setEdad(5);
        p1.printEdad();
        p1.setColor('b'); // '...' porque es char
        p1.printColor();
        p1.muestraPajaros();

        // p2.printEdad();
        // p2.printColor();
    }
}
