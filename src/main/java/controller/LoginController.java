package controller;


import java.io.FileWriter;

import com.group7.ist.custmngmnt.App;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;

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
    private void switchToSecondary() throws IOException {
         
        //needs to do some type of check like this, might need more if else statments for caps and stuff
        //then searches the database or file for the customer to log them in
 if (usernameTextField.getText().isBlank() || passwordTextField.getText().isBlank()) {
        messageLabel.setText("ERROR! Invalid!");
        } else {
          String username = usernameTextField.getText();
          String password = passwordTextField.getText();
           FileWriter customerNames = new FileWriter("customers.txt");
           customerNames.write("username" + username );
           customerNames.write ("password" + password); 

        }
        //makes it go to the next screen 
        App.setRoot("secondary");
    }

    //method thats called when the register button is hit. we could put a simple form here that also adds them to the file
    @FXML
    private void switchToRegister() throws IOException {

        String username = usernameTextField.getText();
        System.out.print("this is the username they have entered" + username);
        //get the username and apssword value and do something with it
        //look at the controller of the other project, see if it makes sense 
        App.setRoot("secondary");
    }

    //end of code 
}
