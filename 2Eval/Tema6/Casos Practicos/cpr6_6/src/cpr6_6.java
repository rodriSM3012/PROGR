import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cpr6_6 {
    public static void main(String[] args) {
        // Ejemplo 1: Uso de Pattern y Matcher para verificar si una cadena contiene solo letras minúsculas
        Pattern p1 = Pattern.compile("[a-z]+"); // el + indica que ocurre más de una vez
        Matcher m1 = p1.matcher("hola");

        if (m1.matches()) {
            System.out.println("Coincide de manera satisfactoria.");
        } else {
            System.out.println("No coincide con el patrón.");
        }

        // Ejemplo 2: Uso de Pattern y Matcher para encontrar todas las ocurrencias de un patrón en una cadena
        Pattern p2 = Pattern.compile("\\d+"); // el + indica que ocurre más de una vez
        Matcher m2 = p2.matcher("123 abc 456 def 789");

        while (m2.find()) {
            System.out.println("Encontrado: " + m2.group());
        }

        // Ejemplo 3: Uso de Pattern y Matcher para reemplazar todas las ocurrencias de un patrón en una cadena
        Pattern p3 = Pattern.compile("\\s+"); // el + indica que ocurre más de una vez
        Matcher m3 = p3.matcher("Hola    mundo   !");

        String resultado = m3.replaceAll(" ");
        System.out.println("Cadena después de reemplazar: " + resultado);
    }
}
