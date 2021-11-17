module com.example.tarea4antoniovieirarubio {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.tarea4antoniovieirarubio to javafx.fxml;
    exports com.example.tarea4antoniovieirarubio;
}