package com.urassh.gacha_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GachaApp extends Application {
    private static final String APP_TITLE = "Gacha App";
    private static final String HOME_PATH = "home/home-view.fxml";

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GachaApp.class.getResource(HOME_PATH));
        Scene scene = new Scene(fxmlLoader.load(), 400, 300);
        stage.setTitle(APP_TITLE);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}