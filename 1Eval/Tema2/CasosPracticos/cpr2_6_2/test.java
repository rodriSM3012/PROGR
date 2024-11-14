import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        /*
         * Persona p = new Persona();
         * Persona p2 = new Persona();
         * Persona p3 = new Persona();
         * 
         * p.nacer();
         * p.hablar();
         * p.caminar();
         * p.morir();
         * 
         * p2.nacer();
         * 
         * p3.nacer();
         * p.caminar();
         */
        Scanner teclado = new Scanner(System.in);
        Persona p;
        String nombre, apellidos;
        int resp, edad;

        System.out.print(
                "¿Deseas crear una persona por defecto(1), una persona con nombre y apellidos(2) " +
                        "o una persona incluyendo su nombre, apellidos y edad(3)? ");
        resp = teclado.nextInt();
        teclado.nextLine();

        if (resp == 1)
            p = new Persona(); // instanciar el objeto
        else if (resp == 2) {
            System.out.print("Introduce el nombre: ");
            nombre = teclado.nextLine();
            System.out.print("Introduce los apellidos: ");
            apellidos = teclado.nextLine();
            p = new Persona(nombre, apellidos);
            p.setEdad(0);
        } else {
            System.out.print("Introduce el nombre: ");
            nombre = teclado.nextLine();
            System.out.print("Introduce los apellidos: ");
            apellidos = teclado.nextLine();
            System.out.print("Introduce la edad: ");
            edad = teclado.nextInt();
            p = new Persona(nombre, apellidos, edad);
        }

        p.setAltura(180);
        p.setPeso(75);

        System.out.print(p);

        teclado.close();
    }
}
