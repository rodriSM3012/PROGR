public class B3_4Ejerc5 {
    public static void main(String[] args) {
        int n = 1, prod = 1;
        for (int i = 0; i < 10; i++) {
            prod *= n;
            n += 2;
        }
        System.out.println("Producto de los 10 primeros números impares: " + prod);
    }
}
