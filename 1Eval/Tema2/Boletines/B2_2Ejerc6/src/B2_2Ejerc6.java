import java.util.Scanner;

public class B2_2Ejerc6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Coche coche1 = new Coche();
        Coche coche2;
        String marca, modelo;

        System.out.println("Objeto 'coche1' creado con el constructor por defecto.");
        System.out.println("Introduce los valores para crear el objeto 'coche2'.");
        System.out.print("Marca: ");
        marca = teclado.nextLine();
        System.out.print("Modelo: ");
        modelo = teclado.nextLine();
        coche2 = new Coche(marca, modelo);

        System.out.printf(coche1.toString() + "\n");
        System.out.printf(coche2.toString() + "\n");

        teclado.close();
    }
}
