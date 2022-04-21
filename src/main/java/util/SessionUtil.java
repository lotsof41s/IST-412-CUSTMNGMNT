package util;

import model.Customer;

/**
 *
 * @author jaredb
 */
public class SessionUtil {
    private static Customer loggedInCustomer;
    
    public static void createSession(Customer loggingInCustomer) {
        loggedInCustomer = loggingInCustomer;
    }
    
    public static Customer getCustomerSession() {
        return loggedInCustomer;
    }
}
