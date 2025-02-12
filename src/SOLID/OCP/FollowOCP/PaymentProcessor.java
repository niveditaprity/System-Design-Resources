package SOLID.OCP.FollowOCP;

public class PaymentProcessor {

    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.payment(amount);
    }
}
