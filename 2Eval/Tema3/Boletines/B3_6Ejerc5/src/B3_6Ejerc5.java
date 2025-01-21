import java.util.Scanner;

public class B3_6Ejerc5 {
    public static void main(String[] args) {
        // 2 numeros enteros positivos el primero dividendo y el segundo divisor
        // calcular cociente y resto mediante restas sucesivas
        Scanner teclado = new Scanner(System.in);
        int dividendo, divisor;

        System.out.print("Introduce el dividendo: ");
        dividendo = teclado.nextInt();
        dividendo = comprobarIntPositivo(dividendo, teclado);

        System.out.print("Introduce el divisor: ");
        divisor = teclado.nextInt();
        divisor = comprobarIntPositivo(divisor, teclado);
        divisor = comprobarCero(divisor, teclado);

        System.out.printf("Dividendo = %d\nDivisor = %d\nCociente = %d\nResto = %d",
                dividendo, divisor, calcularCociente(dividendo, divisor), calcularResto(dividendo, divisor));
        teclado.close();
    }

    public static int comprobarIntPositivo(int n, Scanner teclado) {
        while (n < 0) {
            System.out.print("El número debe ser positivo, introduce otro distinto: ");
            n = teclado.nextInt();
        }
        return n;
    }

    public static int comprobarCero(int n, Scanner teclado) {
        while (n == 0) {
            System.out.print("El divisor no puede ser 0, introduce otro número: ");
            n = teclado.nextInt();
        }
        return n;
    }

    public static int calcularCociente(int dividendo, int divisor) {
        int cociente = 0;
        int resto = dividendo;
        while (resto >= divisor) {
            resto -= divisor;
            cociente++;
        }
        return cociente;
    }

    public static int calcularResto(int dividendo, int divisor) {
        int resto = dividendo;
        while (resto >= divisor) {
            resto -= divisor;
        }
        return resto;
    }
}
