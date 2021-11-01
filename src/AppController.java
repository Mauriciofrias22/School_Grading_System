import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class AppController {

    @FXML
    private Pane mainPane;

    @FXML
    private Label titleLabel;

    @FXML
    private TextField numeroRegistrosText;

    @FXML
    private Button calcularButton;

    @FXML
    private TextArea entradaTextArea;

    @FXML
    private TextArea salidaTextArea;

    @FXML
    void calcular(ActionEvent event) {
        SchoolGradingSystem objeto = new SchoolGradingSystem();
        String[] lines = entradaTextArea.getText().split("\n");
        objeto.loadData(numeroRegistrosText.getText(), lines);
        StringBuilder sb = new StringBuilder();
        sb.append(objeto.stat1() + "\n");
        sb.append(objeto.stat2() + "\n");
        sb.append(objeto.stat3() + "\n");
        sb.append(objeto.stat4());
        salidaTextArea.setText(sb.toString());

    }
}