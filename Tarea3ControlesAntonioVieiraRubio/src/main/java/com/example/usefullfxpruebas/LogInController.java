package com.example.usefullfxpruebas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.awt.*;

public class LogInController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button button;

    @FXML
    private Label wrongLogin;

    @FXML
    private Label okLogIn;

    @FXML
    void userLogIn(ActionEvent event) {
        if (username.getText().toString().equals("Toni") && password.getText().toString().equals("1234")){
            okLogIn.setText("USUARIO ACEPTADO, BIENVENIDO");
            wrongLogin.setText(" ");

        } else if (username.getText().isEmpty() && password.getText().isEmpty()){
            wrongLogin.setText("Por favor introduce las credenciales.");
            okLogIn.setText(" ");
        } else {
            wrongLogin.setText("Usuario o Contraseña invalidada.");
            okLogIn.setText(" ");
        }
    }
}
