package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jaredb
 */
public class ValidateUtil {
    public static boolean validateName(String name) {
        String validName = "^[A-Za-z]+$";
        
        Pattern namePattern = Pattern.compile(validName);
        Matcher nameMatcher = namePattern.matcher(name);
        
        return nameMatcher.matches();
    }
    
    public static boolean validateEmail(String email) {
        String validEmail = "^\\S+@\\S+\\.\\S+$";
        
        Pattern emailPattern = Pattern.compile(validEmail);
        Matcher emailMatcher = emailPattern.matcher(email);
        
        return emailMatcher.matches();
    }
    
    public static boolean validatePassword(String password) {
        String validPassword = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" +
                "(?=.*[^A-Za-z0-9])" + "(?=\\S+$).{8,}$";
        
        Pattern passwordPattern = Pattern.compile(validPassword);
        Matcher passwordMatcher = passwordPattern.matcher(password);
        
        return passwordMatcher.matches();
    }
    
    public static boolean validateSecurityPIN(String securityPIN) {
        String validPIN = "^[0-9]{6}$";
        
        Pattern pinPattern = Pattern.compile(validPIN);
        Matcher pinMatcher = pinPattern.matcher(securityPIN);
        
        return pinMatcher.matches();
    } 
}
