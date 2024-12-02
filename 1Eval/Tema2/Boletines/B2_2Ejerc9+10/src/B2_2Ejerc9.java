import java.util.Scanner;

public class B2_2Ejerc9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Restaurante r1;
        double kgChocos, kgPapas;
        char resp;

        System.out.print("Introduce el número de kgs de chocos que hay: ");
        kgChocos = teclado.nextDouble();
        System.out.print("Introduce el número de kgs de papas que hay: ");
        kgPapas = teclado.nextDouble();
        teclado.nextLine();
        r1 = new Restaurante(kgChocos, kgPapas);

        System.out.print("¿Deseas incrementar la cantidad de alguno de los dos ingredientes? (s/n): ");
        resp = teclado.nextLine().charAt(0);
        if (resp == 's') {
            System.out.print("¿Deseas incrementar la cantidad de chocos(a) o de papas(b)?: ");
            resp = teclado.nextLine().charAt(0);

            if (resp == 'a') {
                System.out.print("Introduce cuántos kgs de chocos deseas añadir: ");
                kgChocos = teclado.nextDouble();
                r1.addChocos(kgChocos);
            } else {
                System.out.print("Introduce cuántas kgs de papas deseas añadir: ");
                kgPapas = teclado.nextDouble();
                r1.addPapas(kgPapas);
            }
        }

        r1.showChocos();
        r1.showPapas();
        System.out.printf("Hay ingredientes suficientes para servir a %d clientes.", r1.getComensales());

        teclado.close();
    }
}
