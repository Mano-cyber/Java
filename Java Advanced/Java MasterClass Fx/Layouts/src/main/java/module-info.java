module com.mano.layouts {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.mano.layouts to javafx.fxml;
    exports com.mano.layouts;
}