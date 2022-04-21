package controller;

import com.group7.ist.custmngmnt.App;
import java.io.IOException;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Customer;
import util.AlertUtil;
import util.JSONUtil;
import util.SessionUtil;

public class LoginController {

    @FXML
    private PasswordField pfPassword;

    @FXML
    private TextField tfEmail;

    @FXML
    void authenticateCustomer(ActionEvent event) throws IOException {
        String email = tfEmail.getText();
        String password = pfPassword.getText();

        if (email.equals("") || password.equals("")) {
            AlertUtil.errorAlert("All Fields Required", "Please enter an email and password");
        } else {
            List<Customer> customers = JSONUtil.readJSON();
            Customer loggingInCustomer = null;

            for (Customer customer : customers) {
                if (customer.getEmail().equals(email)) {
                    loggingInCustomer = customer;
                    break;
                }
            }
            
            if (loggingInCustomer == null) {
                AlertUtil.errorAlert("Account Not Found", "The specified email was not found in our system");
            } else {
                if (loggingInCustomer.getPassword().equals(password)) {
                    AlertUtil.successAlert("Login Successful", "Welcome " + loggingInCustomer.getFirstName());
                    SessionUtil.createSession(loggingInCustomer);
                    App.setRoot("home");
                } else {
                    AlertUtil.errorAlert("Login Failed", "Incorrect password");
                    tfEmail.setText("");
                    pfPassword.setText("");
                }
            }
        }
    }

    @FXML
    void switchToRegister(ActionEvent event) throws IOException {
        App.setRoot("register");
    }

}
