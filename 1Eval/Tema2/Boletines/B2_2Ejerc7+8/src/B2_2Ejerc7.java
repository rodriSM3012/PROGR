import java.util.Scanner;

public class B2_2Ejerc7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Consumo coche1 = new Consumo();
        double kms, litros, vMed, pGas;

        // INPUT
        System.out.println("Introduce los siguientes datos.");

        System.out.print("Kilómetros recorridos por el coche: ");
        kms = teclado.nextDouble();
        coche1.setKms(kms);

        System.out.print("Litros de combustible consumido: ");
        litros = teclado.nextDouble();
        coche1.setLitros(litros);

        System.out.print("Velocidad media en km/h: ");
        vMed = teclado.nextDouble();
        coche1.setvMed(vMed);

        System.out.print("Precio de la gasolina: ");
        pGas = teclado.nextDouble();
        coche1.setpGas(pGas);

        // OUTPUT
        System.out.printf("\nTiempo empleado en realizar el viaje: %.2f horas\n" +
                          "Consumo medio de litros por cada 100 km: %.2f litros/100km\n" +
                          "Consumo en euros por cada 100 km: %.2f €/100km\n",
                          coche1.getTiempo(), coche1.consumoMedio(), coche1.consumoEuros());
    }
}
