import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Distancia d1;
        double distancia;

        System.out.print("Introduce un valor de distancia en millas: ");
        distancia = teclado.nextDouble();
        d1 = new Distancia(distancia);

        System.out.printf("Distancia en millas:%.2f\n" +
                          "Distancia en metros:%.2f\n" +
                          "Distancia en kilómetros:%.2f\n",
                          distancia, d1.millasAMetros(), d1.millasAKilometros());

        teclado.close();
    }
}
