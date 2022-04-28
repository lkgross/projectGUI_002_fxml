package bsu.comp152;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {

    @FXML
    private TextField display;
    @FXML
    private int firstNumber;

    public void numberClicked(ActionEvent event){
        var buttonPressed = (Button) event.getSource();
        var newNumber = buttonPressed.getText();
        var oldNumber = display.getText();
        var newDisplayNumber = oldNumber + newNumber;
        display.setText(newDisplayNumber);
    }

    public void clearPressed(ActionEvent event){
        display.setText("");
    }

    public void plusPressed(ActionEvent event){
        String numberAsString = display.getText();
        firstNumber = Integer.parseInt(numberAsString);
        display.setText("");
    }

    public void equalsPressed(ActionEvent event){
        String numberAsString = display.getText();
        int secondNumber = Integer.parseInt(numberAsString);
        display.setText(String.valueOf(firstNumber + secondNumber));
    }
}
