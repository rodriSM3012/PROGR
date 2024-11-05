package cpr2_2;
import java.util.Scanner;

public class test {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Mesa mesa1 = new Mesa(), mesa2;
        double alto, largo, ancho;
        String material;

        System.out.print("Introduce la altura de la mesa en cm: ");
        alto = teclado.nextDouble();
        System.out.print("Introduce la longitud de la mesa en cm: ");
        largo = teclado.nextDouble();
        System.out.print("Introduce la anchura de la mesa en cm: ");
        ancho = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Introduce el tipo de material de la mesa: ");
        material = teclado.nextLine();

        mesa2 = new Mesa(alto, largo, ancho, material);

        System.out.print("Inserta un nuevo ancho para su mesa: ");
        ancho = teclado.nextDouble();
        mesa2.setAncho(ancho);

        System.out.printf("Tras su solicitud se ordena a fábrica el pedido siguiente:\n" +
                          "alto: %.2f\nlargo: %.2f\nancho: %.2f\nmaterial: %s\n",
                          mesa2.getAlto(), mesa2.getLargo(), mesa2.getAncho(), mesa2.getMaterial());

        teclado.close();
    }
}
