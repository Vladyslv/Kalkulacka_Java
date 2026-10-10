package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private Label labelResult;
    @FXML private TextField textField1, textField2;

    @FXML protected void sucet() {
        double a = Double.parseDouble(textField1.getText());
        double b = Double.parseDouble(textField2.getText());
        labelResult.setText(String.valueOf(a+b));
    }
    @FXML protected void rozdiel() {
        double a = Double.parseDouble(textField1.getText());
        double b = Double.parseDouble(textField2.getText());
        labelResult.setText(String.valueOf(a-b));
    }
    @FXML protected void sucin() {
        double a = Double.parseDouble(textField1.getText());
        double b = Double.parseDouble(textField2.getText());
        labelResult.setText(String.valueOf(a*b));
    }
    @FXML protected void podiel() {
        double a = Double.parseDouble(textField1.getText());
        double b = Double.parseDouble(textField2.getText());
        labelResult.setText(String.valueOf(a/b));
    }
}