/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_4ejerc5;

/**
 *
 * @author ALUMNOS_FP
 */
public class B1_4Ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declarar una vairable numérica correspondiente al percio de un libro de java y
        //calcular posteriormente el PVP que tendrá, tras aplicarle el 8% de IVA.
        
        double precio = 8.99;
        //double precioIVA = precio + 8 * precio / 100;
        double IVA = (double) 8 / 100, precioIVA;
        precioIVA = precio + precio * IVA;
        System.out.printf("El libro con precio %.2f tiene un coste de venta de %.2f\n", precio, precioIVA);
    }
}
