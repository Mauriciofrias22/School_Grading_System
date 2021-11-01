public class Calificacion {
    private double asignatura;
    private double nota;
    private Student estudiante;

    public Calificacion(double asignatura, double nota, Student estudiante) {
        this.asignatura = asignatura;
        this.nota = nota;
        this.estudiante = estudiante;
    }

    public double getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(double asignatura) {
        this.asignatura = asignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Student getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Student estudiante) {
        this.estudiante = estudiante;
    }
}
