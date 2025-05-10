package com.hotel.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class navigate {
    public static void navigateTo(ActionEvent event, String resourcePath) {
        try {
            FXMLLoader loader = new FXMLLoader(navigate.class.getResource(resourcePath));
            Parent root = loader.load();
            
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error loading page: " + e.getMessage());
        }
    }
}
