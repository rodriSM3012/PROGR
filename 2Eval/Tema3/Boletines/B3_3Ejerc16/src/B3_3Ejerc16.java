import java.util.Scanner;

public class B3_3Ejerc16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double distancia;

        System.out.print("Introduce la distancia recorrida en km: ");
        distancia = teclado.nextDouble();

        if (distancia >= 25)
            System.out.println("El precio del billete es de 1,75€.");

        else
            System.out.printf("El precio del billete es de %.2f€.\n", (distancia * 0.1));

        teclado.close();
    }
}
