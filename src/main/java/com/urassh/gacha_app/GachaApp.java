package com.urassh.gacha_app;

import com.urassh.gacha_app.util.Screen;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class GachaApp extends Application {
    private static final String APP_TITLE = "Gacha App";
    private static final String HOME_PATH = "home/home-view.fxml";

    @Override
    public void start(Stage stage) throws IOException {
        Screen screen = new Screen();
        screen.transitionScreen(HOME_PATH, APP_TITLE);
    }

    public static void main(String[] args) {
        launch();
    }
}