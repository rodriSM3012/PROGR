public class B3_3Ejerc3 {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 2; i < 100; i += 3) {
            if (i % 5 == 0) {
                System.out.print(suma + " + " + i + " = " + (suma + i) + "\n");
                suma += i;
            }
        }

        System.out.println("La suma de los números es igual a " + suma + ".");
    }
}
