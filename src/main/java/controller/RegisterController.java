package controller;

import com.group7.ist.custmngmnt.App;
import java.io.IOException;
<<<<<<< HEAD
=======
import java.util.regex.Matcher;
import java.util.regex.Pattern;
>>>>>>> staging
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
<<<<<<< HEAD
=======
import util.ValidateUtil;
>>>>>>> staging

public class RegisterController {

    @FXML
    private Button btnContinue;

    @FXML
    private Label lblConfirmPassword;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblFirstName;

    @FXML
    private Label lblLastName;

    @FXML
    private Label lblPassword;

    @FXML
    private Label lblTitle;
<<<<<<< HEAD
=======
    
    @FXML
    private Label lblSecurityPIN;
>>>>>>> staging

    @FXML
    private PasswordField pfConfirmPassword;

    @FXML
    private PasswordField pfPassword;
<<<<<<< HEAD
=======
    
    @FXML
    private PasswordField pfSecurityPIN;
>>>>>>> staging

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfFirstName;

    @FXML
    private TextField tfLastName;

    @FXML
    void registerCustomer(ActionEvent event) throws IOException {
<<<<<<< HEAD
        App.setRoot("home");
=======
        String firstName = tfFirstName.getText();
        String lastName = tfLastName.getText();
        String email = tfEmail.getText();
        String password = pfPassword.getText();
        String confirmPassword = pfConfirmPassword.getText();
        String securityPIN = pfSecurityPIN.getText();

        if (!(firstName.equals("") || lastName.equals("") || email.equals("") 
                && password.equals("") || confirmPassword.equals("") ||
                securityPIN.equals(""))) {
            if (ValidateUtil.validateEmail(email)) {
                if (emailNotTaken(email)) {
                    if (ValidateUtil.validatePassword(password)) {
                        if (passwordsMatch(password, confirmPassword)) {
                            if (ValidateUtil.validateSecurityPIN(securityPIN)) {
                                addCustomerToSystem(firstName, lastName,
                                        email, password, securityPIN);
                                App.setRoot("home");
                            } else {
                                System.out.println("Invalid security PIN");
                            }
                        } else {
                            System.out.println("Passwords do not match");
                        }
                    } else {
                        System.out.println("Invalid password");
                    }
                } else {
                    System.out.println("Email is already registered");
                }
            } else {
                System.out.println("Invalid email");
            }
        } else {
            System.out.println("All fields are required");
        }
    }
    
    private boolean emailNotTaken(String email) {
        // read current JSONArray, for each object see if object.get("email")
        // is equal to email, if so return false, else return true
    }
    
    private boolean passwordsMatch(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }
    
    private void addCustomerToSystem(String firstName, String lastName,
            String email, String password, String securityPIN) {
//        JSONUtil.readJSON("customers.json");
//        
//        JSONObject customer = new JSONObject;
//        customer.put("first_name", firstName);
//        customer.put("last_name", lastName);
//        customer.put("email", email);
//        customer.put("password", password);
//        customer.put("security_pin", securityPIN);
//        
//        JSONArray customerList = new JSONArray;
//        customerList.add(customer);
//        
//        JSONUtil.writeJSON(customerList, "customers.json");
>>>>>>> staging
    }

}