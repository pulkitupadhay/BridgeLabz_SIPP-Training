package Inheritence;

class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }
}

public class RetailOrderTest {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(1001, "2025-06-30", "TRK123456", "2025-07-01");
        System.out.println("Order ID: " + d.orderId);
        System.out.println("Tracking: " + d.trackingNumber);
        System.out.println("Status: " + d.getOrderStatus());
    }
}
