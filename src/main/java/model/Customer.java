package model;

/**
 *
 * @author jaredb
 */
public class Customer {
    
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String securityPIN;
    // private List<Address> addresses;
    private String address;
    // private List<PaymentMethod> paymentMethods;
    private String paymentMethod;
    // private List<Order> orders;
    
    public Customer(String firstName, String lastName, String email, String 
            password, String securityPIN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.securityPIN = securityPIN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getSecurityPIN() {
        return securityPIN;
    }

    public String getAddress() {
        return address;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSecurityPIN(String securityPIN) {
        this.securityPIN = securityPIN;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
}
