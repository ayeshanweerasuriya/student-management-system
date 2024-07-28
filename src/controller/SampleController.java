package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
    public Label lblTitle;
    public TextField txtUserName;
    public TextField txtPassword;

    public void btnSignInOnAction(ActionEvent actionEvent) {
        if (!txtUserName.equals("") || txtPassword.equals("")) {
            System.out.println(txtUserName.getText() + " " + txtPassword.getText());
        }
    }
}
