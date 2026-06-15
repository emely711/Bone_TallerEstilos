package com.example.tallerestilo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        scene.getStylesheets().add(
                HelloApplication.class.getResource("/com/example/tallerestilo/styles.css").toExternalForm()
        );
        stage.setTitle("Formulario de Producto");
        stage.setScene(scene);
        stage.show();
    }
}
