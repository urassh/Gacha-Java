package com.urassh.gacha_app.controller;

import com.urassh.gacha_app.model.GachaProvider;
import com.urassh.gacha_app.util.Screen;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class ResultController {
    private final GachaProvider gachaProvider = new GachaProvider();
    private static final String NAVIGATE_PATH = "home/home-view.fxml";

    @FXML
    private Label resultLabel;

    @FXML
    private void handleRoll() {
        String result = gachaProvider.roll();
        resultLabel.setText("Result: " + result);
    }

    @FXML
    private void handleBackToHome() throws IOException {
        resultLabel.getScene().getWindow().hide();
        Screen screen = new Screen();
        screen.transitionScreen(NAVIGATE_PATH, "Home");
    }
}
