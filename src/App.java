import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("layout.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        primaryStage.setTitle("Sistema Estadistico");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(false);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void ejercicio() {
        // Simular la entrada del campo en la pantalla
        String cadenaEntrada = "1.0 0.0 1.0 5.7\n1.0 0.0 2.0 0.2\n1.0 0.0 3.0 5.0\n2.0 0.0 1.0 7.5\n2.0 0.0 2.0 9.9\n2.0 0.0 3.0 3.5\n3.0 0.0 1.0 2.2\n3.0 0.0 2.0 5.5\n3.0 0.0 3.0 2.2\n4.0 1.0 1.0 7.9\n4.0 1.0 2.0 2.2\n4.0 1.0 3.0 9.9\n5.0 1.0 1.0 9.3\n5.0 1.0 2.0 9.8\n5.0 1.0 3.0 5.8\n6.0 1.0 1.0 9.5\n6.0 1.0 2.0 7.2\n6.0 1.0 3.0 6.6\n1.0 0.0 1.0 5.7\n1.0 0.0 2.0 0.2\n1.0 0.0 3.0 5.0\n2.0 0.0 1.0 7.5\n2.0 0.0 2.0 9.9\n2.0 0.0 3.0 3.5\n3.0 0.0 1.0 2.2\n3.0 0.0 2.0 5.5\n3.0 0.0 3.0 2.2\n4.0 1.0 1.0 7.9\n4.0 1.0 2.0 2.2\n4.0 1.0 3.0 9.9\n5.0 1.0 1.0 9.3\n5.0 1.0 2.0 9.8\n5.0 1.0 3.0 5.8\n6.0 1.0 1.0 9.5\n6.0 1.0 2.0 7.2\n6.0 1.0 3.0 6.6";
        // Lo divido en lineas
        String[] lineas = cadenaEntrada.split("\n");
        // Ordenar el arreglo
        Arrays.sort(lineas);
        // Definir la lista de estudiantes
        List<Student> ests = new ArrayList<>();
        // Se define un estudiante vacio la primera vez
        Student est = null;
        // Ciclo de procesamiento
        for (String linea : lineas) {
            // Split Linea
            String[] campos = linea.split(" ");
            if (est == null) {
                // Crear un estudiante
                double estudiante = Double.parseDouble(campos[0]);
                double genero = Double.parseDouble(campos[1]);
                est = new Student(estudiante, genero);
            } else if (est.getEstudiante() != Double.parseDouble(campos[0])) {
                // Agregar el estuduante a la lista de estudiantes
                ests.add(est);
                // Crear un estudiante
                double estudiante = Double.parseDouble(campos[0]);
                double genero = Double.parseDouble(campos[1]);
                est = new Student(estudiante, genero);
            }
            // Asignatura y Nota
            double asignatura = Double.parseDouble(campos[2]);
            double nota = Double.parseDouble(campos[3]);
            // Crear una calificacion del estudiante
            Calificacion cal = new Calificacion(asignatura, nota, est);
            // Agregar la calificacion al la lista de calificaciones del estudiante
            est.getCalificaciones().add(cal);
        }
        // Agregar el estudiante a la lista de estudiantes
        ests.add(est);
        System.out.println("Fin");
    }

    public static void main(String[] args) {
        launch(args);
    }
}