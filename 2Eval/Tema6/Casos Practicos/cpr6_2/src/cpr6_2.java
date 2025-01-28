public class cpr6_2 {
    public static void main(String[] args) {
        StringBuilder cad = new StringBuilder("Hoal Muuundo"); // hay que instanciarlo

        // al usar StringBuilder no hace falta cad = cad.delete()
        cad.delete(6, 8); // el primero es inclusive y el segundo no

        cad.append('!'); // añade un caracter al final
        // cad.insert(cad.length(), '!'); // seria como el append pero con insert
        cad.insert(0, '¡');

        cad.replace(3, 5, "la"); // sustituye una seccion de la cadena por otra

        // cad.reverse(); // para invertir la cadena

        System.out.println(cad);
    }
}
