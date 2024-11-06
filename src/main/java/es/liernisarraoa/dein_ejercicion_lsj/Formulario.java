package es.liernisarraoa.dein_ejercicion_lsj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Formulario extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Formulario.class.getResource("formulario.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 357,282);
        stage.setTitle("Formulario!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}