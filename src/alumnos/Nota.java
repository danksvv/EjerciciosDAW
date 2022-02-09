package alumnos;

public class Nota {
    private String asignatura;
    private int notaAsignatura;

    public Nota(String asignatura, int notaAsignatura) {
        this.asignatura = asignatura;
        this.notaAsignatura = notaAsignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getNotaAsignatura() {
        return notaAsignatura;
    }

    public void setNotaAsignatura(int notaAsignatura) {
        this.notaAsignatura = notaAsignatura;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "asignatura='" + asignatura + '\'' +
                ", notaAsignatura=" + notaAsignatura +
                '}';
    }
}

