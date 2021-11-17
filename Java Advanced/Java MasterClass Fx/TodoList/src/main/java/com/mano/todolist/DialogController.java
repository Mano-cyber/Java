package com.mano.todolist;

import com.mano.todolist.datamodel.ToDoItem;
import com.mano.todolist.datamodel.TodoData;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsArea;

    @FXML
    private DatePicker deadlinePicker;

    public ToDoItem processResults(){
        String shortDescription = shortDescriptionField.getText().trim();
        String deatails = detailsArea.getText().trim();
        LocalDate deadLineValue = deadlinePicker.getValue();
        ToDoItem newItem = new ToDoItem(shortDescription, deatails, deadLineValue);
        TodoData.getInstance().addTodoItem(newItem);
        return newItem;
    }
}
