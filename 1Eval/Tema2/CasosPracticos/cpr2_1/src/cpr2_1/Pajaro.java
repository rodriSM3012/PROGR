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
public class Pajaro {
    //atributos
    private char color;
    private int edad;

    //variables
    private static int numPajaros = 0;  //static para hacerlo lo más restringido posible

    //metodos
    //  constructores
    //      constructores por defecto
    public Pajaro(){
        edad = 0;
        color = 'v';
        nuevoPajaro();
    }
    //      constructores de parametro
    public Pajaro(int e, char c){
        edad = e;
        color = c; //asigna el nuevo valor (c) a color
        nuevoPajaro();
    }
    //  comportamientos
    //  getters y setters
    public void setEdad(int e){     //void porque no devuelve nada, solo actualiza
        edad = e;
    }
    public void setColor(char c){
        color = c;
    }

    public int getEdad(){
        return edad;
    }
    public char getColor(){
        return color;
    }

    //  metodos restantes
    public void printEdad(){
        System.out.println(edad);
    }
    
    public void printColor(){
        switch (color) {
            case 'v': System.out.println("Verde");
                      break;
            case 'a': System.out.println("Amarillo");
                      break;
            case 'g': System.out.println("Gris");
                      break;
            case 'n': System.out.println("Negro");
                      break;
            case 'b': System.out.println("Blanco");
                      break;
            default: System.out.println("Ese color no es un color definido para los pájaros.");     //no hace falta poner break;
        }   
    }

    public static void nuevoPajaro(){
        numPajaros++;
    }

    public static void muestraPajaros(){
        System.out.println("El número de pájaros que tiene es: " + numPajaros);
    }
}
