package com.example.pruebatransicionesjavafx;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class HelloController {

    @FXML
    private Button avanzaButton;

    @FXML
    private Button transition;

    @FXML
    private Button goBack;

    @FXML
    private ImageView background;

    @FXML
    private ImageView twelve;

    @FXML
    private Button rotate;

    @FXML
    private ImageView rot;

    @FXML
    void onClick(ActionEvent event) {
        rot.setVisible(false);
        Translate translate = new Translate();
        translate.setX(50);
        //  translate.setY(1.2);
        // translate.setZ(1.2);
        twelve.getTransforms().add(translate);
    }

    @FXML
    void onClickTransition(ActionEvent event) {
        rot.setVisible(false);
        TranslateTransition tr = new TranslateTransition();
        tr.setFromX(30);
        tr.setToX(200);
        tr.setDuration(Duration.millis(700));
        tr.setNode(twelve);
        tr.play();
        twelve.setX(tr.getToX());
    }

    @FXML
    void onClickRotate(ActionEvent event) {

    }

    @FXML
    void onClickBack(ActionEvent event) {
        rot.setVisible(false);
        TranslateTransition tr2 = new TranslateTransition();
        tr2.setFromX(twelve.getX());
        tr2.setToX(-200);

        tr2.setDuration(Duration.millis(500));
        tr2.setNode(twelve);
        tr2.play();
    }
    
    public void moveUP(){
        rot.setVisible(false);
        TranslateTransition tr3 = new TranslateTransition();
        tr3.setToY(twelve.getY());

        tr3.setDuration(Duration.millis(300));
        tr3.setNode(twelve);
        tr3.play();

        TranslateTransition tr4 = new TranslateTransition();
        tr4.setToY(-100);

        tr4.setDuration(Duration.millis(200));
        tr4.setNode(twelve);
        tr4.play();

    }
    
    public void moveLEFT(){
        rot.setVisible(false);
        twelve.setX(twelve.getX() -50);
    }

    public void moveRIGHT(){
        rot.setVisible(false);
        twelve.setX(twelve.getX() +50);
    }
    public void attackROT(){
        twelve.setVisible(false);
        rot.setVisible(true);
    }
}
