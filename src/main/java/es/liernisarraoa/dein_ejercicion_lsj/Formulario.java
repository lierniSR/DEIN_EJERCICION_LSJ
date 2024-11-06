package es.liernisarraoa.dein_ejercicion_lsj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Formulario para una persona
 *
 * @author Lierni
 * @version 1.0
 */
public class Formulario extends Application {
    /**
     * Metodo que inicia la aplicacion javaFX
     * Carga el archivo FXML, configura la escena y muestra la ventana principal
     *
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Formulario.class.getResource("formulario.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 357,282);
        stage.setTitle("Formulario!");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Metodo principal que lanza la aplicacion JavaFX
     * 
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }
}