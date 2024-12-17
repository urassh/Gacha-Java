package com.urassh.gacha_app.util;

import com.urassh.gacha_app.GachaApp;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Screen {
    public void transitionScreen(String fxmlPath, String fxmlTitle) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(GachaApp.class.getResource(fxmlPath));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.setTitle(fxmlTitle);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
