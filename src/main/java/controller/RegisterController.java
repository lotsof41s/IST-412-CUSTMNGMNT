package controller;

import com.group7.ist.custmngmnt.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.util.List;
import model.Customer;
import util.AlertUtil;
import util.JsonUtil;
import util.ValidateUtil;

public class RegisterController {

    @FXML
    private PasswordField pfConfirmPassword;

    @FXML
    private PasswordField pfPassword;

    @FXML
    private PasswordField pfSecurityPIN;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfFirstName;

    @FXML
    private TextField tfLastName;

    @FXML
    void goBack(ActionEvent event) throws IOException {
        App.setRoot("login");
    }

    @FXML
    void registerCustomer(ActionEvent event) throws IOException {
        String firstName = tfFirstName.getText();
        String lastName = tfLastName.getText();
        String email = tfEmail.getText();
        String password = pfPassword.getText();
        String confirmPassword = pfConfirmPassword.getText();
        String securityPIN = pfSecurityPIN.getText();

        if (!(firstName.equals("") || lastName.equals("") || email.equals("")
                && password.equals("") || confirmPassword.equals("")
                || securityPIN.equals(""))) {
            if (ValidateUtil.validateName(firstName)) {
                if (ValidateUtil.validateName(lastName)) {
                    if (ValidateUtil.validateEmail(email)) {
                        if (emailNotTaken(email)) {
                            if (ValidateUtil.validatePassword(password)) {
                                if (passwordsMatch(password, confirmPassword)) {
                                    if (ValidateUtil.validateSecurityPIN(securityPIN)) {
                                        addCustomerToSystem(firstName, lastName,
                                                email, password, securityPIN);
                                        AlertUtil.successAlert("Registration Successful",
                                                "You may now login");
                                        App.setRoot("login");
                                    } else {
                                        AlertUtil.errorAlert("Invalid Security PIN",
                                                "Security PIN must be a 6 digit "
                                                + "number");
                                    }
                                } else {
                                    AlertUtil.errorAlert("Passwords Do Not Match",
                                            "Please re-enter your password "
                                            + "to ensure they match");
                                }
                            } else {
                                AlertUtil.errorAlert("Invalid Password",
                                        "Password must: be eight "
                                        + "characters long, "
                                        + "contain at least "
                                        + "one lowercase, "
                                        + "contain at least "
                                        + "one uppercaster, "
                                        + "contain at least "
                                        + "one digit, contain"
                                        + "at least one special "
                                        + "character, and cannot "
                                        + "contain any whitespace");
                            }
                        } else {
                            AlertUtil.errorAlert("Email Already Registered",
                                    "Please enter a new email address");
                        }
                    } else {
                        AlertUtil.errorAlert("Invalid Email",
                                "Email must be in the form "
                                + "<email>@<domain>");
                    }
                } else {
                    AlertUtil.errorAlert("Invalid Last Name",
                            "No digits are allowed");
                }
            } else {
                AlertUtil.errorAlert("Invalid First Name",
                        "No digits are allowed");
            }
        } else {
            AlertUtil.errorAlert("All Fields Required", "Please do not leave any fields "
                    + "blank");
        }
    }

    private boolean emailNotTaken(String email) {
        List<Customer> customers = JsonUtil.readJSON();

        for (Customer customer : customers) {
            if (customer.getEmail().equals(email)) {
                return false;
            }
        }
        
        return true;
    }

    private boolean passwordsMatch(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }

    private void addCustomerToSystem(String firstName, String lastName,
            String email, String password, String securityPIN) {
          List<Customer> customers = JsonUtil.readJSON();
          
          customers.add(new Customer(firstName, lastName, email, password, securityPIN));
          
          JsonUtil.writeJSON(customers);
    }

}
