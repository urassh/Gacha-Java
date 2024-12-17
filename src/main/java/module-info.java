module com.urassh.gacha_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.urassh.gacha_app to javafx.fxml;
    opens com.urassh.gacha_app.controller to javafx.fxml;
    exports com.urassh.gacha_app;
    exports com.urassh.gacha_app.controller;
}