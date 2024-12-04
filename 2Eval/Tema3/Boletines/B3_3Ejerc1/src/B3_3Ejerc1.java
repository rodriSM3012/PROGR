public class B3_3Ejerc1 {
    public static void main(String[] args) {
        String string1 = "ESTO ES UNA PRUEBA";
        String string2 = "";
        // variable a se usa para calcular .charAt 1 sola vez en lugar de 2 en el bucle
        char a;

        for (int i = 0; i <= string1.length(); i++) {
            a = string1.charAt(i);
            string2 += a;
            // se comprueba que si es un espacio para saltarlo o no
            // no se pone string2 += a; dentro del if porque si tienen que haber espacios
            if (a != ' ')
                System.out.println(string2);
        }
    }
}
