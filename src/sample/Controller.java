package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField entryName;

    @FXML
    private TextField entryAge;

    @FXML
    private TextField entryYear;

    @FXML
    private Button btnConfirm;


    public void onConfirmClick(ActionEvent actionEvent){
        String nameString = entryName.getText();
        String ageString = entryAge.getText();
        String yearString = entryYear.getText();

        int ageInt = Integer.parseInt(ageString);
        int yearInt = Integer.parseInt(yearString);

        newPerson newPerson = new newPerson(nameString, ageInt, yearInt);


        entryName.clear();
        entryAge.clear();
        entryYear.clear();

    }





}
