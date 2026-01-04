// функционал окна
package com.example.project;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Button1;

    @FXML
    private Label label1;

    @FXML
    void Butt1Click(ActionEvent event1){
        label1.setText("No Eshkereit(((");
    }

    @FXML
    void initialize() {
        // чистить т.к обычно в нем ничего важного
    }

}
