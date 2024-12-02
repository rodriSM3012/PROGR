import java.util.Scanner;

public class cpr3_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;

        do {
            System.out.print("Menú\n1- Saludo\n2- Despedida\n3- Felicitación\nElija una opción: ");
            opc = teclado.nextInt();
    
            switch (opc) {
                case 1:
                    System.out.println("Buenos días.");
                    break;
                case 2:
                    System.out.println("Hasta luego.");
                    break;
                case 3:
                    System.out.println("Muchas felicidades.");
                    break;
                case 4: 
                    System.out.println("Usted ha abandonado la sesión.");
                    break;
                default:
                    System.out.println("La opción elegida no está contemplada en el menú.");
            }            
        } while (opc != 4);

        teclado.close();
    }
}
