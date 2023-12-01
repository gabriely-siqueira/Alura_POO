package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Formulário de Login");

        // Crie os campos de entrada para o nome de usuário e senha
        Label usernameLabel = new Label("Nome de Usuário:");
        TextField usernameField = new TextField();
        Label passwordLabel = new Label("Senha:");
        PasswordField passwordField = new PasswordField();

        // Crie um botão para fazer login
        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> fazerLogin(usernameField.getText(), passwordField.getText()));

        // Crie um layout VBox para organizar os elementos com margens
        VBox layout = new VBox(10); // Espaço vertical entre os elementos (10 pixels)
        layout.setPadding(new Insets(20)); // Margens de 20 pixels em todos os lados
        layout.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton);

        // Crie a cena e defina-a na janela
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private void fazerLogin(String username, String password) {
        // Verifique as credenciais do usuário (coloque sua lógica de verificação aqui)
        if (username.equals("usuario") && password.equals("senha")) {
            exibirMensagem("Login bem-sucedido!");
        } else {
            exibirMensagem("Login falhou. Verifique seu nome de usuário e senha.");
        }
    }

    private void exibirMensagem(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Resultado do Login");
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
