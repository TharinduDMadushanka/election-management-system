package com.dev.pos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashboardFormController {

    public AnchorPane context;

    @FXML
    void candidateOnAction(ActionEvent event) {

    }

    @FXML
    void eofficerOnAction(ActionEvent event) {

    }

    @FXML
    void partyOnAction(ActionEvent event) throws IOException {
        setUI("PartyForm");
    }

    private void setUI(String location) throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
        stage.show();
        stage.setResizable(false);
        stage.centerOnScreen();

    }

}
