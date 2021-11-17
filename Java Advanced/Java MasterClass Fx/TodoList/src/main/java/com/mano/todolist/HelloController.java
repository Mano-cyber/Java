package com.mano.todolist;


import com.mano.todolist.datamodel.ToDoItem;
import com.mano.todolist.datamodel.TodoData;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HelloController {

    private List<ToDoItem> todoItems;

    @FXML
    private ListView<ToDoItem> todoListView;

    @FXML
    private TextArea itemDetailsTextArea;

    @FXML
    private Label deadlineLabel;

    public void initialize(){
//        ToDoItem item1 = new ToDoItem("Mail birthday card", "Buy card for John",
//                LocalDate.of(2016, Month.APRIL, 25));
//        ToDoItem item2 = new ToDoItem("Doctors appointment", "See doctor 124 street",
//                LocalDate.of(2016, Month.MAY, 12));
//        ToDoItem item3 = new ToDoItem("Finish design proposal", "Promise mike email by 22 April",
//                LocalDate.of(2016, Month.APRIL, 22));
//        ToDoItem item4 = new ToDoItem("Pickup Doug at train station", "Arriving on March 23 on 17:00",
//                LocalDate.of(2016, Month.MARCH, 23));
//        ToDoItem item5 = new ToDoItem("Dry cleaning", "Clothes should be ready by wednesday",
//                LocalDate.of(2016, Month.APRIL, 20));
//
//        todoItems = new ArrayList<ToDoItem>();
//        todoItems.add(item1);
//        todoItems.add(item2);
//        todoItems.add(item3);
//        todoItems.add(item4);
//        todoItems.add(item5);
//
//        TodoData.getInstance().setToDoItems(todoItems);

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>() {
            @Override
            public void changed(ObservableValue<? extends ToDoItem> observable, ToDoItem oldValue, ToDoItem newValue) {
                if(newValue != null){
                    ToDoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    deadlineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });

        todoListView.getItems().setAll(TodoData.getInstance().getToDoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void handleClickListView(){
        ToDoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());

//        System.out.println("The selected item is: " + item);
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due: ");
//        sb.append(item.getDeadline().toString());
//        itemDetailsTextArea.setText(sb.toString());
    }
}