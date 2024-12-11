public class B3_3Ejerc12 {
    public static void main(String[] args) {
        int suma = 0;
        int n;

        // bucle for
        for (int i = 100; i <= 200; i += 2) {
            suma += i;
        }
        System.out.println("Bucle for: suma=" + suma);

        // bucle while
        suma = 0;
        n = 100;
        while (n <= 200) {
            suma += n;
            n += 2;
        }
        System.out.println("Bucle while: suma=" + suma);

        // bucle do-while
        suma = 0;
        n = 100;
        do {
            suma += n;
            n += 2;
        } while (n <= 200);
        System.out.println("Bucle do-while: suma=" + suma);
    }
}
