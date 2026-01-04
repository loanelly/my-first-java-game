package com.example.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));// Файл с дизайном fxml
        Scene scene = new Scene(fxmlLoader.load(), 600, 400); // Размеры окна
        stage.setTitle("LiL Hello!"); // Название окна
        stage.setScene(scene);// 2 функции для отображения окна
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}