module com.example.layoutpane {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens com.example.layoutpane to javafx.fxml;
    exports com.example.layoutpane;
}