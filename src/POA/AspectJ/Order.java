package POA.AspectJ;

public class Order {
    private int orderId;
    private String customerName;

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public void createOrder() {
        System.out.println("Order #" + orderId + " created for customer " + customerName);
    }

    public void processPayment() {
        System.out.println("Payment processed for order #" + orderId);
    }

    public void shipOrder() {
        System.out.println("Order #" + orderId + " shipped to customer " + customerName);
    }
}