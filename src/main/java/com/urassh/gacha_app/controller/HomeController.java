package com.urassh.gacha_app.controller;

import com.urassh.gacha_app.util.Navigator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeController {
    @FXML
    private Button startButton;

    @FXML
    private void handleStartGacha() {
        Navigator navigator = new Navigator(startButton.getScene());
        navigator.navigateToResult();
    }
}
