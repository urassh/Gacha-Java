package com.urassh.gacha_app;

import com.urassh.gacha_app.util.Navigator;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class GachaApp extends Application {
    private static final String APP_TITLE = "Gacha App";
    private static final String HOME_PATH = "home/home-view.fxml";

    @Override
    public void start(Stage stage) throws IOException {
        Navigator navigator = new Navigator(stage.getScene());
        navigator.navigateToHome();
    }

    public static void main(String[] args) {
        launch();
    }
}