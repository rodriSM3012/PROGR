public class Alumno extends Persona {
    // atributos
    private int codAlumno;
    private String curso;

    // constructores
    public Alumno() {
        super();
        setCodAlumno(0);
        setCurso("N/S");
    }

    public Alumno(String nombre, String apel1, String apel2, String tel, int codAlumno, String curso) {
        super(nombre, apel1, apel2, tel);
        setCodAlumno(codAlumno);
        setCurso(curso);
    }

    // metodos
    public int getCodAlumno() {
        return codAlumno;
    }

    public String getCurso() {
        return curso;
    }

    private void setCodAlumno(int codAlumno) {
        this.codAlumno = codAlumno;
    }

    private void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "Alumno [codAlumno=" + codAlumno + ", curso=" + curso + "]";
    }
}
