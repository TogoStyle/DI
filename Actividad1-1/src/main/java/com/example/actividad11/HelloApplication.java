package com.example.actividad11;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {

        stage.setTitle("Tablero");
        Group root = new Group();
        Text text = new Text();
        text.setX(407);
        text.setY(200);
        root.getChildren().add(text);

        int c = 0;
        final int size = 50;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 8; i++){

            x = 0;

            for (int j = 0; j < 8; j++){


                Rectangle rectangle  = new Rectangle(size, size);

                if (i % 2 == 0){

                    if (c % 2 == 0) rectangle.setFill(Color.GREY);
                    else rectangle.setFill(Color.LIGHTCYAN);

                } else {

                    if (c % 2 == 0) rectangle.setFill(Color.LIGHTCYAN);
                    else rectangle.setFill(Color.GREY);

                }


                rectangle.setX(x);
                rectangle.setY(y);
                rectangle.setId("cuadrado en posición " + (j+1) + " " + (i+1));
                System.out.println(rectangle.getId());



                root.getChildren().add(rectangle);
                rectangle.setOnMouseClicked(event -> {
                    text.setText(rectangle.getId());
                    System.out.println(rectangle.getId());
                });

                c++;
                x = x + 50;

            }

            y = y + 50;

        }

        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();

}
    public static void main(String[] args) {
        launch();
    }
}