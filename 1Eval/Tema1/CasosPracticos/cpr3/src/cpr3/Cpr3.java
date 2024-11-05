/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr3;

/**
 *
 * @author ALUMNOS_FP
 */
public class Cpr3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("unused")
public static void main(String[] args) {
        // TODO code application logic here

        // secuencias de escape \n \t \" \' \\ 
//        int x = 7 , y = 5;
//        System.out.printf("El valor de la variable \"x\" es: " + x + "\tEl valor de la variable \"y\" es: " + y + "\n");
           
        // operadores unitarios o monarios
        // 'cont++' es lo mismo que: 'cont = cont + 1'
        int x = 3 , y = 5, z;
        // ++x preincremento 
        z = ++x;        
        //System.out.println(x);
        //System.out.println(z);
        
        //x++ postincremento
        z = x++;
        System.out.println(x);
        System.out.println(z);
        
        // --x preincremento         
        z = --x;        
        System.out.println(x);
        System.out.println(z);
        
        //x-- postincremento
        z = x--;
        System.out.println(x);
        System.out.println(z);      
        
//--------------------------------------------------------------------------------     

        //operadores de bits <<, >>, >>>
        //x << 1 == x*2
        //x >> 1 == x/2 para negativos
        //x >>> 1 == x/2
        //operadores de asignacion
        int num = 5; //0101 en binario        
        System.out.printf("Antes de la operación: %d\n", num);
        num = num << 1;
        //entra un 0 por la derecha y se cae el 0 que hay por la izquierda
        //num = 5; 0101 en binario -> 1010 depues de la operacion
        //desplaza los bits del numero una cantidad determinada de posiciones (en este caso 1) hacia un lado u otro (<< o >>)
        System.out.printf("Después de la operación: %d\n", num);
        
        int num2 = 11; //1011 en binario        
        System.out.printf("Antes de la operación: %d\n", num2);
        num2 = num2 >> 1;        
        System.out.printf("Después de la operación: %d\n", num2);  
        
//--------------------------------------------------------------------------------

//        a *= b  ->  a = a * b
//        x /= y  ->  x = x / y
//        c += m  ->  c = c + m
//        a -= b  ->  a = a - b
//        x %= y  ->  x = x % y
    }    
}
