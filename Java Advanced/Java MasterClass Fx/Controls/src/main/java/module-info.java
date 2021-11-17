module com.mano.controls {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mano.controls to javafx.fxml;
    exports com.mano.controls;
}