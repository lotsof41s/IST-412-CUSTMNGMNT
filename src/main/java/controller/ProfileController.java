package controller;

import com.group7.ist.custmngmnt.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.util.List;
import model.Customer;
import util.AlertUtil;
import util.JsonUtil;
import util.SessionUtil;

/**
 * FXML Controller class
 *
 * @author Josh
 */
public class ProfileController {

    @FXML
    private TextField tfAddress;

    @FXML
    private TextField tfCardNumber;

    @FXML
    private TextField tfFirstName;

    @FXML
    private TextField tfLastName;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField pfPassword;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        App.setRoot("home");
    }

//    @FXML
//    private void switchToLoginAndSecurity(ActionEvent event) {
//
//    }

    @FXML
    void updateProfile(ActionEvent event) throws IOException {
        
        String firstName = tfFirstName.getText();
        String lastName = tfLastName.getText();
        String email = tfEmail.getText();
        String password = pfPassword.getText();
        String address = tfAddress.getText();
        String cardNumber = tfCardNumber.getText();
        
        List<Customer> customers = JsonUtil.readJSON();
        Customer loggedInCustomer = SessionUtil.getCustomerSession();

        int index = customers.indexOf(loggedInCustomer);

        if (!(firstName.equals(""))) {
            loggedInCustomer.setFirstName(firstName);
            AlertUtil.successAlert("Update Successful", "Successfully updated first name");
        }

        if (!(lastName.equals(""))) {
            loggedInCustomer.setLastName(lastName); 
            AlertUtil.successAlert("Update Successful", "Successfully updated last name");
        }
        
        if (!(email.equals(""))) {
            loggedInCustomer.setEmail(email);
            AlertUtil.successAlert("Update Successful", "Successfully updated email");
        }

        if (!(password.equals(""))) {
            loggedInCustomer.setPassword(password);
            AlertUtil.successAlert("Update Successful", "Successfully updated password");
        }

        if (!(address.equals(""))) {
            loggedInCustomer.setAddress(address);
            AlertUtil.successAlert("Update Successful", "Successfully updated address");
        }

        if (!(cardNumber.equals(""))) {
            loggedInCustomer.setCardNumber(cardNumber);
            AlertUtil.successAlert("Update Successful", "Successfully updated card number");
        }
        
        customers.set(index, loggedInCustomer);

        JsonUtil.writeJSON(customers);
    }

}

