package com.mano.events;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController{
    @FXML
    public TextField nameField;

   @FXML
    public void onButtonClicked(){
       System.out.println("My name is " + nameField.getText());
   }
}