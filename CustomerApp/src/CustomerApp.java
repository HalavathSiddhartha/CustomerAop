// Import necessary libraries to use in the program
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Define the main class for our program
public class CustomerApp {
    public static void main(String[] args) {
        // Create a scanner to accept user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a random number generator
        Random random = new Random();
        
        // Create a list to store customer information
        List<Customer> customerList = new ArrayList<>();

        // Display a welcome message to the user
        System.out.println("Welcome to Customer Registration Page!");
        System.out.println("=======================================");

        // Create a variable to control registration completion
        boolean registrationCompleted = false;

        // Start a loop for registering customers
        while (!registrationCompleted) {
            // Prompt the user for customer information
            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter Customer Email: ");
            String customerEmail = scanner.nextLine();

            System.out.print("Enter Customer Password: ");
            String customerPassword = scanner.nextLine();

            System.out.print("Enter Customer Address: ");
            String customerAddress = scanner.nextLine();

            System.out.print("Enter Customer Phone Number: ");
            String customerPhoneNo = scanner.nextLine();

            // Generate a unique 7-digit customer ID
            int customerId = random.nextInt(9000000) + 1000000;

            // Create a list to store customer services
            List<String> services = new ArrayList<>();

            // Create a customer object with the entered information
            Customer customer = new Customer(customerId, customerName, customerEmail, customerPassword, customerAddress,
                    customerPhoneNo, services);

            // Add the customer to the list
            customerList.add(customer);

            // Confirm the customer's registration
            System.out.println("\nCustomer with ID: " + customerId + " has registered successfully!");

            // Ask the user if the details are correct
            System.out.print("Are all my details correct? (yes/no): ");
            String choice = scanner.nextLine().toLowerCase();

            // Check if the user's input is "yes"
            if ("yes".equals(choice)) {
                registrationCompleted = true;
            } 
            // Check if the user's input is "no"
            else if ("no".equals(choice)) {
                System.out.println("We are sorry, but currently, we don't support editing the information");
                // Exit the registration loop
                break;
            }
        }

        // Display the registered customers
        System.out.println("\nRegistered Customers:");
        System.out.println("============================");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }

        // Ask the user to continue or log out
        System.out.println("Press 1 to continue or 0 to Logout");
        int custChoice = scanner.nextInt();

