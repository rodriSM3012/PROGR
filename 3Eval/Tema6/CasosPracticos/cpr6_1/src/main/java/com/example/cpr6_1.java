package com.example;

import java.util.*;

public class cpr6_1 {
    public static void main(String[] args) {

        Collection<String> col1 = new HashSet<String>();
        Collection<String> col2 = Arrays.asList("Sol", "Lluvia");
        Collection<String> col3 = Collections.singleton("Viento"); // solo 1

        // añadir niebla a coleccion 1 y
        // mensaje que confirme que se ha hecho correctamente
        if (col1.add("Niebla")) { // para añadir elemento
            System.out.println(col1);

        }

        // añadir elementos de col2 a col1
        if (col1.addAll(col2)) {
            System.out.println(col1);
        }

        // hacer copia
        Collection<String> copiaCol1 = new ArrayList<String>(col1);
        System.out.println(copiaCol1);

        // eliminar elementos
        col1.remove("Niebla");
        System.out.println(col1);

        // eliminar elementos en col1 que esten en col3
        col1.removeAll(col3);
        System.out.println(col1);

        // mantener elemntos de col2 que esten en col1 y el resto eliminarlos
        col1.retainAll(col2);
        System.out.println(col1);

        // limpiar
        col1.clear();
        System.out.println(col1);

        // comprobar si una coleccion esta vacia
        boolean comp;
        comp = col1.isEmpty();
        if (comp) {
            System.out.println("col1 esta vacío.");
        } else {
            System.out.println("col1 no está vacío.");
        }

        // cuenta los elementos de una coleccion
        int num = copiaCol1.size();
        System.out.println("Elementos de copiaCol1: " + num);

        // volcar todo copiaCol1 en col1
        col1.addAll(copiaCol1);
        System.out.println(col1);

        // comprobar si 1 elemento esta en una coleccion
        if (col1.contains("Niebla")) {
            System.out.println("Niebla está dentro de col1.");
        } else {
            System.out.println("Niebla no está dentro de col1.");
        }

        // comprobar si todos los elementos de col2 estan en col1
        if (col1.containsAll(col2)) {
            System.out.println("col1 contiene todos los elementos de col2.");
        } else {
            System.out.println("col1 no contiene todos los elementos de col2.");
        }

        // imprimir colecciones
        // 1. utilizando iteradores + while
        System.out.println("\n1ª forma de imprimir elementos de una colección: ");
        Iterator<String> iterador = col1.iterator();

        while (iterador.hasNext()) { // comprueba que en la coleccion que usa iterador
                                     // haya otro elemento sin recorrer
            System.out.println(iterador.next());
        }

        // 2. utilizando iteradores + for
        System.out.println("\n2ª forma de imprimir elementos de una colección: ");
        for (Iterator<String> i = col1.iterator(); i.hasNext();) { // declaracion; condicion;
                                                                   // no hace falta el i++ lo hace automatico
            System.out.println(i.next());
        }

        // 3. utilizando string + cad
        System.out.println("\n3ª forma de imprimir elementos de una colección: ");
        for (String cad : col1) { // moverse por col1 y cada uno de ellos lo vuelca en cad
            System.out.println(cad);
        }
    }
}