import java.util.List;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerEmail;
    private String customerPassword;
    private String customerAddress;
    private String customerPhoneNo;
    private List<String> services;  // List to store the services

    public Customer(int customerId, String customerName, String customerEmail, String customerPassword,
                    String customerAddress, String customerPhoneNo, List<String> services) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPassword = customerPassword;
        this.customerAddress = customerAddress;
        this.customerPhoneNo = customerPhoneNo;
        this.services = services;  // Initialize the services list
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public List<String> getServices() {
        return services;
    }

    public void setServices(List<String> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId +
                "\nName: " + customerName +
                "\nEmail: " + customerEmail +
                "\nPassword: " + customerPassword +
                "\nAddress: " + customerAddress +
                "\nPhone Number: " + customerPhoneNo +
                "\nServices: " + services + "\n";
    }
}
