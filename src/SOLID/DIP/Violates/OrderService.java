package SOLID.DIP.Violates;

// Order-service is high level module
public class OrderService {
    public PaypalPayment paypalPayment;
    public OrderService() {
        this.paypalPayment= new PaypalPayment();
    }

    public void processOrder(double amount) {
        paypalPayment.pay(amount);
        System.out.println("Order processed!");
    }
}