        // Check the user's choice
        if (custChoice == 0) {
            System.out.println("Thank you for using our service");
        } 
        // Check if the user wants to continue
        else if (custChoice == 1) {
            // Greet the customer
            System.out.println("Welcome " + customerList.get(0).getCustomerName() + ". How are you feeling today");

            // Present a menu of options
            System.out.println(
                    "\nPress 1 to View Available Services"
                            + "\nPress 2 to Select Service"
                            + "\nPress 3 to Search Customer by Mobile Number"
                            + "\nPress 4 to Search Customer by Customer ID"
                            + "\nPress 5 to View customers by Service type"
                            + "\nPress 6 to Logout");

            // Create a variable to control the main menu
            boolean closeMenu = true;

            // Start a loop for the main menu
            while (closeMenu) {
                // Ask the user to select an option
                System.out.println("Please select an option: ");
                int showMenu = scanner.nextInt();

                // Check the user's choice and perform the selected action
                switch (showMenu) {
                    case 1:
                        // Display the available services
                        System.out.println("You have selected the Services List Feature.");
                        System.out.println("=================================================");
                        System.out.println("Please Select a Service to proceed:");
                        System.out.println("1. AC repair");
                        System.out.println("2. TV repair");
                        System.out.println("3. Fridge repair");
                        System.out.println("4. Washing Machine repair");
                        break;

                    case 2:
                        // Select a service
                        System.out.println("You have selected the Select Service Feature.");
                        System.out.println("=================================================");

                        // Display the available services
                        System.out.println("Available Services:");
                        System.out.println("============================");
                        System.out.println("1. AC repair");
                        System.out.println("2. TV repair");
                        System.out.println("3. Fridge repair");
                        System.out.println("4. Washing Machine repair");

                        // Ask the user to choose a service
                        System.out.print("Select a service (1/2/3/4): ");
                        int serviceChoice = scanner.nextInt();
                        String selectedService = "";

                        // Determine the selected service
                        switch (serviceChoice) {
                            case 1:
                                selectedService = "AC repair";
                                break;
                            case 2:
                                selectedService = "TV repair";
                                break;
                            case 3:
                                selectedService = "Fridge repair";
                                break;
                            case 4:
                                selectedService = "Washing Machine repair";
                                break;
                            default:
                                System.out.println("Invalid service choice.");
                                break;
                        }

                        // Check if a valid service was selected
                        if (!selectedService.isEmpty()) {
                            // Enter the service date
                            System.out.print("Enter Service Date: ");
                            String serviceDate = scanner.next();

                            // Enter the address
                            System.out.print("Enter Address (Max 100 characters): ");
                            scanner.nextLine(); // Consume the newline character
                            String address = scanner.nextLine();

                            // Display the available vendors
                            System.out.println("Select a Vendor:");
                            System.out.println("1. Vendor A");
                            System.out.println("2. Vendor B");
                            // Add more vendors as needed

                            // Ask the user to choose a vendor
                            System.out.print("Select a vendor (1/2): ");
                            int vendorChoice = scanner.nextInt();
                            String selectedVendor = "";

                            // Determine the selected vendor
                            switch (vendorChoice) {
                                case 1:
                                    selectedVendor = "Vendor A";
                                    break;
                                case 2:
                                    selectedVendor = "Vendor B";
                                    break;
                                // Add more cases for additional vendors
                                default:
                                    System.out.println("Invalid vendor choice.");
                                    break;
                            }

                            // Check if a valid vendor was selected
                            if (!selectedVendor.isEmpty()) {
                                // Set the amount based on the selected vendor
                                double amount = 0.0; // Set the default amount to 0.0

                                // Determine the amount based on the selected vendor
                                if ("Vendor A".equals(selectedVendor)) {
                                    amount = 100.0; // Set the amount for Vendor A
                                } else if ("Vendor B".equals(selectedVendor)) {
                                    amount = 120.0; // Set the amount for Vendor B
                                }
                                // Add more conditions for other vendors as needed

                                // Display the booking details
                                System.out.println("Booking Details:");
                                System.out.println("Service: " + selectedService);
                                System.out.println("Service Date: " + serviceDate);
                                System.out.println("Address: " + address);
                                System.out.println("Vendor: " + selectedVendor);
                                System.out.println("Amount: ₹" + amount);

                                // Acknowledgment message
                                System.out.println("Booking successful!");
                            } else {
                                System.out.println("Invalid service or vendor selection. Please try again.");
                            }
                        } else {
                            System.out.println("Invalid service selection. Please try again.");
                        }
                        break;

                    case 3:
                        // Search for a customer by mobile number
                        System.out.println("You have selected the Search Customer by Mobile Number Feature.");
                        System.out.print("Enter the customer's mobile number to search: ");
                        String mobileNumberToSearch = scanner.next();
                        boolean found = false;

                        // Loop through the customer list to find a match
                        for (Customer customer : customerList) {
                            if (customer.getCustomerPhoneNo().equals(mobileNumberToSearch)) {
                                System.out.println("Customer found:");
                                System.out.println(customer);
                                found = true;
                                break;
                            }
                        }

                        // Display a message if the customer is not found
                        if (!found) {
                            System.out.println("No Such Customer Exist with the Given Mobile number.");
                        }
                        break;

                    case 4:
                        // Search for a customer by customer ID
                        System.out.println("You have selected the Search Customer by Customer ID Feature.");
                        System.out.println("Enter the customer's ID to search: ");
                        int customerIdToSearch = scanner.nextInt();
                        boolean customerFound = false;

                        // Loop through the customer list to find a match
                        for (Customer customer : customerList) {
                            if (customer.getCustomerId() == customerIdToSearch) {
                                System.out.println("Customer found:");
                                System.out.println(customer);
                                customerFound = true;
                                break;
                            }
                        }

                        // Display a message if the customer is not found
                        if (!customerFound) {
                            System.out.println("No Such Customer Exist with the Given Customer ID.");
                        }
                        break;

                    case 5:
                        // View customers who obtained a specific service type
                        System.out.println("You have selected the View Customers by Service Type Feature.");
                        System.out.print("Enter the service type (e.g., 'AC repair', 'TV repair', 'Fridge repair', 'Washing Machine repair'): ");
                        scanner.nextLine(); // Consume the newline character
                        String serviceTypeToSearch = scanner.nextLine();
                        boolean customersFound = false;

                        // Display customers who obtained the specified service
                        System.out.println("Customers who obtained " + serviceTypeToSearch + ":");
                        for (Customer customer : customerList) {
                            if (customer.getServices() != null && customer.getServices().contains(serviceTypeToSearch)) {
                                System.out.println(customer);
                                customersFound = true;
                            }
                        }

                        // Display a message if no customers obtained the service
                        if (!customersFound) {
                            System.out.println("No Customers obtained the particular service.");
                        }
                        break;

                    case 6:
                        // Exit the program
                        System.out.println("Thank you! Visit again. Terminating the program.");
                        closeMenu = false;
                        break;

                    default:
                        // Display a message for an inappropriate option
                        System.out.println("You have selected an inappropriate option. Please try again.");
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}
