import java.util.Scanner;

public class B3_3Ejerc15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int h, m, s;
        String tiempoOriginal;

        System.out.println(
                "Introduce una cantidad de tiempo con 3 medidas distintas para las horas, los minutos y los segundos.");
        System.out.print("Horas: ");
        h = teclado.nextInt();
        System.out.print("Minutos: ");
        m = teclado.nextInt();
        System.out.print("Segundos: ");
        s = teclado.nextInt();
        tiempoOriginal = h + "h " + m + "m " + s + "s";

        s++;
        if (s >= 60) {
            m++;
            s = 0;
            if (m >= 60) {
                h++;
                m = 0;
            }
        }

        System.out.printf("Tiempo original: %s\nTiempo depués de sumar 1 segundo: "
                + h + "h " + m + "m " + s + "s", tiempoOriginal);

        teclado.close();
    }
}
