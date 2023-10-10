import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CustomerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<Customer> customerList = new ArrayList<>();

        // Welcome Message
        System.out.println("Welcome to Customer Registration Page!");
        System.out.println("=======================================");

        boolean registrationCompleted = false;

        while (!registrationCompleted) {
            // Get Customer Information
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

            // Generating 7 Digits of customer Id which is imp for accessing the customer
            // based on the custId
            int customerId = random.nextInt(9000000) + 1000000;

            Customer customer = new Customer(customerId, customerName, customerEmail, customerPassword,
                    customerAddress, customerPhoneNo);

            customerList.add(customer);

            // Confirmation if the customer is created or not
            System.out.println("\nCustomer with ID: " + customerId + " has registered successfully!");

            // Confirm the registration
            System.out.print("I'm sure all my details are correct? (yes/no): ");
            String choice = scanner.nextLine().toLowerCase();

            if ("yes".equals(choice)) {
                registrationCompleted = true;
            }
            if ("no".equals(choice)) {
                System.out.println("We are sorry. But currently we don't support editing the info");
                break;
            }

        }

        // Display Registered Customers
        System.out.println("\nRegistered Customers:");
        System.out.println("============================");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }

        System.out.println("Press 1 to continue or 0 to Logout");
        int custChoice = scanner.nextInt();

        if (custChoice == 0) {
            System.out.println("Thank you for using our service");
        }
        if (custChoice == 1) {
            System.out.println("Welcome " + customerList.get(0).getCustomerName()
                    + " . " + " How you Felling Today");

            System.out.println(
                    "\nPress 1 for Services List"
                            + "\nPress 2 for Select Service"
                            + "\nPress 3 for Search Customer by Mobile Number"
                            + "\nPress 4 for Search Customer by Customer Id"
                            + "\nPress 5 to View customer by Service type"
                            + "\nPress 6 to Logout");

            boolean closeMenu = true;

            while (closeMenu) {

                System.out.println("Please select an option: ");
                int showMenu = scanner.nextInt();

                switch (showMenu) {
                    case 1:
                        System.out.println("You have selected the Services List Feature.");
                        System.out.println("=================================================");
                        System.out.println("Please Select an Service to procced.");
                        System.out.println("1. AC repair");
                        System.out.println("2. TV repair");
                        System.out.println("3. Fridge repair");
                        System.out.println("4. Washing Machine repair");

                        break;
                    case 2:
                        System.out.println("You have selected the Select Service Feature.");

                        break;
                    case 3:
                        System.out.println("You have selected the Search Customer by Mobile Number Feature.");

                        break;
                    case 4:
                        System.out.println("You have selected the Search Customer by Customer Id Feature.");

                        break;
                    case 5:
                        System.out.println("You have selected the View customer by Service type Feature.");

                        break;
                    case 6:
                        System.out.println("Thank you! Visit again. Terminating the program.");
                        closeMenu = false;

                        break;
                    default:
                        System.out.println("You have selected an inappropriate option. Please try again.");
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}
