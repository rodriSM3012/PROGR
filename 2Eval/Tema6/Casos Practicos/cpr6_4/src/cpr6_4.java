import java.util.Scanner;

public class cpr6_4 {
    public static void main(String[] args) {
        /*
         * 1) leer cadena
         * 2) stringbuilder
         * 3) buscar interior DAW: true -> modificar DAW por DAM
         * 4) mostrar invertida
         */
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cad = teclado.nextLine();
        StringBuilder sb1 = new StringBuilder(cad);

        int start = sb1.indexOf("DAW");
        if (cad.contains("DAW")) {
            // cad = cad.replace("DAW", "DAM");
            sb1.replace(start, start + 3, "DAM");
        }
        // for (int i = cad.length() - 1; i >= 0; i--) {
        // System.out.print(cad.charAt(i));
        // }
        System.out.println(sb1.reverse());

        teclado.close();
    }
}
