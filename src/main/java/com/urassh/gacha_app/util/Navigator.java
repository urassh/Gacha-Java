package com.urassh.gacha_app.util;

import com.urassh.gacha_app.GachaApp;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Navigator {
    private static final String[] FXML_PATHS = {
            "home/home-view.fxml",
            "result/result-view.fxml"
    };

    private final Scene beforeScene;

    public Navigator(Scene from) {
        this.beforeScene = from;
    }

    private void navigate(String fxmlPath, String fxmlTitle) {
        try {
            if (beforeScene != null) {
                beforeScene.getWindow().hide();
            }

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

    public void navigateToHome() {
        navigate(FXML_PATHS[0], "Home");
    }

    public void navigateToResult() {
        navigate(FXML_PATHS[1], "Result");
    }
}
