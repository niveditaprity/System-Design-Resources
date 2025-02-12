package SOLID.DIP.Violates;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.processOrder(700);
    }
}
