module com.example.soccer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.soccer to javafx.fxml;
    exports com.example.soccer;
}