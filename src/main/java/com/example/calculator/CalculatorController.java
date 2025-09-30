package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField display;

    private double firstNumber = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    @FXML
    private void handleNumber(javafx.event.ActionEvent event) {
        String value = ((javafx.scene.control.Button) event.getSource()).getText();
        if (startNewNumber) {
            display.clear();
            startNewNumber = false;
        }
        display.appendText(value);
    }

    @FXML
    private void handleOperator(javafx.event.ActionEvent event) {
        String value = ((javafx.scene.control.Button) event.getSource()).getText();
        firstNumber = Double.parseDouble(display.getText());
        operator = value;
        startNewNumber = true;
    }

    @FXML
    private void handleEquals() {
        double secondNumber = Double.parseDouble(display.getText());
        double result = calculate(firstNumber, secondNumber, operator);
        display.setText(String.valueOf(result));
        startNewNumber = true;
    }

    private double calculate(double a, double b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "×": return a * b;
            case "÷": return b == 0 ? 0 : a / b;
            default: return b;
        }
    }
}
