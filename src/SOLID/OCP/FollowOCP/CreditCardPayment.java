package SOLID.OCP.FollowOCP;

public class CreditCardPayment implements PaymentMethod{

    @Override
    public void payment(double amount) {
        System.out.println("Processing credit card payment of Rs." + amount);
    }
}
