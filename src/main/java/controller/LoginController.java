package controller;


import com.group7.ist.custmngmnt.App;

import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {

    //import the scene builders controls
    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    @FXML
    private Label usernameLabel;

    @FXML
    private Label passwordLabel;

    @FXML
    private Label messageLabel;

    @FXML
    //method called when the login button is hit 
    private void loginCustomer() throws IOException {

        //needs to do some type of check like this, might need more if else statments for caps and stuff
        //then searches the database or file for the customer to log them in
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        
        
     //will be working hopefully when we can read from a file
//        if(!(username.equals("") || password.equals(""))){
//            if(username = a username in the JSON list){
//                App.setRoot("home");
//            }else{
//                messageLabel.setText("ERROR! Customer not in system");
//        }else{
//            messageLabel.setText("Must enter fields to login");
//        }
//        }
            

    }
    //method thats called when the register button is hit. we could put a simple form here that also adds them to the file
    @FXML
    private void switchToRegister() throws IOException {
        App.setRoot("register");
        String username = usernameTextField.getText();

    }

    //end of code 
}
