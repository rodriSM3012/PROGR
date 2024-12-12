import java.util.Scanner;

public class B3_3Ejerc14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // n para guardar el número original
        int n;
        // // pot para guardar la potencia de 10 que se usara para dividir
        // int pot = 10;
        // ^ no hace falta una variable ya que se puede usar (10^cont)
        // el contador empieza en 1 porque se asume que tiene como minimo 1 digito
        int cont = 1;

        System.out.print("Introduce un número entero: ");
        n = teclado.nextInt();

        // 456/1000=0 ; 456/100=4 ; 456/10=45
        // (int) para que salga resultado exacto
        while ((n / (int) Math.pow(10, cont)) != 0) {
            cont++;
        }

        System.out.println("El número " + n + " posee " + cont + " dígitos.");
        teclado.close();
    }
}
