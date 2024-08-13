public class Customer {
    private String name;
    private int customerId;
    private String address;

    public Customer(String name, int customerId, String address) {
        this.name = name;
        this.customerId = customerId;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getAddress() {
        return address;
    }
}

