package com.urassh.gacha_app.controller;

import com.urassh.gacha_app.model.GachaProvider;
import com.urassh.gacha_app.util.Navigator;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ResultController {
    private final GachaProvider gachaProvider = new GachaProvider();

    @FXML
    private Label resultLabel;

    @FXML
    private void handleRoll() {
        String result = gachaProvider.roll();
        resultLabel.setText("Result: " + result);
    }

    @FXML
    private void handleBackToHome() {
        Navigator navigator = new Navigator(resultLabel.getScene());
        navigator.navigateToHome();
    }
}
