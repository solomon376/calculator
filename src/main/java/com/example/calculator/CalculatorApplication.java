package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApplication.class.getResource("calculator-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 400);

        scene.getStylesheets().add(getClass().getResource("css/calculator.css").toExternalForm());

        stage.setTitle("JavaFX Calculator");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}