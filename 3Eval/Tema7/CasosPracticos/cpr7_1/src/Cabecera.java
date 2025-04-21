public class Cabecera extends Medicos {
    // atributos
    private String nCol;
    private int codAmbulatorio;
    // los atributos de nombre y apellidos se heredan y no hay que repetirlos

    // constructores
    public Cabecera() {
        super(); // como este constructor no usa parametros llamara automaticamente al
                 // constructor de Medicos que tampoco use parametros (el primero)
        setnCol("N/S");
        setCodAmbulatorio(0);
    }

    public Cabecera(String nombre, String apel1, String apel2, String nCol, int codAmbulatorio) {
        super(nombre, apel1, apel2);
        setnCol(nCol);
        setCodAmbulatorio(codAmbulatorio);
    }

    // metodos
    public void setnCol(String nCol) {
        this.nCol = nCol;
    }

    public void setCodAmbulatorio(int codAmbulatorio) {
        this.codAmbulatorio = codAmbulatorio;
    }

    public int getCodAmbulatorio() {
        return codAmbulatorio;
    }

    public String getnCol() {
        return nCol;
    }

    @Override
    public String toString() {
        return "Cabecera [nCol=" + nCol + ", codAmbulatorio=" + codAmbulatorio + super.toString() + "]";
    }
}
