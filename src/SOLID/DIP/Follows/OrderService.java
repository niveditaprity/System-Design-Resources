package SOLID.DIP.Follows;

import SOLID.DIP.Follows.PaymentMethod;

public class OrderService {
    public PaymentMethod paymentProcessor;
    public OrderService( PaymentMethod paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(double amount) {
        paymentProcessor.pay(amount);
        System.out.println("Order processed!");
    }
}
