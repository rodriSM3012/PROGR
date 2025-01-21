public class B3_6Ejerc9 {
    public static void main(String[] args) {
        // sout con los cuadrados de los 10 primeros numeros divisibles entre 7
        int n = 1;
        int cont = 10;
        System.out.print("10 primeros cuadrados de números divisibles por 7: ");
        while (cont != 0) {
            if (n % 7 == 0) {
                System.out.print(calcularCuadrado(n));
                cont--;
                if (cont != 0) {
                    System.out.print(", ");
                }
            }
            n++;
        }
    }

    public static int calcularCuadrado(int n) {
        return n * n;
    }
}
