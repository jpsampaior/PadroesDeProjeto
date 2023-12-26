package POA.AspectJ;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, "John Doe");
        order.createOrder();
        order.processPayment();
        order.shipOrder();

    }
}
