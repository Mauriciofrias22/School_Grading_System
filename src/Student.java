import java.util.ArrayList;
import java.util.List;

public class Student {
    private double estudiante;
    private double genero;
    private List<Calificacion> calificaciones;

    public Student(double estudiante, double genero) {
        this.estudiante = estudiante;
        this.genero = genero;
        this.calificaciones = new ArrayList<>();
    }

    public double getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(double estudiante) {
        this.estudiante = estudiante;
    }

    public double getGenero() {
        return genero;
    }

    public void setGenero(double genero) {
        this.genero = genero;
    }

    public List<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }
}
