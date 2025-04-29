package seleccion;

public class GestionSeleccion {
    public static void main(String[] args) {
        Entrenador ent1 = new Entrenador(0, "Luis Enrique", "Martínez", 34, "A");

        Futbolista futb1 = new Futbolista(0, "David", "Villa", 28, 9, null);
        Futbolista futb2 = new Futbolista(0, "Santi", "Cazorla", 29, 9, null);

        Masajista masaj1 = new Masajista(0, "Julián", "Martínez", 31, null, 4);

        System.out.println("Todos los integrantes comienzan una concentración.");
        ent1.concentrarse();
        futb1.concentrarse();
        futb2.concentrarse();
        masaj1.concentrarse();

        System.out.println("\nTodos los integrantes viajan para jugar un partido.");
        ent1.viajar();
        futb1.viajar();
        futb2.viajar();
        masaj1.viajar();

        System.out.println("\nNo todos los integrantes entrenan.");
        ent1.dirigirEntrenamiento();
        futb1.entrenar();
        futb2.entrenar();

        System.out.println("\nNo todos los integrantes dan masajes.");
        masaj1.darMasaje();

        System.out.println("\nPartido de Fútbol: Solamente el entrenador y el futbolista tiene métodos para el partido de fútbol.");
        ent1.dirigirPartido();
        futb1.jugarPartido();
        futb2.jugarPartido();
    }
}
