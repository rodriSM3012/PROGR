public class B3_3Ejerc2 {
    public static void main(String[] args) {
        int i, suma;

        // while
        i = 2;
        suma = 0;

        System.out.println("Bucle while:");
        while (i < 100) {
            suma += i;
            i += 3;
        }

        System.out.println(i);

        // do-while
        i = 2;
        suma = 0;

        System.out.println("Bucle do-while:");
        do {
            suma += i;
            i += 3;
        } while (i < 100);

        System.out.println(i);

        // for
        System.out.println("Bucle for:");
        for (i = 2; i < 100; i += 3) {
            suma += i;
        }

        System.out.println(i);
    }
}
