module com.example.javafxefects {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxefects to javafx.fxml;
    exports com.example.javafxefects;
}