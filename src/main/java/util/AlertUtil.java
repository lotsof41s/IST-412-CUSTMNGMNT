package util;

import javafx.scene.control.Alert;

/**
 *
 * @author jaredb
 */
public class AlertUtil {
    public static void successAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                
        alert.setTitle(title);
        alert.setContentText(message);
        
        // Doesn't seem to work
        // alert.getDialogPane().getStyleClass().add("-fx-font-family: Avenir Book");
        // alert.getDialogPane().getStyleClass().add("-fx-font-size: 13px");
        
        alert.showAndWait();
    }
    
    public static void errorAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
                
        alert.setTitle(title);
        alert.setContentText(message);
        
        // Doesn't seem to work
        // alert.getDialogPane().getStyleClass().add("-fx-font-family: Avenir Book");
        // alert.getDialogPane().getStyleClass().add("-fx-font-size: 13px");
        
        alert.showAndWait();
    }
}
