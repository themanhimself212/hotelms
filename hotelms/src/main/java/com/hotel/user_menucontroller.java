package com.hotel;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import com.hotel.util.navigate;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.stage.*;

public class user_menucontroller {
    @FXML private Pane mypane;
    @FXML private Label name;
    @FXML private Label checkin;
    @FXML private Label checkout;
    @FXML private Button infobutton;
    @FXML private Button requestservicebutton;
    @FXML private Button allrequestsbutton;
    @FXML private Button LogoutButton;
    @FXML
    private void logoutAct(ActionEvent event) {
        navigate.navigateTo(event, "/com/hotel/login.fxml");
    }
}
