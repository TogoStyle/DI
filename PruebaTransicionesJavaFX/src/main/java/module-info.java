module com.example.pruebatransicionesjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens com.example.pruebatransicionesjavafx to javafx.fxml;
    exports com.example.pruebatransicionesjavafx;
}