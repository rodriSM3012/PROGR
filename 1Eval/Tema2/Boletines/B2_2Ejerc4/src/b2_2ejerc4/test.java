/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_2ejerc4;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double masa, aux;
        String tipoMedida;
        Peso obj1 = new Peso();

        System.out.print("Introduce un peso en kg: ");
        masa = teclado.nextDouble();
        obj1 = new Peso(masa);
        System.out.printf("%.2f kg = %.2f Lb\n" +
                "%.2f kg = %.2f Li\n\n",
                masa, obj1.getLibras(), masa, obj1.getLingotes());

        System.out.print("Introduce un peso en kg: ");
        masa = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Ahora introduce una medida distinta que no sea kg" +
                " para hacer una conversión (Lb, Li, Oz, P, G, Q): ");
        tipoMedida = teclado.nextLine();
        obj1 = new Peso(masa);
        
        aux = obj1.getPeso(masa, tipoMedida);
        /*
        switch (tipoMedida) {
        case "Lb":
        tipoMedida = "libras";
        break;
        case "Li":
        tipoMedida = "lingotes";
        break;
        case "Oz":
        tipoMedida = "onzas";
        break;
        case "P":
        tipoMedida = "peniques";
        break;
        case "G":
        tipoMedida = "gramos";
        break;
        case "Q":
        tipoMedida = "quintales";
        break;
        } 
        */
        if (tipoMedida.equals("Lb"))
            tipoMedida = "libras";
        else if (tipoMedida.equals("Li"))
            tipoMedida = "lingotes";
        else if (tipoMedida.equals("Oz"))
            tipoMedida = "onzas";
        else if (tipoMedida.equals("P"))
            tipoMedida = "peniques";
        else if (tipoMedida.equals("G"))
            tipoMedida = "gramos";
        else if (tipoMedida.equals("Q"))
            tipoMedida = "quintales";
        else {
            System.out.println("El tipo de medida que introdujiste no es válida.");
            return;
        }

        System.out.printf("Un objeto de %.2f kilogramos pesaría %.2f %s\n", masa, aux, tipoMedida);
    }
}
