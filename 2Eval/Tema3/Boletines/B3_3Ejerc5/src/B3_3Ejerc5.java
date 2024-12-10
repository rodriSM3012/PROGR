import java.util.Scanner;

public class B3_3Ejerc5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char resp = ' ';
        String aux;

        System.out.print("Introduce una letra: ");
        aux = teclado.nextLine();
        aux = aux.toLowerCase();
        resp = aux.charAt(0);

        switch (resp) {
            case 'r':
                System.out.println("Rojo.");
                break;
            case 'v':
                System.out.println("Verde");
                break;
            case 'a':
                System.out.println("Azul");
                break;
            default:
                System.out.println("Negro.");
        }

        teclado.close();
    }
}
