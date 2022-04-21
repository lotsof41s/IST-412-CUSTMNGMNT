package controller;

import com.group7.ist.custmngmnt.App;
import java.io.IOException;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import java.util.regex.Matcher;
import java.util.regex.Pattern;
>>>>>>> staging
=======
>>>>>>> staging
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import model.Customer;
import util.AlertUtil;
<<<<<<< HEAD
import util.JSONUtil;
>>>>>>> staging
=======
import util.JsonUtil;
>>>>>>> staging
import util.ValidateUtil;
>>>>>>> staging

public class RegisterController {

    @FXML
<<<<<<< HEAD
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
=======
>>>>>>> staging
    private PasswordField pfConfirmPassword;

    @FXML
    private PasswordField pfPassword;
<<<<<<< HEAD
<<<<<<< HEAD
=======
    
=======

>>>>>>> staging
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
    void goBack(ActionEvent event) throws IOException {
        App.setRoot("login");
    }

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
<<<<<<< HEAD
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
=======
//        String path = "customers.json";
//
//        try ( BufferedReader reader = new BufferedReader(new FileReader(path));  Writer writer = new FileWriter(path)) {
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//            // Error from reader being null?
//            // List<Customer> customers = gson.fromJson(reader, new TypeToken<List<Customer>>(){}.getType());
//            List<Customer> customers = new ArrayList<>();
//            customers.add(new Customer(firstName, lastName, email, password, securityPIN));
//
//            gson.toJson(customers, writer);
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }

          List<Customer> customers = JsonUtil.readJSON();
          
          customers.add(new Customer(firstName, lastName, email, password, securityPIN));
          
          JsonUtil.writeJSON(customers);

//        try {
//            Gson gson = new Gson();
//
//            Reader reader = Files.newBufferedReader(Paths.get("customers.json"));
//            Writer writer = Files.newBufferedWriter(Paths.get("customers.json"));
//
//            List<Customer> customers = gson.fromJson(reader, new TypeToken<List<Customer>>(){}.getType());
//            customers.add(new Customer(firstName, lastName, email, password, securityPIN));
//
//            gson.toJson(customers, writer);
//
//            reader.close();
//            writer.close();
//
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
>>>>>>> staging
    }

}
