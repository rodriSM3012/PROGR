/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_4ejerc3;

/**
 *
 * @author ALUMNOS_FP
 */
public class B1_4Ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declara una variable numérica que se corresponda con la longitud del lado de 
        //un cuadrado. Muestra por pantalla cuál sería el área del cuadradoy el cubo
        //asociado a esas dimensiones.
        float l = 4;
        float areaCuad = l * l;
        float areaCubo = areaCuad * 6;
        System.out.println("El área del cuadrado con longitud de lado de " + l + " es igual a " + areaCuad + " metros cuadrados.");
        System.out.println("El área del cubo con longitud de arista de " + l + " es igual a " + areaCubo + " metros cuadrados.");
    }
}
