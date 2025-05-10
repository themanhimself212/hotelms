package com.hotel;

import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import com.hotel.util.navigate;

import javafx.event.*;
import javafx.stage.*;



public class logincontroller {
    @FXML private Pane mypane;
    @FXML private TextField username;
    @FXML private PasswordField Password;
    @FXML private Button LoginButton;
    @FXML private ChoiceBox<String> choiceBox;
    @FXML
    private void initialize() {
        choiceBox.getItems().addAll("Guest", "Employee","Admin");
        choiceBox.setValue("Guest");
    }
    @FXML
    private void loginAct(ActionEvent event) {
//if guest is selected it checks guest id and password then goes to user menu
//if employee is selected it checks employee id and password then goes to employee menu
//if invalid id or password it shows error message
//if empty id or password it shows error message
//if correct id and password it goes to user menu
//if correct id and password it goes to employee menu
//if invalid id or password it shows error message
//if empty id or password it shows error message

        navigate.navigateTo(event, "/com/hotel/user_menu.fxml");
    }
    
    
}

