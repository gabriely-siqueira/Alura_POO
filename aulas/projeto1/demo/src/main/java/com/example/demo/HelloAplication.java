package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloAplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Configurar a janela principal
        primaryStage.setTitle("Minha Aplicação JavaFX");

        // Criar um elemento gráfico (neste caso, um rótulo)
        Label label = new Label("Olá, JavaFX!");

        // Criar um layout para a cena
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Criar a cena
        Scene scene = new Scene(root, 300, 200);

        // Configurar a cena na janela principal
        primaryStage.setScene(scene);

        // Mostrar a janela
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
