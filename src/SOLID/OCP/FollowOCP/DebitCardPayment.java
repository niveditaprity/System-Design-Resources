package SOLID.OCP.FollowOCP;

public class DebitCardPayment implements PaymentMethod{
    @Override
    public void payment(double amount) {
        System.out.println("Processing debit card payment of Rs." + amount);
    }
}
