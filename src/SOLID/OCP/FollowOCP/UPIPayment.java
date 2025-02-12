package SOLID.OCP.FollowOCP;

public class UPIPayment implements PaymentMethod{
    @Override
    public void payment(double amount) {
        System.out.println("Processing upi payment of Rs." + amount);
    }
}
