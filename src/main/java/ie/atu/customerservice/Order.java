package ie.atu.customerservice;

import lombok.Data;

@Data
public class Order {
    private int orderId;
    private int productId;
    private int quantity;
    private int customerId;
}
