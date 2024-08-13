import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input customer details
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        
        Customer customer = new Customer(name, customerId, address);

        // Input electricity details
        System.out.print("Enter Units Consumed: ");
        int unitsConsumed = scanner.nextInt();
        System.out.print("Enter Rate per Unit: ");
        double ratePerUnit = scanner.nextDouble();
        
        ElectricityBill bill = new ElectricityBill(customer, unitsConsumed, ratePerUnit);

        // Print the bill
        bill.printBill();

        scanner.close();
    }
}

