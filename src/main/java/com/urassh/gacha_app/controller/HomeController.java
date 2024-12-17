package com.urassh.gacha_app.controller;

import com.urassh.gacha_app.util.Screen;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeController {
    private static final String NAVIGATE_PATH = "result/result-view.fxml";

    @FXML
    private Button startButton;

    @FXML
    private void handleStartGacha() {
        startButton.getScene().getWindow().hide();
        Screen screen = new Screen();
        screen.transitionScreen(NAVIGATE_PATH, "Result");
    }
}
