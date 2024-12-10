public class Clientes {
    // atributos
    private int cod, yearPerman, pts;
    private String nombre, apell, telf, ciudad;

    // constructores
    public Clientes(int cod, String nombre, String apell, String telf) {
        this.cod = cod;
        this.nombre = nombre;
        this.apell = apell;
        this.telf = telf;
        this.ciudad = "Gijón";
        this.yearPerman = 0;
        this.pts = 0;
    }

    public Clientes(int cod, String nombre, String apell, String telf, int yearPerman, int pts) {
        this.cod = cod;
        this.nombre = nombre;
        this.apell = apell;
        this.telf = telf;
        this.ciudad = "Gijón";
        this.yearPerman = yearPerman;
        this.pts = pts;
    }

    public Clientes(int cod, String nombre, String apell, String telf, String ciudad, int yearPerman, int pts) {
        this.cod = cod;
        this.nombre = nombre;
        this.apell = apell;
        this.telf = telf;
        this.ciudad = ciudad;
        this.yearPerman = yearPerman;
        this.pts = pts;
    }

    // getters y setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getYearPerman() {
        return yearPerman;
    }

    public void setYearPerman(int yearPerman) {
        this.yearPerman = yearPerman;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // metodos
    public int fidelizacion(double saldoCompraMens) {
        this.pts += saldoCompraMens * 500 / 300;
        return this.pts;
    }

    public void aniversario() {
        if (yearPerman > 3)
            System.out.printf("cliente: %s %s\n " +
                    "Código de cliente: %d\n" +
                    "Teléfono: %s\n" +
                    "Ciudad: %s\n" +
                    "Tiempo de permanencia: %d años\n" +
                    "Puntos disponibles: %d\n",
                    this.nombre, this.apell, this.cod, this.telf, this.ciudad, this.yearPerman, this.pts);
        else
            System.out.println("No tienes más de 3 años de permanencia.");
    }
}
