module com.mano.todolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mano.todolist to javafx.fxml;
    exports com.mano.todolist;
}