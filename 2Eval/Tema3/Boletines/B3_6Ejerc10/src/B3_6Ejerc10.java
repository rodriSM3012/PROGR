import java.util.Scanner;

public class B3_6Ejerc10 {
    public static void main(String[] args) {
        // pedir numero de 3 cifras y decomponerlo en unidades, decenas y centenas
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.print("Introduce un numero de 3 cifras: ");
        n = teclado.nextInt();
        n = comprobar(n);
        descomponer(n);
        teclado.close();
    }

    public static int comprobar(int n) {
        Scanner teclado = new Scanner(System.in);
        while (!(n >= 100 && n <= 999)) {
            System.out.print("Ese número no es de 3 cifras, reintroduce el número: ");
            n = teclado.nextInt();
        }
        teclado.close();
        return n;
    }

    public static void descomponer(int n) {
        int resto = 1;
        int cont = 0;
        while (resto != 0) {
            resto = n % 10;
            n = (int) (n / 10);
            switch (cont) {
                case 0:
                    System.out.println("Unidades: " + resto);
                    break;
                case 1:
                    System.out.println("Decenas: " + resto);
                    break;
                case 2:
                    System.out.println("Centenas: " + resto);
                    break;
                default:
                    break;
            }
            cont++;
        }
    }
}
