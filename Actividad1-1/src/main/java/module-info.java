module com.example.actividad11 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens com.example.actividad11 to javafx.fxml;
    exports com.example.actividad11;
}