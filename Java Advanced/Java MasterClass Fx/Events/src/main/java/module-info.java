module mano.events {
    requires javafx.controls;
    requires javafx.fxml;


    opens mano.events to javafx.fxml;
    exports mano.events;
}