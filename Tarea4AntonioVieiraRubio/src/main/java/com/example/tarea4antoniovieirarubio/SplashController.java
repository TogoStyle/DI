package com.example.tarea4antoniovieirarubio;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class SplashController implements Initializable {

    @FXML
    private ProgressBar progressBar;

    @FXML
    private ImageView logo;

    @FXML
    private ImageView logoTransition1;

    @FXML
    private ImageView logoTransition2;

    @FXML
    private Label loadingText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        TranslateTransition translate = new TranslateTransition();
        translate.setNode(logoTransition1);
        translate.setDuration(Duration.millis(2000));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByY(-250);
        translate.setAutoReverse(true);
        translate.play();

        RotateTransition rotate = new RotateTransition();
        rotate.setNode(logoTransition1);
        rotate.setDuration(Duration.millis(2000));
        rotate.setCycleCount(TranslateTransition.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.play();

        TranslateTransition translate2 = new TranslateTransition();
        translate2.setNode(logoTransition2);
        translate2.setDuration(Duration.millis(2000));
        translate2.setCycleCount(TranslateTransition.INDEFINITE);
        translate2.setByY(-250);
        translate2.setAutoReverse(true);
        translate2.play();

        RotateTransition rotate2 = new RotateTransition();
        rotate2.setNode(logoTransition2);
        rotate2.setDuration(Duration.millis(2000));
        rotate2.setCycleCount(TranslateTransition.INDEFINITE);
        rotate2.setInterpolator(Interpolator.LINEAR);
        rotate2.setByAngle(-360);
        rotate2.setAxis(Rotate.Z_AXIS);
        rotate2.play();

        FadeTransition fade = new FadeTransition();
        fade.setNode(logo);
        fade.setDuration(Duration.millis(2000));
        fade.setCycleCount(TranslateTransition.INDEFINITE);
        fade.setInterpolator(Interpolator.LINEAR);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();

        FadeTransition fade2 = new FadeTransition();
        fade2.setNode(loadingText);
        fade2.setDuration(Duration.millis(2000));
        fade2.setCycleCount(TranslateTransition.INDEFINITE);
        fade2.setInterpolator(Interpolator.LINEAR);
        fade2.setFromValue(0);
        fade2.setToValue(1);
        fade2.play();

    }
}


