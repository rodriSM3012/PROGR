import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B6_2Ejerc3 {

    // A. Un número entero sin límite de cifras (positivo ó negativo).
    public static boolean comprobarEntero(String cad) {
        // -? indica que puede ser negativo (empezar por -) o no (?)
        // [0-9] es el rango de valores que pueden tomar los caracteres
        // si hubiese '.' como en un numero decimal, retornaría false
        // + indica que pueden haber varias ocurrencias
        Pattern p = Pattern.compile("^-?[0-9]+$");
        Matcher m = p.matcher(cad);
        return m.matches();
    }

    // B. Un número entero positivo sin límite de cifras.
    public static boolean comprobarStringNumPos(String cad) {
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(cad);
        return m.matches();
    }

    // C. Un número entero negativo sin límite de cifras.
    public static boolean comprobarStringNumNeg(String cad) {
        Pattern p = Pattern.compile("^-[0-9]+$");
        Matcher m = p.matcher(cad);
        return m.matches();
    }

    // D. Un DNI con 8 números y una letra al final.
    public static boolean comprobarDNI(String cad) {
        // lo que va entre {} indica la longitud de la sección con los caracteres entre
        // []
        Pattern p = Pattern.compile("^[0-9]{8}[A-Za-z]$");
        Matcher m = p.matcher(cad);
        return m.matches();
        /*
         * cad = cad.toUpperCase();
         * // comprueba que la longitud sea adecuada
         * if (cad.length() != 9) {
         * return false;
         * }
         * // comprueba que el ultimo caracter sea una letra
         * if (!(cad.charAt(8) >= 'A' && cad.charAt(8) <= 'Z')) {
         * return false;
         * }
         * // comprueba que el resto de caracteres son numeros
         * for (int i = 0; i < 8; i++) {
         * if (cad.charAt(i) > '9' || cad.charAt(i) < '0') {
         * return false;
         * }
         * }
         * // despues de pasar por todas las pruebas
         * return true;
         */
    }

    // E. Una dirección IPv4.
    public static boolean comprobarIPv4(String cad) {
        // comprueba la longitud
        if (cad.length() < 7 || cad.length() > 15) {
            return false;
        }
        // recorre el string y comprueba que los caracteres que no sean puntos sean
        // numeros y cuenta que haya 3 puntos
        int cont = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == '.') {
                cont++;
            } else {
                if (!(cad.charAt(i) >= '0' && cad.charAt(i) <= '9')) {
                    return false;
                }
            }
        }
        // si no hay 3 puntos finaliza
        if (cont != 3) {
            return false;
        }
        return true;
    }

    // F. Una matrícula de un coche con formato 0000XXX.
    public static boolean comprobarMatricula(String cad) {
        Pattern p = Pattern.compile("^[0-9]{4}[A-Z]{3}$");
        Matcher m = p.matcher(cad);
        return m.matches();
        /*
         * // comprobar longitud
         * if (cad.length() != 7) {
         * return false;
         * }
         * for (int i = 0; i < 4; i++) {
         * if (!comprobarNumString(cad.charAt(i))) {
         * return false;
         * }
         * }
         * for (int i = 4; i < 7; i++) {
         * if (!comprobarLetraString(cad.charAt(i))) {
         * return false;
         * }
         * }
         * return true;
         */
    }

    // G. Un número binario.
    public static boolean comprobarBin(String cad) {
        Pattern p = Pattern.compile("^[01]+$");
        Matcher m = p.matcher(cad);
        return m.matches();
        /*
         * for (int i = 0; i < cad.length(); i++) {
         * if (!(cad.charAt(i) == '0' || cad.charAt(i) == '1')) {
         * return false;
         * }
         * }
         * return true;
         */
    }

    // H. Un número octal.
    public static boolean comprobarNumOct(String cad) {
        return cad.matches("^[0-7]+$");
        /*
         * for (int i = 0; i < cad.length(); i++) {
         * if (!(cad.charAt(i) >= '0' && cad.charAt(i) <= '7')) {
         * return false;
         * }
         * }
         * return true;
         */
    }

    // I. Un número hexadecimal.
    public static boolean comprobarNumHex(String cad) {
        return cad.matches("^[0-9A-Fa-f]+$");
        /*
         * cad = cad.toUpperCase();
         * for (int i = 0; i < cad.length(); i++) {
         * if (!comprobarNumString(cad.charAt(i)) && !((cad.charAt(i)) >= 'A' &&
         * cad.charAt(i) <= 'F')) {
         * return false;
         * }
         * }
         * return true;
         */
    }

    // J. Un número real.
    // public static boolean comprobar

    // K. Un número real positivo.
    // public static boolean comprobar

    // L. Un número real negativo.
    // public static boolean comprobar

    // M. Un número real con x decimales.
    // public static boolean comprobar

    // N. Un número real positivo con x decimales.
    // public static boolean comprobar

    // O. Un número real negativo con x decimales.
    // public static boolean comprobar

    // P. Una fecha con formato dd/mm/aaaa.
    public static boolean comprobarFecha(String cad) {
        Pattern p = Pattern.compile("^[0123][0-9][/][01][0-9][/][0-9]{4}$");
        // Pattern p =
        // Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$");
        Matcher m = p.matcher(cad);
        return m.matches();
    }

    // Q. Un nombre, incluyendo nombres compuestos.
    // public static boolean comprobar

    // R. Un email.
    // public static boolean comprobar

    // S. Un nombre de usuario en twitter, empieza por @ y puede contener letras
    // mayúsculas y minúsculas, números, guiones y guiones bajos.
    // public static boolean comprobar

    // T. Un ISBN de 13 dígitos que siempre empieza en 978 o 979.
    // public static boolean comprobar

    public static boolean comprobarLetraString(char c) {
        if (!(c >= 'A' && c <= 'Z')) {
            return false;
        }
        return true;
    }

    public static boolean comprobarNumString(char c) {
        if (!(c >= '0' && c <= '9')) {
            return false;
        }
        return true;
    }

}
