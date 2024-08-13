public class ElectricityBill {
    private Customer customer;
    private int unitsConsumed;
    private double ratePerUnit;

    public ElectricityBill(Customer customer, int unitsConsumed, double ratePerUnit) {
        this.customer = customer;
        this.unitsConsumed = unitsConsumed;
        this.ratePerUnit = ratePerUnit;
    }

    public double calculateBill() {
        return unitsConsumed * ratePerUnit;
    }

    public void printBill() {
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Rate per Unit: " + ratePerUnit);
        System.out.println("Total Bill: " + calculateBill());
    }
}

