module com.example.usefullfxpruebas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;
    requires java.desktop;

    opens com.example.usefullfxpruebas to javafx.fxml;
    exports com.example.usefullfxpruebas;
}