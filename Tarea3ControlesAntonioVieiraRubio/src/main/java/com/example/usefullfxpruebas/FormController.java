package com.example.usefullfxpruebas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class FormController implements Initializable {
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidos;
    @FXML
    private TextArea txtComentario;
    @FXML
    private RadioButton masculino, femenino;
    @FXML
    private ChoiceBox<String> ciudad, sistemaOperativo;
    @FXML
    private Slider slider = new Slider();
    @FXML
    private DatePicker fecha;


    private String[] cities = {"Seleccione su ciudad por favor", "Alicante", "Beneixama", "Alcoy", "Castalla", "Jijona"};
    private String[] sos = {"Seleccione su SO", "Linux", "MacOS", "Windows", "Android", "iOS"};

    public void btEnviarClick(ActionEvent actionEvent) {
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String comentario = txtComentario.getText();
        String genero;
        String os = sistemaOperativo.getValue();
        String tiempo = String.valueOf(slider.getValue());


        if (masculino.isSelected()){
            genero = "masculino";
        } else genero = "femenino";

        if (sistemaOperativo.getValue().equals(sos[2]) || sistemaOperativo.getValue().equals(sos[5])){
            os = sistemaOperativo.getValue() + "\uF8FF";
        } else if (sistemaOperativo.getValue().equals(3)){
            os = sistemaOperativo.getValue() + "\uD83E\uDE9F";
        } else if (sistemaOperativo.getValue().equals(4)){
            os = sistemaOperativo.getValue() + "\uD83D\uDC7E";
        } else if (sistemaOperativo.getValue().equals(1)){
            os = sistemaOperativo.getValue() + "\uD83D\uDC27";
        }

        Alert alert;
        if (nombre.isEmpty() || apellidos.isEmpty() || comentario.isEmpty() || ciudad.getValue().equals("Seleccione su ciudad por favor") || sistemaOperativo.getValue().equals("Seleccione su SO")) {
            alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Faltan datos obligatorios...");
            alert.setHeaderText("Faltan datos por introducir en el formulario.");
            alert.setContentText("Debe introducir todos los datos.");
            txtNombre.requestFocus();
        } else {
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos introducidos en el formulario...");
            alert.setHeaderText("Ha introducido correctamente los " +
                    "datos en el formulario. Se muestran a continuación.");
            alert.setContentText("Nombre: " + nombre +
                    System.lineSeparator() + "Apellidos: " + apellidos
                    +
                    System.lineSeparator() + "Comentario: " + comentario
                    + System.lineSeparator() + "Genero: " + genero
            + System.lineSeparator() + "Ciudad: " + ciudad.getValue()
            + System.lineSeparator() + "Sistema Operativo: " + os
            + System.lineSeparator() + "Horas invertidas en el ordenador: " + tiempo);
        }
        alert.showAndWait();
    }

    public void btLimpiarClick(ActionEvent actionEvent) {
        sistemaOperativo.setValue(sos[0]);
        ciudad.setValue(cities[0]);
        sistemaOperativo.setValue(sos[0]);
        txtComentario.setText("");
        txtApellidos.setText("");
        txtNombre.setText("");
        txtNombre.requestFocus();
    }

    public void btSalirClick(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Cerrar aplicación...");
        alert.setHeaderText(null);
        alert.setContentText("¿Desea cerrar la aplicación?");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK){
            System.exit(0);
        } else {
            txtNombre.requestFocus();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ciudad.getItems().addAll(cities);
        ciudad.setValue(cities[0]);
        sistemaOperativo.getItems().addAll(sos);
        sistemaOperativo.setValue(sos[0]);
    }
}