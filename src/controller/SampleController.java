package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SampleController {
    public Label lblTitle;

    public void btnSignInOnAction(ActionEvent actionEvent) {
        if (lblTitle.getText().equals("Hello World")) {
            lblTitle.setText("Hii Jason Momoa");
        } else {
            lblTitle.setText("Hello World");
        }
    }
}
