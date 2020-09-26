module 1.0 {
    requires javafx.controls;
    requires javafx.fxml;

    opens 1.0 to javafx.fxml;
    exports 1.0;
}