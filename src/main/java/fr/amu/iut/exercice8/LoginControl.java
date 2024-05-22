package fr.amu.iut.exercice8;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class LoginControl extends GridPane {
    @FXML
    private TextField idd;

    @FXML
    private PasswordField pwd;

    private void okClicked() {
        String username = idd.getText();
        String password = pwd.getText();
        String maskedPassword = "*".repeat(password.length());
        System.out.println("Username: " + username);
        System.out.println("Password: " + maskedPassword);
    }

    private void cancelClicked() {
        idd.clear();
        pwd.clear();
    }
}