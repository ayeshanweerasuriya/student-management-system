package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Contact;

public class ViewContactRecords {
    public TableView tblContact;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAge;
    public TableColumn colAddress;
    public TableColumn colSalary;

    public void btnReloadOnAction(ActionEvent actionEvent) {

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));

        tblContact.setItems(Contact.getContactObservableList());
    }
}
