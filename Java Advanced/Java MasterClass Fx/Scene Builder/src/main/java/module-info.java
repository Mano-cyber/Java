module com.mano.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mano.scenebuilder to javafx.fxml;
    exports com.mano.scenebuilder;
}