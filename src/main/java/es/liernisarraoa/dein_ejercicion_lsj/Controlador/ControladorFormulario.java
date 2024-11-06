package es.liernisarraoa.dein_ejercicion_lsj.Controlador;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Controlador del formulario
 *
 * @author Lierni
 * @version 1.0
 */
public class ControladorFormulario {

    @FXML
    public Button btnAceptar;
    @FXML
    public Button btnCerrar;
    @FXML
    public TextField nombre;
    @FXML
    public TextField apellido1;
    @FXML
    public TextField apellido2;
    @FXML
    public TextField profesion;

    /**
     * Sale una alerta con la informacion que ha introducido el usuario
     *
     * @param actionEvent
     */
    public void abrirAlerta(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Datos del formulario");
        alert.setContentText("Nombre --> " + nombre.getText() + "\n" +
                "Apellido 1 --> " + apellido1.getText() + "\n" +
                "Apellido 2 --> " + apellido2.getText() + "\n" +
                "Profesion --> " + profesion.getText());
        alert.showAndWait();
    }

    /**
     * Cierra la ventana
     *
     * @param actionEvent
     */
    public void cerrarStage(ActionEvent actionEvent) {
        ((Stage) nombre.getScene().getWindow()).close();
    }
}