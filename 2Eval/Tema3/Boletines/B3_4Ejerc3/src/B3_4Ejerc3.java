import java.util.Scanner;

public class B3_4Ejerc3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int iniRango = 1, finRango = 50;
        int randomN = randomInt(iniRango, finRango);

        System.out.println("Se ha generado un número aleatorio del " + iniRango + " al " + finRango
                + ".\nPara adivinar qué número es, puedes introducir un número y se indicará si es mayor o menor.");
                
        System.out.print("Introduce un número: ");
        int n = teclado.nextInt();
        while (n != randomN) {
            if (n > randomN) {
                System.out.println("Mayor.");
            } else {
                System.out.println("Menor.");
            }
            System.out.print("Introduce otro número: ");
            n = teclado.nextInt();
        }
        System.out.println("¡Has acertado el número!");

        teclado.close();
    }

    public static int randomInt(int iniRango, int finRango) {
        return (int) (Math.random() * (finRango - iniRango) - iniRango);
    }
}
