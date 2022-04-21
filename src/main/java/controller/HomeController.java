package controller;

import com.group7.ist.custmngmnt.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HomeController {

    @FXML
    void switchToProfile(ActionEvent event) throws IOException {
        App.setRoot("profile");
    }

}
