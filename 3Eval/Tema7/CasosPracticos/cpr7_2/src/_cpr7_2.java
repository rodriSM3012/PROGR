public class _cpr7_2 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Sofía", "García", "López", "+34 612 345 678", 1, "DAW");
        Alumno alumno2 = new Alumno("Lucas", "Fernández", "González", "+34 644 987 654", 2, "MKT");
        Alumno alumno3 = new Alumno("Valeria", "Díaz", "Sánchez", "+34 655 234 567", 3, "DAW");
        Alumno alumno4 = new Alumno("Mateo", "Martínez", "Ruiz", "+34 699 876 543", 4, "DAM");

        Profesor prof1 = new Profesor("Elena", "Moreno", "Castro", "+34 677 112 233", 1, "SISIN");
        Profesor prof2 = new Profesor("Javier", "Ramírez", "Soto", "+34 688 445 566", 2, "BADAT");
        Profesor prof3 = new Profesor("Carmen", "Torres", "Vargas", "+34 633 778 899", 3, "PROGR");

        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        System.out.println(alumno3.toString());
        System.out.println(alumno4.toString());

        System.out.println(prof1.toString());
        System.out.println(prof2.toString());
        System.out.println(prof3.toString());
    }
}
