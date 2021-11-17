package com.example.pruebatransicionesjavafx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("twelve-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        HelloController controller = fxmlLoader.getController();
        stage.setTitle("Toni Vieira!");

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                switch (keyEvent.getCode()){
                    case W:
                        controller.moveUP();
                        break;
                    case A:
                        controller.moveLEFT();
                        break;
                    case D:
                        controller.moveRIGHT();
                        break;
                    case P:
                        controller.attackROT();
                    default:
                        break;
                }
            }
        });

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}