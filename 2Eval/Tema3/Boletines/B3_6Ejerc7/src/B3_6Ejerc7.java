import java.util.Scanner;

public class B3_6Ejerc7 {
    public static void main(String[] args) {
        // calcular nota media de una secuencia de notas finaliza cuando -1
        // 0 >= nota >= 10
        Scanner teclado = new Scanner(System.in);
        int nota;
        double media;

        System.out.print("Se va a pedir por teclado una serie de notas para calcular la media."
                + " Las notas deben ser números enteros sin decimales y la secuencia termina al introducir -1. "
                + " \nIntroduce la primera nota: ");
        nota = teclado.nextInt();
        if (nota == -1) {
            System.out.println("Finalizando programa.");
            return;
        }
        nota = comprobarNota(nota, teclado);

        media = calcularMedia(nota, teclado);

        System.out.printf("La media de las notas que has introducido equivale a %.2f.", media);
        teclado.close();
    }

    public static int comprobarNota(int nota, Scanner teclado) {
        while ((nota != -1) && ((nota < 0) || (nota > 10))) {
            System.out.print("La nota debe de estar comprendida entre 0 y 10 inclusive. Vuelve a introducir la nota: ");
            nota = teclado.nextInt();
        }
        return nota;
    }

    public static double calcularMedia(int nota, Scanner teclado) {
        int cantVal = 0;
        int suma = 0;
        while (nota != -1) {
            suma += nota;
            cantVal++;

            System.out.print("Introduce la siguiente nota: ");
            nota = teclado.nextInt();
            nota = comprobarNota(nota, teclado);
        }
        System.out.println("Secuencia finalizada.\n");
        return ((double) suma) / cantVal;
    }
}
