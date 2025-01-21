import java.util.Scanner;

public class B3_6Ejerc1 {
    public static void main(String[] args) {
        // calcular numero de aprobados en clase de 10 alumnos
        // nota entre 0 y 10 se debe comprobar la nota
        Scanner teclado = new Scanner(System.in);
        double nota;
        int contAprobados = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce la nota del alumno " + i + ": ");
            nota = teclado.nextDouble();
            nota = comprobarNota(nota, teclado);
            if (nota >= 5)
                contAprobados++;
        }

        System.out.println("Hay " + contAprobados + " alumnos aprobados y " + (10 - contAprobados)
                + " alumnos que no han aprobado.");
    }

    public static double comprobarNota(double nota, Scanner teclado) {
        while (nota < 0 || nota > 10) {
            System.out.print("La nota debe estar comprendida entre 0 y 10, introduce una nota válida: ");
            nota = teclado.nextDouble();
        }
        return nota;
    }
}
