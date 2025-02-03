public class B6_2Ejerc2 {
    public static void main(String[] args) {
        /*
         * A. Crear un StringBuilder con la cadena "Hola Caracola" y mostrarla por
         * consola.
         * B. Mostrar por consola su longitud.
         * C. Partiendo de la cadena anterior y usando los métodos de StringBuilder
         * modificar la cadena para que pase a ser "Hay Caracolas" y mostrarla por
         * consola.
         * D. Partiendo de la cadena anterior y usando los métodos de StringBuilder
         * modificar la cadena para que pase a ser "Hay 5000 Caracolas" y mostrarla
         * por consola. El número entero 5000 debe estar almacenado en un int
         * inicialmente.
         * E. Partiendo de la cadena anterior y usando los métodos de StringBuilder
         * modificar la cadena para que pase a ser "Hay 5000 Caracolas en el mar" y
         * mostrarla por consola.
         * F. Almacenar en un String los últimos 4 carácteres del StringBuilder
         * resultante y
         * mostrar ese String por consola.
         * G. Mostrar por consola la longitud del StringBuilder final.
         * H. Realizar el mismo ejercicio con la clase StringBuffer.
         */

        System.out.println("StringBuilder:");
        // A.)
        StringBuilder sb1 = new StringBuilder("Hola Caracola");
        System.out.println(sb1);
        // B.)
        System.out.println("Longitud de sb1: " + sb1.length());
        // C.)
        sb1.replace(1, 4, "ay");
        sb1.append('s');
        System.out.println(sb1);
        // D.)
        int n = 5000;
        sb1.insert(4, n + " "); // si se pone ' ' lo trata como un caracter y no va
        // sb1.insert(8, ' ');
        System.out.println(sb1);
        // E.)
        sb1.append(" en el mar");
        System.out.println(sb1);
        // F.)
        String cad1 = sb1.substring(sb1.length() - 4, sb1.length());
        System.out.println(cad1);
        // G.)
        System.out.println("Longitud de sb1 final: " + sb1.length());
        // H.)

        System.out.println("\nStringBuffer:");
        // A.)
        StringBuffer sb2 = new StringBuffer("Hola Caracola");
        System.out.println(sb2);
        // B.)
        System.out.println("Longitud de sb2: " + sb2.length());
        // C.)
        sb2.replace(0, 4, "Hay");
        sb2.append('s');
        System.out.println(sb2);
        // D.)
        n = 5000;
        sb2.insert(4, n + " ");
        System.out.println(sb2);
        // E.)
        sb2.append(" en el mar");
        System.out.println(sb2);
        // F.)
        cad1 = sb2.substring(sb2.length() - 4, sb2.length());
        System.out.println(cad1);
        // G.)
        System.out.println("Longitud de sb2 final: " + sb2.length());
    }
}
