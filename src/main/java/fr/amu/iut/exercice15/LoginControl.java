package fr.amu.iut.exercice15;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.regex.Pattern;

public class LoginControl extends GridPane {
    @FXML
    private TextField userId;

    @FXML
    private PasswordField pwd;
    @FXML
    private Button okButton;
    @FXML
    private Button cancelButton;

    private void createBindings() {
        pwd.editableProperty().bind(Bindings.createBooleanBinding(
                () -> userId.getText().length() >= 6,
                userId.textProperty()
        ));
        cancelButton.disableProperty().bind(Bindings.createBooleanBinding(
                () -> userId.getText().isEmpty() && pwd.getText().isEmpty(),
                userId.textProperty(),
                pwd.textProperty()
        ));
        Pattern uppercasePattern = Pattern.compile(".*[A-Z].*");
        Pattern digitPattern = Pattern.compile(".*[0-9].*");

        BooleanBinding passwordValidBinding = Bindings.createBooleanBinding(
                () -> pwd.getText().length() >= 8 &&
                        uppercasePattern.matcher(pwd.getText()).matches() &&
                        digitPattern.matcher(pwd.getText()).matches(),
                pwd.textProperty()
        );

        okButton.disableProperty().bind(passwordValidBinding.not());


    }

    @FXML
    private void okClicked() {
        System.out.print(userId.getText() + " ");
        for (char c : pwd.getText().toCharArray()) {
            System.out.print("*");
        }
        System.out.println();
    }

    @FXML
    private void cancelClicked() {
        userId.setText("");
        pwd.setText("");
    }


}