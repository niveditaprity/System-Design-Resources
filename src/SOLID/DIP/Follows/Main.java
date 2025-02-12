package SOLID.DIP.Follows;

import SOLID.DIP.Follows.OrderService;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService(new UPI());
        orderService.processOrder(300);
        orderService = new OrderService(new PayPalPayment());
        orderService.processOrder(200);

    }
}
