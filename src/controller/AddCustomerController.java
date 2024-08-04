package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Contact;
import java.util.ArrayList;
import java.util.List;

public class AddCustomerController {

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSalary;

    @FXML
    private Label lblMessage;

    int id = 1;
    @FXML
    void btnAddCustomerOnAction(ActionEvent event) {
        int age;
        double salary;

        if (txtName.getText().equals("") || txtAge.getText().equals("") || txtAddress.getText().equals("") || txtSalary.getText().equals("")) {
            lblMessage.setText("Inputs are Empty");
        } else {
            try {
                age = Integer.parseInt(txtAge.getText());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                age = -1;
        }
            try {
                salary = Double.parseDouble(txtSalary.getText());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                salary = -1;
            }

            if (age == -1|| salary == -1) {
                lblMessage.setText("Age and Salary cannot be text values");
            } else {
                Contact.setContactObservableList(new Contact(id++, txtName.getText(), age, txtAddress.getText(), salary));
                lblMessage.setText("Record Added Successfully");

                txtAddress.setText("");
                txtAge.setText("");
                txtName.setText("");
                txtSalary.setText("");
            }
        }
    }
}
