module com.mano.events {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mano.events to javafx.fxml;
    exports com.mano.events;
}