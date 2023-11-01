package com.example.bmi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.security.PrivateKey;

public class HelloController {
    @FXML
    private TextField inputWeight;
    @FXML
    private TextField inputHeight;

    @FXML
    private RadioButton Metric;
    @FXML
    private RadioButton English;
    @FXML
    private Label Result;
    @FXML
    protected void onCalculateButtonClick()
    {
        Calculator calc = new Calculator();
        if (Metric.isSelected())
        {
            calc.setUnit("Metric");
        }
        if (English.isSelected())
        {
            calc.setUnit("English");
        }

        double weight = Double.parseDouble(inputWeight.getText());
        double height = Double.parseDouble(inputHeight.getText());

        calc.setWeight(weight);
        calc.setHeight(height);

        calc.calculate();

        Result.setText(calc.getState());
    }

}