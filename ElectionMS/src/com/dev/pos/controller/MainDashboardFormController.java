package com.dev.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class MainDashboardFormController {

    public AnchorPane context;

    @FXML
    void adminOnAction(ActionEvent event) throws IOException {
        setUI("AdminDashboardForm");
    }

    @FXML
    void voterOnAction(ActionEvent event) {

    }

    private void setUI(String location) throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
        stage.show();
        stage.setResizable(false);
        stage.centerOnScreen();
    }

}
