
public class SchoolGradingSystem extends GradingSystem {
    public void loadData(String nString, String[] lineas) {
        // Instancia para lectura por pantalla
        int n = Integer.parseInt(nString);
        // Leer numero de filas
        setN(n);
        // Crear matriz
        double[][] temporal = new double[getN()][4];
        // Ciclo de lectura
        for (int i = 0; i < getN(); i++) {
            // Leer linea de texto
            String linea = lineas[i];
            // Crear vector de strings
            String[] columna = linea.split(" ");
            // Asignar valores en cada posicion
            double estudiante = Double.parseDouble(columna[0]);
            double genero = Double.parseDouble(columna[1]);
            double materia = Double.parseDouble(columna[2]);
            double nota = Double.parseDouble(columna[3]);

            temporal[i][0] = estudiante;
            temporal[i][1] = genero;
            temporal[i][2] = materia;
            temporal[i][3] = nota;

            sumatoria += nota;
        }

        // Asignar la matriz en la clase padre
        setMatriz(temporal);
    }
}
